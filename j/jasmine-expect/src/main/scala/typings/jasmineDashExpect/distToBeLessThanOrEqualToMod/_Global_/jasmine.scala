package typings.jasmineDashExpect.distToBeLessThanOrEqualToMod._Global_

import typings.jasmineDashExpect.distToBeLessThanOrEqualToMod.ToBeLessThanOrEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeLessThanOrEqualTo")
    var toBeLessThanOrEqualTo_Original: ToBeLessThanOrEqualTo = js.native
    def toBeLessThanOrEqualTo(otherNumber: Double): Boolean = js.native
    def toBeLessThanOrEqualTo(otherNumber: Double, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

