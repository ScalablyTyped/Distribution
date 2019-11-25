package typings.jasmineDashExpect.distToBeGreaterThanOrEqualToMod._Global_

import typings.jasmineDashExpect.distToBeGreaterThanOrEqualToMod.ToBeGreaterThanOrEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeGreaterThanOrEqualTo")
    var toBeGreaterThanOrEqualTo_Original: ToBeGreaterThanOrEqualTo = js.native
    def toBeGreaterThanOrEqualTo(otherNumber: Double): Boolean = js.native
    def toBeGreaterThanOrEqualTo(otherNumber: Double, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

