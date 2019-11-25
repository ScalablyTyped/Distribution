package typings.jasmineDashExpect.distToHaveUndefinedMod._Global_

import typings.jasmineDashExpect.distToHaveUndefinedMod.ToHaveUndefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveUndefined")
    var toHaveUndefined_Original: ToHaveUndefined = js.native
    def toHaveUndefined(key: String): Boolean = js.native
    def toHaveUndefined(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

