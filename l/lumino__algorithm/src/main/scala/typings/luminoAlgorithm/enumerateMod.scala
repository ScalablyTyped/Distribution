package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/enumerate", JSImport.Namespace)
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
  }
  
  def enumerate[T](`object`: IterableOrArrayLike[T]): IIterator[js.Tuple2[Double, T]] = js.native
  def enumerate[T](`object`: IterableOrArrayLike[T], start: Double): IIterator[js.Tuple2[Double, T]] = js.native
}

