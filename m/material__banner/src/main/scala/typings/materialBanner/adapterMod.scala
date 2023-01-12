package typings.materialBanner

import typings.materialBanner.constantsMod.Action
import typings.materialBanner.constantsMod.CloseReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCBannerAdapter extends StObject {
    
    /**
      * Adds the given class to the banner root element.
      */
    def addClass(className: String): Unit
    
    /**
      * @return Returns the height of the banner content element.
      */
    def getContentHeight(): Double
    
    /**
      * Broadcasts an event denoting that a banner button was clicked without
      * changing the banner state.
      */
    def notifyActionClicked(action: Action): Unit
    
    /**
      * Broadcasts an event denoting that the banner has finished closing.
      */
    def notifyClosed(reason: CloseReason): Unit
    
    /**
      * Broadcasts an event denoting that the banner has just started closing.
      */
    def notifyClosing(reason: CloseReason): Unit
    
    /**
      * Broadcasts an event denoting that the banner has finished opening.
      */
    def notifyOpened(): Unit
    
    /**
      * Broadcasts an event denoting that the banner has just started opening.
      */
    def notifyOpening(): Unit
    
    /**
      * Releases focus from banner and restores focus to the previously focused
      * element.
      */
    def releaseFocus(): Unit
    
    /**
      * Removes the given class from the banner root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets a style property of the banner root element to the passed value.
      */
    def setStyleProperty(propertyName: String, value: String): Unit
    
    /**
      * Traps focus in banner and focuses on the primary action button.
      */
    def trapFocus(): Unit
  }
  object MDCBannerAdapter {
    
    inline def apply(
      addClass: String => Unit,
      getContentHeight: () => Double,
      notifyActionClicked: Action => Unit,
      notifyClosed: CloseReason => Unit,
      notifyClosing: CloseReason => Unit,
      notifyOpened: () => Unit,
      notifyOpening: () => Unit,
      releaseFocus: () => Unit,
      removeClass: String => Unit,
      setStyleProperty: (String, String) => Unit,
      trapFocus: () => Unit
    ): MDCBannerAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getContentHeight = js.Any.fromFunction0(getContentHeight), notifyActionClicked = js.Any.fromFunction1(notifyActionClicked), notifyClosed = js.Any.fromFunction1(notifyClosed), notifyClosing = js.Any.fromFunction1(notifyClosing), notifyOpened = js.Any.fromFunction0(notifyOpened), notifyOpening = js.Any.fromFunction0(notifyOpening), releaseFocus = js.Any.fromFunction0(releaseFocus), removeClass = js.Any.fromFunction1(removeClass), setStyleProperty = js.Any.fromFunction2(setStyleProperty), trapFocus = js.Any.fromFunction0(trapFocus))
      __obj.asInstanceOf[MDCBannerAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCBannerAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setGetContentHeight(value: () => Double): Self = StObject.set(x, "getContentHeight", js.Any.fromFunction0(value))
      
      inline def setNotifyActionClicked(value: Action => Unit): Self = StObject.set(x, "notifyActionClicked", js.Any.fromFunction1(value))
      
      inline def setNotifyClosed(value: CloseReason => Unit): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1(value))
      
      inline def setNotifyClosing(value: CloseReason => Unit): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1(value))
      
      inline def setNotifyOpened(value: () => Unit): Self = StObject.set(x, "notifyOpened", js.Any.fromFunction0(value))
      
      inline def setNotifyOpening(value: () => Unit): Self = StObject.set(x, "notifyOpening", js.Any.fromFunction0(value))
      
      inline def setReleaseFocus(value: () => Unit): Self = StObject.set(x, "releaseFocus", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetStyleProperty(value: (String, String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
      
      inline def setTrapFocus(value: () => Unit): Self = StObject.set(x, "trapFocus", js.Any.fromFunction0(value))
    }
  }
}
