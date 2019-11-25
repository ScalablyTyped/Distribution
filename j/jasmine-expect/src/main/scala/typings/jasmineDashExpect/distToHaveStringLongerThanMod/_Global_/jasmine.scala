package typings.jasmineDashExpect.distToHaveStringLongerThanMod._Global_

import typings.jasmineDashExpect.distToHaveStringLongerThanMod.ToHaveStringLongerThan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveStringLongerThan")
    var toHaveStringLongerThan_Original: ToHaveStringLongerThan = js.native
    def toHaveStringLongerThan(key: String, other: String): Boolean = js.native
    def toHaveStringLongerThan(key: String, other: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

