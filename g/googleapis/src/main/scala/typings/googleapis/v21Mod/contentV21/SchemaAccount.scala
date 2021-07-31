package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Account data. After the creation of a new account it may take a few minutes
  * before it is fully operational. The methods delete, insert, patch, and
  * update require the admin role.
  */
trait SchemaAccount extends StObject {
  
  /**
    * List of linked Ads accounts that are active or pending approval. To
    * create a new link request, add a new link with status active to the list.
    * It will remain in a pending state until approved or rejected either in
    * the Ads interface or through the AdWords API. To delete an active link,
    * or to cancel a link request, remove it from the list.
    */
  var adsLinks: js.UndefOr[js.Array[SchemaAccountAdsLink]] = js.undefined
  
  /**
    * Indicates whether the merchant sells adult content.
    */
  var adultContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The business information of the account.
    */
  var businessInformation: js.UndefOr[SchemaAccountBusinessInformation] = js.undefined
  
  /**
    * The GMB account which is linked or in the process of being linked with
    * the Merchant Center account.
    */
  var googleMyBusinessLink: js.UndefOr[SchemaAccountGoogleMyBusinessLink] = js.undefined
  
  /**
    * Merchant Center account ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#account&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Display name for the account.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Client-specific, locally-unique, internal ID for the child account.
    */
  var sellerId: js.UndefOr[String] = js.undefined
  
  /**
    * Users with access to the account. Every account (except for subaccounts)
    * must have at least one admin user.
    */
  var users: js.UndefOr[js.Array[SchemaAccountUser]] = js.undefined
  
  /**
    * The merchant&#39;s website.
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
  
  /**
    * List of linked YouTube channels that are active or pending approval. To
    * create a new link request, add a new link with status active to the list.
    * It will remain in a pending state until approved or rejected in the YT
    * Creator Studio interface. To delete an active link, or to cancel a link
    * request, remove it from the list.
    */
  var youtubeChannelLinks: js.UndefOr[js.Array[SchemaAccountYouTubeChannelLink]] = js.undefined
}
object SchemaAccount {
  
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  @scala.inline
  implicit class SchemaAccountMutableBuilder[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdsLinks(value: js.Array[SchemaAccountAdsLink]): Self = StObject.set(x, "adsLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsLinksUndefined: Self = StObject.set(x, "adsLinks", js.undefined)
    
    @scala.inline
    def setAdsLinksVarargs(value: SchemaAccountAdsLink*): Self = StObject.set(x, "adsLinks", js.Array(value :_*))
    
    @scala.inline
    def setAdultContent(value: Boolean): Self = StObject.set(x, "adultContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdultContentUndefined: Self = StObject.set(x, "adultContent", js.undefined)
    
    @scala.inline
    def setBusinessInformation(value: SchemaAccountBusinessInformation): Self = StObject.set(x, "businessInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessInformationUndefined: Self = StObject.set(x, "businessInformation", js.undefined)
    
    @scala.inline
    def setGoogleMyBusinessLink(value: SchemaAccountGoogleMyBusinessLink): Self = StObject.set(x, "googleMyBusinessLink", value.asInstanceOf[js.Any])
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSellerId(value: String): Self = StObject.set(x, "sellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerIdUndefined: Self = StObject.set(x, "sellerId", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[SchemaAccountUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: SchemaAccountUser*): Self = StObject.set(x, "users", js.Array(value :_*))
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
    
    @scala.inline
    def setYoutubeChannelLinks(value: js.Array[SchemaAccountYouTubeChannelLink]): Self = StObject.set(x, "youtubeChannelLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutubeChannelLinksUndefined: Self = StObject.set(x, "youtubeChannelLinks", js.undefined)
    
    @scala.inline
    def setYoutubeChannelLinksVarargs(value: SchemaAccountYouTubeChannelLink*): Self = StObject.set(x, "youtubeChannelLinks", js.Array(value :_*))
  }
}
