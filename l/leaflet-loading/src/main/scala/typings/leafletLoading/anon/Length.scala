package typings.leafletLoading.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Length {
  @scala.inline
  def apply(
    length: js.UndefOr[Double] = js.undefined,
    lines: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    top: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Length = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

