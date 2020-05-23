package typings.imageminWebp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set transparency-compression quality between 0 and 100.
    * @default 100
    */
  var alphaQuality: js.UndefOr[Double] = js.undefined
  /**
    * Adjust filter strength automatically.
    * @default false
    */
  var autoFilter: js.UndefOr[Boolean] = js.undefined
  /**
    * Buffer to optimize.
    */
  var buffer: js.UndefOr[Buffer] = js.undefined
  /**
    * Crop the image.
    */
  var crop: js.UndefOr[Crop] = js.undefined
  /**
    * Set deblocking filter strength between 0 (off) and 100.
    */
  var filter: js.UndefOr[Double] = js.undefined
  /**
    * Encode images losslessly.
    * @default false
    */
  var lossless: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of metadata to copy from the input to the output if present.
    */
  var metadata: js.UndefOr[Metadata | js.Array[Metadata]] = js.undefined
  /**
    * Specify the compression method to use,
    * between 0 (fastest) and 6 (slowest).
    * This parameter controls the trade off between encoding speed
    * and the compressed file size and quality.
    * @default 4
    */
  var method: js.UndefOr[Double] = js.undefined
  /**
    * Encode losslessly with an additional lossy pre-processing step,
    * with a quality factor between
    * 0 (maximum pre-processing) and 100 (same as lossless).
    * @default 100
    */
  var nearLossless: js.UndefOr[Double] = js.undefined
  /**
    * Preset setting.
    * @default default
    */
  var preset: js.UndefOr[Preset] = js.undefined
  /**
    * Set quality factor between 0 and 100.
    * @default 75
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * Resize the image. Happens after crop.
    */
  var resize: js.UndefOr[Resize] = js.undefined
  /**
    * Set filter sharpness between 0 (sharpest) and 7 (least sharp).
    * @default 0
    */
  var sharpness: js.UndefOr[Double] = js.undefined
  /**
    * Set target size in bytes.
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * Set the amplitude of spatial noise shaping between 0 and 100.
    * @default 80
    */
  var sns: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alphaQuality: js.UndefOr[Double] = js.undefined,
    autoFilter: js.UndefOr[Boolean] = js.undefined,
    buffer: Buffer = null,
    crop: Crop = null,
    filter: js.UndefOr[Double] = js.undefined,
    lossless: js.UndefOr[Boolean] = js.undefined,
    metadata: Metadata | js.Array[Metadata] = null,
    method: js.UndefOr[Double] = js.undefined,
    nearLossless: js.UndefOr[Double] = js.undefined,
    preset: Preset = null,
    quality: js.UndefOr[Double] = js.undefined,
    resize: Resize = null,
    sharpness: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    sns: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alphaQuality)) __obj.updateDynamic("alphaQuality")(alphaQuality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFilter)) __obj.updateDynamic("autoFilter")(autoFilter.get.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lossless)) __obj.updateDynamic("lossless")(lossless.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nearLossless)) __obj.updateDynamic("nearLossless")(nearLossless.get.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(sharpness)) __obj.updateDynamic("sharpness")(sharpness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sns)) __obj.updateDynamic("sns")(sns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

