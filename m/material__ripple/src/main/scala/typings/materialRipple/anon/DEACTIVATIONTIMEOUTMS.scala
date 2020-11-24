package typings.materialRipple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEACTIVATIONTIMEOUTMS extends js.Object {
  
  var DEACTIVATION_TIMEOUT_MS: Double = js.native
  
  var FG_DEACTIVATION_MS: Double = js.native
  
  var INITIAL_ORIGIN_SCALE: Double = js.native
  
  var PADDING: Double = js.native
  
  var TAP_DELAY_MS: Double = js.native
}
object DEACTIVATIONTIMEOUTMS {
  
  @scala.inline
  def apply(
    DEACTIVATION_TIMEOUT_MS: Double,
    FG_DEACTIVATION_MS: Double,
    INITIAL_ORIGIN_SCALE: Double,
    PADDING: Double,
    TAP_DELAY_MS: Double
  ): DEACTIVATIONTIMEOUTMS = {
    val __obj = js.Dynamic.literal(DEACTIVATION_TIMEOUT_MS = DEACTIVATION_TIMEOUT_MS.asInstanceOf[js.Any], FG_DEACTIVATION_MS = FG_DEACTIVATION_MS.asInstanceOf[js.Any], INITIAL_ORIGIN_SCALE = INITIAL_ORIGIN_SCALE.asInstanceOf[js.Any], PADDING = PADDING.asInstanceOf[js.Any], TAP_DELAY_MS = TAP_DELAY_MS.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEACTIVATIONTIMEOUTMS]
  }
  
  @scala.inline
  implicit class DEACTIVATIONTIMEOUTMSOps[Self <: DEACTIVATIONTIMEOUTMS] (val x: Self) extends AnyVal {
    
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
    def setDEACTIVATION_TIMEOUT_MS(value: Double): Self = this.set("DEACTIVATION_TIMEOUT_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFG_DEACTIVATION_MS(value: Double): Self = this.set("FG_DEACTIVATION_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINITIAL_ORIGIN_SCALE(value: Double): Self = this.set("INITIAL_ORIGIN_SCALE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPADDING(value: Double): Self = this.set("PADDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTAP_DELAY_MS(value: Double): Self = this.set("TAP_DELAY_MS", value.asInstanceOf[js.Any])
  }
}
