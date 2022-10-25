package typings.ipldCar

import typings.ipldCar.distSrcIndexerMod.BlockIndex
import typings.ipldCar.distSrcIndexerMod.CID
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object indexerMod {
  
  @JSImport("@ipld/car/indexer", "CarIndexer")
  @js.native
  open class CarIndexer protected ()
    extends typings.ipldCar.distSrcIndexerMod.CarIndexer {
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncGenerator<BlockIndex>} iterator
      */
    def this(version: Double, roots: js.Array[CID], iterator: AsyncGenerator[BlockIndex, Any, Any]) = this()
  }
  /* static members */
  object CarIndexer {
    
    @JSImport("@ipld/car/indexer", "CarIndexer")
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
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typings.ipldCar.distSrcIndexerMod.CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIndexerMod.CarIndexer]]
    
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
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typings.ipldCar.distSrcIndexerMod.CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIndexerMod.CarIndexer]]
  }
}
