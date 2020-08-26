package typings.hapiBell.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedProfile extends js.Object {
  var extendedProfile: js.UndefOr[Boolean] = js.native
  var getMethod: js.UndefOr[String] = js.native
}

object ExtendedProfile {
  @scala.inline
  def apply(): ExtendedProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedProfile]
  }
  @scala.inline
  implicit class ExtendedProfileOps[Self <: ExtendedProfile] (val x: Self) extends AnyVal {
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
    def setExtendedProfile(value: Boolean): Self = this.set("extendedProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedProfile: Self = this.set("extendedProfile", js.undefined)
    @scala.inline
    def setGetMethod(value: String): Self = this.set("getMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetMethod: Self = this.set("getMethod", js.undefined)
  }
  
}

