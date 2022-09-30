package typings.immer

import typings.immer.scopeMod.ImmerScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finalizeMod {
  
  @JSImport("immer/dist/core/finalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processResult(result: Any, scope: ImmerScope): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("processResult")(result.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
}
