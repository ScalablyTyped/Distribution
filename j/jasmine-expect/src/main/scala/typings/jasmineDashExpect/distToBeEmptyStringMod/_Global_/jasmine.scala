package typings.jasmineDashExpect.distToBeEmptyStringMod._Global_

import typings.jasmineDashExpect.distToBeEmptyStringMod.ToBeEmptyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeEmptyString")
    var toBeEmptyString_Original: ToBeEmptyString = js.native
    def toBeEmptyString(): Boolean = js.native
    def toBeEmptyString(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

