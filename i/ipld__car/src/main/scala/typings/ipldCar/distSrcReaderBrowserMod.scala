package typings.ipldCar

import typings.ipldCar.distSrcApiMod.BlockIterator
import typings.ipldCar.distSrcApiMod.CIDIterator
import typings.ipldCar.ipldCarBooleans.`true`
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReaderBrowserMod {
  
  @JSImport("@ipld/car/dist/src/reader-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ipld/car/dist/src/reader-browser", "CarReader")
  @js.native
  open class CarReader protected ()
    extends StObject
       with typings.ipldCar.distSrcApiMod.CarReader {
    /**
      * @constructs CarReader
      * @param {CarHeader|CarV2Header} header
      * @param {Block[]} blocks
      */
    def this(header: CarHeader, blocks: js.Array[Block]) = this()
    def this(header: CarV2Header, blocks: js.Array[Block]) = this()
    
    var _blocks: js.Array[typings.ipldCar.distSrcApiMod.Block] = js.native
    
    var _header: typings.ipldCar.distSrcCodingMod.CarHeader | typings.ipldCar.distSrcCodingMod.CarV2Header = js.native
    
    var _keys: js.Array[String] = js.native
    
    /* CompleteClass */
    override def blocks(): BlockIterator = js.native
    
    /* CompleteClass */
    override def cids(): CIDIterator = js.native
    
    /**
      * Fetch a `Block` (a `{ cid:CID, bytes:Uint8Array }` pair) from the CAR
      * referenced by this reader matching the provided `CID`. In the case where
      * the provided `CID` doesn't exist within the CAR, `undefined` will be
      * returned.
      *
      * @function
      * @memberof CarReader
      * @instance
      * @async
      * @param {CID} key
      * @returns {Promise<Block | undefined>}
      */
    def get(key: CID): js.Promise[js.UndefOr[Block]] = js.native
    /* CompleteClass */
    override def get(key: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): js.Promise[js.UndefOr[typings.ipldCar.distSrcApiMod.Block]] = js.native
    
    /* CompleteClass */
    override def getRoots(): js.Promise[js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]] = js.native
    
    /**
      * Check whether a given `CID` exists within the CAR referenced by this
      * reader.
      *
      * @function
      * @memberof CarReader
      * @instance
      * @async
      * @param {CID} key
      * @returns {Promise<boolean>}
      */
    def has(key: CID): js.Promise[Boolean] = js.native
    /* CompleteClass */
    override def has(key: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  /* static members */
  object CarReader {
    
    @JSImport("@ipld/car/dist/src/reader-browser", "CarReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarReader} from a `Uint8Array` blob. This performs a
      * decode fully in memory and maintains the decoded state in memory for full
      * access to the data via the `CarReader` API.
      *
      * @async
      * @static
      * @memberof CarReader
      * @param {Uint8Array} bytes
      * @returns {Promise<CarReader>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[CarReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarReader]]
    
    /**
      * Instantiate a {@link CarReader} from a `AsyncIterable<Uint8Array>`, such as
      * a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * This performs a decode fully in memory and maintains the decoded state in
      * memory for full access to the data via the `CarReader` API.
      *
      * Care should be taken for large archives; this API may not be appropriate
      * where memory is a concern or the archive is potentially larger than the
      * amount of memory that the runtime can handle.
      *
      * @async
      * @static
      * @memberof CarReader
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarReader>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[CarReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarReader]]
  }
  
  @JSImport("@ipld/car/dist/src/reader-browser", "__browser")
  @js.native
  val browser: `true` = js.native
  
  inline def decodeReaderComplete(reader: BytesReader): js.Promise[CarReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeReaderComplete")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarReader]]
  
  type Block = typings.ipldCar.distSrcApiMod.Block
  
  type BytesReader = typings.ipldCar.distSrcCodingMod.BytesReader
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type CarHeader = typings.ipldCar.distSrcCodingMod.CarHeader
  
  type CarReaderIface = typings.ipldCar.distSrcApiMod.CarReader
  
  type CarV2Header = typings.ipldCar.distSrcCodingMod.CarV2Header
}
