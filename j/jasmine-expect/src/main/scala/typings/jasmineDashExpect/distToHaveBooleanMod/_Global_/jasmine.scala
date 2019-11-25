package typings.jasmineDashExpect.distToHaveBooleanMod._Global_

import typings.jasmineDashExpect.distToHaveBooleanMod.ToHaveBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveBoolean")
    var toHaveBoolean_Original: ToHaveBoolean = js.native
    def toHaveBoolean(key: String): Boolean = js.native
    def toHaveBoolean(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

