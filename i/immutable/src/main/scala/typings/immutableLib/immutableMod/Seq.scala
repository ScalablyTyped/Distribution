package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Seq[K, V] extends Iterable[K, V] {
  // Force evaluation
  /**
       * Because Sequences are lazy and designed to be chained together, they do
       * not cache their results. For example, this map function is called a total
       * of 6 times, as each `join` iterates the Seq of three values.
       *
       *     var squares = Seq.of(1,2,3).map(x => x * x);
       *     squares.join() + squares.join();
       *
       * If you know a `Seq` will be used multiple times, it may be more
       * efficient to first cache it in memory. Here, the map function is called
       * only 3 times.
       *
       *     var squares = Seq.of(1,2,3).map(x => x * x).cacheResult();
       *     squares.join() + squares.join();
       *
       * Use this method judiciously, as it must fully evaluate a Seq which can be
       * a burden on memory and possibly performance.
       *
       * Note: after calling `cacheResult`, a Seq will always have a `size`.
       */
  def cacheResult(): Seq[K, V] = js.native
}

