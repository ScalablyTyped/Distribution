package typings.atJupyterlabCells.libPlaceholderMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/placeholder", "Placeholder")
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

