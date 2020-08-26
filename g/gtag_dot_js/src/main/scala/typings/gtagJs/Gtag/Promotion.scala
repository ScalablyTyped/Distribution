package typings.gtagJs.Gtag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promotion extends js.Object {
  var creative_name: js.UndefOr[String] = js.native
  var creative_slot: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object Promotion {
  @scala.inline
  def apply(): Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotion]
  }
  @scala.inline
  implicit class PromotionOps[Self <: Promotion] (val x: Self) extends AnyVal {
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
    def setCreative_name(value: String): Self = this.set("creative_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreative_name: Self = this.set("creative_name", js.undefined)
    @scala.inline
    def setCreative_slot(value: String): Self = this.set("creative_slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreative_slot: Self = this.set("creative_slot", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

