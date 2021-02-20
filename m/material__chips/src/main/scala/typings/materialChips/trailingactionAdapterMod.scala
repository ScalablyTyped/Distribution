package typings.materialChips

import typings.materialChips.trailingactionConstantsMod.InteractionTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingactionAdapterMod {
  
  @js.native
  trait MDCChipTrailingActionAdapter extends StObject {
    
    def focus(): Unit = js.native
    
    def getAttribute(attr: String): String | Null = js.native
    
    def notifyInteraction(trigger: InteractionTrigger): Unit = js.native
    
    def notifyNavigation(key: String): Unit = js.native
    
    def setAttribute(attr: String, value: String): Unit = js.native
  }
  object MDCChipTrailingActionAdapter {
    
    @scala.inline
    def apply(
      focus: () => Unit,
      getAttribute: String => String | Null,
      notifyInteraction: InteractionTrigger => Unit,
      notifyNavigation: String => Unit,
      setAttribute: (String, String) => Unit
    ): MDCChipTrailingActionAdapter = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), getAttribute = js.Any.fromFunction1(getAttribute), notifyInteraction = js.Any.fromFunction1(notifyInteraction), notifyNavigation = js.Any.fromFunction1(notifyNavigation), setAttribute = js.Any.fromFunction2(setAttribute))
      __obj.asInstanceOf[MDCChipTrailingActionAdapter]
    }
    
    @scala.inline
    implicit class MDCChipTrailingActionAdapterMutableBuilder[Self <: MDCChipTrailingActionAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyInteraction(value: InteractionTrigger => Unit): Self = StObject.set(x, "notifyInteraction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyNavigation(value: String => Unit): Self = StObject.set(x, "notifyNavigation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
    }
  }
}
