package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMatterPermission extends StObject {
  
  /**
    * The account ID, as provided by the [Admin SDK](https://developers.google.com/admin-sdk/).
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's role for the matter.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaMatterPermission {
  
  inline def apply(): SchemaMatterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatterPermission]
  }
  
  extension [Self <: SchemaMatterPermission](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
