package typings.levelup.mod

import typings.abstractLeveldown.mod.AbstractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractClearOptions[K] extends AbstractOptions {
  var gt: js.UndefOr[K] = js.native
  var gte: js.UndefOr[K] = js.native
  var limit: js.UndefOr[Double] = js.native
  var lt: js.UndefOr[K] = js.native
  var lte: js.UndefOr[K] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
}

object AbstractClearOptions {
  @scala.inline
  def apply[K](): AbstractClearOptions[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractClearOptions[K]]
  }
  @scala.inline
  implicit class AbstractClearOptionsOps[Self <: AbstractClearOptions[_], K] (val x: Self with AbstractClearOptions[K]) extends AnyVal {
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
    def setGt(value: K): Self = this.set("gt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    @scala.inline
    def setGte(value: K): Self = this.set("gte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGte: Self = this.set("gte", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLt(value: K): Self = this.set("lt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    @scala.inline
    def setLte(value: K): Self = this.set("lte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLte: Self = this.set("lte", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
  
}

