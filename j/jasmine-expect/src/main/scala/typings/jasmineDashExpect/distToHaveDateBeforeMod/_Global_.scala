package typings.jasmineDashExpect.distToHaveDateBeforeMod

import typings.std.Date
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
      @JSName("toHaveDateBefore")
      var toHaveDateBefore_Original: ToHaveDateBefore = js.native
      def toHaveDateBefore(key: String, otherDate: Date): Boolean = js.native
      def toHaveDateBefore(key: String, otherDate: Date, expectationFailOutput: js.Any): Boolean = js.native
    }
    
  }
  
}

