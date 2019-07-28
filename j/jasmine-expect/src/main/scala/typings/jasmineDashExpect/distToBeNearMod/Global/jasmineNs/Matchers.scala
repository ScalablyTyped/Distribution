package typings.jasmineDashExpect.distToBeNearMod.Global.jasmineNs

import typings.jasmineDashExpect.distToBeNearMod.ToBeNear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  @JSName("toBeNear")
  var toBeNear_Original: ToBeNear = js.native
  def toBeNear(value: Double, epsilon: Double): Boolean = js.native
  def toBeNear(value: Double, epsilon: Double, expectationFailOutput: js.Any): Boolean = js.native
}

