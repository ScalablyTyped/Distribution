package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * URL for the avatar picture of the User in dynamite
    */
  var avatarUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about whether the user is blocked by requester and/or has blocked requester.
    */
  var blockRelationship: js.UndefOr[SchemaAppsDynamiteSharedUserBlockRelationship] = js.undefined
  
  /**
    * Bot-specific profile information. Leave it empty for human users.
    */
  var botInfo: js.UndefOr[SchemaBotInfo] = js.undefined
  
  /**
    * Deleted flag, if true, means User has been soft-deleted/purged Deprecated. Use user_account_state field instead.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Email ID of the user
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * First or given name of the user
    */
  var firstName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Gender of the user
    */
  var gender: js.UndefOr[String | Null] = js.undefined
  
  /**
    * UserId
    */
  var id: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * Set to true if none of the depending services (Gaia, PeopleApi) returns any info for this user.
    */
  var isAnonymous: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Last or family name of the user
    */
  var lastName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Non-unique, user-defined display name of the User
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about whether the user is a consumer user, or the GSuite customer that they belong to.
    */
  var organizationInfo: js.UndefOr[SchemaAppsDynamiteSharedOrganizationInfo] = js.undefined
  
  /**
    * Phone number(s) of the user
    */
  var phoneNumber: js.UndefOr[js.Array[SchemaAppsDynamiteSharedPhoneNumber]] = js.undefined
  
  /**
    * State of user's Gaia Account
    */
  var userAccountState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Visibility of user's Profile
    */
  var userProfileVisibility: js.UndefOr[String | Null] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlNull: Self = StObject.set(x, "avatarUrl", null)
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setBlockRelationship(value: SchemaAppsDynamiteSharedUserBlockRelationship): Self = StObject.set(x, "blockRelationship", value.asInstanceOf[js.Any])
    
    inline def setBlockRelationshipUndefined: Self = StObject.set(x, "blockRelationship", js.undefined)
    
    inline def setBotInfo(value: SchemaBotInfo): Self = StObject.set(x, "botInfo", value.asInstanceOf[js.Any])
    
    inline def setBotInfoUndefined: Self = StObject.set(x, "botInfo", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameNull: Self = StObject.set(x, "firstName", null)
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderNull: Self = StObject.set(x, "gender", null)
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setId(value: SchemaUserId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsAnonymous(value: Boolean): Self = StObject.set(x, "isAnonymous", value.asInstanceOf[js.Any])
    
    inline def setIsAnonymousNull: Self = StObject.set(x, "isAnonymous", null)
    
    inline def setIsAnonymousUndefined: Self = StObject.set(x, "isAnonymous", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameNull: Self = StObject.set(x, "lastName", null)
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrganizationInfo(value: SchemaAppsDynamiteSharedOrganizationInfo): Self = StObject.set(x, "organizationInfo", value.asInstanceOf[js.Any])
    
    inline def setOrganizationInfoUndefined: Self = StObject.set(x, "organizationInfo", js.undefined)
    
    inline def setPhoneNumber(value: js.Array[SchemaAppsDynamiteSharedPhoneNumber]): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhoneNumberVarargs(value: SchemaAppsDynamiteSharedPhoneNumber*): Self = StObject.set(x, "phoneNumber", js.Array(value*))
    
    inline def setUserAccountState(value: String): Self = StObject.set(x, "userAccountState", value.asInstanceOf[js.Any])
    
    inline def setUserAccountStateNull: Self = StObject.set(x, "userAccountState", null)
    
    inline def setUserAccountStateUndefined: Self = StObject.set(x, "userAccountState", js.undefined)
    
    inline def setUserProfileVisibility(value: String): Self = StObject.set(x, "userProfileVisibility", value.asInstanceOf[js.Any])
    
    inline def setUserProfileVisibilityNull: Self = StObject.set(x, "userProfileVisibility", null)
    
    inline def setUserProfileVisibilityUndefined: Self = StObject.set(x, "userProfileVisibility", js.undefined)
  }
}
