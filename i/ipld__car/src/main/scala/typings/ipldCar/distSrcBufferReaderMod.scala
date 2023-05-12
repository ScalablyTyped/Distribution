package typings.ipldCar

import typings.ipldCar.distSrcBufferReaderBrowserMod.CarHeader
import typings.ipldCar.distSrcBufferReaderBrowserMod.CarV2Header
import typings.ipldCar.ipldCarBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBufferReaderMod {
  
  @JSImport("@ipld/car/dist/src/buffer-reader", "CarBufferReader")
  @js.native
  open class CarBufferReader protected ()
    extends typings.ipldCar.distSrcBufferReaderBrowserMod.CarBufferReader {
    /**
      * @constructs CarBufferReader
      * @param {CarHeader|CarV2Header} header
      * @param {Block[]} blocks
      */
    def this(header: CarHeader, blocks: js.Array[typings.ipldCar.distSrcBufferReaderBrowserMod.Block]) = this()
    def this(header: CarV2Header, blocks: js.Array[typings.ipldCar.distSrcBufferReaderBrowserMod.Block]) = this()
  }
  /* static members */
  object CarBufferReader {
    
    @JSImport("@ipld/car/dist/src/buffer-reader", "CarBufferReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Reads a block directly from a file descriptor for an open CAR file. This
      * function is **only available in Node.js** and not a browser environment.
      *
      * This function can be used in connection with {@link CarIndexer} which emits
      * the `BlockIndex` objects that are required by this function.
      *
      * The user is responsible for opening and closing the file used in this call.
      *
      * @static
      * @memberof CarBufferReader
      * @param {number} fd - A file descriptor from the
      * Node.js `fs` module. An integer, from `fs.open()`.
      * @param {BlockIndex} blockIndex - An index pointing to the location of the
      * Block required. This `BlockIndex` should take the form:
      * `{cid:CID, blockLength:number, blockOffset:number}`.
      * @returns {Block} A `{ cid:CID, bytes:Uint8Array }` pair.
      */
    inline def readRaw(fd: Double, blockIndex: BlockIndex): Block = (^.asInstanceOf[js.Dynamic].applyDynamic("readRaw")(fd.asInstanceOf[js.Any], blockIndex.asInstanceOf[js.Any])).asInstanceOf[Block]
  }
  
  @JSImport("@ipld/car/dist/src/buffer-reader", "__browser")
  @js.native
  val browser: `false` = js.native
  
  type Block = typings.ipldCar.distSrcApiMod.Block
  
  type BlockIndex = typings.ipldCar.distSrcApiMod.BlockIndex
  
  type ICarBufferReader = typings.ipldCar.distSrcApiMod.CarBufferReader
}
