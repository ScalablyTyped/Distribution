package typings.jasmineDashExpect.distToHaveNumberMod._Global_

import typings.jasmineDashExpect.distToHaveNumberMod.ToHaveNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveNumber")
    var toHaveNumber_Original: ToHaveNumber = js.native
    def toHaveNumber(key: String): Boolean = js.native
    def toHaveNumber(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

