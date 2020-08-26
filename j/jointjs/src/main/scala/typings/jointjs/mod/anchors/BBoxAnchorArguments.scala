package typings.jointjs.mod.anchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BBoxAnchorArguments extends RotateAnchorArguments {
  var dx: js.UndefOr[Double | String] = js.native
  var dy: js.UndefOr[Double | String] = js.native
}

object BBoxAnchorArguments {
  @scala.inline
  def apply(): BBoxAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BBoxAnchorArguments]
  }
  @scala.inline
  implicit class BBoxAnchorArgumentsOps[Self <: BBoxAnchorArguments] (val x: Self) extends AnyVal {
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
    def setDx(value: Double | String): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setDy(value: Double | String): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
  }
  
}

