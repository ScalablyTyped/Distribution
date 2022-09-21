package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvitation extends StObject {
  
  /**
    * Required. The resource name for the invitation. `accounts/{account_id\}/invitations/{invitation_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The invited role on the account.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sparsely populated account this invitation is for.
    */
  var targetAccount: js.UndefOr[SchemaAccount] = js.undefined
  
  /**
    * The target location this invitation is for.
    */
  var targetLocation: js.UndefOr[SchemaTargetLocation] = js.undefined
  
  /**
    * Output only. Specifies which target types should appear in the response.
    */
  var targetType: js.UndefOr[String | Null] = js.undefined
}
object SchemaInvitation {
  
  inline def apply(): SchemaInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvitation]
  }
  
  extension [Self <: SchemaInvitation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTargetAccount(value: SchemaAccount): Self = StObject.set(x, "targetAccount", value.asInstanceOf[js.Any])
    
    inline def setTargetAccountUndefined: Self = StObject.set(x, "targetAccount", js.undefined)
    
    inline def setTargetLocation(value: SchemaTargetLocation): Self = StObject.set(x, "targetLocation", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationUndefined: Self = StObject.set(x, "targetLocation", js.undefined)
    
    inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeNull: Self = StObject.set(x, "targetType", null)
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
  }
}
