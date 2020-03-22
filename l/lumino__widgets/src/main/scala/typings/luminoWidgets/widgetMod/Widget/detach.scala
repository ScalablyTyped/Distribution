package typings.luminoWidgets.widgetMod.Widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/widgets/lib/widget", "Widget.detach")
@js.native
object detach extends js.Object {
  /**
    * Detach the widget from its host DOM node.
    *
    * @param widget - The widget of interest.
    *
    * #### Notes
    * This will throw an error if the widget is not a root widget,
    * or if the widget is not attached to the DOM.
    */
  def apply(widget: typings.luminoWidgets.widgetMod.Widget): Unit = js.native
}

