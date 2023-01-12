package typings.materialCircularProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCCircularProgressAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def getDeterminateCircleAttribute(attributeName: String): String | Null
    
    def hasClass(className: String): Boolean
    
    def removeAttribute(attributeName: String): Unit
    
    def removeClass(className: String): Unit
    
    def setAttribute(attributeName: String, value: String): Unit
    
    def setDeterminateCircleAttribute(attributeName: String, value: String): Unit
  }
  object MDCCircularProgressAdapter {
    
    inline def apply(
      addClass: String => Unit,
      getDeterminateCircleAttribute: String => String | Null,
      hasClass: String => Boolean,
      removeAttribute: String => Unit,
      removeClass: String => Unit,
      setAttribute: (String, String) => Unit,
      setDeterminateCircleAttribute: (String, String) => Unit
    ): MDCCircularProgressAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getDeterminateCircleAttribute = js.Any.fromFunction1(getDeterminateCircleAttribute), hasClass = js.Any.fromFunction1(hasClass), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), setAttribute = js.Any.fromFunction2(setAttribute), setDeterminateCircleAttribute = js.Any.fromFunction2(setDeterminateCircleAttribute))
      __obj.asInstanceOf[MDCCircularProgressAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCCircularProgressAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setGetDeterminateCircleAttribute(value: String => String | Null): Self = StObject.set(x, "getDeterminateCircleAttribute", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRemoveAttribute(value: String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetDeterminateCircleAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setDeterminateCircleAttribute", js.Any.fromFunction2(value))
    }
  }
}
