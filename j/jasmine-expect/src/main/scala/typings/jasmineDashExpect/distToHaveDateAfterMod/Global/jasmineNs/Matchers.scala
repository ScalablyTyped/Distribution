package typings.jasmineDashExpect.distToHaveDateAfterMod.Global.jasmineNs

import typings.jasmineDashExpect.distToHaveDateAfterMod.ToHaveDateAfter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  @JSName("toHaveDateAfter")
  var toHaveDateAfter_Original: ToHaveDateAfter = js.native
  def toHaveDateAfter(key: String, otherDate: Date): Boolean = js.native
  def toHaveDateAfter(key: String, otherDate: Date, expectationFailOutput: js.Any): Boolean = js.native
}

