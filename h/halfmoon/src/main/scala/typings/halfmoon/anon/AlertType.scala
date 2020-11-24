package typings.halfmoon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertType extends js.Object {
  
  var alertType: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var fillType: js.UndefOr[String] = js.native
  
  var hasDismissButton: js.UndefOr[Boolean] = js.native
  
  var timeShown: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object AlertType {
  
  @scala.inline
  def apply(): AlertType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertType]
  }
  
  @scala.inline
  implicit class AlertTypeOps[Self <: AlertType] (val x: Self) extends AnyVal {
    
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
    def setAlertType(value: String): Self = this.set("alertType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertType: Self = this.set("alertType", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFillType(value: String): Self = this.set("fillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillType: Self = this.set("fillType", js.undefined)
    
    @scala.inline
    def setHasDismissButton(value: Boolean): Self = this.set("hasDismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDismissButton: Self = this.set("hasDismissButton", js.undefined)
    
    @scala.inline
    def setTimeShown(value: Double): Self = this.set("timeShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeShown: Self = this.set("timeShown", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
