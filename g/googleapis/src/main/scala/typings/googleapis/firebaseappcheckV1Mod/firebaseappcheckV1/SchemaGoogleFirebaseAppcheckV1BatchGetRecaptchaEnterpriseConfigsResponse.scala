package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaEnterpriseConfigsResponse extends StObject {
  
  /**
    * RecaptchaEnterpriseConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaEnterpriseConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaEnterpriseConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaEnterpriseConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1BatchGetRecaptchaEnterpriseConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
