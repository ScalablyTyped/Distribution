package typings.jasmineDashExpect.distToBeAfterMod.Global.jasmineNs

import typings.jasmineDashExpect.distToBeAfterMod.ToBeAfter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  @JSName("toBeAfter")
  var toBeAfter_Original: ToBeAfter = js.native
  def toBeAfter(otherDate: Date): Boolean = js.native
  def toBeAfter(otherDate: Date, expectationFailOutput: js.Any): Boolean = js.native
}

