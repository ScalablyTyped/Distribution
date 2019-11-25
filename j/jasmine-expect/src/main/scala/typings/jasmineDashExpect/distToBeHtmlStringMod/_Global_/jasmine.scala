package typings.jasmineDashExpect.distToBeHtmlStringMod._Global_

import typings.jasmineDashExpect.distToBeHtmlStringMod.ToBeHtmlString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeHtmlString")
    var toBeHtmlString_Original: ToBeHtmlString = js.native
    def toBeHtmlString(): Boolean = js.native
    def toBeHtmlString(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

