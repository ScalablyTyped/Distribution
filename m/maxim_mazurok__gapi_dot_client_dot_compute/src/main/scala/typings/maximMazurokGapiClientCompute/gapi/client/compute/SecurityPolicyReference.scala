package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPolicyReference extends StObject {
  
  var securityPolicy: js.UndefOr[String] = js.undefined
}
object SecurityPolicyReference {
  
  inline def apply(): SecurityPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityPolicyReference] (val x: Self) extends AnyVal {
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
