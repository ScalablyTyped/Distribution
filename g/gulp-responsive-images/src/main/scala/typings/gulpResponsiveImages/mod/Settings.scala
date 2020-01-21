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
    height: Int | Double = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    percentage: Int | Double = null,
    quality: Int | Double = null,
    rename: Rename = null,
    samplingFactor: SamplingFactor = null,
    sharpen: js.UndefOr[Boolean] = js.undefined,
    suffix: String = null,
    upscale: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (samplingFactor != null) __obj.updateDynamic("samplingFactor")(samplingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(sharpen)) __obj.updateDynamic("sharpen")(sharpen.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(upscale)) __obj.updateDynamic("upscale")(upscale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

