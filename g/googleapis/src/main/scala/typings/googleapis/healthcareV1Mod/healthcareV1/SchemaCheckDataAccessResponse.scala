package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckDataAccessResponse extends StObject {
  
  /**
    * The resource names of all evaluated Consents mapped to their evaluation.
    */
  var consentDetails: js.UndefOr[StringDictionary[SchemaConsentEvaluation] | Null] = js.undefined
  
  /**
    * Whether the requested resource is consented for the given use.
    */
  var consented: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCheckDataAccessResponse {
  
  inline def apply(): SchemaCheckDataAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckDataAccessResponse]
  }
  
  extension [Self <: SchemaCheckDataAccessResponse](x: Self) {
    
    inline def setConsentDetails(value: StringDictionary[SchemaConsentEvaluation]): Self = StObject.set(x, "consentDetails", value.asInstanceOf[js.Any])
    
    inline def setConsentDetailsNull: Self = StObject.set(x, "consentDetails", null)
    
    inline def setConsentDetailsUndefined: Self = StObject.set(x, "consentDetails", js.undefined)
    
    inline def setConsented(value: Boolean): Self = StObject.set(x, "consented", value.asInstanceOf[js.Any])
    
    inline def setConsentedNull: Self = StObject.set(x, "consented", null)
    
    inline def setConsentedUndefined: Self = StObject.set(x, "consented", js.undefined)
  }
}
