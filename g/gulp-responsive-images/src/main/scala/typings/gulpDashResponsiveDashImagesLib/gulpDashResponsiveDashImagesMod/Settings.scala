package typings
package gulpDashResponsiveDashImagesLib.gulpDashResponsiveDashImagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var crop: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[gmLib.gmMod.FilterType] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var gravity: js.UndefOr[gmLib.gmMod.GravityDirection] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  var percentage: js.UndefOr[scala.Double] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var rename: js.UndefOr[Rename] = js.undefined
  var samplingFactor: js.UndefOr[SamplingFactor] = js.undefined
  var sharpen: js.UndefOr[scala.Boolean] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  var upscale: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    crop: js.UndefOr[scala.Boolean] = js.undefined,
    filter: gmLib.gmMod.FilterType = null,
    format: java.lang.String = null,
    gravity: gmLib.gmMod.GravityDirection = null,
    height: scala.Int | scala.Double = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    percentage: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    rename: Rename = null,
    samplingFactor: SamplingFactor = null,
    sharpen: js.UndefOr[scala.Boolean] = js.undefined,
    suffix: java.lang.String = null,
    upscale: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (format != null) __obj.updateDynamic("format")(format)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (samplingFactor != null) __obj.updateDynamic("samplingFactor")(samplingFactor)
    if (!js.isUndefined(sharpen)) __obj.updateDynamic("sharpen")(sharpen)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (!js.isUndefined(upscale)) __obj.updateDynamic("upscale")(upscale)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

