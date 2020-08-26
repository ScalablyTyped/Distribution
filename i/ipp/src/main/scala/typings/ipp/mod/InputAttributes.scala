package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputAttributes extends js.Object {
  var `input-auto-scaling`: js.UndefOr[Boolean] = js.native
  var `input-auto-skew-correction`: js.UndefOr[Boolean] = js.native
  var `input-brightness`: js.UndefOr[Double] = js.native
  var `input-color-mode`: js.UndefOr[InputColorMode] = js.native
  var `input-content-type`: js.UndefOr[InputContentType] = js.native
  var `input-contrast`: js.UndefOr[Double] = js.native
  var `input-film-scan-mode`: js.UndefOr[InputFilmScanMode] = js.native
  var `input-images-to-transfer`: js.UndefOr[Double] = js.native
  var `input-media`: js.UndefOr[MediaName | MediaSizeName] = js.native
  var `input-orientation-requested`: js.UndefOr[OrientationRequested] = js.native
  var `input-quality`: js.UndefOr[PrintQuality] = js.native
  var `input-resolution`: js.UndefOr[Resolution] = js.native
  var `input-scaling-height`: js.UndefOr[Double] = js.native
  var `input-scaling-width`: js.UndefOr[Double] = js.native
  var `input-scan-regions`: js.UndefOr[js.Array[PPScanRegions]] = js.native
  var `input-sharpness`: js.UndefOr[Double] = js.native
  var `input-sides`: js.UndefOr[Sides] = js.native
  var `input-source`: js.UndefOr[InputSource] = js.native
}

object InputAttributes {
  @scala.inline
  def apply(): InputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAttributes]
  }
  @scala.inline
  implicit class InputAttributesOps[Self <: InputAttributes] (val x: Self) extends AnyVal {
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
    def `setInput-auto-scaling`(value: Boolean): Self = this.set("input-auto-scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-auto-scaling`: Self = this.set("input-auto-scaling", js.undefined)
    @scala.inline
    def `setInput-auto-skew-correction`(value: Boolean): Self = this.set("input-auto-skew-correction", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-auto-skew-correction`: Self = this.set("input-auto-skew-correction", js.undefined)
    @scala.inline
    def `setInput-brightness`(value: Double): Self = this.set("input-brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-brightness`: Self = this.set("input-brightness", js.undefined)
    @scala.inline
    def `setInput-color-mode`(value: InputColorMode): Self = this.set("input-color-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-color-mode`: Self = this.set("input-color-mode", js.undefined)
    @scala.inline
    def `setInput-content-type`(value: InputContentType): Self = this.set("input-content-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-content-type`: Self = this.set("input-content-type", js.undefined)
    @scala.inline
    def `setInput-contrast`(value: Double): Self = this.set("input-contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-contrast`: Self = this.set("input-contrast", js.undefined)
    @scala.inline
    def `setInput-film-scan-mode`(value: InputFilmScanMode): Self = this.set("input-film-scan-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-film-scan-mode`: Self = this.set("input-film-scan-mode", js.undefined)
    @scala.inline
    def `setInput-images-to-transfer`(value: Double): Self = this.set("input-images-to-transfer", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-images-to-transfer`: Self = this.set("input-images-to-transfer", js.undefined)
    @scala.inline
    def `setInput-media`(value: MediaName | MediaSizeName): Self = this.set("input-media", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-media`: Self = this.set("input-media", js.undefined)
    @scala.inline
    def `setInput-orientation-requested`(value: OrientationRequested): Self = this.set("input-orientation-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-orientation-requested`: Self = this.set("input-orientation-requested", js.undefined)
    @scala.inline
    def `setInput-quality`(value: PrintQuality): Self = this.set("input-quality", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-quality`: Self = this.set("input-quality", js.undefined)
    @scala.inline
    def `setInput-resolution`(value: Resolution): Self = this.set("input-resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-resolution`: Self = this.set("input-resolution", js.undefined)
    @scala.inline
    def `setInput-scaling-height`(value: Double): Self = this.set("input-scaling-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-scaling-height`: Self = this.set("input-scaling-height", js.undefined)
    @scala.inline
    def `setInput-scaling-width`(value: Double): Self = this.set("input-scaling-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-scaling-width`: Self = this.set("input-scaling-width", js.undefined)
    @scala.inline
    def `setInput-scan-regionsVarargs`(value: PPScanRegions*): Self = this.set("input-scan-regions", js.Array(value :_*))
    @scala.inline
    def `setInput-scan-regions`(value: js.Array[PPScanRegions]): Self = this.set("input-scan-regions", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-scan-regions`: Self = this.set("input-scan-regions", js.undefined)
    @scala.inline
    def `setInput-sharpness`(value: Double): Self = this.set("input-sharpness", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-sharpness`: Self = this.set("input-sharpness", js.undefined)
    @scala.inline
    def `setInput-sides`(value: Sides): Self = this.set("input-sides", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-sides`: Self = this.set("input-sides", js.undefined)
    @scala.inline
    def `setInput-source`(value: InputSource): Self = this.set("input-source", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-source`: Self = this.set("input-source", js.undefined)
  }
  
}

