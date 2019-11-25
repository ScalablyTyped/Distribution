package typings.jasmineDashExpect.distToBeFalseMod._Global_

import typings.jasmineDashExpect.distToBeFalseMod.ToBeFalse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeFalse")
    var toBeFalse_Original: ToBeFalse = js.native
    def toBeFalse(): Boolean = js.native
    def toBeFalse(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

