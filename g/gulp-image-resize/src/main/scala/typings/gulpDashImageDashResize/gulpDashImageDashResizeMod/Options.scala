package typings.gulpDashImageDashResize.gulpDashImageDashResizeMod

import typings.gm.gmMod.FilterType
import typings.gm.gmMod.GravityDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var cover: js.UndefOr[Boolean] = js.undefined
  var crop: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[FilterType] = js.undefined
  var flatten: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var gravity: js.UndefOr[GravityDirection] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var imageMagick: js.UndefOr[Boolean] = js.undefined
  var interlace: js.UndefOr[Boolean] = js.undefined
  var noProfile: js.UndefOr[Boolean] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var samplingFactor: js.UndefOr[SamplingFactor] = js.undefined
  var sharpen: js.UndefOr[Boolean | String] = js.undefined
  var upscale: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    background: String = null,
    cover: js.UndefOr[Boolean] = js.undefined,
    crop: js.UndefOr[Boolean] = js.undefined,
    filter: FilterType = null,
    flatten: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    gravity: GravityDirection = null,
    height: Int | Double = null,
    imageMagick: js.UndefOr[Boolean] = js.undefined,
    interlace: js.UndefOr[Boolean] = js.undefined,
    noProfile: js.UndefOr[Boolean] = js.undefined,
    percentage: Int | Double = null,
    quality: Int | Double = null,
    samplingFactor: SamplingFactor = null,
    sharpen: Boolean | String = null,
    upscale: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
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

