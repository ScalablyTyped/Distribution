package typings.mangopay2NodejsSdk.mod.cardPreAuthorization

import typings.mangopay2NodejsSdk.mod.PaymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardPreAuthorization.CardPreAuthorizationData, 'Tag', 'PaymentStatus' | 'Id'> */
trait UpdateCardPreAuthorization extends js.Object {
  var Id: String
  var PaymentStatus: typings.mangopay2NodejsSdk.mod.PaymentStatus
  var Tag: js.UndefOr[String] = js.undefined
}

object UpdateCardPreAuthorization {
  @scala.inline
  def apply(Id: String, PaymentStatus: PaymentStatus, Tag: String = null): UpdateCardPreAuthorization = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCardPreAuthorization]
  }
}

