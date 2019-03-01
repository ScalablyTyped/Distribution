package typings
package gulpDashImageDashResizeLib.gulpDashImageDashResizeMod.GulpImageResizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var cover: js.UndefOr[scala.Boolean] = js.undefined
  var crop: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[gmLib.gmMod.mNs.FilterType] = js.undefined
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var gravity: js.UndefOr[gmLib.gmMod.mNs.GravityDirection] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var imageMagick: js.UndefOr[scala.Boolean] = js.undefined
  var interlace: js.UndefOr[scala.Boolean] = js.undefined
  var noProfile: js.UndefOr[scala.Boolean] = js.undefined
  var percentage: js.UndefOr[scala.Double] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var samplingFactor: js.UndefOr[SamplingFactor] = js.undefined
  var sharpen: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var upscale: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    cover: js.UndefOr[scala.Boolean] = js.undefined,
    crop: js.UndefOr[scala.Boolean] = js.undefined,
    filter: gmLib.gmMod.mNs.FilterType = null,
    flatten: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    gravity: gmLib.gmMod.mNs.GravityDirection = null,
    height: scala.Int | scala.Double = null,
    imageMagick: js.UndefOr[scala.Boolean] = js.undefined,
    interlace: js.UndefOr[scala.Boolean] = js.undefined,
    noProfile: js.UndefOr[scala.Boolean] = js.undefined,
    percentage: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    samplingFactor: SamplingFactor = null,
    sharpen: scala.Boolean | java.lang.String = null,
    upscale: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(cover)) __obj.updateDynamic("cover")(cover)
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten)
    if (format != null) __obj.updateDynamic("format")(format)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(imageMagick)) __obj.updateDynamic("imageMagick")(imageMagick)
    if (!js.isUndefined(interlace)) __obj.updateDynamic("interlace")(interlace)
    if (!js.isUndefined(noProfile)) __obj.updateDynamic("noProfile")(noProfile)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (samplingFactor != null) __obj.updateDynamic("samplingFactor")(samplingFactor)
    if (sharpen != null) __obj.updateDynamic("sharpen")(sharpen.asInstanceOf[js.Any])
    if (!js.isUndefined(upscale)) __obj.updateDynamic("upscale")(upscale)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

