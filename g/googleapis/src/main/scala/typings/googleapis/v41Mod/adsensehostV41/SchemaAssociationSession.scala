package typings.googleapis.v41Mod.adsensehostV41

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAssociationSession extends js.Object {
  /**
    * Hosted account id of the associated publisher after association. Present
    * if status is ACCEPTED.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Unique identifier of this association session.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsensehost#associationSession.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The products to associate with the user. Options: AFC, AFG, AFV, AFS
    * (deprecated), AFMC (deprecated)
    */
  var productCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Redirect URL of this association session. Used to redirect users into the
    * AdSense association flow.
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * Status of the completed association, available once the association
    * callback token has been verified. One of ACCEPTED, REJECTED, or ERROR.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The preferred locale of the user themselves when going through the
    * AdSense association flow.
    */
  var userLocale: js.UndefOr[String] = js.native
  /**
    * The locale of the user&#39;s hosted website.
    */
  var websiteLocale: js.UndefOr[String] = js.native
  /**
    * The URL of the user&#39;s hosted website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

object SchemaAssociationSession {
  @scala.inline
  def apply(): SchemaAssociationSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssociationSession]
  }
  @scala.inline
  implicit class SchemaAssociationSessionOps[Self <: SchemaAssociationSession] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProductCodesVarargs(value: String*): Self = this.set("productCodes", js.Array(value :_*))
    @scala.inline
    def setProductCodes(value: js.Array[String]): Self = this.set("productCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCodes: Self = this.set("productCodes", js.undefined)
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUserLocale(value: String): Self = this.set("userLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLocale: Self = this.set("userLocale", js.undefined)
    @scala.inline
    def setWebsiteLocale(value: String): Self = this.set("websiteLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteLocale: Self = this.set("websiteLocale", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}

