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
    arrowPosition: Int | Double = null,
    arrowSize: Int | Double = null,
    arrowStyle: Int | Double = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableAutoPan: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    padding: Int | Double = null,
    shadowStyle: Int | Double = null
  ): InfoBubbleOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowPosition != null) __obj.updateDynamic("arrowPosition")(arrowPosition.asInstanceOf[js.Any])
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPan)) __obj.updateDynamic("disableAutoPan")(disableAutoPan.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shadowStyle != null) __obj.updateDynamic("shadowStyle")(shadowStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoBubbleOptions]
  }
}

