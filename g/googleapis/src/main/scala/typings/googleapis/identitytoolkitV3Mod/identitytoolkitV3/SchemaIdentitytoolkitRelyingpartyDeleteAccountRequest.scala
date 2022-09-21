package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyDeleteAccountRequest extends StObject {
  
  /**
    * GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The GITKit token or STS id token of the authenticated user.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyDeleteAccountRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyDeleteAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyDeleteAccountRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyDeleteAccountRequest](x: Self) {
    
    inline def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setDelegatedProjectNumberNull: Self = StObject.set(x, "delegatedProjectNumber", null)
    
    inline def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
