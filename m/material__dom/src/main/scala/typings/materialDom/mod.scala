package typings.materialDom

import typings.materialDom.focusTrapMod.FocusOptions
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object events {
    
    @JSImport("@material/dom", "events")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def applyPassive(): Boolean | EventListenerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPassive")().asInstanceOf[Boolean | EventListenerOptions]
    @scala.inline
    def applyPassive(globalObj: Window): Boolean | EventListenerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPassive")(globalObj.asInstanceOf[js.Any]).asInstanceOf[Boolean | EventListenerOptions]
  }
  
  object focusTrap {
    
    @JSImport("@material/dom", "focusTrap.FocusTrap")
    @js.native
    class FocusTrap protected ()
      extends typings.materialDom.focusTrapMod.FocusTrap {
      def this(root: HTMLElement) = this()
      def this(root: HTMLElement, options: FocusOptions) = this()
    }
  }
  
  object keyboard {
    
    @JSImport("@material/dom", "keyboard")
    @js.native
    val ^ : js.Any = js.native
    
    object KEY {
      
      @JSImport("@material/dom", "keyboard.KEY")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@material/dom", "keyboard.KEY.ARROW_DOWN")
      @js.native
      def ARROW_DOWN: String = js.native
      @scala.inline
      def ARROW_DOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_DOWN")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.ARROW_LEFT")
      @js.native
      def ARROW_LEFT: String = js.native
      @scala.inline
      def ARROW_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.ARROW_RIGHT")
      @js.native
      def ARROW_RIGHT: String = js.native
      @scala.inline
      def ARROW_RIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.ARROW_UP")
      @js.native
      def ARROW_UP: String = js.native
      @scala.inline
      def ARROW_UP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_UP")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.BACKSPACE")
      @js.native
      def BACKSPACE: String = js.native
      @scala.inline
      def BACKSPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.DELETE")
      @js.native
      def DELETE: String = js.native
      @scala.inline
      def DELETE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.END")
      @js.native
      def END: String = js.native
      @scala.inline
      def END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.ENTER")
      @js.native
      def ENTER: String = js.native
      @scala.inline
      def ENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.ESCAPE")
      @js.native
      def ESCAPE: String = js.native
      @scala.inline
      def ESCAPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.HOME")
      @js.native
      def HOME: String = js.native
      @scala.inline
      def HOME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.PAGE_DOWN")
      @js.native
      def PAGE_DOWN: String = js.native
      @scala.inline
      def PAGE_DOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE_DOWN")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.PAGE_UP")
      @js.native
      def PAGE_UP: String = js.native
      @scala.inline
      def PAGE_UP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE_UP")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.SPACEBAR")
      @js.native
      def SPACEBAR: String = js.native
      @scala.inline
      def SPACEBAR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACEBAR")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/dom", "keyboard.KEY.UNKNOWN")
      @js.native
      def UNKNOWN: String = js.native
      @scala.inline
      def UNKNOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    }
    
    @scala.inline
    def isNavigationEvent(evt: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNavigationEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def normalizeKey(evt: KeyboardEvent): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKey")(evt.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object ponyfill {
    
    @JSImport("@material/dom", "ponyfill")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def closest(element: Element, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @scala.inline
    def estimateScrollWidth(element: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateScrollWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def matches(element: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
