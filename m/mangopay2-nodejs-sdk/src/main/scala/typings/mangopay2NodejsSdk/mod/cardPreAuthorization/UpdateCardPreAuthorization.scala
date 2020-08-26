package typings.mangopay2NodejsSdk.mod.cardPreAuthorization

import typings.mangopay2NodejsSdk.mod.PaymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardPreAuthorization.CardPreAuthorizationData, 'Tag', 'PaymentStatus' | 'Id'> */
@js.native
trait UpdateCardPreAuthorization extends js.Object {
  var Id: String = js.native
  var PaymentStatus: typings.mangopay2NodejsSdk.mod.PaymentStatus = js.native
  var Tag: js.UndefOr[String] = js.native
}

object UpdateCardPreAuthorization {
  @scala.inline
  def apply(Id: String, PaymentStatus: PaymentStatus): UpdateCardPreAuthorization = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCardPreAuthorization]
  }
  @scala.inline
  implicit class UpdateCardPreAuthorizationOps[Self <: UpdateCardPreAuthorization] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentStatus(value: PaymentStatus): Self = this.set("PaymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

