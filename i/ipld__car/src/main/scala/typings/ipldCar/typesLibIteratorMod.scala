package typings.ipldCar

import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibIteratorMod {
  
  @JSImport("@ipld/car/types/lib/iterator", "CarBlockIterator")
  @js.native
  open class CarBlockIterator protected ()
    extends CarIteratorBase
       with AsyncIterable[Block] {
    def this(version: Double, roots: js.Array[CID], iterable: Unit) = this()
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncIterable<Block>|void} iterable
      */
    def this(version: Double, roots: js.Array[CID], iterable: AsyncIterable[Block]) = this()
  }
  /* static members */
  object CarBlockIterator {
    
    @JSImport("@ipld/car/types/lib/iterator", "CarBlockIterator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarBlockIterator} from a `Uint8Array` blob. Rather
      * than decoding the entire byte array prior to returning the iterator, as in
      * {@link CarReader.fromBytes}, only the header is decoded and the remainder
      * of the CAR is parsed as the `Block`s as yielded.
      *
      * @async
      * @static
      * @memberof CarBlockIterator
      * @param {Uint8Array} bytes
      * @returns {Promise<CarBlockIterator>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[CarBlockIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarBlockIterator]]
    
    /**
      * Instantiate a {@link CarBlockIterator} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * Rather than decoding the entire byte array prior to returning the iterator,
      * as in {@link CarReader.fromIterable}, only the header is decoded and the
      * remainder of the CAR is parsed as the `Block`s as yielded.
      *
      * @async
      * @static
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarBlockIterator>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[CarBlockIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarBlockIterator]]
  }
  
  @JSImport("@ipld/car/types/lib/iterator", "CarCIDIterator")
  @js.native
  open class CarCIDIterator protected ()
    extends CarIteratorBase
       with AsyncIterable[CID] {
    def this(version: Double, roots: js.Array[CID], iterable: Unit) = this()
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncIterable<Block>|void} iterable
      */
    def this(version: Double, roots: js.Array[CID], iterable: AsyncIterable[Block]) = this()
  }
  /* static members */
  object CarCIDIterator {
    
    @JSImport("@ipld/car/types/lib/iterator", "CarCIDIterator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarCIDIterator} from a `Uint8Array` blob. Rather
      * than decoding the entire byte array prior to returning the iterator, as in
      * {@link CarReader.fromBytes}, only the header is decoded and the remainder
      * of the CAR is parsed as the `CID`s as yielded.
      *
      * @async
      * @static
      * @memberof CarCIDIterator
      * @param {Uint8Array} bytes
      * @returns {Promise<CarCIDIterator>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[CarCIDIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarCIDIterator]]
    
    /**
      * Instantiate a {@link CarCIDIterator} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * Rather than decoding the entire byte array prior to returning the iterator,
      * as in {@link CarReader.fromIterable}, only the header is decoded and the
      * remainder of the CAR is parsed as the `CID`s as yielded.
      *
      * @async
      * @static
      * @memberof CarCIDIterator
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarCIDIterator>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[CarCIDIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarCIDIterator]]
  }
  
  @JSImport("@ipld/car/types/lib/iterator", "CarIteratorBase")
  @js.native
  open class CarIteratorBase protected ()
    extends StObject
       with typings.ipldCar.typesApiMod.RootsReader {
    def this(version: Double, roots: js.Array[CID], iterable: Unit) = this()
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncIterable<Block>|void} iterable
      */
    def this(version: Double, roots: js.Array[CID], iterable: AsyncIterable[Block]) = this()
    
    var _decoded: Boolean = js.native
    
    var _iterable: Unit | AsyncIterable[typings.ipldCar.typesApiMod.Block] = js.native
    
    var _roots: js.Array[typings.multiformats.mod.CID[Any, Double, Double, Version]] = js.native
    
    var _version: Double = js.native
    
    /* CompleteClass */
    override def getRoots(): js.Promise[js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]] = js.native
    
    /* CompleteClass */
    var version: Double = js.native
    @JSName("version")
    def version_MCarIteratorBase: Double = js.native
  }
  
  type Block = typings.ipldCar.typesApiMod.Block
  
  type BytesReader = typings.ipldCar.typesLibCodingMod.BytesReader
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type RootsReader = typings.ipldCar.typesApiMod.RootsReader
}
