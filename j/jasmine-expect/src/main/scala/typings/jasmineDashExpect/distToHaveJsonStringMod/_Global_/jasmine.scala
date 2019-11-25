package typings.jasmineDashExpect.distToHaveJsonStringMod._Global_

import typings.jasmineDashExpect.distToHaveJsonStringMod.ToHaveJsonString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveJsonString")
    var toHaveJsonString_Original: ToHaveJsonString = js.native
    def toHaveJsonString(key: String): Boolean = js.native
    def toHaveJsonString(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

