package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaPlayIntegrityConfig extends StObject {
  
  /**
    * Required. The relative resource name of the Play Integrity configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/playIntegrityConfig ```
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the duration for which App Check tokens exchanged from Play Integrity tokens will be valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
    */
  var tokenTtl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaPlayIntegrityConfig {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaPlayIntegrityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaPlayIntegrityConfig]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaPlayIntegrityConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTokenTtl(value: String): Self = StObject.set(x, "tokenTtl", value.asInstanceOf[js.Any])
    
    inline def setTokenTtlNull: Self = StObject.set(x, "tokenTtl", null)
    
    inline def setTokenTtlUndefined: Self = StObject.set(x, "tokenTtl", js.undefined)
  }
}
