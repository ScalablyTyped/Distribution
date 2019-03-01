package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait identityData extends js.Object {
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object identityData {
  @scala.inline
  def apply(
    emailAddress: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    username: java.lang.String = null
  ): identityData = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[identityData]
  }
}

