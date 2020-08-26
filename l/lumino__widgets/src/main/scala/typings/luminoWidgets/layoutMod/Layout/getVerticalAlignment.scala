package typings.luminoWidgets.layoutMod.Layout

import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/widgets/types/layout", "Layout.getVerticalAlignment")
@js.native
object getVerticalAlignment extends js.Object {
  /**
    * Get the vertical alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The vertical alignment for the widget.
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
    */
  def apply(widget: Widget): VerticalAlignment = js.native
}

