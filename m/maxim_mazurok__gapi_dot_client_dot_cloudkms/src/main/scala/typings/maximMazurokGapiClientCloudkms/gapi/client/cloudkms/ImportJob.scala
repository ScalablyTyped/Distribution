package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportJob extends js.Object {
  
  /**
    * Output only. Statement that was generated and signed by the key creator (for example, an HSM) at key creation time. Use this statement to verify attributes of the key as stored on
    * the HSM, independently of Google. Only present if the chosen ImportMethod is one with a protection level of HSM.
    */
  var attestation: js.UndefOr[KeyOperationAttestation] = js.native
  
  /** Output only. The time at which this ImportJob was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time this ImportJob expired. Only present if state is EXPIRED. */
  var expireEventTime: js.UndefOr[String] = js.native
  
  /** Output only. The time at which this ImportJob is scheduled for expiration and can no longer be used to import key material. */
  var expireTime: js.UndefOr[String] = js.native
  
  /** Output only. The time this ImportJob's key material was generated. */
  var generateTime: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The wrapping method to be used for incoming key material. */
  var importMethod: js.UndefOr[String] = js.native
  
  /** Output only. The resource name for this ImportJob in the format `projects/∗/locations/∗/keyRings/∗/importJobs/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into. */
  var protectionLevel: js.UndefOr[String] = js.native
  
  /** Output only. The public key with which to wrap key material prior to import. Only returned if state is ACTIVE. */
  var publicKey: js.UndefOr[WrappingPublicKey] = js.native
  
  /** Output only. The current state of the ImportJob, indicating if it can be used. */
  var state: js.UndefOr[String] = js.native
}
object ImportJob {
  
  @scala.inline
  def apply(): ImportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJob]
  }
  
  @scala.inline
  implicit class ImportJobOps[Self <: ImportJob] (val x: Self) extends AnyVal {
    
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
    def setAttestation(value: KeyOperationAttestation): Self = this.set("attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setExpireEventTime(value: String): Self = this.set("expireEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireEventTime: Self = this.set("expireEventTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setGenerateTime(value: String): Self = this.set("generateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateTime: Self = this.set("generateTime", js.undefined)
    
    @scala.inline
    def setImportMethod(value: String): Self = this.set("importMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportMethod: Self = this.set("importMethod", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProtectionLevel(value: String): Self = this.set("protectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectionLevel: Self = this.set("protectionLevel", js.undefined)
    
    @scala.inline
    def setPublicKey(value: WrappingPublicKey): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
