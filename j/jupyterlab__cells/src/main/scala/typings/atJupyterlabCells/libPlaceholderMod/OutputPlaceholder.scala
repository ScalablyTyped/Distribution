package typings.atJupyterlabCells.libPlaceholderMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/placeholder", "OutputPlaceholder")
@js.native
class OutputPlaceholder protected () extends Placeholder {
  /**
    * Construct a new output placeholder.
    */
  def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
}

