package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/lib/enumerate", JSImport.Namespace)
@js.native
object enumerateMod extends js.Object {
  @js.native
  class EnumerateIterator[T] protected ()
    extends IIterator[js.Tuple2[Double, T]] {
    /**
      * Construct a new enumerate iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param start - The starting enum value.
      */
    def this(source: IIterator[T], start: Double) = this()
    var _index: js.Any = js.native
    var _source: js.Any = js.native
    /**
      * Get an iterator over the object's values.
      *
      * @returns An iterator which yields the object's values.
      *
      * #### Notes
      * Depending on the iterable, the returned iterator may or may not be
      * a new object. A collection or other container-like object should
      * typically return a new iterator, while an iterator itself should
      * normally return `this`.
      */
    /* CompleteClass */
    override def iter(): IIterator[js.Tuple2[Double, T]] = js.native
    /**
      * Get the next value from the iterator.
      *
      * @returns The next value from the iterator, or `undefined`.
      *
      * #### Notes
      * The `undefined` value is used to signal the end of iteration and
      * should therefore not be used as a value in a collection.
      *
      * The use of the `undefined` sentinel is an explicit design choice
      * which favors performance over purity. The ES6 iterator design of
      * returning a `{ value, done }` pair is suboptimal, as it requires
      * an object allocation on each iteration; and an `isDone()` method
      * would increase implementation and runtime complexity.
      */
    /* CompleteClass */
    override def next(): js.UndefOr[js.Tuple2[Double, T]] = js.native
  }
  
  def enumerate[T](`object`: IterableOrArrayLike[T]): IIterator[js.Tuple2[Double, T]] = js.native
  def enumerate[T](`object`: IterableOrArrayLike[T], start: Double): IIterator[js.Tuple2[Double, T]] = js.native
}

