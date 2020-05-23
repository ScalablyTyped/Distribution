package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Activity /////////////////////////////////////////////
trait KoLiteActivityOptions extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[js.Any] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
  var space: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var valign: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object KoLiteActivityOptions {
  @scala.inline
  def apply(
    align: String = null,
    color: js.Any = null,
    length: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    segments: js.UndefOr[Double] = js.undefined,
    space: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    valign: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): KoLiteActivityOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(segments)) __obj.updateDynamic("segments")(segments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoLiteActivityOptions]
  }
}

