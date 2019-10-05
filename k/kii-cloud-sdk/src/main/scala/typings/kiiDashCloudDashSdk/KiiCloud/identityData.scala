package typings.kiiDashCloudDashSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait identityData extends js.Object {
  var emailAddress: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object identityData {
  @scala.inline
  def apply(emailAddress: String = null, phoneNumber: String = null, username: String = null): identityData = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[identityData]
  }
}

