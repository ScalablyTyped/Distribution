package typings.jasmineDashExpect.distToHaveNonEmptyArrayMod._Global_

import typings.jasmineDashExpect.distToHaveNonEmptyArrayMod.ToHaveNonEmptyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveNonEmptyArray")
    var toHaveNonEmptyArray_Original: ToHaveNonEmptyArray = js.native
    def toHaveNonEmptyArray(key: String): Boolean = js.native
    def toHaveNonEmptyArray(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

