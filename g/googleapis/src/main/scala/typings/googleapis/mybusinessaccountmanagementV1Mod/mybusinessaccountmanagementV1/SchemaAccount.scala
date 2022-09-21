package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccount extends StObject {
  
  /**
    * Required. The name of the account. For an account of type `PERSONAL`, this is the first and last name of the user account.
    */
  var accountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Account reference number if provisioned.
    */
  var accountNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The resource name, in the format `accounts/{account_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional info for an organization. This is populated only for an organization account.
    */
  var organizationInfo: js.UndefOr[SchemaOrganizationInfo] = js.undefined
  
  /**
    * Output only. Specifies the permission level the user has for this account.
    */
  var permissionLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Input only. The resource name of the account which will be the primary owner of the account being created. It should be of the form `accounts/{account_id\}/`.
    */
  var primaryOwner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Specifies the AccountRole of this account.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Contains the type of account. Accounts of type PERSONAL and ORGANIZATION cannot be created using this API.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If verified, future locations that are created are automatically connected to Google Maps, and have Google+ pages created, without requiring moderation.
    */
  var verificationState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the account is vetted by Google. A vetted account is able to verify locations via the VETTED_PARTNER method.
    */
  var vettedState: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccount {
  
  inline def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  extension [Self <: SchemaAccount](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberNull: Self = StObject.set(x, "accountNumber", null)
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrganizationInfo(value: SchemaOrganizationInfo): Self = StObject.set(x, "organizationInfo", value.asInstanceOf[js.Any])
    
    inline def setOrganizationInfoUndefined: Self = StObject.set(x, "organizationInfo", js.undefined)
    
    inline def setPermissionLevel(value: String): Self = StObject.set(x, "permissionLevel", value.asInstanceOf[js.Any])
    
    inline def setPermissionLevelNull: Self = StObject.set(x, "permissionLevel", null)
    
    inline def setPermissionLevelUndefined: Self = StObject.set(x, "permissionLevel", js.undefined)
    
    inline def setPrimaryOwner(value: String): Self = StObject.set(x, "primaryOwner", value.asInstanceOf[js.Any])
    
    inline def setPrimaryOwnerNull: Self = StObject.set(x, "primaryOwner", null)
    
    inline def setPrimaryOwnerUndefined: Self = StObject.set(x, "primaryOwner", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVerificationState(value: String): Self = StObject.set(x, "verificationState", value.asInstanceOf[js.Any])
    
    inline def setVerificationStateNull: Self = StObject.set(x, "verificationState", null)
    
    inline def setVerificationStateUndefined: Self = StObject.set(x, "verificationState", js.undefined)
    
    inline def setVettedState(value: String): Self = StObject.set(x, "vettedState", value.asInstanceOf[js.Any])
    
    inline def setVettedStateNull: Self = StObject.set(x, "vettedState", null)
    
    inline def setVettedStateUndefined: Self = StObject.set(x, "vettedState", js.undefined)
  }
}
