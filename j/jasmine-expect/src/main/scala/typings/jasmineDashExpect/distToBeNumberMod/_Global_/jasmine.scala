package typings.jasmineDashExpect.distToBeNumberMod._Global_

import typings.jasmineDashExpect.distToBeNumberMod.ToBeNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeNumber")
    var toBeNumber_Original: ToBeNumber = js.native
    def toBeNumber(): Boolean = js.native
    def toBeNumber(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

