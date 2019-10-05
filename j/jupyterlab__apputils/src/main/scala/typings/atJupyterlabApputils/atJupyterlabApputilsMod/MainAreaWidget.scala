package typings.atJupyterlabApputils.atJupyterlabApputilsMod

import typings.atJupyterlabApputils.libMainareawidgetMod.MainAreaWidget.IOptions
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "MainAreaWidget")
@js.native
class MainAreaWidget[T /* <: Widget */] protected ()
  extends typings.atJupyterlabApputils.libMainareawidgetMod.MainAreaWidget[T] {
  /**
    * Construct a new main area widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: IOptions[T]) = this()
}

