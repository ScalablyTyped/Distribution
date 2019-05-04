package typings
package atJupyterlabCellsLib.libPlaceholderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/placeholder", "Placeholder")
@js.native
abstract class Placeholder protected ()
  extends atJupyterlabApputilsLib.atJupyterlabApputilsMod.VDomRenderer[scala.Null] {
  /**
    * Construct a new placeholder.
    */
  def this(callback: js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]) = this()
  var _callback: js.Any = js.native
  /**
    * Handle the click event.
    */
  /* protected */ def handleClick(e: reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

