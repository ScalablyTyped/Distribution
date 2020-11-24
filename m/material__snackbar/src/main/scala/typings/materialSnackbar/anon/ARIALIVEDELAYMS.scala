package typings.materialSnackbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIALIVEDELAYMS extends js.Object {
  
  var ARIA_LIVE_DELAY_MS: Double = js.native
  
  var DEFAULT_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
  
  var INDETERMINATE: Double = js.native
  
  var MAX_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
  
  var MIN_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
  
  var SNACKBAR_ANIMATION_CLOSE_TIME_MS: Double = js.native
  
  var SNACKBAR_ANIMATION_OPEN_TIME_MS: Double = js.native
}
object ARIALIVEDELAYMS {
  
  @scala.inline
  def apply(
    ARIA_LIVE_DELAY_MS: Double,
    DEFAULT_AUTO_DISMISS_TIMEOUT_MS: Double,
    INDETERMINATE: Double,
    MAX_AUTO_DISMISS_TIMEOUT_MS: Double,
    MIN_AUTO_DISMISS_TIMEOUT_MS: Double,
    SNACKBAR_ANIMATION_CLOSE_TIME_MS: Double,
    SNACKBAR_ANIMATION_OPEN_TIME_MS: Double
  ): ARIALIVEDELAYMS = {
    val __obj = js.Dynamic.literal(ARIA_LIVE_DELAY_MS = ARIA_LIVE_DELAY_MS.asInstanceOf[js.Any], DEFAULT_AUTO_DISMISS_TIMEOUT_MS = DEFAULT_AUTO_DISMISS_TIMEOUT_MS.asInstanceOf[js.Any], INDETERMINATE = INDETERMINATE.asInstanceOf[js.Any], MAX_AUTO_DISMISS_TIMEOUT_MS = MAX_AUTO_DISMISS_TIMEOUT_MS.asInstanceOf[js.Any], MIN_AUTO_DISMISS_TIMEOUT_MS = MIN_AUTO_DISMISS_TIMEOUT_MS.asInstanceOf[js.Any], SNACKBAR_ANIMATION_CLOSE_TIME_MS = SNACKBAR_ANIMATION_CLOSE_TIME_MS.asInstanceOf[js.Any], SNACKBAR_ANIMATION_OPEN_TIME_MS = SNACKBAR_ANIMATION_OPEN_TIME_MS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIALIVEDELAYMS]
  }
  
  @scala.inline
  implicit class ARIALIVEDELAYMSOps[Self <: ARIALIVEDELAYMS] (val x: Self) extends AnyVal {
    
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
    def setARIA_LIVE_DELAY_MS(value: Double): Self = this.set("ARIA_LIVE_DELAY_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEFAULT_AUTO_DISMISS_TIMEOUT_MS(value: Double): Self = this.set("DEFAULT_AUTO_DISMISS_TIMEOUT_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDETERMINATE(value: Double): Self = this.set("INDETERMINATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX_AUTO_DISMISS_TIMEOUT_MS(value: Double): Self = this.set("MAX_AUTO_DISMISS_TIMEOUT_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN_AUTO_DISMISS_TIMEOUT_MS(value: Double): Self = this.set("MIN_AUTO_DISMISS_TIMEOUT_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNACKBAR_ANIMATION_CLOSE_TIME_MS(value: Double): Self = this.set("SNACKBAR_ANIMATION_CLOSE_TIME_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNACKBAR_ANIMATION_OPEN_TIME_MS(value: Double): Self = this.set("SNACKBAR_ANIMATION_OPEN_TIME_MS", value.asInstanceOf[js.Any])
  }
}
