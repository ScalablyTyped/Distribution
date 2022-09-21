package typings.hummerEnv

import typings.hummerEnv.hummerEnvStrings.hidden
import typings.hummerEnv.hummerEnvStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewStyle
  extends StObject
     with HummerCommonStyle {
  
  var overflow: js.UndefOr[visible | hidden] = js.undefined
}
object ViewStyle {
  
  inline def apply(): ViewStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewStyle]
  }
  
  extension [Self <: ViewStyle](x: Self) {
    
    inline def setOverflow(value: visible | hidden): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
  }
}
