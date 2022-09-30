package typings.ipldCar

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexerMod {
  
  @JSImport("@ipld/car/types/lib/indexer", "CarIndexer")
  @js.native
  open class CarIndexer protected ()
    extends StObject
       with typings.ipldCar.apiMod.RootsReader
       with AsyncIterable[BlockIndex] {
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncGenerator<BlockIndex>} iterator
      */
    def this(version: Double, roots: js.Array[CID], iterator: AsyncGenerator[BlockIndex, Any, Any]) = this()
    
    var _iterator: AsyncGenerator[typings.ipldCar.apiMod.BlockIndex, Any, Any] = js.native
    
    var _roots: js.Array[typings.multiformats.mod.CID] = js.native
    
    var _version: Double = js.native
    
    /* CompleteClass */
    override def getRoots(): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
      ] = js.native
    
    /* CompleteClass */
    var version: Double = js.native
    @JSName("version")
    def version_MCarIndexer: Double = js.native
  }
  /* static members */
  object CarIndexer {
    
    @JSImport("@ipld/car/types/lib/indexer", "CarIndexer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarIndexer} from a `Uint8Array` blob. Only the header
      * is decoded initially, the remainder is processed and emitted via the
      * iterator as it is consumed.
      *
      * @async
      * @static
      * @memberof CarIndexer
      * @param {Uint8Array} bytes
      * @returns {Promise<CarIndexer>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarIndexer]]
    
    /**
      * Instantiate a {@link CarIndexer} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * is decoded initially, the remainder is processed and emitted via the
      * iterator as it is consumed.
      *
      * @async
      * @static
      * @memberof CarIndexer
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarIndexer>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarIndexer]]
  }
  
  type Block = typings.ipldCar.apiMod.Block
  
  type BlockIndex = typings.ipldCar.apiMod.BlockIndex
  
  type BytesReader = typings.ipldCar.codingMod.BytesReader
  
  type CID = typings.multiformats.mod.CID
  
  type RootsReader = typings.ipldCar.apiMod.RootsReader
}
