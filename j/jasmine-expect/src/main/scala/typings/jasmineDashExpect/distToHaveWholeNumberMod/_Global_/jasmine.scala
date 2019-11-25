package typings.jasmineDashExpect.distToHaveWholeNumberMod._Global_

import typings.jasmineDashExpect.distToHaveWholeNumberMod.ToHaveWholeNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveWholeNumber")
    var toHaveWholeNumber_Original: ToHaveWholeNumber = js.native
    def toHaveWholeNumber(key: String): Boolean = js.native
    def toHaveWholeNumber(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

