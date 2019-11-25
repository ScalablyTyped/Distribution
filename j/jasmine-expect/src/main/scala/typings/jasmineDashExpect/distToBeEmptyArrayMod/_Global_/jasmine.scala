package typings.jasmineDashExpect.distToBeEmptyArrayMod._Global_

import typings.jasmineDashExpect.distToBeEmptyArrayMod.ToBeEmptyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeEmptyArray")
    var toBeEmptyArray_Original: ToBeEmptyArray = js.native
    def toBeEmptyArray(): Boolean = js.native
    def toBeEmptyArray(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

