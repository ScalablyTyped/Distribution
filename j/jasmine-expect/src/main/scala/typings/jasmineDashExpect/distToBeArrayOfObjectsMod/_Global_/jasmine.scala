package typings.jasmineDashExpect.distToBeArrayOfObjectsMod._Global_

import typings.jasmineDashExpect.distToBeArrayOfObjectsMod.ToBeArrayOfObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeArrayOfObjects")
    var toBeArrayOfObjects_Original: ToBeArrayOfObjects = js.native
    def toBeArrayOfObjects(): Boolean = js.native
    def toBeArrayOfObjects(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

