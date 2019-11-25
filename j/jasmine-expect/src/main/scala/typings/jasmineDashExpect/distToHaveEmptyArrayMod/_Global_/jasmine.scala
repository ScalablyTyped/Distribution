package typings.jasmineDashExpect.distToHaveEmptyArrayMod._Global_

import typings.jasmineDashExpect.distToHaveEmptyArrayMod.ToHaveEmptyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveEmptyArray")
    var toHaveEmptyArray_Original: ToHaveEmptyArray = js.native
    def toHaveEmptyArray(key: String): Boolean = js.native
    def toHaveEmptyArray(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

