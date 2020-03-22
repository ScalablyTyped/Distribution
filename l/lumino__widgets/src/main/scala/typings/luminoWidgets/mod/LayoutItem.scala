package typings.luminoWidgets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/widgets", "LayoutItem")
@js.native
class LayoutItem protected ()
  extends typings.luminoWidgets.layoutMod.LayoutItem {
  /**
    * Construct a new layout item.
    *
    * @param widget - The widget to be managed by the item.
    *
    * #### Notes
    * The widget will be set to absolute positioning.
    */
  def this(widget: typings.luminoWidgets.widgetMod.Widget) = this()
}

