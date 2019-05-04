package typings
package atJupyterlabCellsLib.libCollapserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/collapser", "Collapser")
@js.native
/**
  * Construct a new collapser.
  */
abstract class Collapser ()
  extends atJupyterlabApputilsLib.atJupyterlabApputilsMod.VDomRenderer[scala.Null] {
  /**
    * Is the input/output of the parent collapsed.
    */
  val collapsed: scala.Boolean = js.native
  /**
    * Handle the click event.
    */
  /* protected */ def handleClick(e: reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

