package typings.jasmineDashExpect.distToBeNearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  object jasmine extends js.Object {
    @js.native
    trait Matchers[T] extends js.Object {
      @JSName("toBeNear")
      var toBeNear_Original: ToBeNear = js.native
      def toBeNear(value: Double, epsilon: Double): Boolean = js.native
      def toBeNear(value: Double, epsilon: Double, expectationFailOutput: js.Any): Boolean = js.native
    }
    
  }
  
}

