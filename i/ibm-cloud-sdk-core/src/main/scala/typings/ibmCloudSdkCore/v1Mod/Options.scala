package typings.ibmCloudSdkCore.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var iamAccessToken: js.UndefOr[String] = js.native
  var iamApikey: js.UndefOr[String] = js.native
  var iamUrl: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setIamAccessToken(value: String): Self = this.set("iamAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamAccessToken: Self = this.set("iamAccessToken", js.undefined)
    @scala.inline
    def setIamApikey(value: String): Self = this.set("iamApikey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamApikey: Self = this.set("iamApikey", js.undefined)
    @scala.inline
    def setIamUrl(value: String): Self = this.set("iamUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamUrl: Self = this.set("iamUrl", js.undefined)
  }
  
}

