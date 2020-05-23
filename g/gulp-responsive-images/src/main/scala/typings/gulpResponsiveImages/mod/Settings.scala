package typings.gulpResponsiveImages.mod

import typings.gm.mod.FilterType
import typings.gm.mod.GravityDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var crop: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[FilterType] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var gravity: js.UndefOr[GravityDirection] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var rename: js.UndefOr[Rename] = js.undefined
  var samplingFactor: js.UndefOr[SamplingFactor] = js.undefined
  var sharpen: js.UndefOr[Boolean] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var upscale: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    crop: js.UndefOr[Boolean] = js.undefined,
    filter: FilterType = null,
    format: String = null,
    gravity: GravityDirection = null,
    height: js.UndefOr[Double] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    percentage: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    rename: Rename = null,
    samplingFactor: SamplingFactor = null,
    sharpen: js.UndefOr[Boolean] = js.undefined,
    suffix: String = null,
    upscale: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (samplingFactor != null) __obj.updateDynamic("samplingFactor")(samplingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(sharpen)) __obj.updateDynamic("sharpen")(sharpen.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(upscale)) __obj.updateDynamic("upscale")(upscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

