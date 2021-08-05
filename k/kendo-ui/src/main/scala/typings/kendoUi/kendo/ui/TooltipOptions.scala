package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions extends StObject {
  
  var animation: js.UndefOr[Boolean | TooltipAnimation] = js.undefined
  
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  var callout: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[String | js.Function | TooltipContent] = js.undefined
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ TooltipErrorEvent, Unit]] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hide: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.undefined
  
  var iframe: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var requestStart: js.UndefOr[js.Function1[/* e */ TooltipRequestStartEvent, Unit]] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ TooltipEvent, Unit]] = js.undefined
  
  var showAfter: js.UndefOr[Double] = js.undefined
  
  var showOn: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TooltipOptions {
  
  inline def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  extension [Self <: TooltipOptions](x: Self) {
    
    inline def setAnimation(value: Boolean | TooltipAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setContent(value: String | js.Function | TooltipContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentLoad(value: /* e */ TooltipEvent => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
    
    inline def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setError(value: /* e */ TooltipErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHide(value: /* e */ TooltipEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRequestStart(value: /* e */ TooltipRequestStartEvent => Unit): Self = StObject.set(x, "requestStart", js.Any.fromFunction1(value))
    
    inline def setRequestStartUndefined: Self = StObject.set(x, "requestStart", js.undefined)
    
    inline def setShow(value: /* e */ TooltipEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowAfter(value: Double): Self = StObject.set(x, "showAfter", value.asInstanceOf[js.Any])
    
    inline def setShowAfterUndefined: Self = StObject.set(x, "showAfter", js.undefined)
    
    inline def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
