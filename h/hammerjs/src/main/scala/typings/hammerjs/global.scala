package typings.hammerjs

import org.scalablytyped.runtime.Shortcut
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Hammer")
  @js.native
  class Hammer protected () extends HammerManager {
    def this(element: HTMLElement) = this()
    def this(element: SVGElement) = this()
    def this(element: HTMLElement, options: HammerOptions) = this()
    def this(element: SVGElement, options: HammerOptions) = this()
  }
  object Hammer extends Shortcut {
    
    @JSGlobal("Hammer")
    @js.native
    val ^ : HammerStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Manager")
    @js.native
    class Manager protected () extends HammerManager {
      def this(element: EventTarget) = this()
      def this(element: EventTarget, options: HammerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Pan")
    @js.native
    class Pan () extends AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Pinch")
    @js.native
    class Pinch () extends AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Press")
    @js.native
    class Press () extends AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Recognizer")
    @js.native
    class Recognizer ()
      extends typings.hammerjs.Recognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Rotate")
    @js.native
    class Rotate () extends AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Swipe")
    @js.native
    class Swipe () extends AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Tap")
    @js.native
    class Tap () extends AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    type _To = HammerStatic
    
    /* This means you don't have to write `^`, but can instead just say `Hammer.foo` */
    override def _to: HammerStatic = ^
  }
  
  @JSGlobal("HammerInput")
  @js.native
  class HammerInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @JSGlobal("MouseInput")
  @js.native
  class MouseInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @JSGlobal("PointerEventInput")
  @js.native
  class PointerEventInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @JSGlobal("SingleTouchInput")
  @js.native
  class SingleTouchInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @JSGlobal("TouchAction")
  @js.native
  class TouchAction protected ()
    extends typings.hammerjs.TouchAction {
    def this(manager: HammerManager, value: String) = this()
  }
  
  @JSGlobal("TouchInput")
  @js.native
  class TouchInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @JSGlobal("TouchMouseInput")
  @js.native
  class TouchMouseInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
}
