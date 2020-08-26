package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterIccProfiles extends js.Object {
  var `profile-name`: js.UndefOr[String] = js.native
  var `profile-url`: js.UndefOr[String] = js.native
}

object PrinterIccProfiles {
  @scala.inline
  def apply(): PrinterIccProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterIccProfiles]
  }
  @scala.inline
  implicit class PrinterIccProfilesOps[Self <: PrinterIccProfiles] (val x: Self) extends AnyVal {
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
    def `setProfile-name`(value: String): Self = this.set("profile-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProfile-name`: Self = this.set("profile-name", js.undefined)
    @scala.inline
    def `setProfile-url`(value: String): Self = this.set("profile-url", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProfile-url`: Self = this.set("profile-url", js.undefined)
  }
  
}

