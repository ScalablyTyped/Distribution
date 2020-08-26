package typings.mangopay2NodejsSdk.mod.cardRegistration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardRegistration.CardRegistrationData, 'Tag' | 'RegistrationData'> */
@js.native
trait UpdateCardRegistration extends js.Object {
  var RegistrationData: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object UpdateCardRegistration {
  @scala.inline
  def apply(): UpdateCardRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCardRegistration]
  }
  @scala.inline
  implicit class UpdateCardRegistrationOps[Self <: UpdateCardRegistration] (val x: Self) extends AnyVal {
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
    def setRegistrationData(value: String): Self = this.set("RegistrationData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationData: Self = this.set("RegistrationData", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

