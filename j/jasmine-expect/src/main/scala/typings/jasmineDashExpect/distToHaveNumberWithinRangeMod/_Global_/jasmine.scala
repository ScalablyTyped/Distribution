package typings.jasmineDashExpect.distToHaveNumberWithinRangeMod._Global_

import typings.jasmineDashExpect.distToHaveNumberWithinRangeMod.ToHaveNumberWithinRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveNumberWithinRange")
    var toHaveNumberWithinRange_Original: ToHaveNumberWithinRange = js.native
    def toHaveNumberWithinRange(key: String, floor: Double, ceiling: Double): Boolean = js.native
    def toHaveNumberWithinRange(key: String, floor: Double, ceiling: Double, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

