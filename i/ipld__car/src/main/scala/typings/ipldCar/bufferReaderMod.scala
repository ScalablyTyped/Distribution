package typings.ipldCar

import typings.ipldCar.distSrcBufferReaderBrowserMod.Block
import typings.ipldCar.distSrcBufferReaderBrowserMod.CarHeader
import typings.ipldCar.distSrcBufferReaderBrowserMod.CarV2Header
import typings.ipldCar.ipldCarBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object bufferReaderMod {
  
  @JSImport("@ipld/car/buffer-reader", "CarBufferReader")
  @js.native
  open class CarBufferReader protected ()
    extends typings.ipldCar.distSrcBufferReaderBrowserMod.CarBufferReader {
    /**
      * @constructs CarBufferReader
      * @param {CarHeader|CarV2Header} header
      * @param {Block[]} blocks
      */
    def this(header: CarHeader, blocks: js.Array[Block]) = this()
    def this(header: CarV2Header, blocks: js.Array[Block]) = this()
  }
  /* static members */
  object CarBufferReader {
    
    @JSImport("@ipld/car/buffer-reader", "CarBufferReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarBufferReader} from a `Uint8Array` blob. This performs a
      * decode fully in memory and maintains the decoded state in memory for full
      * access to the data via the `CarReader` API.
      *
      * @static
      * @memberof CarBufferReader
      * @param {Uint8Array} bytes
      * @returns {CarBufferReader}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): typings.ipldCar.distSrcBufferReaderBrowserMod.CarBufferReader = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.ipldCar.distSrcBufferReaderBrowserMod.CarBufferReader]
  }
  
  @JSImport("@ipld/car/buffer-reader", "__browser")
  @js.native
  val browser: `true` = js.native
}
