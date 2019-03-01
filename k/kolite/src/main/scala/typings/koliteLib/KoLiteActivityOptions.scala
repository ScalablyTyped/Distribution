package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Activity /////////////////////////////////////////////
trait KoLiteActivityOptions extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[js.Any] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var segments: js.UndefOr[scala.Double] = js.undefined
  var space: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var valign: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object KoLiteActivityOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    color: js.Any = null,
    length: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    segments: scala.Int | scala.Double = null,
    space: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    valign: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): KoLiteActivityOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (color != null) __obj.updateDynamic("color")(color)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoLiteActivityOptions]
  }
}

