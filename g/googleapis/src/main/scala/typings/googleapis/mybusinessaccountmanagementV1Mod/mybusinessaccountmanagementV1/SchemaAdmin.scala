package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdmin extends StObject {
  
  /**
    * Immutable. The name of the Account resource that this Admin refers to. Used when calling locations.admins.create to invite a LocationGroup as an admin. If both this field and `admin` are set on `CREATE` requests, this field takes precedence and the email address in `admin` will be ignored. Format: `accounts/{account\}`.
    */
  var account: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The name of the admin. When making the initial invitation, this is the invitee's email address. On `GET` calls, the user's email address is returned if the invitation is still pending. Otherwise, it contains the user's first and last names. This field is only needed to be set during admin creation.
    */
  var admin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The resource name. For account admins, this is in the form: `accounts/{account_id\}/admins/{admin_id\}` For location admins, this is in the form: `locations/{location_id\}/admins/{admin_id\}` This field will be ignored if set during admin creation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether this admin has a pending invitation for the specified resource.
    */
  var pendingInvitation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Specifies the role that this admin uses with the specified Account or Location.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdmin {
  
  inline def apply(): SchemaAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdmin]
  }
  
  extension [Self <: SchemaAdmin](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAdmin(value: String): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminNull: Self = StObject.set(x, "admin", null)
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPendingInvitation(value: Boolean): Self = StObject.set(x, "pendingInvitation", value.asInstanceOf[js.Any])
    
    inline def setPendingInvitationNull: Self = StObject.set(x, "pendingInvitation", null)
    
    inline def setPendingInvitationUndefined: Self = StObject.set(x, "pendingInvitation", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
