package typings.jasmineDashExpect.distToHaveHtmlStringMod._Global_

import typings.jasmineDashExpect.distToHaveHtmlStringMod.ToHaveHtmlString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveHtmlString")
    var toHaveHtmlString_Original: ToHaveHtmlString = js.native
    def toHaveHtmlString(key: String): Boolean = js.native
    def toHaveHtmlString(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

