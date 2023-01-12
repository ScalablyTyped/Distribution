package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /** Output only. How the account is managed. Acceptable values are: - "`manual`" - "`automatic`" */
  var accountManagement: js.UndefOr[String] = js.undefined
  
  /**
    * Linked Ads accounts that are active or pending approval. To create a new link request, add a new link with status `active` to the list. It will remain in a `pending` state until
    * approved or rejected either in the Ads interface or through the AdWords API. To delete an active link, or to cancel a link request, remove it from the list.
    */
  var adsLinks: js.UndefOr[js.Array[AccountAdsLink]] = js.undefined
  
  /** Indicates whether the merchant sells adult content. */
  var adultContent: js.UndefOr[Boolean] = js.undefined
  
  /** The automatic improvements of the account can be used to automatically update items, improve images and shipping. Each section inside AutomaticImprovements is updated separately. */
  var automaticImprovements: js.UndefOr[AccountAutomaticImprovements] = js.undefined
  
  /** Automatically created label IDs that are assigned to the account by CSS Center. */
  var automaticLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The business information of the account. */
  var businessInformation: js.UndefOr[AccountBusinessInformation] = js.undefined
  
  /** ID of CSS the account belongs to. */
  var cssId: js.UndefOr[String] = js.undefined
  
  /** The Business Profile which is linked or in the process of being linked with the Merchant Center account. */
  var googleMyBusinessLink: js.UndefOr[AccountGoogleMyBusinessLink] = js.undefined
  
  /** Required for update. Merchant Center account ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#account`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Manually created label IDs that are assigned to the account by CSS. */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Display name for the account. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Client-specific, locally-unique, internal ID for the child account. */
  var sellerId: js.UndefOr[String] = js.undefined
  
  /** Users with access to the account. Every account (except for subaccounts) must have at least one admin user. */
  var users: js.UndefOr[js.Array[AccountUser]] = js.undefined
  
  /** The merchant's website. */
  var websiteUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Linked YouTube channels that are active or pending approval. To create a new link request, add a new link with status `active` to the list. It will remain in a `pending` state until
    * approved or rejected in the YT Creator Studio interface. To delete an active link, or to cancel a link request, remove it from the list.
    */
  var youtubeChannelLinks: js.UndefOr[js.Array[AccountYouTubeChannelLink]] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setAccountManagement(value: String): Self = StObject.set(x, "accountManagement", value.asInstanceOf[js.Any])
    
    inline def setAccountManagementUndefined: Self = StObject.set(x, "accountManagement", js.undefined)
    
    inline def setAdsLinks(value: js.Array[AccountAdsLink]): Self = StObject.set(x, "adsLinks", value.asInstanceOf[js.Any])
    
    inline def setAdsLinksUndefined: Self = StObject.set(x, "adsLinks", js.undefined)
    
    inline def setAdsLinksVarargs(value: AccountAdsLink*): Self = StObject.set(x, "adsLinks", js.Array(value*))
    
    inline def setAdultContent(value: Boolean): Self = StObject.set(x, "adultContent", value.asInstanceOf[js.Any])
    
    inline def setAdultContentUndefined: Self = StObject.set(x, "adultContent", js.undefined)
    
    inline def setAutomaticImprovements(value: AccountAutomaticImprovements): Self = StObject.set(x, "automaticImprovements", value.asInstanceOf[js.Any])
    
    inline def setAutomaticImprovementsUndefined: Self = StObject.set(x, "automaticImprovements", js.undefined)
    
    inline def setAutomaticLabelIds(value: js.Array[String]): Self = StObject.set(x, "automaticLabelIds", value.asInstanceOf[js.Any])
    
    inline def setAutomaticLabelIdsUndefined: Self = StObject.set(x, "automaticLabelIds", js.undefined)
    
    inline def setAutomaticLabelIdsVarargs(value: String*): Self = StObject.set(x, "automaticLabelIds", js.Array(value*))
    
    inline def setBusinessInformation(value: AccountBusinessInformation): Self = StObject.set(x, "businessInformation", value.asInstanceOf[js.Any])
    
    inline def setBusinessInformationUndefined: Self = StObject.set(x, "businessInformation", js.undefined)
    
    inline def setCssId(value: String): Self = StObject.set(x, "cssId", value.asInstanceOf[js.Any])
    
    inline def setCssIdUndefined: Self = StObject.set(x, "cssId", js.undefined)
    
    inline def setGoogleMyBusinessLink(value: AccountGoogleMyBusinessLink): Self = StObject.set(x, "googleMyBusinessLink", value.asInstanceOf[js.Any])
    
    inline def setGoogleMyBusinessLinkUndefined: Self = StObject.set(x, "googleMyBusinessLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSellerId(value: String): Self = StObject.set(x, "sellerId", value.asInstanceOf[js.Any])
    
    inline def setSellerIdUndefined: Self = StObject.set(x, "sellerId", js.undefined)
    
    inline def setUsers(value: js.Array[AccountUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: AccountUser*): Self = StObject.set(x, "users", js.Array(value*))
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
    
    inline def setYoutubeChannelLinks(value: js.Array[AccountYouTubeChannelLink]): Self = StObject.set(x, "youtubeChannelLinks", value.asInstanceOf[js.Any])
    
    inline def setYoutubeChannelLinksUndefined: Self = StObject.set(x, "youtubeChannelLinks", js.undefined)
    
    inline def setYoutubeChannelLinksVarargs(value: AccountYouTubeChannelLink*): Self = StObject.set(x, "youtubeChannelLinks", js.Array(value*))
  }
}
