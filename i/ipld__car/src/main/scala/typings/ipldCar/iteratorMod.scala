package typings.ipldCar

import typings.ipldCar.distSrcIteratorMod.Block
import typings.ipldCar.distSrcIteratorMod.CID
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object iteratorMod {
  
  @JSImport("@ipld/car/iterator", "CarBlockIterator")
  @js.native
  open class CarBlockIterator protected ()
    extends typings.ipldCar.distSrcIteratorMod.CarBlockIterator {
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
    
    @JSImport("@ipld/car/iterator", "CarBlockIterator")
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
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typings.ipldCar.distSrcIteratorMod.CarBlockIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIteratorMod.CarBlockIterator]]
    
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
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typings.ipldCar.distSrcIteratorMod.CarBlockIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIteratorMod.CarBlockIterator]]
  }
  
  @JSImport("@ipld/car/iterator", "CarCIDIterator")
  @js.native
  open class CarCIDIterator protected ()
    extends typings.ipldCar.distSrcIteratorMod.CarCIDIterator {
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
    
    @JSImport("@ipld/car/iterator", "CarCIDIterator")
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
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typings.ipldCar.distSrcIteratorMod.CarCIDIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIteratorMod.CarCIDIterator]]
    
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
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typings.ipldCar.distSrcIteratorMod.CarCIDIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIteratorMod.CarCIDIterator]]
  }
  
  @JSImport("@ipld/car/iterator", "CarIteratorBase")
  @js.native
  open class CarIteratorBase protected ()
    extends typings.ipldCar.distSrcIteratorMod.CarIteratorBase {
    def this(version: Double, roots: js.Array[CID], iterable: Unit) = this()
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncIterable<Block>|void} iterable
      */
    def this(version: Double, roots: js.Array[CID], iterable: AsyncIterable[Block]) = this()
  }
}
