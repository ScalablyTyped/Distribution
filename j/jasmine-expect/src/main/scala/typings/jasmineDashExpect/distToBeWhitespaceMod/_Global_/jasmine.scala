package typings.jasmineDashExpect.distToBeWhitespaceMod._Global_

import typings.jasmineDashExpect.distToBeWhitespaceMod.ToBeWhitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeWhitespace")
    var toBeWhitespace_Original: ToBeWhitespace = js.native
    def toBeWhitespace(): Boolean = js.native
    def toBeWhitespace(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

