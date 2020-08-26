package typings.gtagJs.Gtag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  var brand: js.UndefOr[String] = js.native
  var category: js.UndefOr[String] = js.native
  var creative_name: js.UndefOr[String] = js.native
  var creative_slot: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var location_id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var price: js.UndefOr[Currency] = js.native
  var quantity: js.UndefOr[Double] = js.native
}

object Item {
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
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
    def setLocation_id(value: String): Self = this.set("location_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation_id: Self = this.set("location_id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrice(value: Currency): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

