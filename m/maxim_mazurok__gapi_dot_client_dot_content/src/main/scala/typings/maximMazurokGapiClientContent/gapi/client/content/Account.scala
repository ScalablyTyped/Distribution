package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
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
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdsLinks(value: js.Array[AccountAdsLink]): Self = StObject.set(x, "adsLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsLinksUndefined: Self = StObject.set(x, "adsLinks", js.undefined)
    
    @scala.inline
    def setAdsLinksVarargs(value: AccountAdsLink*): Self = StObject.set(x, "adsLinks", js.Array(value :_*))
    
    @scala.inline
    def setAdultContent(value: Boolean): Self = StObject.set(x, "adultContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdultContentUndefined: Self = StObject.set(x, "adultContent", js.undefined)
    
    @scala.inline
    def setBusinessInformation(value: AccountBusinessInformation): Self = StObject.set(x, "businessInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessInformationUndefined: Self = StObject.set(x, "businessInformation", js.undefined)
    
    @scala.inline
    def setCssId(value: String): Self = StObject.set(x, "cssId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssIdUndefined: Self = StObject.set(x, "cssId", js.undefined)
    
    @scala.inline
    def setGoogleMyBusinessLink(value: AccountGoogleMyBusinessLink): Self = StObject.set(x, "googleMyBusinessLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleMyBusinessLinkUndefined: Self = StObject.set(x, "googleMyBusinessLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSellerId(value: String): Self = StObject.set(x, "sellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerIdUndefined: Self = StObject.set(x, "sellerId", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[AccountUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: AccountUser*): Self = StObject.set(x, "users", js.Array(value :_*))
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
    
    @scala.inline
    def setYoutubeChannelLinks(value: js.Array[AccountYouTubeChannelLink]): Self = StObject.set(x, "youtubeChannelLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutubeChannelLinksUndefined: Self = StObject.set(x, "youtubeChannelLinks", js.undefined)
    
    @scala.inline
    def setYoutubeChannelLinksVarargs(value: AccountYouTubeChannelLink*): Self = StObject.set(x, "youtubeChannelLinks", js.Array(value :_*))
  }
}
