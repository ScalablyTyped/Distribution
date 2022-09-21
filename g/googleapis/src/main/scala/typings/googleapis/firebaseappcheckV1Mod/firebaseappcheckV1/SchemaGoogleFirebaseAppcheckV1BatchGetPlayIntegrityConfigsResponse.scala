package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse extends StObject {
  
  /**
    * PlayIntegrityConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1BatchGetPlayIntegrityConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
