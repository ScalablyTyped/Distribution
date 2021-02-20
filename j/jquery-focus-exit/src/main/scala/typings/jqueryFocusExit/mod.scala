package typings.jqueryFocusExit

import typings.jquery.JQuery.TriggeredEvent
import typings.jqueryFocusExit.anon.Debug
import typings.jqueryFocusExit.jqueryFocusExitStrings.focusExit
import typings.jqueryFocusExit.jqueryFocusExitStrings.focusin
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait FocusElements extends StObject {
    
    var gainedFocus: HTMLElement = js.native
    
    var lostFocus: js.UndefOr[HTMLElement] = js.native
  }
  object FocusElements {
    
    @scala.inline
    def apply(gainedFocus: HTMLElement): FocusElements = {
      val __obj = js.Dynamic.literal(gainedFocus = gainedFocus.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusElements]
    }
    
    @scala.inline
    implicit class FocusElementsMutableBuilder[Self <: FocusElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGainedFocus(value: HTMLElement): Self = StObject.set(x, "gainedFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLostFocus(value: HTMLElement): Self = StObject.set(x, "lostFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLostFocusUndefined: Self = StObject.set(x, "lostFocus", js.undefined)
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
        handler: js.Function2[/* event */ TriggeredEvent[HTMLElement, _, _, _], /* data */ FocusElements, Unit]
      ): JQuery = js.native
      
      @JSName("one")
      def one_focusin(event: focusin, handler: js.Function1[/* event */ TriggeredEvent[HTMLElement, _, _, _], Unit]): JQuery = js.native
    }
  }
}
