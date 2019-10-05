package typings.jasmineDashExpect.distToStartWithMod

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
      @JSName("toStartWith")
      var toStartWith_Original: ToStartWith = js.native
      def toStartWith(subString: String): Boolean = js.native
      def toStartWith(subString: String, expectationFailOutput: js.Any): Boolean = js.native
    }
    
  }
  
}

