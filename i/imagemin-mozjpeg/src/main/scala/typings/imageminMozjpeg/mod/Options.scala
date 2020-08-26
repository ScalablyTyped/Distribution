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

@js.native
trait Options extends js.Object {
  /**
    * Use arithmetic coding.
    * @default false
    */
  var arithmetic: js.UndefOr[Boolean] = js.native
  /**
    * Set DC scan optimization mode.
    *  0 One scan for all components
    *  1 One scan per component
    *  2 Optimize between one scan for all components and one scan for 1st component plus one scan for remaining components
    * @default 1
    */
  var dcScanOpt: js.UndefOr[Double] = js.native
  /**
    * Set DCT method:
    * int Use integer DCT
    * fast Use fast integer DCT (less accurate)
    * float Use floating-point DCT
    * @default 'int'
    */
  var dct: js.UndefOr[int | fast | float] = js.native
  /**
    * Disable progressive scan optimization.
    * @default false
    */
  var fastCrush: js.UndefOr[Boolean] = js.native
  /**
    * Set the maximum memory to use in kilobytes.
    */
  var maxMemory: js.UndefOr[Double] = js.native
  /**
    * Black-on-white deringing via overshoot.
    * @default true
    */
  var overshoot: js.UndefOr[Boolean] = js.native
  /**
    * false creates baseline JPEG file.
    * @default true
    */
  var progressive: js.UndefOr[Boolean] = js.native
  /** Compression quality, in range 0 (worst) to 100 (perfect). */
  var quality: js.UndefOr[Double] = js.native
  /**
    * Use 8-bit quantization table entries for baseline JPEG compatibility.
    * @default false
    */
  var quantBaseline: js.UndefOr[Boolean] = js.native
  /**
    * Use predefined quantization table.
    * 0 JPEG Annex K
    * 1 Flat
    * 2 Custom, tuned for MS-SSIM
    * 3 ImageMagick table by N. Robidoux
    * 4 Custom, tuned for PSNR-HVS
    * 5 Table from paper by Klein, Silverstein and Carney
    */
  var quantTable: js.UndefOr[Double] = js.native
  /**
    * Revert to standard defaults instead of mozjpeg defaults.
    * @default false
    */
  var revert: js.UndefOr[Boolean] = js.native
  /**
    * Set component sampling factors. Each item should be in the format HxV, for example 2x1.
    */
  var sample: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set the strength of smooth dithered input. (1...100)
    */
  var smooth: js.UndefOr[Double] = js.native
  /**
    * Input file is Targa format (usually not needed).
    * @default false
    */
  var targa: js.UndefOr[Boolean] = js.native
  /**
    * Trellis optimization.
    * @default true
    *
    */
  var trellis: js.UndefOr[Boolean] = js.native
  /**
    * Trellis optimization of DC coefficients.
    * @default true
    */
  var trellisDC: js.UndefOr[Boolean] = js.native
  /**
    * Set Trellis optimization method. Available methods: psnr, hvs-psnr, ssim, ms-ssim
    * @default 'hvs-psnr'
    */
  var tune: js.UndefOr[psnr | `hvs-psnr` | ssim | `ms-ssim`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArithmetic(value: Boolean): Self = this.set("arithmetic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArithmetic: Self = this.set("arithmetic", js.undefined)
    @scala.inline
    def setDcScanOpt(value: Double): Self = this.set("dcScanOpt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDcScanOpt: Self = this.set("dcScanOpt", js.undefined)
    @scala.inline
    def setDct(value: int | fast | float): Self = this.set("dct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDct: Self = this.set("dct", js.undefined)
    @scala.inline
    def setFastCrush(value: Boolean): Self = this.set("fastCrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastCrush: Self = this.set("fastCrush", js.undefined)
    @scala.inline
    def setMaxMemory(value: Double): Self = this.set("maxMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMemory: Self = this.set("maxMemory", js.undefined)
    @scala.inline
    def setOvershoot(value: Boolean): Self = this.set("overshoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOvershoot: Self = this.set("overshoot", js.undefined)
    @scala.inline
    def setProgressive(value: Boolean): Self = this.set("progressive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressive: Self = this.set("progressive", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setQuantBaseline(value: Boolean): Self = this.set("quantBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantBaseline: Self = this.set("quantBaseline", js.undefined)
    @scala.inline
    def setQuantTable(value: Double): Self = this.set("quantTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantTable: Self = this.set("quantTable", js.undefined)
    @scala.inline
    def setRevert(value: Boolean): Self = this.set("revert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
    @scala.inline
    def setSampleVarargs(value: String*): Self = this.set("sample", js.Array(value :_*))
    @scala.inline
    def setSample(value: js.Array[String]): Self = this.set("sample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSample: Self = this.set("sample", js.undefined)
    @scala.inline
    def setSmooth(value: Double): Self = this.set("smooth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    @scala.inline
    def setTarga(value: Boolean): Self = this.set("targa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarga: Self = this.set("targa", js.undefined)
    @scala.inline
    def setTrellis(value: Boolean): Self = this.set("trellis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrellis: Self = this.set("trellis", js.undefined)
    @scala.inline
    def setTrellisDC(value: Boolean): Self = this.set("trellisDC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrellisDC: Self = this.set("trellisDC", js.undefined)
    @scala.inline
    def setTune(value: psnr | `hvs-psnr` | ssim | `ms-ssim`): Self = this.set("tune", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTune: Self = this.set("tune", js.undefined)
  }
  
}

