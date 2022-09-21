package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaV3ConfigsResponse extends StObject {
  
  /**
    * RecaptchaV3Configs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1RecaptchaV3Config]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaV3ConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaV3ConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaV3ConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaV3ConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1RecaptchaV3Config]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1RecaptchaV3Config*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
