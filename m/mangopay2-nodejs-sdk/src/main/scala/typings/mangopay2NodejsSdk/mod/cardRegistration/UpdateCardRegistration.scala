package typings.mangopay2NodejsSdk.mod.cardRegistration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardRegistration.CardRegistrationData, 'Tag' | 'RegistrationData'> */
trait UpdateCardRegistration extends js.Object {
  var RegistrationData: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object UpdateCardRegistration {
  @scala.inline
  def apply(RegistrationData: String = null, Tag: String = null): UpdateCardRegistration = {
    val __obj = js.Dynamic.literal()
    if (RegistrationData != null) __obj.updateDynamic("RegistrationData")(RegistrationData.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCardRegistration]
  }
}

