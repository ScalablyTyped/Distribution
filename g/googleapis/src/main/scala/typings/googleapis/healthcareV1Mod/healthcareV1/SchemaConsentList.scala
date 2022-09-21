package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsentList extends StObject {
  
  /**
    * The resource names of the Consents to evaluate against, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`.
    */
  var consents: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaConsentList {
  
  inline def apply(): SchemaConsentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsentList]
  }
  
  extension [Self <: SchemaConsentList](x: Self) {
    
    inline def setConsents(value: js.Array[String]): Self = StObject.set(x, "consents", value.asInstanceOf[js.Any])
    
    inline def setConsentsNull: Self = StObject.set(x, "consents", null)
    
    inline def setConsentsUndefined: Self = StObject.set(x, "consents", js.undefined)
    
    inline def setConsentsVarargs(value: String*): Self = StObject.set(x, "consents", js.Array(value*))
  }
}
