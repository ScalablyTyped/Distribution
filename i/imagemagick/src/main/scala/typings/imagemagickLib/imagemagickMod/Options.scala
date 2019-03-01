package typings
package imagemagickLib.imagemagickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
   //: false,
  var colorspace: js.UndefOr[js.Any] = js.undefined
   //: 0.2,
  var customArgs: js.UndefOr[js.Array[_]] = js.undefined
   //: null,
  var dstPath: js.UndefOr[java.lang.String] = js.undefined
   //: true,
  var filter: js.UndefOr[java.lang.String] = js.undefined
   //: 0.8,
  var format: js.UndefOr[java.lang.String] = js.undefined
   //: 0,
  var height: js.UndefOr[scala.Double] = js.undefined
   //: 'jpg',
  var progressive: js.UndefOr[scala.Boolean] = js.undefined
   //: null,
  var quality: js.UndefOr[scala.Double] = js.undefined
   //: 'Lagrange',
  var sharpening: js.UndefOr[scala.Double] = js.undefined
   //: null,
  var srcData: js.UndefOr[java.lang.String] = js.undefined
   //: null,
  var srcFormat: js.UndefOr[java.lang.String] = js.undefined
  var srcPath: js.UndefOr[java.lang.String] = js.undefined
   //: 0,
  var strip: js.UndefOr[scala.Boolean] = js.undefined
   //: [],
  var timeout: js.UndefOr[scala.Double] = js.undefined
   //: null,
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    colorspace: js.Any = null,
    customArgs: js.Array[_] = null,
    dstPath: java.lang.String = null,
    filter: java.lang.String = null,
    format: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    progressive: js.UndefOr[scala.Boolean] = js.undefined,
    quality: scala.Int | scala.Double = null,
    sharpening: scala.Int | scala.Double = null,
    srcData: java.lang.String = null,
    srcFormat: java.lang.String = null,
    srcPath: java.lang.String = null,
    strip: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

