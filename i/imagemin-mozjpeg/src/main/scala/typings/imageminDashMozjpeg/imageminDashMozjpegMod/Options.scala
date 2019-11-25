package typings.imageminDashMozjpeg.imageminDashMozjpegMod

import typings.imageminDashMozjpeg.imageminDashMozjpegStrings.`hvs-psnr`
import typings.imageminDashMozjpeg.imageminDashMozjpegStrings.`ms-ssim`
import typings.imageminDashMozjpeg.imageminDashMozjpegStrings.fast
import typings.imageminDashMozjpeg.imageminDashMozjpegStrings.float
import typings.imageminDashMozjpeg.imageminDashMozjpegStrings.int
import typings.imageminDashMozjpeg.imageminDashMozjpegStrings.psnr
import typings.imageminDashMozjpeg.imageminDashMozjpegStrings.ssim
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
    dcScanOpt: Int | Double = null,
    dct: int | fast | float = null,
    fastCrush: js.UndefOr[Boolean] = js.undefined,
    maxMemory: Int | Double = null,
    overshoot: js.UndefOr[Boolean] = js.undefined,
    progressive: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    quantBaseline: js.UndefOr[Boolean] = js.undefined,
    quantTable: Int | Double = null,
    revert: js.UndefOr[Boolean] = js.undefined,
    sample: js.Array[String] = null,
    smooth: Int | Double = null,
    targa: js.UndefOr[Boolean] = js.undefined,
    trellis: js.UndefOr[Boolean] = js.undefined,
    trellisDC: js.UndefOr[Boolean] = js.undefined,
    tune: psnr | `hvs-psnr` | ssim | `ms-ssim` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arithmetic)) __obj.updateDynamic("arithmetic")(arithmetic.asInstanceOf[js.Any])
    if (dcScanOpt != null) __obj.updateDynamic("dcScanOpt")(dcScanOpt.asInstanceOf[js.Any])
    if (dct != null) __obj.updateDynamic("dct")(dct.asInstanceOf[js.Any])
    if (!js.isUndefined(fastCrush)) __obj.updateDynamic("fastCrush")(fastCrush.asInstanceOf[js.Any])
    if (maxMemory != null) __obj.updateDynamic("maxMemory")(maxMemory.asInstanceOf[js.Any])
    if (!js.isUndefined(overshoot)) __obj.updateDynamic("overshoot")(overshoot.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(quantBaseline)) __obj.updateDynamic("quantBaseline")(quantBaseline.asInstanceOf[js.Any])
    if (quantTable != null) __obj.updateDynamic("quantTable")(quantTable.asInstanceOf[js.Any])
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (sample != null) __obj.updateDynamic("sample")(sample.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (!js.isUndefined(targa)) __obj.updateDynamic("targa")(targa.asInstanceOf[js.Any])
    if (!js.isUndefined(trellis)) __obj.updateDynamic("trellis")(trellis.asInstanceOf[js.Any])
    if (!js.isUndefined(trellisDC)) __obj.updateDynamic("trellisDC")(trellisDC.asInstanceOf[js.Any])
    if (tune != null) __obj.updateDynamic("tune")(tune.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

