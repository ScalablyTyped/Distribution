package typings.jasmineDashExpect.distToBeWithinRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
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
  
}

