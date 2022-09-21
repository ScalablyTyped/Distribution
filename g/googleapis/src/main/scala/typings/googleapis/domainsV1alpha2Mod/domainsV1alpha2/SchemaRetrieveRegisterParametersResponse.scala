package typings.googleapis.domainsV1alpha2Mod.domainsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRetrieveRegisterParametersResponse extends StObject {
  
  /**
    * Parameters to use when calling the `RegisterDomain` method.
    */
  var registerParameters: js.UndefOr[SchemaRegisterParameters] = js.undefined
}
object SchemaRetrieveRegisterParametersResponse {
  
  inline def apply(): SchemaRetrieveRegisterParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetrieveRegisterParametersResponse]
  }
  
  extension [Self <: SchemaRetrieveRegisterParametersResponse](x: Self) {
    
    inline def setRegisterParameters(value: SchemaRegisterParameters): Self = StObject.set(x, "registerParameters", value.asInstanceOf[js.Any])
    
    inline def setRegisterParametersUndefined: Self = StObject.set(x, "registerParameters", js.undefined)
  }
}
