package typings.googlemapsInfobubble.google.maps.infobubble

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBubbleOptions extends js.Object {
  /**
    * Percentage from the bottom left corner of the infobubble
    */
  var arrowPosition: js.UndefOr[Double] = js.undefined
  var arrowSize: js.UndefOr[Double] = js.undefined
  /**
    * 0: Middle, 1: Left, 2: Right
    */
  var arrowStyle: js.UndefOr[Double] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  var disableAutoPan: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * 0: None, 1: Right, 2: Under
    */
  var shadowStyle: js.UndefOr[Double] = js.undefined
}

object InfoBubbleOptions {
  @scala.inline
  def apply(
    arrowPosition: js.UndefOr[Double] = js.undefined,
    arrowSize: js.UndefOr[Double] = js.undefined,
    arrowStyle: js.UndefOr[Double] = js.undefined,
    backgroundColor: String = null,
    borderColor: String = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableAutoPan: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    shadowStyle: js.UndefOr[Double] = js.undefined
  ): InfoBubbleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowPosition)) __obj.updateDynamic("arrowPosition")(arrowPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowSize)) __obj.updateDynamic("arrowSize")(arrowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowStyle)) __obj.updateDynamic("arrowStyle")(arrowStyle.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPan)) __obj.updateDynamic("disableAutoPan")(disableAutoPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowStyle)) __obj.updateDynamic("shadowStyle")(shadowStyle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoBubbleOptions]
  }
}

