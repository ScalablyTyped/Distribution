package typings.jupyterlabCells.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "Placeholder")
@js.native
abstract class Placeholder protected ()
  extends typings.jupyterlabCells.placeholderMod.Placeholder {
  /**
    * Construct a new placeholder.
    */
  def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
}

