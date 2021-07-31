package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule for transforming a value.
  */
trait SchemaGooglePrivacyDlpV2PrimitiveTransformation extends StObject {
  
  var bucketingConfig: js.UndefOr[SchemaGooglePrivacyDlpV2BucketingConfig] = js.undefined
  
  var characterMaskConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CharacterMaskConfig] = js.undefined
  
  var cryptoDeterministicConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoDeterministicConfig] = js.undefined
  
  var cryptoHashConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoHashConfig] = js.undefined
  
  var cryptoReplaceFfxFpeConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] = js.undefined
  
  var dateShiftConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DateShiftConfig] = js.undefined
  
  var fixedSizeBucketingConfig: js.UndefOr[SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig] = js.undefined
  
  var redactConfig: js.UndefOr[SchemaGooglePrivacyDlpV2RedactConfig] = js.undefined
  
  var replaceConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceValueConfig] = js.undefined
  
  var replaceWithInfoTypeConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig] = js.undefined
  
  var timePartConfig: js.UndefOr[SchemaGooglePrivacyDlpV2TimePartConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2PrimitiveTransformation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrimitiveTransformation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PrimitiveTransformationMutableBuilder[Self <: SchemaGooglePrivacyDlpV2PrimitiveTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketingConfig(value: SchemaGooglePrivacyDlpV2BucketingConfig): Self = StObject.set(x, "bucketingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketingConfigUndefined: Self = StObject.set(x, "bucketingConfig", js.undefined)
    
    @scala.inline
    def setCharacterMaskConfig(value: SchemaGooglePrivacyDlpV2CharacterMaskConfig): Self = StObject.set(x, "characterMaskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterMaskConfigUndefined: Self = StObject.set(x, "characterMaskConfig", js.undefined)
    
    @scala.inline
    def setCryptoDeterministicConfig(value: SchemaGooglePrivacyDlpV2CryptoDeterministicConfig): Self = StObject.set(x, "cryptoDeterministicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoDeterministicConfigUndefined: Self = StObject.set(x, "cryptoDeterministicConfig", js.undefined)
    
    @scala.inline
    def setCryptoHashConfig(value: SchemaGooglePrivacyDlpV2CryptoHashConfig): Self = StObject.set(x, "cryptoHashConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoHashConfigUndefined: Self = StObject.set(x, "cryptoHashConfig", js.undefined)
    
    @scala.inline
    def setCryptoReplaceFfxFpeConfig(value: SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig): Self = StObject.set(x, "cryptoReplaceFfxFpeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoReplaceFfxFpeConfigUndefined: Self = StObject.set(x, "cryptoReplaceFfxFpeConfig", js.undefined)
    
    @scala.inline
    def setDateShiftConfig(value: SchemaGooglePrivacyDlpV2DateShiftConfig): Self = StObject.set(x, "dateShiftConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateShiftConfigUndefined: Self = StObject.set(x, "dateShiftConfig", js.undefined)
    
    @scala.inline
    def setFixedSizeBucketingConfig(value: SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig): Self = StObject.set(x, "fixedSizeBucketingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedSizeBucketingConfigUndefined: Self = StObject.set(x, "fixedSizeBucketingConfig", js.undefined)
    
    @scala.inline
    def setRedactConfig(value: SchemaGooglePrivacyDlpV2RedactConfig): Self = StObject.set(x, "redactConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactConfigUndefined: Self = StObject.set(x, "redactConfig", js.undefined)
    
    @scala.inline
    def setReplaceConfig(value: SchemaGooglePrivacyDlpV2ReplaceValueConfig): Self = StObject.set(x, "replaceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceConfigUndefined: Self = StObject.set(x, "replaceConfig", js.undefined)
    
    @scala.inline
    def setReplaceWithInfoTypeConfig(value: SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig): Self = StObject.set(x, "replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceWithInfoTypeConfigUndefined: Self = StObject.set(x, "replaceWithInfoTypeConfig", js.undefined)
    
    @scala.inline
    def setTimePartConfig(value: SchemaGooglePrivacyDlpV2TimePartConfig): Self = StObject.set(x, "timePartConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePartConfigUndefined: Self = StObject.set(x, "timePartConfig", js.undefined)
  }
}
