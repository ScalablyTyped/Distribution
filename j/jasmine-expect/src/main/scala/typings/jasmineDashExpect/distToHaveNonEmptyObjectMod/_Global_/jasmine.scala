package typings.jasmineDashExpect.distToHaveNonEmptyObjectMod._Global_

import typings.jasmineDashExpect.distToHaveNonEmptyObjectMod.ToHaveNonEmptyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveNonEmptyObject")
    var toHaveNonEmptyObject_Original: ToHaveNonEmptyObject = js.native
    def toHaveNonEmptyObject(key: String): Boolean = js.native
    def toHaveNonEmptyObject(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

