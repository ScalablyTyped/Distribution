package typings
package imagemagickDashNativeLib.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamConvertOptions extends js.Object {
  var blur: js.UndefOr[scala.Double] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var density: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var gravity: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var resizeStyle: js.UndefOr[java.lang.String] = js.undefined
  var rotate: js.UndefOr[scala.Double] = js.undefined
  var srcFormat: js.UndefOr[java.lang.String] = js.undefined
  var strip: js.UndefOr[scala.Boolean] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  var trimFuzz: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IStreamConvertOptions {
  @scala.inline
  def apply(
    blur: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    density: scala.Int | scala.Double = null,
    filter: java.lang.String = null,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    gravity: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    quality: scala.Int | scala.Double = null,
    resizeStyle: java.lang.String = null,
    rotate: scala.Int | scala.Double = null,
    srcFormat: java.lang.String = null,
    strip: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    trimFuzz: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

