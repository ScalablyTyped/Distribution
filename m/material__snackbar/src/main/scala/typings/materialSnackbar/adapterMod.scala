package typings.materialSnackbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCSnackbarAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def announce(): Unit
    
    def notifyClosed(reason: String): Unit
    
    def notifyClosing(reason: String): Unit
    
    def notifyOpened(): Unit
    
    def notifyOpening(): Unit
    
    def removeClass(className: String): Unit
  }
  object MDCSnackbarAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      announce: () => Unit,
      notifyClosed: String => Unit,
      notifyClosing: String => Unit,
      notifyOpened: () => Unit,
      notifyOpening: () => Unit,
      removeClass: String => Unit
    ): MDCSnackbarAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), announce = js.Any.fromFunction0(announce), notifyClosed = js.Any.fromFunction1(notifyClosed), notifyClosing = js.Any.fromFunction1(notifyClosing), notifyOpened = js.Any.fromFunction0(notifyOpened), notifyOpening = js.Any.fromFunction0(notifyOpening), removeClass = js.Any.fromFunction1(removeClass))
      __obj.asInstanceOf[MDCSnackbarAdapter]
    }
    
    @scala.inline
    implicit class MDCSnackbarAdapterMutableBuilder[Self <: MDCSnackbarAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnnounce(value: () => Unit): Self = StObject.set(x, "announce", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyClosed(value: String => Unit): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyClosing(value: String => Unit): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyOpened(value: () => Unit): Self = StObject.set(x, "notifyOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyOpening(value: () => Unit): Self = StObject.set(x, "notifyOpening", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
    }
  }
}
