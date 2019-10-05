package typings.jasmineDashExpect.distToHaveStringMod

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
      @JSName("toHaveString")
      var toHaveString_Original: ToHaveString = js.native
      def toHaveString(key: String): Boolean = js.native
      def toHaveString(key: String, expectationFailOutput: js.Any): Boolean = js.native
    }
    
  }
  
}

