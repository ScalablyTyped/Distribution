package typings.materialToolbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MAXTITLESIZE extends js.Object {
  
  var MAX_TITLE_SIZE: Double = js.native
  
   /** The ratio of max scrollTop that we should listen to to row height. */ var MIN_TITLE_SIZE: Double = js.native
  
  var TOOLBAR_MOBILE_BREAKPOINT: Double = js.native
  
  var TOOLBAR_ROW_HEIGHT: Double = js.native
  
  var TOOLBAR_ROW_MOBILE_HEIGHT: Double = js.native
}
object MAXTITLESIZE {
  
  @scala.inline
  def apply(
    MAX_TITLE_SIZE: Double,
    MIN_TITLE_SIZE: Double,
    TOOLBAR_MOBILE_BREAKPOINT: Double,
    TOOLBAR_ROW_HEIGHT: Double,
    TOOLBAR_ROW_MOBILE_HEIGHT: Double
  ): MAXTITLESIZE = {
    val __obj = js.Dynamic.literal(MAX_TITLE_SIZE = MAX_TITLE_SIZE.asInstanceOf[js.Any], MIN_TITLE_SIZE = MIN_TITLE_SIZE.asInstanceOf[js.Any], TOOLBAR_MOBILE_BREAKPOINT = TOOLBAR_MOBILE_BREAKPOINT.asInstanceOf[js.Any], TOOLBAR_ROW_HEIGHT = TOOLBAR_ROW_HEIGHT.asInstanceOf[js.Any], TOOLBAR_ROW_MOBILE_HEIGHT = TOOLBAR_ROW_MOBILE_HEIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[MAXTITLESIZE]
  }
  
  @scala.inline
  implicit class MAXTITLESIZEOps[Self <: MAXTITLESIZE] (val x: Self) extends AnyVal {
    
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
    def setMAX_TITLE_SIZE(value: Double): Self = this.set("MAX_TITLE_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN_TITLE_SIZE(value: Double): Self = this.set("MIN_TITLE_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOOLBAR_MOBILE_BREAKPOINT(value: Double): Self = this.set("TOOLBAR_MOBILE_BREAKPOINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOOLBAR_ROW_HEIGHT(value: Double): Self = this.set("TOOLBAR_ROW_HEIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOOLBAR_ROW_MOBILE_HEIGHT(value: Double): Self = this.set("TOOLBAR_ROW_MOBILE_HEIGHT", value.asInstanceOf[js.Any])
  }
}
