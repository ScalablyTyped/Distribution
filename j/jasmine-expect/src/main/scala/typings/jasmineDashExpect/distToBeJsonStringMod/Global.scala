package typings.jasmineDashExpect.distToBeJsonStringMod

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
      @JSName("toBeJsonString")
      var toBeJsonString_Original: ToBeJsonString = js.native
      def toBeJsonString(): Boolean = js.native
      def toBeJsonString(expectationFailOutput: js.Any): Boolean = js.native
    }
    
  }
  
}

