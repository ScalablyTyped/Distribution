package typings.materialTextfield

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextAdapterMod {
  
  @js.native
  trait MDCTextFieldHelperTextAdapter extends StObject {
    
    /**
      * Adds a class to the helper text element.
      */
    def addClass(className: String): Unit = js.native
    
    /**
      * @return the specified attribute's value on the helper text element.
      */
    def getAttr(attr: String): String | Null = js.native
    
    /**
      * Returns whether or not the helper text element contains the given class.
      */
    def hasClass(className: String): Boolean = js.native
    
    /**
      * Removes an attribute from the helper text element.
      */
    def removeAttr(attr: String): Unit = js.native
    
    /**
      * Removes a class from the helper text element.
      */
    def removeClass(className: String): Unit = js.native
    
    /**
      * Sets an attribute with a given value on the helper text element.
      */
    def setAttr(attr: String, value: String): Unit = js.native
    
    /**
      * Sets the text content for the helper text element.
      */
    def setContent(content: String): Unit = js.native
  }
  object MDCTextFieldHelperTextAdapter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MDCTextFieldHelperTextAdapterMutableBuilder[Self <: MDCTextFieldHelperTextAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAttr(value: String => Unit): Self = StObject.set(x, "removeAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAttr(value: (String, String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    }
  }
}
