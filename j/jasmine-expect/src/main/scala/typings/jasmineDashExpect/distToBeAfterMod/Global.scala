package typings.jasmineDashExpect.distToBeAfterMod

import typings.std.Date
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
      @JSName("toBeAfter")
      var toBeAfter_Original: ToBeAfter = js.native
      def toBeAfter(otherDate: Date): Boolean = js.native
      def toBeAfter(otherDate: Date, expectationFailOutput: js.Any): Boolean = js.native
    }
    
  }
  
}

