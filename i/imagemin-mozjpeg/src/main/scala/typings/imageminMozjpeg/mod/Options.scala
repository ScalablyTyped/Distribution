package typings.imageminMozjpeg.mod

import typings.imageminMozjpeg.imageminMozjpegStrings.`hvs-psnr`
import typings.imageminMozjpeg.imageminMozjpegStrings.`ms-ssim`
import typings.imageminMozjpeg.imageminMozjpegStrings.fast
import typings.imageminMozjpeg.imageminMozjpegStrings.float
import typings.imageminMozjpeg.imageminMozjpegStrings.int
import typings.imageminMozjpeg.imageminMozjpegStrings.psnr
import typings.imageminMozjpeg.imageminMozjpegStrings.ssim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Use arithmetic coding.
    * @default false
    */
  var arithmetic: js.UndefOr[Boolean] = js.undefined
  /**
    * Set DC scan optimization mode.
    *  0 One scan for all components
    *  1 One scan per component
    *  2 Optimize between one scan for all components and one scan for 1st component plus one scan for remaining components
    * @default 1
    */
  var dcScanOpt: js.UndefOr[Double] = js.undefined
  /**
    * Set DCT method:
    * int Use integer DCT
    * fast Use fast integer DCT (less accurate)
    * float Use floating-point DCT
    * @default 'int'
    */
  var dct: js.UndefOr[int | fast | float] = js.undefined
  /**
    * Disable progressive scan optimization.
    * @default false
    */
  var fastCrush: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the maximum memory to use in kilobytes.
    */
  var maxMemory: js.UndefOr[Double] = js.undefined
  /**
    * Black-on-white deringing via overshoot.
    * @default true
    */
  var overshoot: js.UndefOr[Boolean] = js.undefined
  /**
    * false creates baseline JPEG file.
    * @default true
    */
  var progressive: js.UndefOr[Boolean] = js.undefined
  /** Compression quality, in range 0 (worst) to 100 (perfect). */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * Use 8-bit quantization table entries for baseline JPEG compatibility.
    * @default false
    */
  var quantBaseline: js.UndefOr[Boolean] = js.undefined
  /**
    * Use predefined quantization table.
    * 0 JPEG Annex K
    * 1 Flat
    * 2 Custom, tuned for MS-SSIM
    * 3 ImageMagick table by N. Robidoux
    * 4 Custom, tuned for PSNR-HVS
    * 5 Table from paper by Klein, Silverstein and Carney
    */
  var quantTable: js.UndefOr[Double] = js.undefined
  /**
    * Revert to standard defaults instead of mozjpeg defaults.
    * @default false
    */
  var revert: js.UndefOr[Boolean] = js.undefined
  /**
    * Set component sampling factors. Each item should be in the format HxV, for example 2x1.
    */
  var sample: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Set the strength of smooth dithered input. (1...100)
    */
  var smooth: js.UndefOr[Double] = js.undefined
  /**
    * Input file is Targa format (usually not needed).
    * @default false
    */
  var targa: js.UndefOr[Boolean] = js.undefined
  /**
    * Trellis optimization.
    * @default true
    *
    */
  var trellis: js.UndefOr[Boolean] = js.undefined
  /**
    * Trellis optimization of DC coefficients.
    * @default true
    */
  var trellisDC: js.UndefOr[Boolean] = js.undefined
  /**
    * Set Trellis optimization method. Available methods: psnr, hvs-psnr, ssim, ms-ssim
    * @default 'hvs-psnr'
    */
  var tune: js.UndefOr[psnr | `hvs-psnr` | ssim | `ms-ssim`] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arithmetic: js.UndefOr[Boolean] = js.undefined,
    dcScanOpt: js.UndefOr[Double] = js.undefined,
    dct: int | fast | float = null,
    fastCrush: js.UndefOr[Boolean] = js.undefined,
    maxMemory: js.UndefOr[Double] = js.undefined,
    overshoot: js.UndefOr[Boolean] = js.undefined,
    progressive: js.UndefOr[Boolean] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    quantBaseline: js.UndefOr[Boolean] = js.undefined,
    quantTable: js.UndefOr[Double] = js.undefined,
    revert: js.UndefOr[Boolean] = js.undefined,
    sample: js.Array[String] = null,
    smooth: js.UndefOr[Double] = js.undefined,
    targa: js.UndefOr[Boolean] = js.undefined,
    trellis: js.UndefOr[Boolean] = js.undefined,
    trellisDC: js.UndefOr[Boolean] = js.undefined,
    tune: psnr | `hvs-psnr` | ssim | `ms-ssim` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arithmetic)) __obj.updateDynamic("arithmetic")(arithmetic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dcScanOpt)) __obj.updateDynamic("dcScanOpt")(dcScanOpt.get.asInstanceOf[js.Any])
    if (dct != null) __obj.updateDynamic("dct")(dct.asInstanceOf[js.Any])
    if (!js.isUndefined(fastCrush)) __obj.updateDynamic("fastCrush")(fastCrush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMemory)) __obj.updateDynamic("maxMemory")(maxMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overshoot)) __obj.updateDynamic("overshoot")(overshoot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantBaseline)) __obj.updateDynamic("quantBaseline")(quantBaseline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantTable)) __obj.updateDynamic("quantTable")(quantTable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert.get.asInstanceOf[js.Any])
    if (sample != null) __obj.updateDynamic("sample")(sample.asInstanceOf[js.Any])
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targa)) __obj.updateDynamic("targa")(targa.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trellis)) __obj.updateDynamic("trellis")(trellis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trellisDC)) __obj.updateDynamic("trellisDC")(trellisDC.get.asInstanceOf[js.Any])
    if (tune != null) __obj.updateDynamic("tune")(tune.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

