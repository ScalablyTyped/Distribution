package typings.jasmineDashExpect.distToHaveCalculableMod._Global_

import typings.jasmineDashExpect.distToHaveCalculableMod.ToHaveCalculable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveCalculable")
    var toHaveCalculable_Original: ToHaveCalculable = js.native
    def toHaveCalculable(key: String): Boolean = js.native
    def toHaveCalculable(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

