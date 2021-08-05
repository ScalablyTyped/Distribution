package typings.materialMenuSurface

import typings.materialMenuSurface.anon.PartialMDCMenuDistance
import typings.materialMenuSurface.typesMod.MDCMenuDimensions
import typings.materialMenuSurface.typesMod.MDCMenuPoint
import typings.std.ClientRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCMenuSurfaceAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def getAnchorDimensions(): ClientRect | Null
    
    def getBodyDimensions(): MDCMenuDimensions
    
    def getInnerDimensions(): MDCMenuDimensions
    
    def getWindowDimensions(): MDCMenuDimensions
    
    def getWindowScroll(): MDCMenuPoint
    
    def hasAnchor(): Boolean
    
    def hasClass(className: String): Boolean
    
    def isElementInContainer(el: Element): Boolean
    
    def isFocused(): Boolean
    
    def isRtl(): Boolean
    
    /** Emits an event when the menu surface is closed. */
    def notifyClose(): Unit
    
    /** Emits an event when the menu surface is opened. */
    def notifyOpen(): Unit
    
    def removeClass(className: String): Unit
    
    /** Restores focus to the element that was focused before the menu surface was opened. */
    def restoreFocus(): Unit
    
    /** Saves the element that was focused before the menu surface was opened. */
    def saveFocus(): Unit
    
    def setMaxHeight(height: String): Unit
    
    def setPosition(position: PartialMDCMenuDistance): Unit
    
    def setTransformOrigin(origin: String): Unit
  }
  object MDCMenuSurfaceAdapter {
    
    inline def apply(
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
    
    extension [Self <: MDCMenuSurfaceAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setGetAnchorDimensions(value: () => ClientRect | Null): Self = StObject.set(x, "getAnchorDimensions", js.Any.fromFunction0(value))
      
      inline def setGetBodyDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getBodyDimensions", js.Any.fromFunction0(value))
      
      inline def setGetInnerDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getInnerDimensions", js.Any.fromFunction0(value))
      
      inline def setGetWindowDimensions(value: () => MDCMenuDimensions): Self = StObject.set(x, "getWindowDimensions", js.Any.fromFunction0(value))
      
      inline def setGetWindowScroll(value: () => MDCMenuPoint): Self = StObject.set(x, "getWindowScroll", js.Any.fromFunction0(value))
      
      inline def setHasAnchor(value: () => Boolean): Self = StObject.set(x, "hasAnchor", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsElementInContainer(value: Element => Boolean): Self = StObject.set(x, "isElementInContainer", js.Any.fromFunction1(value))
      
      inline def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      inline def setIsRtl(value: () => Boolean): Self = StObject.set(x, "isRtl", js.Any.fromFunction0(value))
      
      inline def setNotifyClose(value: () => Unit): Self = StObject.set(x, "notifyClose", js.Any.fromFunction0(value))
      
      inline def setNotifyOpen(value: () => Unit): Self = StObject.set(x, "notifyOpen", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRestoreFocus(value: () => Unit): Self = StObject.set(x, "restoreFocus", js.Any.fromFunction0(value))
      
      inline def setSaveFocus(value: () => Unit): Self = StObject.set(x, "saveFocus", js.Any.fromFunction0(value))
      
      inline def setSetMaxHeight(value: String => Unit): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
      
      inline def setSetPosition(value: PartialMDCMenuDistance => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
      
      inline def setSetTransformOrigin(value: String => Unit): Self = StObject.set(x, "setTransformOrigin", js.Any.fromFunction1(value))
    }
  }
}
