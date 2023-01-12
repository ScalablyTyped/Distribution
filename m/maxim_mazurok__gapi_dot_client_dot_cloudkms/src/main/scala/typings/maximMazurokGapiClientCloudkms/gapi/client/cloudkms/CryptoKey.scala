package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKey extends StObject {
  
  /** Output only. The time at which this CryptoKey was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. The resource name of the backend environment where the key material for all CryptoKeyVersions associated with this CryptoKey reside and where all related cryptographic
    * operations are performed. Only applicable if CryptoKeyVersions have a ProtectionLevel of EXTERNAL_VPC, with the resource name in the format
    * `projects/ *‍/locations/ *‍/ekmConnections/ *`. Note, this list is non-exhaustive and may apply to additional ProtectionLevels in the future.
    */
  var cryptoKeyBackend: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED. If not specified at creation time, the default
    * duration is 24 hours.
    */
  var destroyScheduledDuration: js.UndefOr[String] = js.undefined
  
  /** Immutable. Whether this key may contain imported versions only. */
  var importOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Labels with user-defined metadata. For more information, see [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys). */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. The resource name for this CryptoKey in the format `projects/ *‍/locations/ *‍/keyRings/ *‍/cryptoKeys/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually
    * via CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this
    * field must be omitted.
    */
  var nextRotationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A copy of the "primary" CryptoKeyVersion that will be used by Encrypt when this CryptoKey is given in EncryptRequest.name. The CryptoKey's primary version can be
    * updated via UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be omitted.
    */
  var primary: js.UndefOr[CryptoKeyVersion] = js.undefined
  
  /** Immutable. The immutable purpose of this CryptoKey. */
  var purpose: js.UndefOr[String] = js.undefined
  
  /**
    * next_rotation_time will be advanced by this period when the service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set,
    * next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
    */
  var rotationPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * A template describing settings for new CryptoKeyVersion instances. The properties of new CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are
    * controlled by this template.
    */
  var versionTemplate: js.UndefOr[CryptoKeyVersionTemplate] = js.undefined
}
object CryptoKey {
  
  inline def apply(): CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoKey] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCryptoKeyBackend(value: String): Self = StObject.set(x, "cryptoKeyBackend", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyBackendUndefined: Self = StObject.set(x, "cryptoKeyBackend", js.undefined)
    
    inline def setDestroyScheduledDuration(value: String): Self = StObject.set(x, "destroyScheduledDuration", value.asInstanceOf[js.Any])
    
    inline def setDestroyScheduledDurationUndefined: Self = StObject.set(x, "destroyScheduledDuration", js.undefined)
    
    inline def setImportOnly(value: Boolean): Self = StObject.set(x, "importOnly", value.asInstanceOf[js.Any])
    
    inline def setImportOnlyUndefined: Self = StObject.set(x, "importOnly", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextRotationTime(value: String): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    inline def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    inline def setPrimary(value: CryptoKeyVersion): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setRotationPeriod(value: String): Self = StObject.set(x, "rotationPeriod", value.asInstanceOf[js.Any])
    
    inline def setRotationPeriodUndefined: Self = StObject.set(x, "rotationPeriod", js.undefined)
    
    inline def setVersionTemplate(value: CryptoKeyVersionTemplate): Self = StObject.set(x, "versionTemplate", value.asInstanceOf[js.Any])
    
    inline def setVersionTemplateUndefined: Self = StObject.set(x, "versionTemplate", js.undefined)
  }
}
