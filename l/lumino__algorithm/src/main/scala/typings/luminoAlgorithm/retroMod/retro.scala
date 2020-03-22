package typings.luminoAlgorithm.retroMod

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/lib/retro", "retro")
@js.native
object retro extends js.Object {
  def apply[T](`object`: RetroableOrArrayLike[T]): IIterator[T] = js.native
}

