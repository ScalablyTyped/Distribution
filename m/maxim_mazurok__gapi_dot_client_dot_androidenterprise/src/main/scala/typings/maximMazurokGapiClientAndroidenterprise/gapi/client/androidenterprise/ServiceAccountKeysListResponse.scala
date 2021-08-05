package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccountKeysListResponse extends StObject {
  
  /** The service account credentials. */
  var serviceAccountKey: js.UndefOr[js.Array[ServiceAccountKey]] = js.undefined
}
object ServiceAccountKeysListResponse {
  
  inline def apply(): ServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountKeysListResponse]
  }
  
  extension [Self <: ServiceAccountKeysListResponse](x: Self) {
    
    inline def setServiceAccountKey(value: js.Array[ServiceAccountKey]): Self = StObject.set(x, "serviceAccountKey", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountKeyUndefined: Self = StObject.set(x, "serviceAccountKey", js.undefined)
    
    inline def setServiceAccountKeyVarargs(value: ServiceAccountKey*): Self = StObject.set(x, "serviceAccountKey", js.Array(value :_*))
  }
}
