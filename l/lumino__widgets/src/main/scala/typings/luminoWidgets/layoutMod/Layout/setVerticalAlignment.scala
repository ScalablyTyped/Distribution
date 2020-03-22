package typings.luminoWidgets.layoutMod.Layout

import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/widgets/lib/layout", "Layout.setVerticalAlignment")
@js.native
object setVerticalAlignment extends js.Object {
  /**
    * Set the vertical alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the vertical alignment.
    *
    * #### Notes
    * If the layout height allocated to a widget is larger than its max
    * height, the vertical alignment controls how the widget is placed
    * within the extra vertical space.
    *
    * If the allocated height is less than the widget's max height, the
    * vertical alignment has no effect.
    *
    * Some layout implementations may ignore vertical alignment.
    *
    * Changing the horizontal alignment will post an `update-request`
    * message to widget's parent, provided the parent has a layout
    * installed.
    */
  def apply(widget: Widget, value: VerticalAlignment): Unit = js.native
}

