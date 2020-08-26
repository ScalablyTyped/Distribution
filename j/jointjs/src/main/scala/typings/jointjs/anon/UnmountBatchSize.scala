package typings.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmountBatchSize extends js.Object {
  var unmountBatchSize: js.UndefOr[Double] = js.native
}

object UnmountBatchSize {
  @scala.inline
  def apply(): UnmountBatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmountBatchSize]
  }
  @scala.inline
  implicit class UnmountBatchSizeOps[Self <: UnmountBatchSize] (val x: Self) extends AnyVal {
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
    def setUnmountBatchSize(value: Double): Self = this.set("unmountBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmountBatchSize: Self = this.set("unmountBatchSize", js.undefined)
  }
  
}

