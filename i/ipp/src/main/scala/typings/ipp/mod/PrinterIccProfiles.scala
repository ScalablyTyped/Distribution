package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterIccProfiles extends js.Object {
  var `profile-name`: js.UndefOr[String] = js.undefined
  var `profile-url`: js.UndefOr[String] = js.undefined
}

object PrinterIccProfiles {
  @scala.inline
  def apply(`profile-name`: String = null, `profile-url`: String = null): PrinterIccProfiles = {
    val __obj = js.Dynamic.literal()
    if (`profile-name` != null) __obj.updateDynamic("profile-name")(`profile-name`.asInstanceOf[js.Any])
    if (`profile-url` != null) __obj.updateDynamic("profile-url")(`profile-url`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterIccProfiles]
  }
}

