package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKey extends StObject {
  
  /** Output only. The time at which this CryptoKey was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Labels with user-defined metadata. For more information, see [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys). */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.CryptoKey with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The resource name for this CryptoKey in the format `projects/∗/locations/∗/keyRings/∗/cryptoKeys/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually
    * via CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this
    * field must be omitted.
    */
  var nextRotationTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. A copy of the "primary" CryptoKeyVersion that will be used by Encrypt when this CryptoKey is given in EncryptRequest.name. The CryptoKey's primary version can be
    * updated via UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be omitted.
    */
  var primary: js.UndefOr[CryptoKeyVersion] = js.native
  
  /** Immutable. The immutable purpose of this CryptoKey. */
  var purpose: js.UndefOr[String] = js.native
  
  /**
    * next_rotation_time will be advanced by this period when the service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set,
    * next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
    */
  var rotationPeriod: js.UndefOr[String] = js.native
  
  /**
    * A template describing settings for new CryptoKeyVersion instances. The properties of new CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are
    * controlled by this template.
    */
  var versionTemplate: js.UndefOr[CryptoKeyVersionTemplate] = js.native
}
object CryptoKey {
  
  @scala.inline
  def apply(): CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKey]
  }
  
  @scala.inline
  implicit class CryptoKeyMutableBuilder[Self <: CryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.CryptoKey with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNextRotationTime(value: String): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    @scala.inline
    def setPrimary(value: CryptoKeyVersion): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setRotationPeriod(value: String): Self = StObject.set(x, "rotationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationPeriodUndefined: Self = StObject.set(x, "rotationPeriod", js.undefined)
    
    @scala.inline
    def setVersionTemplate(value: CryptoKeyVersionTemplate): Self = StObject.set(x, "versionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTemplateUndefined: Self = StObject.set(x, "versionTemplate", js.undefined)
  }
}
