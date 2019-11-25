package typings.jasmineDashExpect.distToHaveDateMod._Global_

import typings.jasmineDashExpect.distToHaveDateMod.ToHaveDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveDate")
    var toHaveDate_Original: ToHaveDate = js.native
    def toHaveDate(key: String): Boolean = js.native
    def toHaveDate(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

