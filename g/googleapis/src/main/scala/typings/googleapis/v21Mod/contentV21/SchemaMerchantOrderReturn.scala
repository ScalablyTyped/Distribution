package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMerchantOrderReturn extends js.Object {
  var creationDate: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var orderId: js.UndefOr[String] = js.native
  var orderReturnId: js.UndefOr[String] = js.native
  var returnItems: js.UndefOr[js.Array[SchemaMerchantOrderReturnItem]] = js.native
  var returnShipments: js.UndefOr[js.Array[SchemaReturnShipment]] = js.native
}

object SchemaMerchantOrderReturn {
  @scala.inline
  def apply(): SchemaMerchantOrderReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantOrderReturn]
  }
  @scala.inline
  implicit class SchemaMerchantOrderReturnOps[Self <: SchemaMerchantOrderReturn] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    @scala.inline
    def setOrderReturnId(value: String): Self = this.set("orderReturnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderReturnId: Self = this.set("orderReturnId", js.undefined)
    @scala.inline
    def setReturnItemsVarargs(value: SchemaMerchantOrderReturnItem*): Self = this.set("returnItems", js.Array(value :_*))
    @scala.inline
    def setReturnItems(value: js.Array[SchemaMerchantOrderReturnItem]): Self = this.set("returnItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnItems: Self = this.set("returnItems", js.undefined)
    @scala.inline
    def setReturnShipmentsVarargs(value: SchemaReturnShipment*): Self = this.set("returnShipments", js.Array(value :_*))
    @scala.inline
    def setReturnShipments(value: js.Array[SchemaReturnShipment]): Self = this.set("returnShipments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnShipments: Self = this.set("returnShipments", js.undefined)
  }
  
}

