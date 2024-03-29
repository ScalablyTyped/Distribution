package typings.jupyterlabCells

import typings.jupyterlabApputils.mod.ReactWidget
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlaceholderMod {
  
  @JSImport("@jupyterlab/cells/lib/placeholder", "InputPlaceholder")
  @js.native
  open class InputPlaceholder protected () extends Placeholder {
    /**
      * Construct a new input placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
  }
  
  @JSImport("@jupyterlab/cells/lib/placeholder", "OutputPlaceholder")
  @js.native
  open class OutputPlaceholder protected () extends Placeholder {
    /**
      * Construct a new output placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
  }
  
  /* note: abstract class */ @JSImport("@jupyterlab/cells/lib/placeholder", "Placeholder")
  @js.native
  open class Placeholder protected () extends ReactWidget {
    /**
      * Construct a new placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
    
    /* private */ var _callback: Any = js.native
    
    /**
      * Handle the click event.
      */
    /* protected */ def handleClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
  }
}
