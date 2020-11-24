package typings.jestAxe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IToHaveNoViolations = js.Function1[
    /* results */ js.UndefOr[typings.jestAxe.anon.PartialAxeResults], 
    typings.jestAxe.mod.AssertionsResult
  ]
  
  type JestAxe = js.Function2[
    /* html */ typings.std.Element | java.lang.String, 
    /* options */ js.UndefOr[typings.axeCore.mod.RunOptions], 
    js.Promise[typings.axeCore.mod.AxeResults]
  ]
}
