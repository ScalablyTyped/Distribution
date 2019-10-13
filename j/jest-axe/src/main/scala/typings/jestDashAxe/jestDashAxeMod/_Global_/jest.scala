package typings.jestDashAxe.jestDashAxeMod._Global_

import typings.axeDashCore.axeDashCoreMod.AxeResults
import typings.jestDashAxe.jestDashAxeMod.AssertionsResult
import typings.jestDashAxe.jestDashAxeMod.IToHaveNoViolations
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jest")
@js.native
object jest extends js.Object {
  @js.native
  trait Matchers[R] extends js.Object {
    @JSName("toHaveNoViolations")
    var toHaveNoViolations_Original: IToHaveNoViolations = js.native
    def toHaveNoViolations(): AssertionsResult = js.native
    def toHaveNoViolations(results: Partial[AxeResults]): AssertionsResult = js.native
  }
  
}

