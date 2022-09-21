package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResult extends StObject {
  
  /**
    * The resource names of all evaluated Consents mapped to their evaluation.
    */
  var consentDetails: js.UndefOr[StringDictionary[SchemaConsentEvaluation] | Null] = js.undefined
  
  /**
    * Whether the resource is consented for the given use.
    */
  var consented: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The unique identifier of the evaluated resource.
    */
  var dataId: js.UndefOr[String | Null] = js.undefined
}
object SchemaResult {
  
  inline def apply(): SchemaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResult]
  }
  
  extension [Self <: SchemaResult](x: Self) {
    
    inline def setConsentDetails(value: StringDictionary[SchemaConsentEvaluation]): Self = StObject.set(x, "consentDetails", value.asInstanceOf[js.Any])
    
    inline def setConsentDetailsNull: Self = StObject.set(x, "consentDetails", null)
    
    inline def setConsentDetailsUndefined: Self = StObject.set(x, "consentDetails", js.undefined)
    
    inline def setConsented(value: Boolean): Self = StObject.set(x, "consented", value.asInstanceOf[js.Any])
    
    inline def setConsentedNull: Self = StObject.set(x, "consented", null)
    
    inline def setConsentedUndefined: Self = StObject.set(x, "consented", js.undefined)
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setDataIdNull: Self = StObject.set(x, "dataId", null)
    
    inline def setDataIdUndefined: Self = StObject.set(x, "dataId", js.undefined)
  }
}
