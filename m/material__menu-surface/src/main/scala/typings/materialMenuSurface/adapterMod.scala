package typings.materialMenuSurface

import typings.materialMenuSurface.anon.PartialMDCMenuDistance
import typings.materialMenuSurface.typesMod.MDCMenuDimensions
import typings.materialMenuSurface.typesMod.MDCMenuPoint
import typings.std.ClientRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCMenuSurfaceAdapter extends StObject {
    
    def addClass(className: String): Unit = js.native
    
    def getAnchorDimensions(): ClientRect | Null = js.native
    
    def getBodyDimensions(): MDCMenuDimensions = js.native
    
    def getInnerDimensions(): MDCMenuDimensions = js.native
    
    def getWindowDimensions(): MDCMenuDimensions = js.native
    
    def getWindowScroll(): MDCMenuPoint = js.native
    
    def hasAnchor(): Boolean = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def isElementInContainer(el: Element): Boolean = js.native
    
    def isFocused(): Boolean = js.native
    
    def isRtl(): Boolean = js.native
    
    /** Emits an event when the menu surface is closed. */
    def notifyClose(): Unit = js.native
    
    /** Emits an event when the menu surface is opened. */
    def notifyOpen(): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    /** Restores focus to the element that was focused before the menu surface was opened. */
    def restoreFocus(): Unit = js.native
    
    /** Saves the element that was focused before the menu surface was opened. */
    def saveFocus(): Unit = js.native
    
    def setMaxHeight(height: String): Unit = js.native
    
    def setPosition(position: PartialMDCMenuDistance): Unit = js.native
    
    def setTransformOrigin(origin: String): Unit = js.native
  }
  object MDCMenuSurfaceAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      getAnchorDimensions: () => ClientRect | Null,
      getBodyDimensions: () => MDCMenuDimensions,
      getInnerDimensions: () => MDCMenuDimensions,
      getWindowDimensions: () => MDCMenuDimensions,
      getWindowScroll: () => MDCMenuPoint,
      hasAnchor: () => Boolean,
      hasClass: String => Boolean,
      isElementInContainer: Element => Boolean,
      isFocused: () => Boolean,
      isRtl: () => Boolean,
      notifyClose: () => Unit,
      notifyOpen: () => Unit,
      removeClass: String => Unit,
      restoreFocus: () => Unit,
      saveFocus: () => Unit,
      setMaxHeight: String => Unit,
      setPosition: PartialMDCMenuDistance => Unit,
      setTransformOrigin: String => Unit
    ): MDCMenuSurfaceAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getAnchorDimensions = js.Any.fromFunction0(getAnchorDimensions), getBodyDimensions = js.Any.fromFunction0(getBodyDimensions), getInnerDimensions = js.Any.fromFunction0(getInnerDimensions), getWindowDimensions = js.Any.fromFunction0(getWindowDimensions), getWindowScroll = js.Any.fromFunction0(getWindowScroll), hasAnchor = js.Any.fromFunction0(hasAnchor), hasClass = js.Any.fromFunction1(hasClass), isElementInContainer = js.Any.fromFunction1(isElementInContainer), isFocused = js.Any.fromFunction0(isFocused), isRtl = js.Any.fromFunction0(isRtl), notifyClose = js.Any.fromFunction0(notifyClose), notifyOpen = js.Any.fromFunction0(notifyOpen), removeClass = js.Any.fromFunction1(removeClass), restoreFocus = js.Any.fromFunction0(restoreFocus), saveFocus = js.Any.fromFunction0(saveFocus), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setPosition = js.Any.fromFunction1(setPosition), setTransformOrigin = js.Any.fromFunction1(setTransformOrigin))
      __obj.asInstanceOf[MDCMenuSurfaceAdapter]
    }
    
    @scala.inline
    implicit class MDCMenuSurfaceAdapterMutableBuilder[Self <: MDCMenuSurfaceAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAnchorDimensions(value: () => ClientRect | Null): Self = StObject.set(x, "getAnchorDimensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBodyDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getBodyDimensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInnerDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getInnerDimensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWindowDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getWindowDimensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWindowScroll(value: () => MDCMenuPoint): Self = StObject.set(x, "getWindowScroll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasAnchor(value: () => Boolean): Self = StObject.set(x, "hasAnchor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsElementInContainer(value: Element => Boolean): Self = StObject.set(x, "isElementInContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRtl(value: () => Boolean): Self = StObject.set(x, "isRtl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyClose(value: () => Unit): Self = StObject.set(x, "notifyClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyOpen(value: () => Unit): Self = StObject.set(x, "notifyOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestoreFocus(value: () => Unit): Self = StObject.set(x, "restoreFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveFocus(value: () => Unit): Self = StObject.set(x, "saveFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetMaxHeight(value: String => Unit): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPosition(value: PartialMDCMenuDistance => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTransformOrigin(value: String => Unit): Self = StObject.set(x, "setTransformOrigin", js.Any.fromFunction1(value))
    }
  }
}
