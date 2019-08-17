package typings.jestDashAxe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashAxeMod {
  import typings.axeDashCore.axeDashCoreMod.AxeResults
  import typings.std.Partial

  type IToHaveNoViolations = js.Function1[/* results */ js.UndefOr[Partial[AxeResults]], AssertionsResult]
  type JestAxe = js.Function2[/* html */ String, /* options */ js.UndefOr[AxeOptions], js.Promise[AxeResults]]
}
