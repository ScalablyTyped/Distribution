package typings.jasmineDashExpect.distToBeBeforeMod.Global.jasmineNs

import typings.jasmineDashExpect.distToBeBeforeMod.ToBeBefore
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  @JSName("toBeBefore")
  var toBeBefore_Original: ToBeBefore = js.native
  def toBeBefore(otherDate: Date): Boolean = js.native
  def toBeBefore(otherDate: Date, expectationFailOutput: js.Any): Boolean = js.native
}

