package typings.jqueryMouseExit

import typings.jquery.JQuery.TriggeredEvent
import typings.jqueryMouseExit.jqueryMouseExitStrings.mouseExit
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  lostFocus :std.HTMLElement,   gainedFocus :std.HTMLElement}> */
  trait FocusElements extends StObject {
    
    var gainedFocus: js.UndefOr[HTMLElement] = js.undefined
    
    var lostFocus: js.UndefOr[HTMLElement] = js.undefined
  }
  object FocusElements {
    
    inline def apply(): FocusElements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusElements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusElements] (val x: Self) extends AnyVal {
      
      inline def setGainedFocus(value: HTMLElement): Self = StObject.set(x, "gainedFocus", value.asInstanceOf[js.Any])
      
      inline def setGainedFocusUndefined: Self = StObject.set(x, "gainedFocus", js.undefined)
      
      inline def setLostFocus(value: HTMLElement): Self = StObject.set(x, "lostFocus", value.asInstanceOf[js.Any])
      
      inline def setLostFocusUndefined: Self = StObject.set(x, "lostFocus", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  delay :number}> */
  trait Options extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def mouseExit(): JQuery = js.native
      def mouseExit(options: Options): JQuery = js.native
      
      @JSName("on")
      def on_mouseExit(
        event: mouseExit,
        handler: js.Function2[
              /* event */ TriggeredEvent[HTMLElement, Any, Any, Any], 
              /* data */ FocusElements, 
              Unit
            ]
      ): JQuery = js.native
    }
  }
}
