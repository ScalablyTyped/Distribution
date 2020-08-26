package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/find", JSImport.Namespace)
@js.native
object findMod extends js.Object {
  def find[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  def findIndex[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
  def max[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = js.native
  def min[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = js.native
  def minmax[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[js.Tuple2[T, T]] = js.native
}

