package typings.atJupyterlabCells

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/collapser", JSImport.Namespace)
@js.native
object libCollapserMod extends js.Object {
  @js.native
  /**
    * Construct a new collapser.
    */
  abstract class Collapser () extends ReactWidget {
    /**
      * Is the input/output of the parent collapsed.
      */
    val collapsed: Boolean = js.native
    /**
      * Handle the click event.
      */
    /* protected */ def handleClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
  }
  
  @js.native
  /**
    * Construct a new input collapser.
    */
  class InputCollapser () extends Collapser
  
  @js.native
  /**
    * Construct a new output collapser.
    */
  class OutputCollapser () extends Collapser
  
}

