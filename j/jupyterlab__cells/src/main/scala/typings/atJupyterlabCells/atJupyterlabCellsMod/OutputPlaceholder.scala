package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "OutputPlaceholder")
@js.native
class OutputPlaceholder protected ()
  extends typings.atJupyterlabCells.libPlaceholderMod.OutputPlaceholder {
  /**
    * Construct a new output placeholder.
    */
  def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
}

