package typings.jointjs.mod.dia.Paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStats extends js.Object {
  var batches: js.UndefOr[Double] = js.native
  var empty: js.UndefOr[Boolean] = js.native
  var mounted: js.UndefOr[Double] = js.native
  var postponed: js.UndefOr[Double] = js.native
  var priority: Double = js.native
  var unmounted: js.UndefOr[Double] = js.native
  var updated: Double = js.native
}

object UpdateStats {
  @scala.inline
  def apply(priority: Double, updated: Double): UpdateStats = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStats]
  }
  @scala.inline
  implicit class UpdateStatsOps[Self <: UpdateStats] (val x: Self) extends AnyVal {
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
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatches(value: Double): Self = this.set("batches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatches: Self = this.set("batches", js.undefined)
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setMounted(value: Double): Self = this.set("mounted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMounted: Self = this.set("mounted", js.undefined)
    @scala.inline
    def setPostponed(value: Double): Self = this.set("postponed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostponed: Self = this.set("postponed", js.undefined)
    @scala.inline
    def setUnmounted(value: Double): Self = this.set("unmounted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmounted: Self = this.set("unmounted", js.undefined)
  }
  
}

