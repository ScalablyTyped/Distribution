package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyVersion extends StObject {
  
  /** Output only. The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports. */
  var algorithm: js.UndefOr[String] = js.native
  
  /**
    * Output only. Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of
    * Google. Only provided for key versions with protection_level HSM.
    */
  var attestation: js.UndefOr[KeyOperationAttestation] = js.native
  
  /** Output only. The time at which this CryptoKeyVersion was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time this CryptoKeyVersion's key material was destroyed. Only present if state is DESTROYED. */
  var destroyEventTime: js.UndefOr[String] = js.native
  
  /** Output only. The time this CryptoKeyVersion's key material is scheduled for destruction. Only present if state is DESTROY_SCHEDULED. */
  var destroyTime: js.UndefOr[String] = js.native
  
  /** ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level. */
  var externalProtectionLevelOptions: js.UndefOr[ExternalProtectionLevelOptions] = js.native
  
  /** Output only. The time this CryptoKeyVersion's key material was generated. */
  var generateTime: js.UndefOr[String] = js.native
  
  /** Output only. The root cause of an import failure. Only present if state is IMPORT_FAILED. */
  var importFailureReason: js.UndefOr[String] = js.native
  
  /** Output only. The name of the ImportJob used to import this CryptoKeyVersion. Only present if the underlying key material was imported. */
  var importJob: js.UndefOr[String] = js.native
  
  /** Output only. The time at which this CryptoKeyVersion's key material was imported. */
  var importTime: js.UndefOr[String] = js.native
  
  /** Output only. The resource name for this CryptoKeyVersion in the format `projects/∗/locations/∗/keyRings/∗/cryptoKeys/∗/cryptoKeyVersions/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion. */
  var protectionLevel: js.UndefOr[String] = js.native
  
  /** The current state of the CryptoKeyVersion. */
  var state: js.UndefOr[String] = js.native
}
object CryptoKeyVersion {
  
  @scala.inline
  def apply(): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKeyVersion]
  }
  
  @scala.inline
  implicit class CryptoKeyVersionMutableBuilder[Self <: CryptoKeyVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setAttestation(value: KeyOperationAttestation): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDestroyEventTime(value: String): Self = StObject.set(x, "destroyEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyEventTimeUndefined: Self = StObject.set(x, "destroyEventTime", js.undefined)
    
    @scala.inline
    def setDestroyTime(value: String): Self = StObject.set(x, "destroyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyTimeUndefined: Self = StObject.set(x, "destroyTime", js.undefined)
    
    @scala.inline
    def setExternalProtectionLevelOptions(value: ExternalProtectionLevelOptions): Self = StObject.set(x, "externalProtectionLevelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalProtectionLevelOptionsUndefined: Self = StObject.set(x, "externalProtectionLevelOptions", js.undefined)
    
    @scala.inline
    def setGenerateTime(value: String): Self = StObject.set(x, "generateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateTimeUndefined: Self = StObject.set(x, "generateTime", js.undefined)
    
    @scala.inline
    def setImportFailureReason(value: String): Self = StObject.set(x, "importFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportFailureReasonUndefined: Self = StObject.set(x, "importFailureReason", js.undefined)
    
    @scala.inline
    def setImportJob(value: String): Self = StObject.set(x, "importJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportJobUndefined: Self = StObject.set(x, "importJob", js.undefined)
    
    @scala.inline
    def setImportTime(value: String): Self = StObject.set(x, "importTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTimeUndefined: Self = StObject.set(x, "importTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProtectionLevel(value: String): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLevelUndefined: Self = StObject.set(x, "protectionLevel", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
