package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountGoogleMyBusinessLink extends js.Object {
  /**
    * The GMB email address of which a specific account within a GMB account. A
    * sample account within a GMB account could be a business account with set
    * of locations, managed under the GMB account.
    */
  var gmbEmail: js.UndefOr[String] = js.native
  /**
    * Status of the link between this Merchant Center account and the GMB
    * account.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaAccountGoogleMyBusinessLink {
  @scala.inline
  def apply(): SchemaAccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountGoogleMyBusinessLink]
  }
  @scala.inline
  implicit class SchemaAccountGoogleMyBusinessLinkOps[Self <: SchemaAccountGoogleMyBusinessLink] (val x: Self) extends AnyVal {
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
    def setGmbEmail(value: String): Self = this.set("gmbEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmbEmail: Self = this.set("gmbEmail", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

