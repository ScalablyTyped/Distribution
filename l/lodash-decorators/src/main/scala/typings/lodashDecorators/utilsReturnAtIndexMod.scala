package typings.lodashDecorators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsReturnAtIndexMod {
  
  @JSImport("lodash-decorators/utils/returnAtIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def returnAtIndex(fn: js.Function, index: Double): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("returnAtIndex")(fn.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
