package typings.atJupyterlabCells.libCollapserMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/collapser", "Collapser")
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

