package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceAccountResponse extends StObject {
  
  /** The service account email address. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.undefined
}
object GetServiceAccountResponse {
  
  inline def apply(): GetServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
