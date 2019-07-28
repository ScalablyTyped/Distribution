package typings.imagemagickDashNative.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamConvertOptions extends js.Object {
  var blur: js.UndefOr[Double] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var density: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var flip: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var gravity: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var resizeStyle: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var srcFormat: js.UndefOr[String] = js.undefined
  var strip: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
  var trimFuzz: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IStreamConvertOptions {
  @scala.inline
  def apply(
    blur: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    density: Int | Double = null,
    filter: String = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    gravity: String = null,
    height: Int | Double = null,
    ignoreWarnings: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    resizeStyle: String = null,
    rotate: Int | Double = null,
    srcFormat: String = null,
    strip: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined,
    trimFuzz: Int | Double = null,
    width: Int | Double = null
  ): IStreamConvertOptions = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (format != null) __obj.updateDynamic("format")(format)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (resizeStyle != null) __obj.updateDynamic("resizeStyle")(resizeStyle)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (srcFormat != null) __obj.updateDynamic("srcFormat")(srcFormat)
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (trimFuzz != null) __obj.updateDynamic("trimFuzz")(trimFuzz.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamConvertOptions]
  }
}

