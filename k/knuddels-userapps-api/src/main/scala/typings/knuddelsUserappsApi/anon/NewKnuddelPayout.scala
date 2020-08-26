package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewKnuddelPayout extends js.Object {
  var newKnuddelPayout: js.UndefOr[Double] = js.native
  var newPriceCents: js.UndefOr[Double] = js.native
  var origKnuddelPayout: Double = js.native
  var origPriceCents: Double = js.native
  var productId: String = js.native
}

object NewKnuddelPayout {
  @scala.inline
  def apply(origKnuddelPayout: Double, origPriceCents: Double, productId: String): NewKnuddelPayout = {
    val __obj = js.Dynamic.literal(origKnuddelPayout = origKnuddelPayout.asInstanceOf[js.Any], origPriceCents = origPriceCents.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewKnuddelPayout]
  }
  @scala.inline
  implicit class NewKnuddelPayoutOps[Self <: NewKnuddelPayout] (val x: Self) extends AnyVal {
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
    def setOrigKnuddelPayout(value: Double): Self = this.set("origKnuddelPayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigPriceCents(value: Double): Self = this.set("origPriceCents", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewKnuddelPayout(value: Double): Self = this.set("newKnuddelPayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewKnuddelPayout: Self = this.set("newKnuddelPayout", js.undefined)
    @scala.inline
    def setNewPriceCents(value: Double): Self = this.set("newPriceCents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPriceCents: Self = this.set("newPriceCents", js.undefined)
  }
  
}

