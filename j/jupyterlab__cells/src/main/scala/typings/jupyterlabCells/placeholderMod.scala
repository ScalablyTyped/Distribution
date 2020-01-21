package typings.jupyterlabCells

import typings.jupyterlabApputils.mod.ReactWidget
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/placeholder", JSImport.Namespace)
@js.native
object placeholderMod extends js.Object {
  @js.native
  class InputPlaceholder protected () extends Placeholder {
    /**
      * Construct a new input placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
  }
  
  @js.native
  class OutputPlaceholder protected () extends Placeholder {
    /**
      * Construct a new output placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
  }
  
  @js.native
  abstract class Placeholder protected () extends ReactWidget {
    /**
      * Construct a new placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
    var _callback: js.Any = js.native
    /**
      * Handle the click event.
      */
    /* protected */ def handleClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
  }
  
}

