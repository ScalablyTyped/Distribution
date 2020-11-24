package typings.jqueryNotifybar.JQueryNotifyBar

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyBarOptions extends js.Object {
  
  /**
    * How long this bar will be slided up and down.
    *
    * Default: "normal"
    */
  var animationSpeed: js.UndefOr[String | Double] = js.native
  
  /**
    * If set to true close button will be displayed.
    */
  var close: js.UndefOr[Boolean] = js.native
  
  /**
    * If enabled, user can hide notify bar just by click on it.
    */
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * If enabled, user can hide notify bar just by moving mouse cursor on it.
    */
  var closeOnOver: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the text to close button.
    */
  var closeText: js.UndefOr[String] = js.native
  
  /**
    * You can define own CSS class for Notify bar. There are too premade classes "error", "warning" and "success".
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /**
    * How long bar will be delayed, doesn't count animation time.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * What text will be inside bar. Can be HTML or just text.
    */
  var html: js.UndefOr[String] = js.native
  
  /**
    * Custom jQuery object for notify bar.
    */
  var jqObject: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  /**
    * Callback on before hide.
    */
  var onBeforeHide: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Callback on before show.
    */
  var onBeforeShow: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Callback on hide.
    */
  var onHide: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Callback on show.
    */
  var onShow: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Set the position of notify bar. Possible values are "top", "bottom".
    */
  var position: js.UndefOr[String] = js.native
}
object NotifyBarOptions {
  
  @scala.inline
  def apply(): NotifyBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyBarOptions]
  }
  
  @scala.inline
  implicit class NotifyBarOptionsOps[Self <: NotifyBarOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationSpeed(value: String | Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    
    @scala.inline
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    
    @scala.inline
    def setCloseOnOver(value: Boolean): Self = this.set("closeOnOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnOver: Self = this.set("closeOnOver", js.undefined)
    
    @scala.inline
    def setCloseText(value: String): Self = this.set("closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseText: Self = this.set("closeText", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setJqObject(value: JQuery[HTMLElement]): Self = this.set("jqObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJqObject: Self = this.set("jqObject", js.undefined)
    
    @scala.inline
    def setOnBeforeHide(value: () => _): Self = this.set("onBeforeHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    
    @scala.inline
    def setOnBeforeShow(value: () => _): Self = this.set("onBeforeShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => _): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => _): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
