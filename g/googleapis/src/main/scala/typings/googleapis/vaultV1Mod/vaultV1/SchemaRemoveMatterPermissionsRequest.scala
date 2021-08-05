package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remove an account as a matter collaborator.
  */
trait SchemaRemoveMatterPermissionsRequest extends StObject {
  
  /**
    * The account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
}
object SchemaRemoveMatterPermissionsRequest {
  
  inline def apply(): SchemaRemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveMatterPermissionsRequest]
  }
  
  extension [Self <: SchemaRemoveMatterPermissionsRequest](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
