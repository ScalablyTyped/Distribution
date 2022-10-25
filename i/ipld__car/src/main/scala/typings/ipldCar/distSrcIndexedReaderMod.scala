package typings.ipldCar

import typings.ipldCar.distSrcApiMod.BlockIterator
import typings.ipldCar.distSrcApiMod.CIDIterator
import typings.ipldCar.ipldCarBooleans.`false`
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIndexedReaderMod {
  
  @JSImport("@ipld/car/dist/src/indexed-reader", "CarIndexedReader")
  @js.native
  open class CarIndexedReader protected ()
    extends StObject
       with typings.ipldCar.distSrcApiMod.CarReader {
    /**
      * @param {number} version
      * @param {string} path
      * @param {CID[]} roots
      * @param {Map<string, RawLocation>} index
      * @param {string[]} order
      */
    def this(
      version: Double,
      path: String,
      roots: js.Array[CID[Any, Double, Double, Version]],
      index: Map[String, RawLocation],
      order: js.Array[String]
    ) = this()
    
    var _fd: typings.node.fsPromisesMod.FileHandle | Null = js.native
    
    var _index: Map[String, RawLocation] = js.native
    
    var _order: js.Array[String] = js.native
    
    var _path: String = js.native
    
    var _roots: js.Array[CID[Any, Double, Double, Version]] = js.native
    
    var _version: Double = js.native
    
    /* CompleteClass */
    override def blocks(): BlockIterator = js.native
    
    /* CompleteClass */
    override def cids(): CIDIterator = js.native
    
    /**
      * Close the underlying file descriptor maintained by this `CarIndexedReader`.
      * This must be called for proper resource clean-up to occur.
      *
      * @function
      * @memberof CarIndexedReader
      * @instance
      * @async
      * @returns {Promise<void>}
      */
    def close(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def get(key: CID[Any, Double, Double, Version]): js.Promise[js.UndefOr[typings.ipldCar.distSrcApiMod.Block]] = js.native
    
    /* CompleteClass */
    override def getRoots(): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
    
    /* CompleteClass */
    override def has(key: CID[Any, Double, Double, Version]): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    var version: Double = js.native
    @JSName("version")
    def version_MCarIndexedReader: Double = js.native
  }
  /* static members */
  object CarIndexedReader {
    
    @JSImport("@ipld/car/dist/src/indexed-reader", "CarIndexedReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate an {@link CarIndexedReader} from a file with the provided
      * `path`. The CAR file is first indexed with a full path that collects `CID`s
      * and block locations. This index is maintained in memory. Subsequent reads
      * operate on a read-only file descriptor, fetching the block from its in-file
      * location.
      *
      * For large archives, the initial indexing may take some time. The returned
      * `Promise` will resolve only after this is complete.
      *
      * @async
      * @static
      * @memberof CarIndexedReader
      * @param {string} path
      * @returns {Promise<CarIndexedReader>}
      */
    inline def fromFile(path: String): js.Promise[CarIndexedReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarIndexedReader]]
  }
  
  @JSImport("@ipld/car/dist/src/indexed-reader", "__browser")
  @js.native
  val browser: `false` = js.native
  
  type Block = typings.ipldCar.distSrcApiMod.Block
  
  type BlockIndex = typings.ipldCar.distSrcApiMod.BlockIndex
  
  type CarReader = typings.ipldCar.distSrcReaderBrowserMod.CarReader
  
  type CarReaderIface = typings.ipldCar.distSrcApiMod.CarReader
  
  type FileHandle = typings.node.fsPromisesMod.FileHandle
  
  trait RawLocation extends StObject {
    
    var blockLength: Double
    
    var blockOffset: Double
  }
  object RawLocation {
    
    inline def apply(blockLength: Double, blockOffset: Double): RawLocation = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockOffset = blockOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawLocation]
    }
    
    extension [Self <: RawLocation](x: Self) {
      
      inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
      
      inline def setBlockOffset(value: Double): Self = StObject.set(x, "blockOffset", value.asInstanceOf[js.Any])
    }
  }
}
