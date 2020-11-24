package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  /**
    * List of linked Ads accounts that are active or pending approval. To create a new link request, add a new link with status `active` to the list. It will remain in a `pending` state
    * until approved or rejected either in the Ads interface or through the AdWords API. To delete an active link, or to cancel a link request, remove it from the list.
    */
  var adsLinks: js.UndefOr[js.Array[AccountAdsLink]] = js.native
  
  /** Indicates whether the merchant sells adult content. */
  var adultContent: js.UndefOr[Boolean] = js.native
  
  /** The business information of the account. */
  var businessInformation: js.UndefOr[AccountBusinessInformation] = js.native
  
  /** ID of CSS the account belongs to. */
  var cssId: js.UndefOr[String] = js.native
  
  /** The GMB account which is linked or in the process of being linked with the Merchant Center account. */
  var googleMyBusinessLink: js.UndefOr[AccountGoogleMyBusinessLink] = js.native
  
  /** Required for update. Merchant Center account ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#account`" */
  var kind: js.UndefOr[String] = js.native
  
  /** List of label IDs that are assigned to the account by CSS. */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. Display name for the account. */
  var name: js.UndefOr[String] = js.native
  
  /** Client-specific, locally-unique, internal ID for the child account. */
  var sellerId: js.UndefOr[String] = js.native
  
  /** Users with access to the account. Every account (except for subaccounts) must have at least one admin user. */
  var users: js.UndefOr[js.Array[AccountUser]] = js.native
  
  /** The merchant's website. */
  var websiteUrl: js.UndefOr[String] = js.native
  
  /**
    * List of linked YouTube channels that are active or pending approval. To create a new link request, add a new link with status `active` to the list. It will remain in a `pending`
    * state until approved or rejected in the YT Creator Studio interface. To delete an active link, or to cancel a link request, remove it from the list.
    */
  var youtubeChannelLinks: js.UndefOr[js.Array[AccountYouTubeChannelLink]] = js.native
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def setAdsLinksVarargs(value: AccountAdsLink*): Self = this.set("adsLinks", js.Array(value :_*))
    
    @scala.inline
    def setAdsLinks(value: js.Array[AccountAdsLink]): Self = this.set("adsLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsLinks: Self = this.set("adsLinks", js.undefined)
    
    @scala.inline
    def setAdultContent(value: Boolean): Self = this.set("adultContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdultContent: Self = this.set("adultContent", js.undefined)
    
    @scala.inline
    def setBusinessInformation(value: AccountBusinessInformation): Self = this.set("businessInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessInformation: Self = this.set("businessInformation", js.undefined)
    
    @scala.inline
    def setCssId(value: String): Self = this.set("cssId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssId: Self = this.set("cssId", js.undefined)
    
    @scala.inline
    def setGoogleMyBusinessLink(value: AccountGoogleMyBusinessLink): Self = this.set("googleMyBusinessLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleMyBusinessLink: Self = this.set("googleMyBusinessLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSellerId(value: String): Self = this.set("sellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerId: Self = this.set("sellerId", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: AccountUser*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[AccountUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
    
    @scala.inline
    def setYoutubeChannelLinksVarargs(value: AccountYouTubeChannelLink*): Self = this.set("youtubeChannelLinks", js.Array(value :_*))
    
    @scala.inline
    def setYoutubeChannelLinks(value: js.Array[AccountYouTubeChannelLink]): Self = this.set("youtubeChannelLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoutubeChannelLinks: Self = this.set("youtubeChannelLinks", js.undefined)
  }
}
