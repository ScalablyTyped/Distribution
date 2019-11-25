package typings.jasmineDashExpect.distToHaveObjectMod._Global_

import typings.jasmineDashExpect.distToHaveObjectMod.ToHaveObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveObject")
    var toHaveObject_Original: ToHaveObject = js.native
    def toHaveObject(key: String): Boolean = js.native
    def toHaveObject(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

