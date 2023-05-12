package typings.ipldCar

import typings.ipldCar.ipldCarBooleans.`true`
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBufferReaderBrowserMod {
  
  @JSImport("@ipld/car/dist/src/buffer-reader-browser", "CarBufferReader")
  @js.native
  open class CarBufferReader protected ()
    extends StObject
       with typings.ipldCar.distSrcApiMod.CarBufferReader {
    /**
      * @constructs CarBufferReader
      * @param {CarHeader|CarV2Header} header
      * @param {Block[]} blocks
      */
    def this(header: CarHeader, blocks: js.Array[Block]) = this()
    def this(header: CarV2Header, blocks: js.Array[Block]) = this()
    
    var _blocks: js.Array[typings.ipldCar.distSrcApiMod.Block] = js.native
    
    var _cids: js.UndefOr[js.Array[typings.multiformats.mod.CID[Any, Double, Double, Version]]] = js.native
    
    var _header: typings.ipldCar.distSrcCodingMod.CarHeader | typings.ipldCar.distSrcCodingMod.CarV2Header = js.native
    
    /* CompleteClass */
    override def blocks(): js.Iterable[typings.ipldCar.distSrcApiMod.Block] = js.native
    
    /* CompleteClass */
    override def cids(): js.Iterable[typings.multiformats.cidMod.CID[Any, Double, Double, Version]] = js.native
    
    /**
      * Fetch a `Block` (a `{ cid:CID, bytes:Uint8Array }` pair) from the CAR
      * referenced by this reader matching the provided `CID`. In the case where
      * the provided `CID` doesn't exist within the CAR, `undefined` will be
      * returned.
      *
      * @function
      * @memberof CarBufferReader
      * @instance
      * @param {CID} key
      * @returns {Block | undefined}
      */
    def get(key: CID): js.UndefOr[Block] = js.native
    /* CompleteClass */
    override def get(key: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): js.UndefOr[typings.ipldCar.distSrcApiMod.Block] = js.native
    
    /* CompleteClass */
    override def getRoots(): js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]] = js.native
    
    /**
      * Check whether a given `CID` exists within the CAR referenced by this
      * reader.
      *
      * @function
      * @memberof CarBufferReader
      * @instance
      * @param {CID} key
      * @returns {boolean}
      */
    def has(key: CID): Boolean = js.native
    /* CompleteClass */
    override def has(key: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): Boolean = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  /* static members */
  object CarBufferReader {
    
    @JSImport("@ipld/car/dist/src/buffer-reader-browser", "CarBufferReader")
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
    inline def fromBytes(bytes: js.typedarray.Uint8Array): CarBufferReader = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[CarBufferReader]
  }
  
  @JSImport("@ipld/car/dist/src/buffer-reader-browser", "__browser")
  @js.native
  val browser: `true` = js.native
  
  type Block = typings.ipldCar.distSrcApiMod.Block
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type CarHeader = typings.ipldCar.distSrcCodingMod.CarHeader
  
  type CarV2Header = typings.ipldCar.distSrcCodingMod.CarV2Header
  
  type ICarBufferReader = typings.ipldCar.distSrcApiMod.CarBufferReader
}
