package typings.materialMenuSurface

import typings.materialMenuSurface.typesMod.MDCMenuDimensions
import typings.materialMenuSurface.typesMod.MDCMenuPoint
import typings.std.ClientRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ANCHOR extends StObject {
    
    var ANCHOR: String = js.native
    
    var ANIMATING_CLOSED: String = js.native
    
    var ANIMATING_OPEN: String = js.native
    
    var FIXED: String = js.native
    
    var IS_OPEN_BELOW: String = js.native
    
    var OPEN: String = js.native
    
    var ROOT: String = js.native
  }
  object ANCHOR {
    
    @scala.inline
    def apply(
      ANCHOR: String,
      ANIMATING_CLOSED: String,
      ANIMATING_OPEN: String,
      FIXED: String,
      IS_OPEN_BELOW: String,
      OPEN: String,
      ROOT: String
    ): ANCHOR = {
      val __obj = js.Dynamic.literal(ANCHOR = ANCHOR.asInstanceOf[js.Any], ANIMATING_CLOSED = ANIMATING_CLOSED.asInstanceOf[js.Any], ANIMATING_OPEN = ANIMATING_OPEN.asInstanceOf[js.Any], FIXED = FIXED.asInstanceOf[js.Any], IS_OPEN_BELOW = IS_OPEN_BELOW.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANCHOR]
    }
    
    @scala.inline
    implicit class ANCHORMutableBuilder[Self <: ANCHOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setANCHOR(value: String): Self = StObject.set(x, "ANCHOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setANIMATING_CLOSED(value: String): Self = StObject.set(x, "ANIMATING_CLOSED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setANIMATING_OPEN(value: String): Self = StObject.set(x, "ANIMATING_OPEN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIXED(value: String): Self = StObject.set(x, "FIXED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIS_OPEN_BELOW(value: String): Self = StObject.set(x, "IS_OPEN_BELOW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN(value: String): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ANCHORTOMENUSURFACEWIDTHRATIO extends StObject {
    
    var ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double = js.native
    
    var MARGIN_TO_EDGE: Double = js.native
    
    var TRANSITION_CLOSE_DURATION: Double = js.native
    
    var TRANSITION_OPEN_DURATION: Double = js.native
  }
  object ANCHORTOMENUSURFACEWIDTHRATIO {
    
    @scala.inline
    def apply(
      ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double,
      MARGIN_TO_EDGE: Double,
      TRANSITION_CLOSE_DURATION: Double,
      TRANSITION_OPEN_DURATION: Double
    ): ANCHORTOMENUSURFACEWIDTHRATIO = {
      val __obj = js.Dynamic.literal(ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO = ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO.asInstanceOf[js.Any], MARGIN_TO_EDGE = MARGIN_TO_EDGE.asInstanceOf[js.Any], TRANSITION_CLOSE_DURATION = TRANSITION_CLOSE_DURATION.asInstanceOf[js.Any], TRANSITION_OPEN_DURATION = TRANSITION_OPEN_DURATION.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANCHORTOMENUSURFACEWIDTHRATIO]
    }
    
    @scala.inline
    implicit class ANCHORTOMENUSURFACEWIDTHRATIOMutableBuilder[Self <: ANCHORTOMENUSURFACEWIDTHRATIO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setANCHOR_TO_MENU_SURFACE_WIDTH_RATIO(value: Double): Self = StObject.set(x, "ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMARGIN_TO_EDGE(value: Double): Self = StObject.set(x, "MARGIN_TO_EDGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSITION_CLOSE_DURATION(value: Double): Self = StObject.set(x, "TRANSITION_CLOSE_DURATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSITION_OPEN_DURATION(value: Double): Self = StObject.set(x, "TRANSITION_OPEN_DURATION", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CLOSEDEVENT extends StObject {
    
    var CLOSED_EVENT: String = js.native
    
    var FOCUSABLE_ELEMENTS: String = js.native
    
    var OPENED_EVENT: String = js.native
  }
  object CLOSEDEVENT {
    
    @scala.inline
    def apply(CLOSED_EVENT: String, FOCUSABLE_ELEMENTS: String, OPENED_EVENT: String): CLOSEDEVENT = {
      val __obj = js.Dynamic.literal(CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], FOCUSABLE_ELEMENTS = FOCUSABLE_ELEMENTS.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLOSEDEVENT]
    }
    
    @scala.inline
    implicit class CLOSEDEVENTMutableBuilder[Self <: CLOSEDEVENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCLOSED_EVENT(value: String): Self = StObject.set(x, "CLOSED_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFOCUSABLE_ELEMENTS(value: String): Self = StObject.set(x, "FOCUSABLE_ELEMENTS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPENED_EVENT(value: String): Self = StObject.set(x, "OPENED_EVENT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/menu-surface.@material/menu-surface/types.MDCMenuDistance> */
  @js.native
  trait PartialMDCMenuDistance extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object PartialMDCMenuDistance {
    
    @scala.inline
    def apply(): PartialMDCMenuDistance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCMenuDistance]
    }
    
    @scala.inline
    implicit class PartialMDCMenuDistanceMutableBuilder[Self <: PartialMDCMenuDistance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@material/menu-surface.@material/menu-surface/adapter.MDCMenuSurfaceAdapter> */
  @js.native
  trait PartialMDCMenuSurfaceAdap extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var getAnchorDimensions: js.UndefOr[js.Function0[ClientRect | Null]] = js.native
    
    var getBodyDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
    
    var getInnerDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
    
    var getWindowDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
    
    var getWindowScroll: js.UndefOr[js.Function0[MDCMenuPoint]] = js.native
    
    var hasAnchor: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var isElementInContainer: js.UndefOr[js.Function1[/* el */ Element, Boolean]] = js.native
    
    var isFocused: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var isRtl: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var notifyClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var saveFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var setMaxHeight: js.UndefOr[js.Function1[/* height */ String, Unit]] = js.native
    
    var setPosition: js.UndefOr[js.Function1[/* position */ PartialMDCMenuDistance, Unit]] = js.native
    
    var setTransformOrigin: js.UndefOr[js.Function1[/* origin */ String, Unit]] = js.native
  }
  object PartialMDCMenuSurfaceAdap {
    
    @scala.inline
    def apply(): PartialMDCMenuSurfaceAdap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCMenuSurfaceAdap]
    }
    
    @scala.inline
    implicit class PartialMDCMenuSurfaceAdapMutableBuilder[Self <: PartialMDCMenuSurfaceAdap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setGetAnchorDimensions(value: () => ClientRect | Null): Self = StObject.set(x, "getAnchorDimensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAnchorDimensionsUndefined: Self = StObject.set(x, "getAnchorDimensions", js.undefined)
      
      @scala.inline
      def setGetBodyDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getBodyDimensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBodyDimensionsUndefined: Self = StObject.set(x, "getBodyDimensions", js.undefined)
      
      @scala.inline
      def setGetInnerDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getInnerDimensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInnerDimensionsUndefined: Self = StObject.set(x, "getInnerDimensions", js.undefined)
      
      @scala.inline
      def setGetWindowDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getWindowDimensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWindowDimensionsUndefined: Self = StObject.set(x, "getWindowDimensions", js.undefined)
      
      @scala.inline
      def setGetWindowScroll(value: () => MDCMenuPoint): Self = StObject.set(x, "getWindowScroll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWindowScrollUndefined: Self = StObject.set(x, "getWindowScroll", js.undefined)
      
      @scala.inline
      def setHasAnchor(value: () => Boolean): Self = StObject.set(x, "hasAnchor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasAnchorUndefined: Self = StObject.set(x, "hasAnchor", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setIsElementInContainer(value: /* el */ Element => Boolean): Self = StObject.set(x, "isElementInContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsElementInContainerUndefined: Self = StObject.set(x, "isElementInContainer", js.undefined)
      
      @scala.inline
      def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      @scala.inline
      def setIsRtl(value: () => Boolean): Self = StObject.set(x, "isRtl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
      
      @scala.inline
      def setNotifyClose(value: () => Unit): Self = StObject.set(x, "notifyClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyCloseUndefined: Self = StObject.set(x, "notifyClose", js.undefined)
      
      @scala.inline
      def setNotifyOpen(value: () => Unit): Self = StObject.set(x, "notifyOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyOpenUndefined: Self = StObject.set(x, "notifyOpen", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setRestoreFocus(value: () => Unit): Self = StObject.set(x, "restoreFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      @scala.inline
      def setSaveFocus(value: () => Unit): Self = StObject.set(x, "saveFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveFocusUndefined: Self = StObject.set(x, "saveFocus", js.undefined)
      
      @scala.inline
      def setSetMaxHeight(value: /* height */ String => Unit): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxHeightUndefined: Self = StObject.set(x, "setMaxHeight", js.undefined)
      
      @scala.inline
      def setSetPosition(value: /* position */ PartialMDCMenuDistance => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
      
      @scala.inline
      def setSetTransformOrigin(value: /* origin */ String => Unit): Self = StObject.set(x, "setTransformOrigin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTransformOriginUndefined: Self = StObject.set(x, "setTransformOrigin", js.undefined)
    }
  }
}
