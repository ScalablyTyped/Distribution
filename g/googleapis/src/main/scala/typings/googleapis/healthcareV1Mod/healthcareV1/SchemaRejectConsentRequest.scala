package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRejectConsentRequest extends StObject {
  
  /**
    * Optional. The resource name of the Consent artifact that contains documentation of the user's rejection of the draft Consent, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consentArtifacts/{consent_artifact_id\}`. If the draft Consent had a Consent artifact, this Consent artifact overwrites it.
    */
  var consentArtifact: js.UndefOr[String | Null] = js.undefined
}
object SchemaRejectConsentRequest {
  
  inline def apply(): SchemaRejectConsentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRejectConsentRequest]
  }
  
  extension [Self <: SchemaRejectConsentRequest](x: Self) {
    
    inline def setConsentArtifact(value: String): Self = StObject.set(x, "consentArtifact", value.asInstanceOf[js.Any])
    
    inline def setConsentArtifactNull: Self = StObject.set(x, "consentArtifact", null)
    
    inline def setConsentArtifactUndefined: Self = StObject.set(x, "consentArtifact", js.undefined)
  }
}
