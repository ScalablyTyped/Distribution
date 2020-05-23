package typings.jui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  /**
    * @cfg {String/Integer} [bottom="auto"]
    * Determines the Y coordinate based on the bottom side of a window
    */
  var bottom: js.UndefOr[String | Double] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [height=300]
    * Determines the height of a window
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {String/Integer} [left="auto"]
    * Determines the X coordinate of a window
    */
  var left: js.UndefOr[String | Double] = js.undefined
  /**
    * @cfg {Boolean} [modal=false]
    * Applies a modal UI to a window
    */
  var modal: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Integer} [modalIndex=0]
    * Determines the z-index property of a modal UI
    */
  var modalIndex: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Boolean} [move=true]
    * It is possible to move a window
    */
  var move: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean} [resize=true]
    * It is possible to resize a window
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {String/Integer} [right="auto"]
    * Determines the X coordinate based on the right side of a window
    */
  var right: js.UndefOr[String | Double] = js.undefined
  /**
    * @cfg {String/Integer} [top="auto"]
    * Determines the Y coordinate of a window
    */
  var top: js.UndefOr[String | Double] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [width=400]
    * Determines the horizontal size of a window
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Bottom {
  @scala.inline
  def apply(
    bottom: String | Double = null,
    event: js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    left: String | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalIndex: js.UndefOr[Double] = js.undefined,
    move: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    right: String | Double = null,
    top: String | Double = null,
    tpl: js.Any = null,
    width: js.UndefOr[Double] = js.undefined
  ): Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modalIndex)) __obj.updateDynamic("modalIndex")(modalIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

