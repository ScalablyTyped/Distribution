package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesSetServiceAccountRequest extends StObject {
  
  /** Email address of the service account. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The list of scopes to be made available for this service account. */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}
object InstancesSetServiceAccountRequest {
  
  inline def apply(): InstancesSetServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetServiceAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesSetServiceAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
