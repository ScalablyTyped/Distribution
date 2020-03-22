package typings.mangopay2NodejsSdk.mod.mandate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.mandate.MandateData, 'Tag', 'BankAccountId' | 'Culture' | 'ReturnURL'> */
trait CreateMandate extends js.Object {
  var BankAccountId: String
  var Culture: MandateCultureCode
  var ReturnURL: String
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateMandate {
  @scala.inline
  def apply(BankAccountId: String, Culture: MandateCultureCode, ReturnURL: String, Tag: String = null): CreateMandate = {
    val __obj = js.Dynamic.literal(BankAccountId = BankAccountId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMandate]
  }
}

