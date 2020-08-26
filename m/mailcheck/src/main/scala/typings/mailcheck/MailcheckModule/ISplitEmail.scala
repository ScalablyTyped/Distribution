package typings.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISplitEmail extends js.Object {
  var address: js.UndefOr[String] = js.native
  var domain: js.UndefOr[String] = js.native
  var topLevelDomain: js.UndefOr[String] = js.native
}

object ISplitEmail {
  @scala.inline
  def apply(): ISplitEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitEmail]
  }
  @scala.inline
  implicit class ISplitEmailOps[Self <: ISplitEmail] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setTopLevelDomain(value: String): Self = this.set("topLevelDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLevelDomain: Self = this.set("topLevelDomain", js.undefined)
  }
  
}

