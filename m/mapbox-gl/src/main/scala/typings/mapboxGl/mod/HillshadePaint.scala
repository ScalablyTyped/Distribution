package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HillshadePaint extends AnyPaint {
  var `hillshade-accent-color`: js.UndefOr[String | Expression] = js.native
  var `hillshade-accent-color-transition`: js.UndefOr[Transition] = js.native
  var `hillshade-exaggeration`: js.UndefOr[Double | Expression] = js.native
  var `hillshade-exaggeration-transition`: js.UndefOr[Transition] = js.native
  var `hillshade-highlight-color`: js.UndefOr[String | Expression] = js.native
  var `hillshade-highlight-color-transition`: js.UndefOr[Transition] = js.native
  var `hillshade-illumination-anchor`: js.UndefOr[map | viewport] = js.native
  var `hillshade-illumination-direction`: js.UndefOr[Double | Expression] = js.native
  var `hillshade-shadow-color`: js.UndefOr[String | Expression] = js.native
  var `hillshade-shadow-color-transition`: js.UndefOr[Transition] = js.native
}

object HillshadePaint {
  @scala.inline
  def apply(): HillshadePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HillshadePaint]
  }
  @scala.inline
  implicit class HillshadePaintOps[Self <: HillshadePaint] (val x: Self) extends AnyVal {
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
    def `setHillshade-accent-color`(value: String | Expression): Self = this.set("hillshade-accent-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-accent-color`: Self = this.set("hillshade-accent-color", js.undefined)
    @scala.inline
    def `setHillshade-accent-color-transition`(value: Transition): Self = this.set("hillshade-accent-color-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-accent-color-transition`: Self = this.set("hillshade-accent-color-transition", js.undefined)
    @scala.inline
    def `setHillshade-exaggeration`(value: Double | Expression): Self = this.set("hillshade-exaggeration", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-exaggeration`: Self = this.set("hillshade-exaggeration", js.undefined)
    @scala.inline
    def `setHillshade-exaggeration-transition`(value: Transition): Self = this.set("hillshade-exaggeration-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-exaggeration-transition`: Self = this.set("hillshade-exaggeration-transition", js.undefined)
    @scala.inline
    def `setHillshade-highlight-color`(value: String | Expression): Self = this.set("hillshade-highlight-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-highlight-color`: Self = this.set("hillshade-highlight-color", js.undefined)
    @scala.inline
    def `setHillshade-highlight-color-transition`(value: Transition): Self = this.set("hillshade-highlight-color-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-highlight-color-transition`: Self = this.set("hillshade-highlight-color-transition", js.undefined)
    @scala.inline
    def `setHillshade-illumination-anchor`(value: map | viewport): Self = this.set("hillshade-illumination-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-illumination-anchor`: Self = this.set("hillshade-illumination-anchor", js.undefined)
    @scala.inline
    def `setHillshade-illumination-direction`(value: Double | Expression): Self = this.set("hillshade-illumination-direction", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-illumination-direction`: Self = this.set("hillshade-illumination-direction", js.undefined)
    @scala.inline
    def `setHillshade-shadow-color`(value: String | Expression): Self = this.set("hillshade-shadow-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-shadow-color`: Self = this.set("hillshade-shadow-color", js.undefined)
    @scala.inline
    def `setHillshade-shadow-color-transition`(value: Transition): Self = this.set("hillshade-shadow-color-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHillshade-shadow-color-transition`: Self = this.set("hillshade-shadow-color-transition", js.undefined)
  }
  
}

