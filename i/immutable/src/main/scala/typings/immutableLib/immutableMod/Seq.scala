package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Seq[K, V] extends Collection[K, V] {
  /**
    * Some Seqs can describe their size lazily. When this is the case,
    * size will be an integer. Otherwise it will be undefined.
    *
    * For example, Seqs returned from `map()` or `reverse()`
    * preserve the size of the original `Seq` while `filter()` does not.
    *
    * Note: `Range`, `Repeat` and `Seq`s made from `Array`s and `Object`s will
    * always have a size.
    */
  val size: js.UndefOr[scala.Double] = js.native
  // Force evaluation
  /**
    * Because Sequences are lazy and designed to be chained together, they do
    * not cache their results. For example, this map function is called a total
    * of 6 times, as each `join` iterates the Seq of three values.
    *
    *     var squares = Seq([ 1, 2, 3 ]).map(x => x * x)
    *     squares.join() + squares.join()
    *
    * If you know a `Seq` will be used multiple times, it may be more
    * efficient to first cache it in memory. Here, the map function is called
    * only 3 times.
    *
    *     var squares = Seq([ 1, 2, 3 ]).map(x => x * x).cacheResult()
    *     squares.join() + squares.join()
    *
    * Use this method judiciously, as it must fully evaluate a Seq which can be
    * a burden on memory and possibly performance.
    *
    * Note: after calling `cacheResult`, a Seq will always have a `size`.
    */
  def cacheResult(): this.type = js.native
  /**
    * Returns a new Seq with only the values for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_FVSeq[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ scala.Boolean]
  ): Seq[K, F] = js.native
  @JSName("filter")
  def filter_FVSeq[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ scala.Boolean],
    context: js.Any
  ): Seq[K, F] = js.native
}

