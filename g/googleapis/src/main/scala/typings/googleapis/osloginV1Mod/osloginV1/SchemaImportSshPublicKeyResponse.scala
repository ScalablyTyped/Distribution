package typings.googleapis.osloginV1Mod.osloginV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportSshPublicKeyResponse extends StObject {
  
  /**
    * Detailed information about import results.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The login profile information for the user.
    */
  var loginProfile: js.UndefOr[SchemaLoginProfile] = js.undefined
}
object SchemaImportSshPublicKeyResponse {
  
  inline def apply(): SchemaImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportSshPublicKeyResponse]
  }
  
  extension [Self <: SchemaImportSshPublicKeyResponse](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setLoginProfile(value: SchemaLoginProfile): Self = StObject.set(x, "loginProfile", value.asInstanceOf[js.Any])
    
    inline def setLoginProfileUndefined: Self = StObject.set(x, "loginProfile", js.undefined)
  }
}
