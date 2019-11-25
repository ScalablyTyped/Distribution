package typings.jasmineDashExpect.distToBeLongerThanMod._Global_

import typings.jasmineDashExpect.distToBeLongerThanMod.ToBeLongerThan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeLongerThan")
    var toBeLongerThan_Original: ToBeLongerThan = js.native
    def toBeLongerThan(other: String): Boolean = js.native
    def toBeLongerThan(other: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

