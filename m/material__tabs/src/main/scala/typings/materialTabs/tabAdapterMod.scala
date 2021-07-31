package typings.materialTabs

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabAdapterMod {
  
  trait MDCTabAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def deregisterInteractionHandler[K /* <: EventType */](`type`: K, handler: SpecificEventListener[K]): Unit
    
    def getOffsetLeft(): Double
    
    def getOffsetWidth(): Double
    
    def notifySelected(): Unit
    
    def registerInteractionHandler[K /* <: EventType */](`type`: K, handler: SpecificEventListener[K]): Unit
    
    def removeClass(className: String): Unit
  }
  object MDCTabAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      deregisterInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      getOffsetLeft: () => Double,
      getOffsetWidth: () => Double,
      notifySelected: () => Unit,
      registerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      removeClass: String => Unit
    ): MDCTabAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getOffsetLeft = js.Any.fromFunction0(getOffsetLeft), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), notifySelected = js.Any.fromFunction0(notifySelected), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass))
      __obj.asInstanceOf[MDCTabAdapter]
    }
    
    @scala.inline
    implicit class MDCTabAdapterMutableBuilder[Self <: MDCTabAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetOffsetLeft(value: () => Double): Self = StObject.set(x, "getOffsetLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifySelected(value: () => Unit): Self = StObject.set(x, "notifySelected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
    }
  }
}
