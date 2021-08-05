package typings.materialIconButton

import typings.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCIconButtonToggleAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    /** Returns the given attribute value on the root element. */
    def getAttr(attrName: String): String | Null
    
    def hasClass(className: String): Boolean
    
    def notifyChange(evtData: MDCIconButtonToggleEventDetail): Unit
    
    def removeClass(className: String): Unit
    
    def setAttr(attrName: String, attrValue: String): Unit
  }
  object MDCIconButtonToggleAdapter {
    
    inline def apply(
      addClass: String => Unit,
      getAttr: String => String | Null,
      hasClass: String => Boolean,
      notifyChange: MDCIconButtonToggleEventDetail => Unit,
      removeClass: String => Unit,
      setAttr: (String, String) => Unit
    ): MDCIconButtonToggleAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getAttr = js.Any.fromFunction1(getAttr), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr))
      __obj.asInstanceOf[MDCIconButtonToggleAdapter]
    }
    
    extension [Self <: MDCIconButtonToggleAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setNotifyChange(value: MDCIconButtonToggleEventDetail => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetAttr(value: (String, String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
    }
  }
}
