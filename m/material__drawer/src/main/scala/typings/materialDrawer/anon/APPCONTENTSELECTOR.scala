package typings.materialDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APPCONTENTSELECTOR extends js.Object {
  
  var APP_CONTENT_SELECTOR: String = js.native
  
  var CLOSE_EVENT: String = js.native
  
  var OPEN_EVENT: String = js.native
  
  var SCRIM_SELECTOR: String = js.native
}
object APPCONTENTSELECTOR {
  
  @scala.inline
  def apply(APP_CONTENT_SELECTOR: String, CLOSE_EVENT: String, OPEN_EVENT: String, SCRIM_SELECTOR: String): APPCONTENTSELECTOR = {
    val __obj = js.Dynamic.literal(APP_CONTENT_SELECTOR = APP_CONTENT_SELECTOR.asInstanceOf[js.Any], CLOSE_EVENT = CLOSE_EVENT.asInstanceOf[js.Any], OPEN_EVENT = OPEN_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[APPCONTENTSELECTOR]
  }
  
  @scala.inline
  implicit class APPCONTENTSELECTOROps[Self <: APPCONTENTSELECTOR] (val x: Self) extends AnyVal {
    
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
    def setAPP_CONTENT_SELECTOR(value: String): Self = this.set("APP_CONTENT_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLOSE_EVENT(value: String): Self = this.set("CLOSE_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPEN_EVENT(value: String): Self = this.set("OPEN_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCRIM_SELECTOR(value: String): Self = this.set("SCRIM_SELECTOR", value.asInstanceOf[js.Any])
  }
}
