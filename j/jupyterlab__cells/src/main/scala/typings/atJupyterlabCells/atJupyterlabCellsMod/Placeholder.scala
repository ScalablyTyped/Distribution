package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "Placeholder")
@js.native
abstract class Placeholder protected ()
  extends typings.atJupyterlabCells.libPlaceholderMod.Placeholder {
  /**
    * Construct a new placeholder.
    */
  def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
}

