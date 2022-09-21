package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchDomainsResponse extends StObject {
  
  /**
    * Results of the domain name search.
    */
  var registerParameters: js.UndefOr[js.Array[SchemaRegisterParameters]] = js.undefined
}
object SchemaSearchDomainsResponse {
  
  inline def apply(): SchemaSearchDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchDomainsResponse]
  }
  
  extension [Self <: SchemaSearchDomainsResponse](x: Self) {
    
    inline def setRegisterParameters(value: js.Array[SchemaRegisterParameters]): Self = StObject.set(x, "registerParameters", value.asInstanceOf[js.Any])
    
    inline def setRegisterParametersUndefined: Self = StObject.set(x, "registerParameters", js.undefined)
    
    inline def setRegisterParametersVarargs(value: SchemaRegisterParameters*): Self = StObject.set(x, "registerParameters", js.Array(value*))
  }
}
