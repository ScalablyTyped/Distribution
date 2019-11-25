package typings.jasmineDashExpect.distToBeNonEmptyArrayMod._Global_

import typings.jasmineDashExpect.distToBeNonEmptyArrayMod.ToBeNonEmptyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeNonEmptyArray")
    var toBeNonEmptyArray_Original: ToBeNonEmptyArray = js.native
    def toBeNonEmptyArray(): Boolean = js.native
    def toBeNonEmptyArray(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

