package typings.jointjs.mod.Vectorizer

import typings.jointjs.mod.g.PlainRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoundedRect extends PlainRect {
  var `bottom-rx`: js.UndefOr[Double] = js.native
  var `bottom-ry`: js.UndefOr[Double] = js.native
  var rx: js.UndefOr[Double] = js.native
  var ry: js.UndefOr[Double] = js.native
  var `top-rx`: js.UndefOr[Double] = js.native
  var `top-ry`: js.UndefOr[Double] = js.native
}

object RoundedRect {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): RoundedRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRect]
  }
  @scala.inline
  implicit class RoundedRectOps[Self <: RoundedRect] (val x: Self) extends AnyVal {
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
    def `setBottom-rx`(value: Double): Self = this.set("bottom-rx", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBottom-rx`: Self = this.set("bottom-rx", js.undefined)
    @scala.inline
    def `setBottom-ry`(value: Double): Self = this.set("bottom-ry", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBottom-ry`: Self = this.set("bottom-ry", js.undefined)
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    @scala.inline
    def `setTop-rx`(value: Double): Self = this.set("top-rx", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTop-rx`: Self = this.set("top-rx", js.undefined)
    @scala.inline
    def `setTop-ry`(value: Double): Self = this.set("top-ry", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTop-ry`: Self = this.set("top-ry", js.undefined)
  }
  
}

