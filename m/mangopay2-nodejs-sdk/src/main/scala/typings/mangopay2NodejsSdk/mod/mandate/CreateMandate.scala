package typings.mangopay2NodejsSdk.mod.mandate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.mandate.MandateData, 'Tag', 'BankAccountId' | 'Culture' | 'ReturnURL'> */
@js.native
trait CreateMandate extends js.Object {
  var BankAccountId: String = js.native
  var Culture: MandateCultureCode = js.native
  var ReturnURL: String = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateMandate {
  @scala.inline
  def apply(BankAccountId: String, Culture: MandateCultureCode, ReturnURL: String): CreateMandate = {
    val __obj = js.Dynamic.literal(BankAccountId = BankAccountId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMandate]
  }
  @scala.inline
  implicit class CreateMandateOps[Self <: CreateMandate] (val x: Self) extends AnyVal {
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
    def setBankAccountId(value: String): Self = this.set("BankAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCulture(value: MandateCultureCode): Self = this.set("Culture", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnURL(value: String): Self = this.set("ReturnURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

