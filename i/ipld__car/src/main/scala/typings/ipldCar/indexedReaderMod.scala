package typings.ipldCar

import typings.ipldCar.apiMod.BlockIterator
import typings.ipldCar.apiMod.CIDIterator
import typings.ipldCar.ipldCarBooleans.`false`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedReaderMod {
  
  @JSImport("@ipld/car/types/lib/indexed-reader", "CarIndexedReader")
  @js.native
  open class CarIndexedReader protected ()
    extends StObject
       with typings.ipldCar.apiMod.CarReader {
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
      roots: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
          ],
      index: Map[String, RawLocation],
      order: js.Array[String]
    ) = this()
    
    var _fd: typings.node.fsPromisesMod.FileHandle | Null = js.native
    
    var _index: Map[String, RawLocation] = js.native
    
    var _order: js.Array[String] = js.native
    
    var _path: String = js.native
    
    var _roots: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ] = js.native
    
    var _version: Double = js.native
    
    /* CompleteClass */
    override def blocks(): BlockIterator = js.native
    
    /* CompleteClass */
    override def cids(): CIDIterator = js.native
    
    /**
      * Close the underlying file descriptor maintained by this `CarIndexedReader`.
      * This must be called for proper resource clean-up to occur.
      *
      * @method
      * @memberof CarIndexedReader
      * @instance
      * @async
      * @returns {Promise<void>}
      */
    def close(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def get(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    ): js.Promise[js.UndefOr[typings.ipldCar.apiMod.Block]] = js.native
    
    /* CompleteClass */
    override def getRoots(): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
      ] = js.native
    
    /* CompleteClass */
    override def has(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    ): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    var version: Double = js.native
    @JSName("version")
    def version_MCarIndexedReader: Double = js.native
  }
  /* static members */
  object CarIndexedReader {
    
    @JSImport("@ipld/car/types/lib/indexed-reader", "CarIndexedReader")
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
  
  @JSImport("@ipld/car/types/lib/indexed-reader", "__browser")
  @js.native
  val browser: `false` = js.native
  
  type Block = typings.ipldCar.apiMod.Block
  
  type BlockIndex = typings.ipldCar.apiMod.BlockIndex
  
  type CarReader = typings.ipldCar.readerBrowserMod.CarReader
  
  type CarReaderIface = typings.ipldCar.apiMod.CarReader
  
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
