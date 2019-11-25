package typings.jasmineDashExpect.distToBeWholeNumberMod._Global_

import typings.jasmineDashExpect.distToBeWholeNumberMod.ToBeWholeNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeWholeNumber")
    var toBeWholeNumber_Original: ToBeWholeNumber = js.native
    def toBeWholeNumber(): Boolean = js.native
    def toBeWholeNumber(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

