package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubscriptionPurchasesDeferResponse extends js.Object {
  /**
    * The new expiry time for the subscription in milliseconds since the Epoch.
    */
  var newExpiryTimeMillis: js.UndefOr[String] = js.native
}

object SchemaSubscriptionPurchasesDeferResponse {
  @scala.inline
  def apply(): SchemaSubscriptionPurchasesDeferResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferResponse]
  }
  @scala.inline
  implicit class SchemaSubscriptionPurchasesDeferResponseOps[Self <: SchemaSubscriptionPurchasesDeferResponse] (val x: Self) extends AnyVal {
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
    def setNewExpiryTimeMillis(value: String): Self = this.set("newExpiryTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewExpiryTimeMillis: Self = this.set("newExpiryTimeMillis", js.undefined)
  }
  
}

