package typings.linq.linqMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", "matches")
@js.native
object matches extends js.Object {
  def apply[T](input: String, pattern: String): IEnumerable[T] = js.native
  def apply[T](input: String, pattern: String, flags: String): IEnumerable[T] = js.native
  def apply[T](input: String, pattern: RegExp): IEnumerable[T] = js.native
}

