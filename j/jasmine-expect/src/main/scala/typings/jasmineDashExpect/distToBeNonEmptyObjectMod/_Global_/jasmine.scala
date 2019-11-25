package typings.jasmineDashExpect.distToBeNonEmptyObjectMod._Global_

import typings.jasmineDashExpect.distToBeNonEmptyObjectMod.ToBeNonEmptyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeNonEmptyObject")
    var toBeNonEmptyObject_Original: ToBeNonEmptyObject = js.native
    def toBeNonEmptyObject(): Boolean = js.native
    def toBeNonEmptyObject(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

