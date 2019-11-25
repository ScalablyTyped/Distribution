package typings.jasmineDashExpect.distToHaveOddNumberMod._Global_

import typings.jasmineDashExpect.distToHaveOddNumberMod.ToHaveOddNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveOddNumber")
    var toHaveOddNumber_Original: ToHaveOddNumber = js.native
    def toHaveOddNumber(key: String): Boolean = js.native
    def toHaveOddNumber(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

