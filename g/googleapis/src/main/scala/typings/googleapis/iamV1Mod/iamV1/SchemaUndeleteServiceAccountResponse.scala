package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUndeleteServiceAccountResponse extends StObject {
  
  /**
    * Metadata for the restored service account.
    */
  var restoredAccount: js.UndefOr[SchemaServiceAccount] = js.undefined
}
object SchemaUndeleteServiceAccountResponse {
  
  inline def apply(): SchemaUndeleteServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteServiceAccountResponse]
  }
  
  extension [Self <: SchemaUndeleteServiceAccountResponse](x: Self) {
    
    inline def setRestoredAccount(value: SchemaServiceAccount): Self = StObject.set(x, "restoredAccount", value.asInstanceOf[js.Any])
    
    inline def setRestoredAccountUndefined: Self = StObject.set(x, "restoredAccount", js.undefined)
  }
}
