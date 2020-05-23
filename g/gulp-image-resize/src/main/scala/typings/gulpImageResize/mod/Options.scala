package typings.gulpImageResize.mod

import typings.gm.mod.FilterType
import typings.gm.mod.GravityDirection
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
    height: js.UndefOr[Double] = js.undefined,
    imageMagick: js.UndefOr[Boolean] = js.undefined,
    interlace: js.UndefOr[Boolean] = js.undefined,
    noProfile: js.UndefOr[Boolean] = js.undefined,
    percentage: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    samplingFactor: SamplingFactor = null,
    sharpen: Boolean | String = null,
    upscale: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(cover)) __obj.updateDynamic("cover")(cover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageMagick)) __obj.updateDynamic("imageMagick")(imageMagick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interlace)) __obj.updateDynamic("interlace")(interlace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noProfile)) __obj.updateDynamic("noProfile")(noProfile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (samplingFactor != null) __obj.updateDynamic("samplingFactor")(samplingFactor.asInstanceOf[js.Any])
    if (sharpen != null) __obj.updateDynamic("sharpen")(sharpen.asInstanceOf[js.Any])
    if (!js.isUndefined(upscale)) __obj.updateDynamic("upscale")(upscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

