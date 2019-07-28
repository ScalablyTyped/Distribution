package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "InputPlaceholder")
@js.native
class InputPlaceholder protected ()
  extends typings.atJupyterlabCells.libPlaceholderMod.InputPlaceholder {
  /**
    * Construct a new input placeholder.
    */
  def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
}

