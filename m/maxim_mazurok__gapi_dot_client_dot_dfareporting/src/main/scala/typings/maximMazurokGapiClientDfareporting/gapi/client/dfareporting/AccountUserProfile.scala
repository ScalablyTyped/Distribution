package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountUserProfile extends StObject {
  
  /** Account ID of the user profile. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Whether this user profile is active. This defaults to false, and must be set true on insert for the user profile to be usable. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Filter that describes which advertisers are visible to the user profile. */
  var advertiserFilter: js.UndefOr[ObjectFilter] = js.undefined
  
  /** Filter that describes which campaigns are visible to the user profile. */
  var campaignFilter: js.UndefOr[ObjectFilter] = js.undefined
  
  /** Comments for this user profile. */
  var comments: js.UndefOr[String] = js.undefined
  
  /** Email of the user profile. The email addresss must be linked to a Google Account. This field is required on insertion and is read-only after insertion. */
  var email: js.UndefOr[String] = js.undefined
  
  /** ID of the user profile. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountUserProfile". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Locale of the user profile. This is a required field. Acceptable values are: - "cs" (Czech) - "de" (German) - "en" (English) - "en-GB" (English United Kingdom) - "es" (Spanish) -
    * "fr" (French) - "it" (Italian) - "ja" (Japanese) - "ko" (Korean) - "pl" (Polish) - "pt-BR" (Portuguese Brazil) - "ru" (Russian) - "sv" (Swedish) - "tr" (Turkish) - "zh-CN" (Chinese
    * Simplified) - "zh-TW" (Chinese Traditional)
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the user profile. This is a required field. Must be less than 64 characters long, must be globally unique, and cannot contain whitespace or any of the following characters:
    * "&;<>"#%,".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Filter that describes which sites are visible to the user profile. */
  var siteFilter: js.UndefOr[ObjectFilter] = js.undefined
  
  /** Subaccount ID of the user profile. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /** Trafficker type of this user profile. This is a read-only field. */
  var traffickerType: js.UndefOr[String] = js.undefined
  
  /** User type of the user profile. This is a read-only field that can be left blank. */
  var userAccessType: js.UndefOr[String] = js.undefined
  
  /** Filter that describes which user roles are visible to the user profile. */
  var userRoleFilter: js.UndefOr[ObjectFilter] = js.undefined
  
  /** User role ID of the user profile. This is a required field. */
  var userRoleId: js.UndefOr[String] = js.undefined
}
object AccountUserProfile {
  
  inline def apply(): AccountUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUserProfile]
  }
  
  extension [Self <: AccountUserProfile](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdvertiserFilter(value: ObjectFilter): Self = StObject.set(x, "advertiserFilter", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserFilterUndefined: Self = StObject.set(x, "advertiserFilter", js.undefined)
    
    inline def setCampaignFilter(value: ObjectFilter): Self = StObject.set(x, "campaignFilter", value.asInstanceOf[js.Any])
    
    inline def setCampaignFilterUndefined: Self = StObject.set(x, "campaignFilter", js.undefined)
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSiteFilter(value: ObjectFilter): Self = StObject.set(x, "siteFilter", value.asInstanceOf[js.Any])
    
    inline def setSiteFilterUndefined: Self = StObject.set(x, "siteFilter", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTraffickerType(value: String): Self = StObject.set(x, "traffickerType", value.asInstanceOf[js.Any])
    
    inline def setTraffickerTypeUndefined: Self = StObject.set(x, "traffickerType", js.undefined)
    
    inline def setUserAccessType(value: String): Self = StObject.set(x, "userAccessType", value.asInstanceOf[js.Any])
    
    inline def setUserAccessTypeUndefined: Self = StObject.set(x, "userAccessType", js.undefined)
    
    inline def setUserRoleFilter(value: ObjectFilter): Self = StObject.set(x, "userRoleFilter", value.asInstanceOf[js.Any])
    
    inline def setUserRoleFilterUndefined: Self = StObject.set(x, "userRoleFilter", js.undefined)
    
    inline def setUserRoleId(value: String): Self = StObject.set(x, "userRoleId", value.asInstanceOf[js.Any])
    
    inline def setUserRoleIdUndefined: Self = StObject.set(x, "userRoleId", js.undefined)
  }
}
