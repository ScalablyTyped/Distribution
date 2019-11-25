package typings.jasmineDashExpect.distToBeObjectMod._Global_

import typings.jasmineDashExpect.distToBeObjectMod.ToBeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeObject")
    var toBeObject_Original: ToBeObject = js.native
    def toBeObject(): Boolean = js.native
    def toBeObject(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

