package typings.imagemagick.imagemagickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
   //: false,
  var colorspace: js.UndefOr[js.Any] = js.undefined
   //: 0.2,
  var customArgs: js.UndefOr[js.Array[_]] = js.undefined
   //: null,
  var dstPath: js.UndefOr[String] = js.undefined
   //: true,
  var filter: js.UndefOr[String] = js.undefined
   //: 0.8,
  var format: js.UndefOr[String] = js.undefined
   //: 0,
  var height: js.UndefOr[Double] = js.undefined
   //: 'jpg',
  var progressive: js.UndefOr[Boolean] = js.undefined
   //: null,
  var quality: js.UndefOr[Double] = js.undefined
   //: 'Lagrange',
  var sharpening: js.UndefOr[Double] = js.undefined
   //: null,
  var srcData: js.UndefOr[String] = js.undefined
   //: null,
  var srcFormat: js.UndefOr[String] = js.undefined
  var srcPath: js.UndefOr[String] = js.undefined
   //: 0,
  var strip: js.UndefOr[Boolean] = js.undefined
   //: [],
  var timeout: js.UndefOr[Double] = js.undefined
   //: null,
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    colorspace: js.Any = null,
    customArgs: js.Array[_] = null,
    dstPath: String = null,
    filter: String = null,
    format: String = null,
    height: Int | Double = null,
    progressive: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    sharpening: Int | Double = null,
    srcData: String = null,
    srcFormat: String = null,
    srcPath: String = null,
    strip: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (colorspace != null) __obj.updateDynamic("colorspace")(colorspace)
    if (customArgs != null) __obj.updateDynamic("customArgs")(customArgs)
    if (dstPath != null) __obj.updateDynamic("dstPath")(dstPath)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (sharpening != null) __obj.updateDynamic("sharpening")(sharpening.asInstanceOf[js.Any])
    if (srcData != null) __obj.updateDynamic("srcData")(srcData)
    if (srcFormat != null) __obj.updateDynamic("srcFormat")(srcFormat)
    if (srcPath != null) __obj.updateDynamic("srcPath")(srcPath)
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

