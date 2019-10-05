package typings.jasmineDashExpect.distToHaveDateAfterMod

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
      @JSName("toHaveDateAfter")
      var toHaveDateAfter_Original: ToHaveDateAfter = js.native
      def toHaveDateAfter(key: String, otherDate: Date): Boolean = js.native
      def toHaveDateAfter(key: String, otherDate: Date, expectationFailOutput: js.Any): Boolean = js.native
    }
    
  }
  
}

