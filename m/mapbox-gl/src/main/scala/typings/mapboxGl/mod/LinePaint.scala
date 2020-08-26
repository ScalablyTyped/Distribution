package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinePaint extends AnyPaint {
  var `line-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-blur-transition`: js.UndefOr[Transition] = js.native
  var `line-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `line-color-transition`: js.UndefOr[Transition] = js.native
  var `line-dasharray`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `line-dasharray-transition`: js.UndefOr[Transition] = js.native
  var `line-gap-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-gap-width-transition`: js.UndefOr[Transition] = js.native
  var `line-gradient`: js.UndefOr[Expression] = js.native
  var `line-offset`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-offset-transition`: js.UndefOr[Transition] = js.native
  var `line-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-opacity-transition`: js.UndefOr[Transition] = js.native
  var `line-pattern`: js.UndefOr[String | Expression] = js.native
  var `line-pattern-transition`: js.UndefOr[Transition] = js.native
  var `line-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `line-translate-anchor`: js.UndefOr[map | viewport] = js.native
  var `line-translate-transition`: js.UndefOr[Transition] = js.native
  var `line-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-width-transition`: js.UndefOr[Transition] = js.native
}

object LinePaint {
  @scala.inline
  def apply(): LinePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinePaint]
  }
  @scala.inline
  implicit class LinePaintOps[Self <: LinePaint] (val x: Self) extends AnyVal {
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
    def `setLine-blur`(value: Double | StyleFunction | Expression): Self = this.set("line-blur", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-blur`: Self = this.set("line-blur", js.undefined)
    @scala.inline
    def `setLine-blur-transition`(value: Transition): Self = this.set("line-blur-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-blur-transition`: Self = this.set("line-blur-transition", js.undefined)
    @scala.inline
    def `setLine-color`(value: String | StyleFunction | Expression): Self = this.set("line-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-color`: Self = this.set("line-color", js.undefined)
    @scala.inline
    def `setLine-color-transition`(value: Transition): Self = this.set("line-color-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-color-transition`: Self = this.set("line-color-transition", js.undefined)
    @scala.inline
    def `setLine-dasharrayVarargs`(value: Double*): Self = this.set("line-dasharray", js.Array(value :_*))
    @scala.inline
    def `setLine-dasharray`(value: js.Array[Double] | Expression): Self = this.set("line-dasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-dasharray`: Self = this.set("line-dasharray", js.undefined)
    @scala.inline
    def `setLine-dasharray-transition`(value: Transition): Self = this.set("line-dasharray-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-dasharray-transition`: Self = this.set("line-dasharray-transition", js.undefined)
    @scala.inline
    def `setLine-gap-width`(value: Double | StyleFunction | Expression): Self = this.set("line-gap-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-gap-width`: Self = this.set("line-gap-width", js.undefined)
    @scala.inline
    def `setLine-gap-width-transition`(value: Transition): Self = this.set("line-gap-width-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-gap-width-transition`: Self = this.set("line-gap-width-transition", js.undefined)
    @scala.inline
    def `setLine-gradient`(value: Expression): Self = this.set("line-gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-gradient`: Self = this.set("line-gradient", js.undefined)
    @scala.inline
    def `setLine-offset`(value: Double | StyleFunction | Expression): Self = this.set("line-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-offset`: Self = this.set("line-offset", js.undefined)
    @scala.inline
    def `setLine-offset-transition`(value: Transition): Self = this.set("line-offset-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-offset-transition`: Self = this.set("line-offset-transition", js.undefined)
    @scala.inline
    def `setLine-opacity`(value: Double | StyleFunction | Expression): Self = this.set("line-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-opacity`: Self = this.set("line-opacity", js.undefined)
    @scala.inline
    def `setLine-opacity-transition`(value: Transition): Self = this.set("line-opacity-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-opacity-transition`: Self = this.set("line-opacity-transition", js.undefined)
    @scala.inline
    def `setLine-pattern`(value: String | Expression): Self = this.set("line-pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-pattern`: Self = this.set("line-pattern", js.undefined)
    @scala.inline
    def `setLine-pattern-transition`(value: Transition): Self = this.set("line-pattern-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-pattern-transition`: Self = this.set("line-pattern-transition", js.undefined)
    @scala.inline
    def `setLine-translateVarargs`(value: Double*): Self = this.set("line-translate", js.Array(value :_*))
    @scala.inline
    def `setLine-translate`(value: js.Array[Double] | Expression): Self = this.set("line-translate", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-translate`: Self = this.set("line-translate", js.undefined)
    @scala.inline
    def `setLine-translate-anchor`(value: map | viewport): Self = this.set("line-translate-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-translate-anchor`: Self = this.set("line-translate-anchor", js.undefined)
    @scala.inline
    def `setLine-translate-transition`(value: Transition): Self = this.set("line-translate-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-translate-transition`: Self = this.set("line-translate-transition", js.undefined)
    @scala.inline
    def `setLine-width`(value: Double | StyleFunction | Expression): Self = this.set("line-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-width`: Self = this.set("line-width", js.undefined)
    @scala.inline
    def `setLine-width-transition`(value: Transition): Self = this.set("line-width-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-width-transition`: Self = this.set("line-width-transition", js.undefined)
  }
  
}

