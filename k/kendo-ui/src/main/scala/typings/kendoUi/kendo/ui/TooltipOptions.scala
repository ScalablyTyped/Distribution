package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipOptions extends js.Object {
  
  var animation: js.UndefOr[Boolean | TooltipAnimation] = js.native
  
  var autoHide: js.UndefOr[Boolean] = js.native
  
  var callout: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[String | js.Function | TooltipContent] = js.native
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ TooltipErrorEvent, Unit]] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hide: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.native
  
  var iframe: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var requestStart: js.UndefOr[js.Function1[/* e */ TooltipRequestStartEvent, Unit]] = js.native
  
  var show: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.native
  
  var showAfter: js.UndefOr[Double] = js.native
  
  var showOn: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object TooltipOptions {
  
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean | TooltipAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setCallout(value: Boolean): Self = this.set("callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    
    @scala.inline
    def setContent(value: String | js.Function | TooltipContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ TooltipEvent => Unit): Self = this.set("contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentLoad: Self = this.set("contentLoad", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ TooltipErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHide(value: /* e */ TooltipEvent => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setIframe(value: Boolean): Self = this.set("iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRequestStart(value: /* e */ TooltipRequestStartEvent => Unit): Self = this.set("requestStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestStart: Self = this.set("requestStart", js.undefined)
    
    @scala.inline
    def setShow(value: /* e */ TooltipEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowAfter(value: Double): Self = this.set("showAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAfter: Self = this.set("showAfter", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = this.set("showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOn: Self = this.set("showOn", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
