package typings.atJupyterlabApputils.atJupyterlabApputilsMod

import typings.atJupyterlabApputils.libWidgettrackerMod.WidgetTracker.IOptions
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "WidgetTracker")
@js.native
class WidgetTracker[T /* <: Widget */] protected ()
  extends typings.atJupyterlabApputils.libWidgettrackerMod.WidgetTracker[T] {
  /**
    * Create a new widget tracker.
    *
    * @param options - The instantiation options for a widget tracker.
    */
  def this(options: IOptions) = this()
}

