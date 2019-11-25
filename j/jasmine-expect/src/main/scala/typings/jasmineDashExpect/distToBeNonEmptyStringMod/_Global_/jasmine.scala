package typings.jasmineDashExpect.distToBeNonEmptyStringMod._Global_

import typings.jasmineDashExpect.distToBeNonEmptyStringMod.ToBeNonEmptyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeNonEmptyString")
    var toBeNonEmptyString_Original: ToBeNonEmptyString = js.native
    def toBeNonEmptyString(): Boolean = js.native
    def toBeNonEmptyString(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

