package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationOptions extends js.Object {
  
  var allowHideAfter: js.UndefOr[Double] = js.native
  
  var animation: js.UndefOr[js.Any | Boolean] = js.native
  
  var appendTo: js.UndefOr[String | JQuery] = js.native
  
  var autoHideAfter: js.UndefOr[Double] = js.native
  
  var button: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var hide: js.UndefOr[js.Function1[/* e */ NotificationHideEvent, Unit]] = js.native
  
  var hideOnClick: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[NotificationPosition] = js.native
  
  var show: js.UndefOr[js.Function1[/* e */ NotificationShowEvent, Unit]] = js.native
  
  var stacking: js.UndefOr[String] = js.native
  
  var templates: js.UndefOr[js.Array[NotificationTemplate]] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object NotificationOptions {
  
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowHideAfter(value: Double): Self = this.set("allowHideAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHideAfter: Self = this.set("allowHideAfter", js.undefined)
    
    @scala.inline
    def setAnimation(value: js.Any | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAppendTo(value: String | JQuery): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAutoHideAfter(value: Double): Self = this.set("autoHideAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideAfter: Self = this.set("autoHideAfter", js.undefined)
    
    @scala.inline
    def setButton(value: Boolean): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHide(value: /* e */ NotificationHideEvent => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setHideOnClick(value: Boolean): Self = this.set("hideOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnClick: Self = this.set("hideOnClick", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPosition(value: NotificationPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShow(value: /* e */ NotificationShowEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStacking(value: String): Self = this.set("stacking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStacking: Self = this.set("stacking", js.undefined)
    
    @scala.inline
    def setTemplatesVarargs(value: NotificationTemplate*): Self = this.set("templates", js.Array(value :_*))
    
    @scala.inline
    def setTemplates(value: js.Array[NotificationTemplate]): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
