package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse extends StObject {
  
  /**
    * Service objects after the updates have been applied.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1betaService]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse](x: Self) {
    
    inline def setServices(value: js.Array[SchemaGoogleFirebaseAppcheckV1betaService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaGoogleFirebaseAppcheckV1betaService*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
