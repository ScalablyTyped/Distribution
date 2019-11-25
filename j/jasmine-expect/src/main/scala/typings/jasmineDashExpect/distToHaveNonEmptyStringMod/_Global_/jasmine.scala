package typings.jasmineDashExpect.distToHaveNonEmptyStringMod._Global_

import typings.jasmineDashExpect.distToHaveNonEmptyStringMod.ToHaveNonEmptyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveNonEmptyString")
    var toHaveNonEmptyString_Original: ToHaveNonEmptyString = js.native
    def toHaveNonEmptyString(key: String): Boolean = js.native
    def toHaveNonEmptyString(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

