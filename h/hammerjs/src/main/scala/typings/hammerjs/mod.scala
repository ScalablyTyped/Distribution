package typings.hammerjs

import org.scalablytyped.runtime.Shortcut
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HammerManager {
    def this(element: HTMLElement) = this()
    def this(element: SVGElement) = this()
    def this(element: HTMLElement, options: HammerOptions) = this()
    def this(element: SVGElement, options: HammerOptions) = this()
  }
  @JSImport("hammerjs", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HammerStatic = js.native
  
  // DIRECTION_HORIZONTAL | DIRECTION_VERTICAL
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Manager")
  @js.native
  open class Manager protected ()
    extends StObject
       with HammerManager {
    def this(element: EventTarget) = this()
    def this(element: EventTarget, options: HammerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Pan")
  @js.native
  open class Pan ()
    extends StObject
       with AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Pinch")
  @js.native
  open class Pinch ()
    extends StObject
       with AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Press")
  @js.native
  open class Press ()
    extends StObject
       with AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Recognizer")
  @js.native
  open class Recognizer ()
    extends StObject
       with typings.hammerjs.Recognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Rotate")
  @js.native
  open class Rotate ()
    extends StObject
       with AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Swipe")
  @js.native
  open class Swipe ()
    extends StObject
       with AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Tap")
  @js.native
  open class Tap ()
    extends StObject
       with AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  type _To = js.Object & HammerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & HammerStatic = ^
}
