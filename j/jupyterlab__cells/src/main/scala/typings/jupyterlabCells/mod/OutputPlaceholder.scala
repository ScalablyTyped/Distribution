package typings.jupyterlabCells.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "OutputPlaceholder")
@js.native
class OutputPlaceholder protected ()
  extends typings.jupyterlabCells.placeholderMod.OutputPlaceholder {
  /**
    * Construct a new output placeholder.
    */
  def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
}

