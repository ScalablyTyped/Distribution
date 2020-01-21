package typings.jui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  /**
    * @cfg {Boolean} [close=true]
    * Closes the Auto when clicking on the dropdown list
    */
  var close: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [height=0]
    * Determines the vertical size of a dropdown list
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Boolean} [keydown=false]
    * It is possible to choose anything on the dropdown list with the arrow keys on the keyboard
    */
  var keydown: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Integer} [left=0]
    * Sets the X coordinate of the dropdown list
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Array} nodes
    * Sets a dropdown list to data rather than markup
    */
  var nodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {Integer} [top=0]
    * Sets the Y coordinate of the dropdown list
    */
  var top: js.UndefOr[Double] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [width=0]
    * Determines the horizontal size of a dropdown list
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonClose {
  @scala.inline
  def apply(
    close: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    height: Int | Double = null,
    keydown: js.UndefOr[Boolean] = js.undefined,
    left: Int | Double = null,
    nodes: js.Array[_] = null,
    top: Int | Double = null,
    tpl: js.Any = null,
    width: Int | Double = null
  ): AnonClose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keydown)) __obj.updateDynamic("keydown")(keydown.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClose]
  }
}

