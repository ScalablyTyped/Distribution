package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchVerificationOptionsRequest extends StObject {
  
  /**
    * Optional. Extra context information for the verification of service businesses. Can only be applied to the locations whose business type is CUSTOMER_LOCATION_ONLY. Specifying an accurate address could enable more options. INVALID_ARGUMENT will be thrown if it is set for other business types of locations.
    */
  var context: js.UndefOr[SchemaServiceBusinessContext] = js.undefined
  
  /**
    * Required. The BCP 47 language code representing the language that is to be used for the verification process. Available options vary by language.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaFetchVerificationOptionsRequest {
  
  inline def apply(): SchemaFetchVerificationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchVerificationOptionsRequest]
  }
  
  extension [Self <: SchemaFetchVerificationOptionsRequest](x: Self) {
    
    inline def setContext(value: SchemaServiceBusinessContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
