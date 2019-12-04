package typings.atJupyterlabCells

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import typings.atJupyterlabCells.libPlaceholderMod.Placeholder
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/placeholder", JSImport.Namespace)
@js.native
object libPlaceholderMod extends js.Object {
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

