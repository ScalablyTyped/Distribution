package typings.jasmineDashExpect.distToHaveEmptyStringMod._Global_

import typings.jasmineDashExpect.distToHaveEmptyStringMod.ToHaveEmptyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveEmptyString")
    var toHaveEmptyString_Original: ToHaveEmptyString = js.native
    def toHaveEmptyString(key: String): Boolean = js.native
    def toHaveEmptyString(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

