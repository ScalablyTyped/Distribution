package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKey extends StObject {
  
  /** Output only. The time at which this CryptoKey was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Labels with user-defined metadata. For more information, see [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys). */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.CryptoKey & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The resource name for this CryptoKey in the format `projects/∗/locations/∗/keyRings/∗/cryptoKeys/ *`. */
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
  
  extension [Self <: CryptoKey](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.CryptoKey & TopLevel[js.Any]
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
