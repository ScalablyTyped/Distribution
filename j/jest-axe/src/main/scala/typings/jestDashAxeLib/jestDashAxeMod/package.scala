package typings
package jestDashAxeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashAxeMod {
  type IToHaveNoViolations = js.Function1[
    /* results */ js.UndefOr[stdLib.Partial[axeDashCoreLib.axeDashCoreMod.axeNs.AxeResults]], 
    AssertionsResult
  ]
  type JestAxe = js.Function2[
    /* html */ java.lang.String, 
    /* options */ js.UndefOr[AxeOptions], 
    js.Promise[axeDashCoreLib.axeDashCoreMod.axeNs.AxeResults]
  ]
}
