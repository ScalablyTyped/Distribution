package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsentArtifact extends StObject {
  
  /**
    * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
    */
  var consentContentScreenshots: js.UndefOr[js.Array[SchemaImage]] = js.undefined
  
  /**
    * Optional. An string indicating the version of the consent information shown to the user.
    */
  var consentContentVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A signature from a guardian.
    */
  var guardianSignature: js.UndefOr[SchemaSignature] = js.undefined
  
  /**
    * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Resource name of the Consent artifact, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consentArtifacts/{consent_artifact_id\}`. Cannot be changed after creation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. User's UUID provided by the client.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User's signature.
    */
  var userSignature: js.UndefOr[SchemaSignature] = js.undefined
  
  /**
    * Optional. A signature from a witness.
    */
  var witnessSignature: js.UndefOr[SchemaSignature] = js.undefined
}
object SchemaConsentArtifact {
  
  inline def apply(): SchemaConsentArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsentArtifact]
  }
  
  extension [Self <: SchemaConsentArtifact](x: Self) {
    
    inline def setConsentContentScreenshots(value: js.Array[SchemaImage]): Self = StObject.set(x, "consentContentScreenshots", value.asInstanceOf[js.Any])
    
    inline def setConsentContentScreenshotsUndefined: Self = StObject.set(x, "consentContentScreenshots", js.undefined)
    
    inline def setConsentContentScreenshotsVarargs(value: SchemaImage*): Self = StObject.set(x, "consentContentScreenshots", js.Array(value*))
    
    inline def setConsentContentVersion(value: String): Self = StObject.set(x, "consentContentVersion", value.asInstanceOf[js.Any])
    
    inline def setConsentContentVersionNull: Self = StObject.set(x, "consentContentVersion", null)
    
    inline def setConsentContentVersionUndefined: Self = StObject.set(x, "consentContentVersion", js.undefined)
    
    inline def setGuardianSignature(value: SchemaSignature): Self = StObject.set(x, "guardianSignature", value.asInstanceOf[js.Any])
    
    inline def setGuardianSignatureUndefined: Self = StObject.set(x, "guardianSignature", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserSignature(value: SchemaSignature): Self = StObject.set(x, "userSignature", value.asInstanceOf[js.Any])
    
    inline def setUserSignatureUndefined: Self = StObject.set(x, "userSignature", js.undefined)
    
    inline def setWitnessSignature(value: SchemaSignature): Self = StObject.set(x, "witnessSignature", value.asInstanceOf[js.Any])
    
    inline def setWitnessSignatureUndefined: Self = StObject.set(x, "witnessSignature", js.undefined)
  }
}
