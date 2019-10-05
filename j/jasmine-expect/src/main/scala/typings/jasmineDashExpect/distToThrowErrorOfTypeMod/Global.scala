package typings.jasmineDashExpect.distToThrowErrorOfTypeMod

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
      @JSName("toThrowErrorOfType")
      var toThrowErrorOfType_Original: ToThrowErrorOfType = js.native
      def toThrowErrorOfType(`type`: String): Boolean = js.native
      def toThrowErrorOfType(`type`: String, expectationFailOutput: js.Any): Boolean = js.native
    }
    
  }
  
}

