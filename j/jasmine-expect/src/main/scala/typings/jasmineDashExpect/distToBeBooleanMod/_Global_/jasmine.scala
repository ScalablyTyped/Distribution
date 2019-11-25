package typings.jasmineDashExpect.distToBeBooleanMod._Global_

import typings.jasmineDashExpect.distToBeBooleanMod.ToBeBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeBoolean")
    var toBeBoolean_Original: ToBeBoolean = js.native
    def toBeBoolean(): Boolean = js.native
    def toBeBoolean(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

