package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisibleCheckTime extends StObject {
  
  var focusVisibleCheckTime: Double
  
  var focusVisibleMaxCheckTimes: Double
  
  var focusVisibleTimeout: js.Any
}
object FocusVisibleCheckTime {
  
  inline def apply(focusVisibleCheckTime: Double, focusVisibleMaxCheckTimes: Double, focusVisibleTimeout: js.Any): FocusVisibleCheckTime = {
    val __obj = js.Dynamic.literal(focusVisibleCheckTime = focusVisibleCheckTime.asInstanceOf[js.Any], focusVisibleMaxCheckTimes = focusVisibleMaxCheckTimes.asInstanceOf[js.Any], focusVisibleTimeout = focusVisibleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusVisibleCheckTime]
  }
  
  extension [Self <: FocusVisibleCheckTime](x: Self) {
    
    inline def setFocusVisibleCheckTime(value: Double): Self = StObject.set(x, "focusVisibleCheckTime", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleMaxCheckTimes(value: Double): Self = StObject.set(x, "focusVisibleMaxCheckTimes", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleTimeout(value: js.Any): Self = StObject.set(x, "focusVisibleTimeout", value.asInstanceOf[js.Any])
  }
}
