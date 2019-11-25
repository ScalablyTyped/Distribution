package typings.jasmineDashExpect.distToHaveFalseMod._Global_

import typings.jasmineDashExpect.distToHaveFalseMod.ToHaveFalse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveFalse")
    var toHaveFalse_Original: ToHaveFalse = js.native
    def toHaveFalse(key: String): Boolean = js.native
    def toHaveFalse(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

