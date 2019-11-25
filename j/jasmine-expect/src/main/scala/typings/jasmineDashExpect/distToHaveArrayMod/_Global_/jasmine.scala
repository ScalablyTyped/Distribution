package typings.jasmineDashExpect.distToHaveArrayMod._Global_

import typings.jasmineDashExpect.distToHaveArrayMod.ToHaveArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveArray")
    var toHaveArray_Original: ToHaveArray = js.native
    def toHaveArray(key: String): Boolean = js.native
    def toHaveArray(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

