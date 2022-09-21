package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2PrimitiveTransformation extends StObject {
  
  /**
    * Bucketing
    */
  var bucketingConfig: js.UndefOr[SchemaGooglePrivacyDlpV2BucketingConfig] = js.undefined
  
  /**
    * Mask
    */
  var characterMaskConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CharacterMaskConfig] = js.undefined
  
  /**
    * Deterministic Crypto
    */
  var cryptoDeterministicConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoDeterministicConfig] = js.undefined
  
  /**
    * Crypto
    */
  var cryptoHashConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoHashConfig] = js.undefined
  
  /**
    * Ffx-Fpe
    */
  var cryptoReplaceFfxFpeConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] = js.undefined
  
  /**
    * Date Shift
    */
  var dateShiftConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DateShiftConfig] = js.undefined
  
  /**
    * Fixed size bucketing
    */
  var fixedSizeBucketingConfig: js.UndefOr[SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig] = js.undefined
  
  /**
    * Redact
    */
  var redactConfig: js.UndefOr[SchemaGooglePrivacyDlpV2RedactConfig] = js.undefined
  
  /**
    * Replace with a specified value.
    */
  var replaceConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceValueConfig] = js.undefined
  
  /**
    * Replace with a value randomly drawn (with replacement) from a dictionary.
    */
  var replaceDictionaryConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceDictionaryConfig] = js.undefined
  
  /**
    * Replace with infotype
    */
  var replaceWithInfoTypeConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig] = js.undefined
  
  /**
    * Time extraction
    */
  var timePartConfig: js.UndefOr[SchemaGooglePrivacyDlpV2TimePartConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2PrimitiveTransformation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrimitiveTransformation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2PrimitiveTransformation](x: Self) {
    
    inline def setBucketingConfig(value: SchemaGooglePrivacyDlpV2BucketingConfig): Self = StObject.set(x, "bucketingConfig", value.asInstanceOf[js.Any])
    
    inline def setBucketingConfigUndefined: Self = StObject.set(x, "bucketingConfig", js.undefined)
    
    inline def setCharacterMaskConfig(value: SchemaGooglePrivacyDlpV2CharacterMaskConfig): Self = StObject.set(x, "characterMaskConfig", value.asInstanceOf[js.Any])
    
    inline def setCharacterMaskConfigUndefined: Self = StObject.set(x, "characterMaskConfig", js.undefined)
    
    inline def setCryptoDeterministicConfig(value: SchemaGooglePrivacyDlpV2CryptoDeterministicConfig): Self = StObject.set(x, "cryptoDeterministicConfig", value.asInstanceOf[js.Any])
    
    inline def setCryptoDeterministicConfigUndefined: Self = StObject.set(x, "cryptoDeterministicConfig", js.undefined)
    
    inline def setCryptoHashConfig(value: SchemaGooglePrivacyDlpV2CryptoHashConfig): Self = StObject.set(x, "cryptoHashConfig", value.asInstanceOf[js.Any])
    
    inline def setCryptoHashConfigUndefined: Self = StObject.set(x, "cryptoHashConfig", js.undefined)
    
    inline def setCryptoReplaceFfxFpeConfig(value: SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig): Self = StObject.set(x, "cryptoReplaceFfxFpeConfig", value.asInstanceOf[js.Any])
    
    inline def setCryptoReplaceFfxFpeConfigUndefined: Self = StObject.set(x, "cryptoReplaceFfxFpeConfig", js.undefined)
    
    inline def setDateShiftConfig(value: SchemaGooglePrivacyDlpV2DateShiftConfig): Self = StObject.set(x, "dateShiftConfig", value.asInstanceOf[js.Any])
    
    inline def setDateShiftConfigUndefined: Self = StObject.set(x, "dateShiftConfig", js.undefined)
    
    inline def setFixedSizeBucketingConfig(value: SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig): Self = StObject.set(x, "fixedSizeBucketingConfig", value.asInstanceOf[js.Any])
    
    inline def setFixedSizeBucketingConfigUndefined: Self = StObject.set(x, "fixedSizeBucketingConfig", js.undefined)
    
    inline def setRedactConfig(value: SchemaGooglePrivacyDlpV2RedactConfig): Self = StObject.set(x, "redactConfig", value.asInstanceOf[js.Any])
    
    inline def setRedactConfigUndefined: Self = StObject.set(x, "redactConfig", js.undefined)
    
    inline def setReplaceConfig(value: SchemaGooglePrivacyDlpV2ReplaceValueConfig): Self = StObject.set(x, "replaceConfig", value.asInstanceOf[js.Any])
    
    inline def setReplaceConfigUndefined: Self = StObject.set(x, "replaceConfig", js.undefined)
    
    inline def setReplaceDictionaryConfig(value: SchemaGooglePrivacyDlpV2ReplaceDictionaryConfig): Self = StObject.set(x, "replaceDictionaryConfig", value.asInstanceOf[js.Any])
    
    inline def setReplaceDictionaryConfigUndefined: Self = StObject.set(x, "replaceDictionaryConfig", js.undefined)
    
    inline def setReplaceWithInfoTypeConfig(value: SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig): Self = StObject.set(x, "replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    inline def setReplaceWithInfoTypeConfigUndefined: Self = StObject.set(x, "replaceWithInfoTypeConfig", js.undefined)
    
    inline def setTimePartConfig(value: SchemaGooglePrivacyDlpV2TimePartConfig): Self = StObject.set(x, "timePartConfig", value.asInstanceOf[js.Any])
    
    inline def setTimePartConfigUndefined: Self = StObject.set(x, "timePartConfig", js.undefined)
  }
}
