package typings.jupyterlabLogconsole.widgetMod

import typings.jupyterlabLogconsole.widgetMod.ScrollingWidget.IOptions
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole/lib/widget", "ScrollingWidget")
@js.native
class ScrollingWidget_[T /* <: Widget */] protected () extends Widget {
  def this(hasContentOptions: IOptions[T]) = this()
  var _content: js.Any = js.native
  var _handleScroll: js.Any = js.native
  var _observer: js.Any = js.native
  var _scrollHeight: js.Any = js.native
  var _sentinel: js.Any = js.native
  var _tracking: js.Any = js.native
  /**
    * The content widget.
    */
  def content: T = js.native
}

