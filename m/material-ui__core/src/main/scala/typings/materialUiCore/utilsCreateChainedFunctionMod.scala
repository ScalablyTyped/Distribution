package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCreateChainedFunctionMod {
  
  @JSImport("@material-ui/core/utils/createChainedFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(funcs: ChainedFunction*): js.Function1[/* repeated */ Any, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, scala.Nothing]]
  
  type ChainedFunction = js.UndefOr[(js.Function1[/* repeated */ Any, Unit]) | Null]
}
