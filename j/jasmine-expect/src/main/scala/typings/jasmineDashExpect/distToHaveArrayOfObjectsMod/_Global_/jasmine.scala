package typings.jasmineDashExpect.distToHaveArrayOfObjectsMod._Global_

import typings.jasmineDashExpect.distToHaveArrayOfObjectsMod.ToHaveArrayOfObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveArrayOfObjects")
    var toHaveArrayOfObjects_Original: ToHaveArrayOfObjects = js.native
    def toHaveArrayOfObjects(key: String): Boolean = js.native
    def toHaveArrayOfObjects(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

