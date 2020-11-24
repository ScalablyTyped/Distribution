package typings.materialTopAppBar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEBOUNCETHROTTLERESIZETIMEMS extends js.Object {
  
  var DEBOUNCE_THROTTLE_RESIZE_TIME_MS: Double = js.native
  
  var MAX_TOP_APP_BAR_HEIGHT: Double = js.native
}
object DEBOUNCETHROTTLERESIZETIMEMS {
  
  @scala.inline
  def apply(DEBOUNCE_THROTTLE_RESIZE_TIME_MS: Double, MAX_TOP_APP_BAR_HEIGHT: Double): DEBOUNCETHROTTLERESIZETIMEMS = {
    val __obj = js.Dynamic.literal(DEBOUNCE_THROTTLE_RESIZE_TIME_MS = DEBOUNCE_THROTTLE_RESIZE_TIME_MS.asInstanceOf[js.Any], MAX_TOP_APP_BAR_HEIGHT = MAX_TOP_APP_BAR_HEIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEBOUNCETHROTTLERESIZETIMEMS]
  }
  
  @scala.inline
  implicit class DEBOUNCETHROTTLERESIZETIMEMSOps[Self <: DEBOUNCETHROTTLERESIZETIMEMS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDEBOUNCE_THROTTLE_RESIZE_TIME_MS(value: Double): Self = this.set("DEBOUNCE_THROTTLE_RESIZE_TIME_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX_TOP_APP_BAR_HEIGHT(value: Double): Self = this.set("MAX_TOP_APP_BAR_HEIGHT", value.asInstanceOf[js.Any])
  }
}
