package typings.jqueryFocusExit

import typings.jquery.JQuery.TriggeredEvent
import typings.jqueryFocusExit.anon.Debug
import typings.jqueryFocusExit.jqueryFocusExitStrings.focusExit
import typings.jqueryFocusExit.jqueryFocusExitStrings.focusin
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait FocusElements extends StObject {
    
    var gainedFocus: HTMLElement
    
    var lostFocus: js.UndefOr[HTMLElement] = js.undefined
  }
  object FocusElements {
    
    inline def apply(gainedFocus: HTMLElement): FocusElements = {
      val __obj = js.Dynamic.literal(gainedFocus = gainedFocus.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusElements]
    }
    
    extension [Self <: FocusElements](x: Self) {
      
      inline def setGainedFocus(value: HTMLElement): Self = StObject.set(x, "gainedFocus", value.asInstanceOf[js.Any])
      
      inline def setLostFocus(value: HTMLElement): Self = StObject.set(x, "lostFocus", value.asInstanceOf[js.Any])
      
      inline def setLostFocusUndefined: Self = StObject.set(x, "lostFocus", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def focusExit(): JQuery = js.native
      def focusExit(options: Debug): JQuery = js.native
      
      @JSName("on")
      def on_focusExit(
        event: focusExit,
        handler: js.Function2[
              /* event */ TriggeredEvent[HTMLElement, Any, Any, Any], 
              /* data */ FocusElements, 
              Unit
            ]
      ): JQuery = js.native
      
      @JSName("one")
      def one_focusin(
        event: focusin,
        handler: js.Function1[/* event */ TriggeredEvent[HTMLElement, Any, Any, Any], Unit]
      ): JQuery = js.native
    }
  }
}
