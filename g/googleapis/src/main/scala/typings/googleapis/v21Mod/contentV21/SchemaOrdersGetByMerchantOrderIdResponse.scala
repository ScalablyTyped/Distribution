package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersGetByMerchantOrderIdResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersGetByMerchantOrderIdResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The requested order.
    */
  var order: js.UndefOr[SchemaOrder] = js.native
}

object SchemaOrdersGetByMerchantOrderIdResponse {
  @scala.inline
  def apply(): SchemaOrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersGetByMerchantOrderIdResponse]
  }
  @scala.inline
  implicit class SchemaOrdersGetByMerchantOrderIdResponseOps[Self <: SchemaOrdersGetByMerchantOrderIdResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrder(value: SchemaOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

