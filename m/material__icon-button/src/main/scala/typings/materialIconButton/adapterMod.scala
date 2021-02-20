package typings.materialIconButton

import typings.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCIconButtonToggleAdapter extends StObject {
    
    def addClass(className: String): Unit = js.native
    
    /** Returns the given attribute value on the root element. */
    def getAttr(attrName: String): String | Null = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def notifyChange(evtData: MDCIconButtonToggleEventDetail): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def setAttr(attrName: String, attrValue: String): Unit = js.native
  }
  object MDCIconButtonToggleAdapter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MDCIconButtonToggleAdapterMutableBuilder[Self <: MDCIconButtonToggleAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyChange(value: MDCIconButtonToggleEventDetail => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAttr(value: (String, String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
    }
  }
}
