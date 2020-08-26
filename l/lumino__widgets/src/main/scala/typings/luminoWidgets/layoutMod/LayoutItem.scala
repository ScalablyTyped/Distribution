package typings.luminoWidgets.layoutMod

import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/widgets/types/layout", "LayoutItem")
@js.native
class LayoutItem protected () extends IDisposable {
  /**
    * Construct a new layout item.
    *
    * @param widget - The widget to be managed by the item.
    *
    * #### Notes
    * The widget will be set to absolute positioning.
    */
  def this(widget: Widget) = this()
  var _disposed: js.Any = js.native
  var _height: js.Any = js.native
  var _left: js.Any = js.native
  var _maxHeight: js.Any = js.native
  var _maxWidth: js.Any = js.native
  var _minHeight: js.Any = js.native
  var _minWidth: js.Any = js.native
  var _top: js.Any = js.native
  var _width: js.Any = js.native
  /**
    * Whether the managed widget is attached.
    */
  val isAttached: Boolean = js.native
  /**
    * Whether the managed widget is hidden.
    */
  val isHidden: Boolean = js.native
  /**
    * Whether the managed widget is visible.
    */
  val isVisible: Boolean = js.native
  /**
    * The computed maximum height of the widget.
    *
    * #### Notes
    * This value can be updated by calling the `fit` method.
    */
  val maxHeight: Double = js.native
  /**
    * The computed maximum width of the widget.
    *
    * #### Notes
    * This value can be updated by calling the `fit` method.
    */
  val maxWidth: Double = js.native
  /**
    * The computed minimum height of the widget.
    *
    * #### Notes
    * This value can be updated by calling the `fit` method.
    */
  val minHeight: Double = js.native
  /**
    * The computed minimum width of the widget.
    *
    * #### Notes
    * This value can be updated by calling the `fit` method.
    */
  val minWidth: Double = js.native
  /**
    * The widget managed by the layout item.
    */
  val widget: Widget = js.native
  /**
    * Update the computed size limits of the managed widget.
    */
  def fit(): Unit = js.native
  /**
    * Update the position and size of the managed widget.
    *
    * @param left - The left edge position of the layout box.
    *
    * @param top - The top edge position of the layout box.
    *
    * @param width - The width of the layout box.
    *
    * @param height - The height of the layout box.
    */
  def update(left: Double, top: Double, width: Double, height: Double): Unit = js.native
}

