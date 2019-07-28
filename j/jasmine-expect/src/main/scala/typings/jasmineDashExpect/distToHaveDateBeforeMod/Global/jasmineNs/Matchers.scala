package typings.jasmineDashExpect.distToHaveDateBeforeMod.Global.jasmineNs

import typings.jasmineDashExpect.distToHaveDateBeforeMod.ToHaveDateBefore
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  @JSName("toHaveDateBefore")
  var toHaveDateBefore_Original: ToHaveDateBefore = js.native
  def toHaveDateBefore(key: String, otherDate: Date): Boolean = js.native
  def toHaveDateBefore(key: String, otherDate: Date, expectationFailOutput: js.Any): Boolean = js.native
}

