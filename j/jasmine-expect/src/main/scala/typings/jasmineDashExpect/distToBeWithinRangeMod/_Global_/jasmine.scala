package typings.jasmineDashExpect.distToBeWithinRangeMod._Global_

import typings.jasmineDashExpect.distToBeWithinRangeMod.ToBeWithinRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeWithinRange")
    var toBeWithinRange_Original: ToBeWithinRange = js.native
    def toBeWithinRange(floor: Double, ceiling: Double): Boolean = js.native
    def toBeWithinRange(floor: Double, ceiling: Double, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

