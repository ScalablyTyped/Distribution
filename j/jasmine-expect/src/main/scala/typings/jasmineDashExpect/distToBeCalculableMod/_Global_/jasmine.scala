package typings.jasmineDashExpect.distToBeCalculableMod._Global_

import typings.jasmineDashExpect.distToBeCalculableMod.ToBeCalculable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeCalculable")
    var toBeCalculable_Original: ToBeCalculable = js.native
    def toBeCalculable(): Boolean = js.native
    def toBeCalculable(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

