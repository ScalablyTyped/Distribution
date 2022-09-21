package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1SafetyNetConfig extends StObject {
  
  /**
    * Required. The relative resource name of the SafetyNet configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/safetyNetConfig ```
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the duration for which App Check tokens exchanged from SafetyNet tokens will be valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
    */
  var tokenTtl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1SafetyNetConfig {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1SafetyNetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1SafetyNetConfig]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1SafetyNetConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTokenTtl(value: String): Self = StObject.set(x, "tokenTtl", value.asInstanceOf[js.Any])
    
    inline def setTokenTtlNull: Self = StObject.set(x, "tokenTtl", null)
    
    inline def setTokenTtlUndefined: Self = StObject.set(x, "tokenTtl", js.undefined)
  }
}
