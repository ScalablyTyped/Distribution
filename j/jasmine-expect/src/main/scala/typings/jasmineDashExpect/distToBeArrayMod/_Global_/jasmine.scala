package typings.jasmineDashExpect.distToBeArrayMod._Global_

import typings.jasmineDashExpect.distToBeArrayMod.ToBeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeArray")
    var toBeArray_Original: ToBeArray = js.native
    def toBeArray(): Boolean = js.native
    def toBeArray(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

