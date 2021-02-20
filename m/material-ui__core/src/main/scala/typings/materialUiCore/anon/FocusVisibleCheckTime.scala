package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusVisibleCheckTime extends StObject {
  
  var focusVisibleCheckTime: Double = js.native
  
  var focusVisibleMaxCheckTimes: Double = js.native
  
  var focusVisibleTimeout: js.Any = js.native
}
object FocusVisibleCheckTime {
  
  @scala.inline
  def apply(focusVisibleCheckTime: Double, focusVisibleMaxCheckTimes: Double, focusVisibleTimeout: js.Any): FocusVisibleCheckTime = {
    val __obj = js.Dynamic.literal(focusVisibleCheckTime = focusVisibleCheckTime.asInstanceOf[js.Any], focusVisibleMaxCheckTimes = focusVisibleMaxCheckTimes.asInstanceOf[js.Any], focusVisibleTimeout = focusVisibleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusVisibleCheckTime]
  }
  
  @scala.inline
  implicit class FocusVisibleCheckTimeMutableBuilder[Self <: FocusVisibleCheckTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusVisibleCheckTime(value: Double): Self = StObject.set(x, "focusVisibleCheckTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisibleMaxCheckTimes(value: Double): Self = StObject.set(x, "focusVisibleMaxCheckTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisibleTimeout(value: js.Any): Self = StObject.set(x, "focusVisibleTimeout", value.asInstanceOf[js.Any])
  }
}
