package typings.materialDom

import typings.materialDom.focusTrapMod.FocusOptions
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/dom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object events extends js.Object {
    
    def applyPassive(): Boolean | EventListenerOptions = js.native
    def applyPassive(globalObj: Window): Boolean | EventListenerOptions = js.native
  }
  
  @js.native
  object focusTrap extends js.Object {
    
    @js.native
    class FocusTrap protected ()
      extends typings.materialDom.focusTrapMod.FocusTrap {
      def this(root: HTMLElement) = this()
      def this(root: HTMLElement, options: FocusOptions) = this()
    }
  }
  
  @js.native
  object keyboard extends js.Object {
    
    def isNavigationEvent(evt: KeyboardEvent): Boolean = js.native
    
    def normalizeKey(evt: KeyboardEvent): String = js.native
    
    @js.native
    object KEY extends js.Object {
      
      var ARROW_DOWN: String = js.native
      
      var ARROW_LEFT: String = js.native
      
      var ARROW_RIGHT: String = js.native
      
      var ARROW_UP: String = js.native
      
      var BACKSPACE: String = js.native
      
      var DELETE: String = js.native
      
      var END: String = js.native
      
      var ENTER: String = js.native
      
      var ESCAPE: String = js.native
      
      var HOME: String = js.native
      
      var PAGE_DOWN: String = js.native
      
      var PAGE_UP: String = js.native
      
      var SPACEBAR: String = js.native
      
      var UNKNOWN: String = js.native
    }
  }
  
  @js.native
  object ponyfill extends js.Object {
    
    def closest(element: Element, selector: String): Element | Null = js.native
    
    def estimateScrollWidth(element: Element): Double = js.native
    
    def matches(element: Element, selector: String): Boolean = js.native
  }
}
