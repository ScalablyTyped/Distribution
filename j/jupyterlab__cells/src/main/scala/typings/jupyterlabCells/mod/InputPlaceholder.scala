package typings.jupyterlabCells.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "InputPlaceholder")
@js.native
class InputPlaceholder protected ()
  extends typings.jupyterlabCells.placeholderMod.InputPlaceholder {
  /**
    * Construct a new input placeholder.
    */
  def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
}

