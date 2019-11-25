package typings.jasmineDashExpect.distToBeDateMod._Global_

import typings.jasmineDashExpect.distToBeDateMod.ToBeDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeDate")
    var toBeDate_Original: ToBeDate = js.native
    def toBeDate(): Boolean = js.native
    def toBeDate(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

