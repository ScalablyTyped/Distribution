package typings.jasmineDashExpect.distToHaveWhitespaceStringMod._Global_

import typings.jasmineDashExpect.distToHaveWhitespaceStringMod.ToHaveWhitespaceString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveWhitespaceString")
    var toHaveWhitespaceString_Original: ToHaveWhitespaceString = js.native
    def toHaveWhitespaceString(key: String): Boolean = js.native
    def toHaveWhitespaceString(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

