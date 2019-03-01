package typings
package googlemapsDotInfobubbleLib.googleNs.mapsNs.infobubbleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBubbleOptions extends js.Object {
  /**
    * Percentage from the bottom left corner of the infobubble
    */
  var arrowPosition: js.UndefOr[scala.Double] = js.undefined
  var arrowSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * 0: Middle, 1: Left, 2: Right
    */
  var arrowStyle: js.UndefOr[scala.Double] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var disableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var disableAutoPan: js.UndefOr[scala.Boolean] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * 0: None, 1: Right, 2: Under
    */
  var shadowStyle: js.UndefOr[scala.Double] = js.undefined
}

object InfoBubbleOptions {
  @scala.inline
  def apply(
    arrowPosition: scala.Int | scala.Double = null,
    arrowSize: scala.Int | scala.Double = null,
    arrowStyle: scala.Int | scala.Double = null,
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    disableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    disableAutoPan: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    shadowStyle: scala.Int | scala.Double = null
  ): InfoBubbleOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowPosition != null) __obj.updateDynamic("arrowPosition")(arrowPosition.asInstanceOf[js.Any])
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation)
    if (!js.isUndefined(disableAutoPan)) __obj.updateDynamic("disableAutoPan")(disableAutoPan)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shadowStyle != null) __obj.updateDynamic("shadowStyle")(shadowStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoBubbleOptions]
  }
}

