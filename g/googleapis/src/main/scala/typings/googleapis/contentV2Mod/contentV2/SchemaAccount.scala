package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccount extends StObject {
  
  /**
    * Indicates whether the merchant sells adult content.
    */
  var adultContent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of linked AdWords accounts that are active or pending approval. To create a new link request, add a new link with status `active` to the list. It will remain in a `pending` state until approved or rejected either in the AdWords interface or through the AdWords API. To delete an active link, or to cancel a link request, remove it from the list.
    */
  var adwordsLinks: js.UndefOr[js.Array[SchemaAccountAdwordsLink]] = js.undefined
  
  /**
    * The business information of the account.
    */
  var businessInformation: js.UndefOr[SchemaAccountBusinessInformation] = js.undefined
  
  /**
    * The GMB account which is linked or in the process of being linked with the Merchant Center account.
    */
  var googleMyBusinessLink: js.UndefOr[SchemaAccountGoogleMyBusinessLink] = js.undefined
  
  /**
    * Required for update. Merchant Center account ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#account`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Display name for the account.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [DEPRECATED] This field is never returned and will be ignored if provided.
    */
  var reviewsUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Client-specific, locally-unique, internal ID for the child account.
    */
  var sellerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Users with access to the account. Every account (except for subaccounts) must have at least one admin user.
    */
  var users: js.UndefOr[js.Array[SchemaAccountUser]] = js.undefined
  
  /**
    * The merchant's website.
    */
  var websiteUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of linked YouTube channels that are active or pending approval. To create a new link request, add a new link with status `active` to the list. It will remain in a `pending` state until approved or rejected in the YT Creator Studio interface. To delete an active link, or to cancel a link request, remove it from the list.
    */
  var youtubeChannelLinks: js.UndefOr[js.Array[SchemaAccountYouTubeChannelLink]] = js.undefined
}
object SchemaAccount {
  
  inline def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  extension [Self <: SchemaAccount](x: Self) {
    
    inline def setAdultContent(value: Boolean): Self = StObject.set(x, "adultContent", value.asInstanceOf[js.Any])
    
    inline def setAdultContentNull: Self = StObject.set(x, "adultContent", null)
    
    inline def setAdultContentUndefined: Self = StObject.set(x, "adultContent", js.undefined)
    
    inline def setAdwordsLinks(value: js.Array[SchemaAccountAdwordsLink]): Self = StObject.set(x, "adwordsLinks", value.asInstanceOf[js.Any])
    
    inline def setAdwordsLinksUndefined: Self = StObject.set(x, "adwordsLinks", js.undefined)
    
    inline def setAdwordsLinksVarargs(value: SchemaAccountAdwordsLink*): Self = StObject.set(x, "adwordsLinks", js.Array(value*))
    
    inline def setBusinessInformation(value: SchemaAccountBusinessInformation): Self = StObject.set(x, "businessInformation", value.asInstanceOf[js.Any])
    
    inline def setBusinessInformationUndefined: Self = StObject.set(x, "businessInformation", js.undefined)
    
    inline def setGoogleMyBusinessLink(value: SchemaAccountGoogleMyBusinessLink): Self = StObject.set(x, "googleMyBusinessLink", value.asInstanceOf[js.Any])
    
    inline def setGoogleMyBusinessLinkUndefined: Self = StObject.set(x, "googleMyBusinessLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReviewsUrl(value: String): Self = StObject.set(x, "reviewsUrl", value.asInstanceOf[js.Any])
    
    inline def setReviewsUrlNull: Self = StObject.set(x, "reviewsUrl", null)
    
    inline def setReviewsUrlUndefined: Self = StObject.set(x, "reviewsUrl", js.undefined)
    
    inline def setSellerId(value: String): Self = StObject.set(x, "sellerId", value.asInstanceOf[js.Any])
    
    inline def setSellerIdNull: Self = StObject.set(x, "sellerId", null)
    
    inline def setSellerIdUndefined: Self = StObject.set(x, "sellerId", js.undefined)
    
    inline def setUsers(value: js.Array[SchemaAccountUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: SchemaAccountUser*): Self = StObject.set(x, "users", js.Array(value*))
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlNull: Self = StObject.set(x, "websiteUrl", null)
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
    
    inline def setYoutubeChannelLinks(value: js.Array[SchemaAccountYouTubeChannelLink]): Self = StObject.set(x, "youtubeChannelLinks", value.asInstanceOf[js.Any])
    
    inline def setYoutubeChannelLinksUndefined: Self = StObject.set(x, "youtubeChannelLinks", js.undefined)
    
    inline def setYoutubeChannelLinksVarargs(value: SchemaAccountYouTubeChannelLink*): Self = StObject.set(x, "youtubeChannelLinks", js.Array(value*))
  }
}
