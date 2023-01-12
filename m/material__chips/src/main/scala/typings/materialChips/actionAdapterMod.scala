package typings.materialChips

import typings.materialChips.actionConstantsMod.MDCChipActionAttributes
import typings.materialChips.actionConstantsMod.MDCChipActionEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionAdapterMod {
  
  trait MDCChipActionAdapter extends StObject {
    
    def emitEvent[D /* <: js.Object */](name: MDCChipActionEvents, detail: D): Unit
    
    def focus(): Unit
    
    def getAttribute(attr: MDCChipActionAttributes): String | Null
    
    def getElementID(): String
    
    def removeAttribute(attr: MDCChipActionAttributes): Unit
    
    def setAttribute(attr: MDCChipActionAttributes, value: String): Unit
  }
  object MDCChipActionAdapter {
    
    inline def apply(
      emitEvent: (MDCChipActionEvents, Any) => Unit,
      focus: () => Unit,
      getAttribute: MDCChipActionAttributes => String | Null,
      getElementID: () => String,
      removeAttribute: MDCChipActionAttributes => Unit,
      setAttribute: (MDCChipActionAttributes, String) => Unit
    ): MDCChipActionAdapter = {
      val __obj = js.Dynamic.literal(emitEvent = js.Any.fromFunction2(emitEvent), focus = js.Any.fromFunction0(focus), getAttribute = js.Any.fromFunction1(getAttribute), getElementID = js.Any.fromFunction0(getElementID), removeAttribute = js.Any.fromFunction1(removeAttribute), setAttribute = js.Any.fromFunction2(setAttribute))
      __obj.asInstanceOf[MDCChipActionAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCChipActionAdapter] (val x: Self) extends AnyVal {
      
      inline def setEmitEvent(value: (MDCChipActionEvents, Any) => Unit): Self = StObject.set(x, "emitEvent", js.Any.fromFunction2(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetAttribute(value: MDCChipActionAttributes => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetElementID(value: () => String): Self = StObject.set(x, "getElementID", js.Any.fromFunction0(value))
      
      inline def setRemoveAttribute(value: MDCChipActionAttributes => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setSetAttribute(value: (MDCChipActionAttributes, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
    }
  }
}
