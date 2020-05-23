package typings.imagemagickNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConvertOptions extends js.Object {
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
  var srcData: Buffer
  var srcFormat: js.UndefOr[String] = js.undefined
  var strip: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
  var trimFuzz: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IConvertOptions {
  @scala.inline
  def apply(
    srcData: Buffer,
    blur: js.UndefOr[Double] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    density: js.UndefOr[Double] = js.undefined,
    filter: String = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    gravity: String = null,
    height: js.UndefOr[Double] = js.undefined,
    ignoreWarnings: js.UndefOr[Boolean] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    resizeStyle: String = null,
    rotate: js.UndefOr[Double] = js.undefined,
    srcFormat: String = null,
    strip: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined,
    trimFuzz: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): IConvertOptions = {
    val __obj = js.Dynamic.literal(srcData = srcData.asInstanceOf[js.Any])
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(density)) __obj.updateDynamic("density")(density.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (resizeStyle != null) __obj.updateDynamic("resizeStyle")(resizeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (srcFormat != null) __obj.updateDynamic("srcFormat")(srcFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trimFuzz)) __obj.updateDynamic("trimFuzz")(trimFuzz.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConvertOptions]
  }
}

