package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMTLSPolicy extends StObject {
  
  /**
    *  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
    */
  var clientValidationCa: js.UndefOr[js.Array[SchemaValidationCA]] = js.undefined
}
object SchemaMTLSPolicy {
  
  inline def apply(): SchemaMTLSPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMTLSPolicy]
  }
  
  extension [Self <: SchemaMTLSPolicy](x: Self) {
    
    inline def setClientValidationCa(value: js.Array[SchemaValidationCA]): Self = StObject.set(x, "clientValidationCa", value.asInstanceOf[js.Any])
    
    inline def setClientValidationCaUndefined: Self = StObject.set(x, "clientValidationCa", js.undefined)
    
    inline def setClientValidationCaVarargs(value: SchemaValidationCA*): Self = StObject.set(x, "clientValidationCa", js.Array(value*))
  }
}
