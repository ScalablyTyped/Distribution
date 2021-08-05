package typings.materialTooltip

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTooltip.constantsMod.CssClasses
import typings.materialTooltip.constantsMod.XPosition
import typings.materialTooltip.constantsMod.YPosition
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tooltip.@material/tooltip/adapter.MDCTooltipAdapter> */
  trait PartialMDCTooltipAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ CssClasses, Unit]] = js.undefined
    
    var deregisterDocumentEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var getAnchorAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.undefined
    
    var getAnchorBoundingRect: js.UndefOr[js.Function0[ClientRect | Null]] = js.undefined
    
    var getAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.undefined
    
    var getTooltipSize: js.UndefOr[js.Function0[Height]] = js.undefined
    
    var getViewportHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getViewportWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ CssClasses, Boolean]] = js.undefined
    
    var isRTL: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var notifyHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var registerDocumentEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ CssClasses, Unit]] = js.undefined
    
    var setAttribute: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
    
    var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCTooltipAdapter {
    
    inline def apply(): PartialMDCTooltipAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTooltipAdapter]
    }
    
    extension [Self <: PartialMDCTooltipAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ CssClasses => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setDeregisterDocumentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterDocumentEventHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterDocumentEventHandlerUndefined: Self = StObject.set(x, "deregisterDocumentEventHandler", js.undefined)
      
      inline def setGetAnchorAttribute(value: /* attr */ String => String | Null): Self = StObject.set(x, "getAnchorAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAnchorAttributeUndefined: Self = StObject.set(x, "getAnchorAttribute", js.undefined)
      
      inline def setGetAnchorBoundingRect(value: () => ClientRect | Null): Self = StObject.set(x, "getAnchorBoundingRect", js.Any.fromFunction0(value))
      
      inline def setGetAnchorBoundingRectUndefined: Self = StObject.set(x, "getAnchorBoundingRect", js.undefined)
      
      inline def setGetAttribute(value: /* attr */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
      
      inline def setGetTooltipSize(value: () => Height): Self = StObject.set(x, "getTooltipSize", js.Any.fromFunction0(value))
      
      inline def setGetTooltipSizeUndefined: Self = StObject.set(x, "getTooltipSize", js.undefined)
      
      inline def setGetViewportHeight(value: () => Double): Self = StObject.set(x, "getViewportHeight", js.Any.fromFunction0(value))
      
      inline def setGetViewportHeightUndefined: Self = StObject.set(x, "getViewportHeight", js.undefined)
      
      inline def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      inline def setGetViewportWidthUndefined: Self = StObject.set(x, "getViewportWidth", js.undefined)
      
      inline def setHasClass(value: /* className */ CssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setNotifyHidden(value: () => Unit): Self = StObject.set(x, "notifyHidden", js.Any.fromFunction0(value))
      
      inline def setNotifyHiddenUndefined: Self = StObject.set(x, "notifyHidden", js.undefined)
      
      inline def setRegisterDocumentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerDocumentEventHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterDocumentEventHandlerUndefined: Self = StObject.set(x, "registerDocumentEventHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ CssClasses => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetAttribute(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
      
      inline def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetStylePropertyUndefined: Self = StObject.set(x, "setStyleProperty", js.undefined)
    }
  }
  
  trait XPos extends StObject {
    
    var xPos: js.UndefOr[XPosition] = js.undefined
    
    var yPos: js.UndefOr[YPosition] = js.undefined
  }
  object XPos {
    
    inline def apply(): XPos = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XPos]
    }
    
    extension [Self <: XPos](x: Self) {
      
      inline def setXPos(value: XPosition): Self = StObject.set(x, "xPos", value.asInstanceOf[js.Any])
      
      inline def setXPosUndefined: Self = StObject.set(x, "xPos", js.undefined)
      
      inline def setYPos(value: YPosition): Self = StObject.set(x, "yPos", value.asInstanceOf[js.Any])
      
      inline def setYPosUndefined: Self = StObject.set(x, "yPos", js.undefined)
    }
  }
}
