package typings.jasmineDashExpect.distToBeEmptyObjectMod._Global_

import typings.jasmineDashExpect.distToBeEmptyObjectMod.ToBeEmptyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeEmptyObject")
    var toBeEmptyObject_Original: ToBeEmptyObject = js.native
    def toBeEmptyObject(): Boolean = js.native
    def toBeEmptyObject(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

