package typings.jasmineDashExpect.distToHaveMethodMod._Global_

import typings.jasmineDashExpect.distToHaveMethodMod.ToHaveMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveMethod")
    var toHaveMethod_Original: ToHaveMethod = js.native
    def toHaveMethod(key: String): Boolean = js.native
    def toHaveMethod(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

