package typings.jasmineDashExpect.distToHaveStringMod._Global_

import typings.jasmineDashExpect.distToHaveStringMod.ToHaveString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveString")
    var toHaveString_Original: ToHaveString = js.native
    def toHaveString(key: String): Boolean = js.native
    def toHaveString(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

