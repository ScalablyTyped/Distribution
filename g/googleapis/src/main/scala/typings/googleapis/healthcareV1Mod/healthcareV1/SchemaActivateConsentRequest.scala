package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivateConsentRequest extends StObject {
  
  /**
    * Required. The resource name of the Consent artifact that contains documentation of the user's consent, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consentArtifacts/{consent_artifact_id\}`. If the draft Consent had a Consent artifact, this Consent artifact overwrites it.
    */
  var consentArtifact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp in UTC of when this Consent is considered expired.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time to live for this Consent from when it is marked as active.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
}
object SchemaActivateConsentRequest {
  
  inline def apply(): SchemaActivateConsentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivateConsentRequest]
  }
  
  extension [Self <: SchemaActivateConsentRequest](x: Self) {
    
    inline def setConsentArtifact(value: String): Self = StObject.set(x, "consentArtifact", value.asInstanceOf[js.Any])
    
    inline def setConsentArtifactNull: Self = StObject.set(x, "consentArtifact", null)
    
    inline def setConsentArtifactUndefined: Self = StObject.set(x, "consentArtifact", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
