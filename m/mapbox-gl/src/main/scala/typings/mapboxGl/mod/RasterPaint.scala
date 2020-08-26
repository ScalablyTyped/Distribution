package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.linear
import typings.mapboxGl.mapboxGlStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterPaint extends AnyPaint {
  var `circle-sort-key`: js.UndefOr[Double] = js.native
  var `raster-brightness-max`: js.UndefOr[Double | Expression] = js.native
  var `raster-brightness-max-transition`: js.UndefOr[Transition] = js.native
  var `raster-brightness-min`: js.UndefOr[Double | Expression] = js.native
  var `raster-brightness-min-transition`: js.UndefOr[Transition] = js.native
  var `raster-contrast`: js.UndefOr[Double | Expression] = js.native
  var `raster-contrast-transition`: js.UndefOr[Transition] = js.native
  var `raster-fade-duration`: js.UndefOr[Double | Expression] = js.native
  var `raster-hue-rotate`: js.UndefOr[Double | Expression] = js.native
  var `raster-hue-rotate-transition`: js.UndefOr[Transition] = js.native
  var `raster-opacity`: js.UndefOr[Double | Expression] = js.native
  var `raster-opacity-transition`: js.UndefOr[Transition] = js.native
  var `raster-resampling`: js.UndefOr[linear | nearest] = js.native
  var `raster-saturation`: js.UndefOr[Double | Expression] = js.native
  var `raster-saturation-transition`: js.UndefOr[Transition] = js.native
}

object RasterPaint {
  @scala.inline
  def apply(): RasterPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterPaint]
  }
  @scala.inline
  implicit class RasterPaintOps[Self <: RasterPaint] (val x: Self) extends AnyVal {
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
    def `setCircle-sort-key`(value: Double): Self = this.set("circle-sort-key", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCircle-sort-key`: Self = this.set("circle-sort-key", js.undefined)
    @scala.inline
    def `setRaster-brightness-max`(value: Double | Expression): Self = this.set("raster-brightness-max", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-brightness-max`: Self = this.set("raster-brightness-max", js.undefined)
    @scala.inline
    def `setRaster-brightness-max-transition`(value: Transition): Self = this.set("raster-brightness-max-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-brightness-max-transition`: Self = this.set("raster-brightness-max-transition", js.undefined)
    @scala.inline
    def `setRaster-brightness-min`(value: Double | Expression): Self = this.set("raster-brightness-min", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-brightness-min`: Self = this.set("raster-brightness-min", js.undefined)
    @scala.inline
    def `setRaster-brightness-min-transition`(value: Transition): Self = this.set("raster-brightness-min-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-brightness-min-transition`: Self = this.set("raster-brightness-min-transition", js.undefined)
    @scala.inline
    def `setRaster-contrast`(value: Double | Expression): Self = this.set("raster-contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-contrast`: Self = this.set("raster-contrast", js.undefined)
    @scala.inline
    def `setRaster-contrast-transition`(value: Transition): Self = this.set("raster-contrast-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-contrast-transition`: Self = this.set("raster-contrast-transition", js.undefined)
    @scala.inline
    def `setRaster-fade-duration`(value: Double | Expression): Self = this.set("raster-fade-duration", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-fade-duration`: Self = this.set("raster-fade-duration", js.undefined)
    @scala.inline
    def `setRaster-hue-rotate`(value: Double | Expression): Self = this.set("raster-hue-rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-hue-rotate`: Self = this.set("raster-hue-rotate", js.undefined)
    @scala.inline
    def `setRaster-hue-rotate-transition`(value: Transition): Self = this.set("raster-hue-rotate-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-hue-rotate-transition`: Self = this.set("raster-hue-rotate-transition", js.undefined)
    @scala.inline
    def `setRaster-opacity`(value: Double | Expression): Self = this.set("raster-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-opacity`: Self = this.set("raster-opacity", js.undefined)
    @scala.inline
    def `setRaster-opacity-transition`(value: Transition): Self = this.set("raster-opacity-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-opacity-transition`: Self = this.set("raster-opacity-transition", js.undefined)
    @scala.inline
    def `setRaster-resampling`(value: linear | nearest): Self = this.set("raster-resampling", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-resampling`: Self = this.set("raster-resampling", js.undefined)
    @scala.inline
    def `setRaster-saturation`(value: Double | Expression): Self = this.set("raster-saturation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-saturation`: Self = this.set("raster-saturation", js.undefined)
    @scala.inline
    def `setRaster-saturation-transition`(value: Transition): Self = this.set("raster-saturation-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRaster-saturation-transition`: Self = this.set("raster-saturation-transition", js.undefined)
  }
  
}

