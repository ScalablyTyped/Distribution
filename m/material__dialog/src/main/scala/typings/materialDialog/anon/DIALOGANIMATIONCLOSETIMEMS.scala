package typings.materialDialog.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DIALOGANIMATIONCLOSETIMEMS extends js.Object {
  
  var DIALOG_ANIMATION_CLOSE_TIME_MS: Double = js.native
  
  var DIALOG_ANIMATION_OPEN_TIME_MS: Double = js.native
}
object DIALOGANIMATIONCLOSETIMEMS {
  
  @scala.inline
  def apply(DIALOG_ANIMATION_CLOSE_TIME_MS: Double, DIALOG_ANIMATION_OPEN_TIME_MS: Double): DIALOGANIMATIONCLOSETIMEMS = {
    val __obj = js.Dynamic.literal(DIALOG_ANIMATION_CLOSE_TIME_MS = DIALOG_ANIMATION_CLOSE_TIME_MS.asInstanceOf[js.Any], DIALOG_ANIMATION_OPEN_TIME_MS = DIALOG_ANIMATION_OPEN_TIME_MS.asInstanceOf[js.Any])
    __obj.asInstanceOf[DIALOGANIMATIONCLOSETIMEMS]
  }
  
  @scala.inline
  implicit class DIALOGANIMATIONCLOSETIMEMSOps[Self <: DIALOGANIMATIONCLOSETIMEMS] (val x: Self) extends AnyVal {
    
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
    def setDIALOG_ANIMATION_CLOSE_TIME_MS(value: Double): Self = this.set("DIALOG_ANIMATION_CLOSE_TIME_MS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDIALOG_ANIMATION_OPEN_TIME_MS(value: Double): Self = this.set("DIALOG_ANIMATION_OPEN_TIME_MS", value.asInstanceOf[js.Any])
  }
}
