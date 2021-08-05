package typings.materialTextfield

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextAdapterMod {
  
  trait MDCTextFieldHelperTextAdapter extends StObject {
    
    /**
      * Adds a class to the helper text element.
      */
    def addClass(className: String): Unit
    
    /**
      * @return the specified attribute's value on the helper text element.
      */
    def getAttr(attr: String): String | Null
    
    /**
      * Returns whether or not the helper text element contains the given class.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Removes an attribute from the helper text element.
      */
    def removeAttr(attr: String): Unit
    
    /**
      * Removes a class from the helper text element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets an attribute with a given value on the helper text element.
      */
    def setAttr(attr: String, value: String): Unit
    
    /**
      * Sets the text content for the helper text element.
      */
    def setContent(content: String): Unit
  }
  object MDCTextFieldHelperTextAdapter {
    
    inline def apply(
      addClass: String => Unit,
      getAttr: String => String | Null,
      hasClass: String => Boolean,
      removeAttr: String => Unit,
      removeClass: String => Unit,
      setAttr: (String, String) => Unit,
      setContent: String => Unit
    ): MDCTextFieldHelperTextAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getAttr = js.Any.fromFunction1(getAttr), hasClass = js.Any.fromFunction1(hasClass), removeAttr = js.Any.fromFunction1(removeAttr), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr), setContent = js.Any.fromFunction1(setContent))
      __obj.asInstanceOf[MDCTextFieldHelperTextAdapter]
    }
    
    extension [Self <: MDCTextFieldHelperTextAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRemoveAttr(value: String => Unit): Self = StObject.set(x, "removeAttr", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetAttr(value: (String, String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
      
      inline def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    }
  }
}
