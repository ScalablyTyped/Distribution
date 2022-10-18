package typings.jupyterlabCells

import typings.jupyterlabApputils.mod.ReactWidget
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCollapserMod {
  
  /* note: abstract class */ @JSImport("@jupyterlab/cells/lib/collapser", "Collapser")
  @js.native
  /**
    * Construct a new collapser.
    */
  open class Collapser () extends ReactWidget {
    
    /**
      * Is the input/output of the parent collapsed.
      */
    def collapsed: Boolean = js.native
    
    /**
      * Handle the click event.
      */
    /* protected */ def handleClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
  }
  
  @JSImport("@jupyterlab/cells/lib/collapser", "InputCollapser")
  @js.native
  /**
    * Construct a new input collapser.
    */
  open class InputCollapser () extends Collapser
  
  @JSImport("@jupyterlab/cells/lib/collapser", "OutputCollapser")
  @js.native
  /**
    * Construct a new output collapser.
    */
  open class OutputCollapser () extends Collapser
}
