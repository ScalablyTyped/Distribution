package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.bevel
import typings.mapboxGl.mapboxGlStrings.butt
import typings.mapboxGl.mapboxGlStrings.miter
import typings.mapboxGl.mapboxGlStrings.round
import typings.mapboxGl.mapboxGlStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineLayout
  extends Layout
     with _AnyLayout {
  var `line-cap`: js.UndefOr[butt | round | square] = js.native
  var `line-join`: js.UndefOr[bevel | round | miter | Expression] = js.native
  var `line-miter-limit`: js.UndefOr[Double | Expression] = js.native
  var `line-round-limit`: js.UndefOr[Double | Expression] = js.native
  var `line-sort-key`: js.UndefOr[Double] = js.native
}

object LineLayout {
  @scala.inline
  def apply(): LineLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLayout]
  }
  @scala.inline
  implicit class LineLayoutOps[Self <: LineLayout] (val x: Self) extends AnyVal {
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
    def `setLine-cap`(value: butt | round | square): Self = this.set("line-cap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-cap`: Self = this.set("line-cap", js.undefined)
    @scala.inline
    def `setLine-join`(value: bevel | round | miter | Expression): Self = this.set("line-join", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-join`: Self = this.set("line-join", js.undefined)
    @scala.inline
    def `setLine-miter-limit`(value: Double | Expression): Self = this.set("line-miter-limit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-miter-limit`: Self = this.set("line-miter-limit", js.undefined)
    @scala.inline
    def `setLine-round-limit`(value: Double | Expression): Self = this.set("line-round-limit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-round-limit`: Self = this.set("line-round-limit", js.undefined)
    @scala.inline
    def `setLine-sort-key`(value: Double): Self = this.set("line-sort-key", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-sort-key`: Self = this.set("line-sort-key", js.undefined)
  }
  
}

