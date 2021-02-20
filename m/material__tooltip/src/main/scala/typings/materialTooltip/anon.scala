package typings.materialTooltip

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTooltip.constantsMod.CssClasses
import typings.materialTooltip.constantsMod.XPosition
import typings.materialTooltip.constantsMod.YPosition
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tooltip.@material/tooltip/adapter.MDCTooltipAdapter> */
  @js.native
  trait PartialMDCTooltipAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ CssClasses, Unit]] = js.native
    
    var deregisterDocumentEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.native
    
    var getAnchorAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
    
    var getAnchorBoundingRect: js.UndefOr[js.Function0[ClientRect | Null]] = js.native
    
    var getAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
    
    var getTooltipSize: js.UndefOr[js.Function0[Height]] = js.native
    
    var getViewportHeight: js.UndefOr[js.Function0[Double]] = js.native
    
    var getViewportWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ CssClasses, Boolean]] = js.native
    
    var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var notifyHidden: js.UndefOr[js.Function0[Unit]] = js.native
    
    var registerDocumentEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ CssClasses, Unit]] = js.native
    
    var setAttribute: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
    
    var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCTooltipAdapter {
    
    @scala.inline
    def apply(): PartialMDCTooltipAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTooltipAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCTooltipAdapterMutableBuilder[Self <: PartialMDCTooltipAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ CssClasses => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setDeregisterDocumentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterDocumentEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterDocumentEventHandlerUndefined: Self = StObject.set(x, "deregisterDocumentEventHandler", js.undefined)
      
      @scala.inline
      def setGetAnchorAttribute(value: /* attr */ String => String | Null): Self = StObject.set(x, "getAnchorAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAnchorAttributeUndefined: Self = StObject.set(x, "getAnchorAttribute", js.undefined)
      
      @scala.inline
      def setGetAnchorBoundingRect(value: () => ClientRect | Null): Self = StObject.set(x, "getAnchorBoundingRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAnchorBoundingRectUndefined: Self = StObject.set(x, "getAnchorBoundingRect", js.undefined)
      
      @scala.inline
      def setGetAttribute(value: /* attr */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
      
      @scala.inline
      def setGetTooltipSize(value: () => Height): Self = StObject.set(x, "getTooltipSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTooltipSizeUndefined: Self = StObject.set(x, "getTooltipSize", js.undefined)
      
      @scala.inline
      def setGetViewportHeight(value: () => Double): Self = StObject.set(x, "getViewportHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportHeightUndefined: Self = StObject.set(x, "getViewportHeight", js.undefined)
      
      @scala.inline
      def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportWidthUndefined: Self = StObject.set(x, "getViewportWidth", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ CssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      @scala.inline
      def setNotifyHidden(value: () => Unit): Self = StObject.set(x, "notifyHidden", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyHiddenUndefined: Self = StObject.set(x, "notifyHidden", js.undefined)
      
      @scala.inline
      def setRegisterDocumentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerDocumentEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterDocumentEventHandlerUndefined: Self = StObject.set(x, "registerDocumentEventHandler", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ CssClasses => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetAttribute(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
      
      @scala.inline
      def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStylePropertyUndefined: Self = StObject.set(x, "setStyleProperty", js.undefined)
    }
  }
  
  @js.native
  trait XPos extends StObject {
    
    var xPos: js.UndefOr[XPosition] = js.native
    
    var yPos: js.UndefOr[YPosition] = js.native
  }
  object XPos {
    
    @scala.inline
    def apply(): XPos = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XPos]
    }
    
    @scala.inline
    implicit class XPosMutableBuilder[Self <: XPos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXPos(value: XPosition): Self = StObject.set(x, "xPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXPosUndefined: Self = StObject.set(x, "xPos", js.undefined)
      
      @scala.inline
      def setYPos(value: YPosition): Self = StObject.set(x, "yPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYPosUndefined: Self = StObject.set(x, "yPos", js.undefined)
    }
  }
}
