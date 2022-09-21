package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesResponse extends StObject {
  
  /**
    * Service objects after the updates have been applied.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1Service]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesResponse](x: Self) {
    
    inline def setServices(value: js.Array[SchemaGoogleFirebaseAppcheckV1Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaGoogleFirebaseAppcheckV1Service*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
