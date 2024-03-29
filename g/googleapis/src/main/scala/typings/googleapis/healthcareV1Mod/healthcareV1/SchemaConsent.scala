package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsent extends StObject {
  
  /**
    * Required. The resource name of the Consent artifact that contains proof of the end user's consent, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consentArtifacts/{consent_artifact_id\}`.
    */
  var consentArtifact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp in UTC of when this Consent is considered expired.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Resource name of the Consent, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. Cannot be changed after creation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Represents a user's consent in terms of the resources that can be accessed and under what conditions.
    */
  var policies: js.UndefOr[js.Array[SchemaGoogleCloudHealthcareV1ConsentPolicy]] = js.undefined
  
  /**
    * Output only. The timestamp that the revision was created.
    */
  var revisionCreateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id\}` to the Consent's resource name.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Indicates the current state of this Consent.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. The time to live for this Consent from when it is created.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. User's UUID provided by the client.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaConsent {
  
  inline def apply(): SchemaConsent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsent]
  }
  
  extension [Self <: SchemaConsent](x: Self) {
    
    inline def setConsentArtifact(value: String): Self = StObject.set(x, "consentArtifact", value.asInstanceOf[js.Any])
    
    inline def setConsentArtifactNull: Self = StObject.set(x, "consentArtifact", null)
    
    inline def setConsentArtifactUndefined: Self = StObject.set(x, "consentArtifact", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicies(value: js.Array[SchemaGoogleCloudHealthcareV1ConsentPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaGoogleCloudHealthcareV1ConsentPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
    
    inline def setRevisionCreateTime(value: String): Self = StObject.set(x, "revisionCreateTime", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreateTimeNull: Self = StObject.set(x, "revisionCreateTime", null)
    
    inline def setRevisionCreateTimeUndefined: Self = StObject.set(x, "revisionCreateTime", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
