package typings.jsplumb.anon

import typings.jsplumb.mod.PerimeterShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorCount extends js.Object {
  var anchorCount: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var shape: js.UndefOr[PerimeterShape] = js.native
}

object AnchorCount {
  @scala.inline
  def apply(): AnchorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorCount]
  }
  @scala.inline
  implicit class AnchorCountOps[Self <: AnchorCount] (val x: Self) extends AnyVal {
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
    def setAnchorCount(value: Double): Self = this.set("anchorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorCount: Self = this.set("anchorCount", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setShape(value: PerimeterShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
  
}

