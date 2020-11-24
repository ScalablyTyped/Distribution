package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyVersion extends js.Object {
  
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
  implicit class CryptoKeyVersionOps[Self <: CryptoKeyVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setAttestation(value: KeyOperationAttestation): Self = this.set("attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDestroyEventTime(value: String): Self = this.set("destroyEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyEventTime: Self = this.set("destroyEventTime", js.undefined)
    
    @scala.inline
    def setDestroyTime(value: String): Self = this.set("destroyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyTime: Self = this.set("destroyTime", js.undefined)
    
    @scala.inline
    def setExternalProtectionLevelOptions(value: ExternalProtectionLevelOptions): Self = this.set("externalProtectionLevelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalProtectionLevelOptions: Self = this.set("externalProtectionLevelOptions", js.undefined)
    
    @scala.inline
    def setGenerateTime(value: String): Self = this.set("generateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateTime: Self = this.set("generateTime", js.undefined)
    
    @scala.inline
    def setImportFailureReason(value: String): Self = this.set("importFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportFailureReason: Self = this.set("importFailureReason", js.undefined)
    
    @scala.inline
    def setImportJob(value: String): Self = this.set("importJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportJob: Self = this.set("importJob", js.undefined)
    
    @scala.inline
    def setImportTime(value: String): Self = this.set("importTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportTime: Self = this.set("importTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProtectionLevel(value: String): Self = this.set("protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectionLevel: Self = this.set("protectionLevel", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
