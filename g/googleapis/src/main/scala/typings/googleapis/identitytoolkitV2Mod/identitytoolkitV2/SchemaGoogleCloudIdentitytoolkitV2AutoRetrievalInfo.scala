package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2AutoRetrievalInfo extends StObject {
  
  /**
    * The Android app's signature hash for Google Play Service's SMS Retriever API.
    */
  var appSignatureHash: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2AutoRetrievalInfo {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2AutoRetrievalInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2AutoRetrievalInfo]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2AutoRetrievalInfo](x: Self) {
    
    inline def setAppSignatureHash(value: String): Self = StObject.set(x, "appSignatureHash", value.asInstanceOf[js.Any])
    
    inline def setAppSignatureHashNull: Self = StObject.set(x, "appSignatureHash", null)
    
    inline def setAppSignatureHashUndefined: Self = StObject.set(x, "appSignatureHash", js.undefined)
  }
}
