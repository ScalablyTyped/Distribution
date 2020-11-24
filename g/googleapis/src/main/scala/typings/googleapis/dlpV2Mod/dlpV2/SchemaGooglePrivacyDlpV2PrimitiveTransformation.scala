package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule for transforming a value.
  */
@js.native
trait SchemaGooglePrivacyDlpV2PrimitiveTransformation extends js.Object {
  
  var bucketingConfig: js.UndefOr[SchemaGooglePrivacyDlpV2BucketingConfig] = js.native
  
  var characterMaskConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CharacterMaskConfig] = js.native
  
  var cryptoDeterministicConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoDeterministicConfig] = js.native
  
  var cryptoHashConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoHashConfig] = js.native
  
  var cryptoReplaceFfxFpeConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] = js.native
  
  var dateShiftConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DateShiftConfig] = js.native
  
  var fixedSizeBucketingConfig: js.UndefOr[SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig] = js.native
  
  var redactConfig: js.UndefOr[SchemaGooglePrivacyDlpV2RedactConfig] = js.native
  
  var replaceConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceValueConfig] = js.native
  
  var replaceWithInfoTypeConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig] = js.native
  
  var timePartConfig: js.UndefOr[SchemaGooglePrivacyDlpV2TimePartConfig] = js.native
}
object SchemaGooglePrivacyDlpV2PrimitiveTransformation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrimitiveTransformation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PrimitiveTransformationOps[Self <: SchemaGooglePrivacyDlpV2PrimitiveTransformation] (val x: Self) extends AnyVal {
    
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
    def setBucketingConfig(value: SchemaGooglePrivacyDlpV2BucketingConfig): Self = this.set("bucketingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketingConfig: Self = this.set("bucketingConfig", js.undefined)
    
    @scala.inline
    def setCharacterMaskConfig(value: SchemaGooglePrivacyDlpV2CharacterMaskConfig): Self = this.set("characterMaskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterMaskConfig: Self = this.set("characterMaskConfig", js.undefined)
    
    @scala.inline
    def setCryptoDeterministicConfig(value: SchemaGooglePrivacyDlpV2CryptoDeterministicConfig): Self = this.set("cryptoDeterministicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoDeterministicConfig: Self = this.set("cryptoDeterministicConfig", js.undefined)
    
    @scala.inline
    def setCryptoHashConfig(value: SchemaGooglePrivacyDlpV2CryptoHashConfig): Self = this.set("cryptoHashConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoHashConfig: Self = this.set("cryptoHashConfig", js.undefined)
    
    @scala.inline
    def setCryptoReplaceFfxFpeConfig(value: SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig): Self = this.set("cryptoReplaceFfxFpeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoReplaceFfxFpeConfig: Self = this.set("cryptoReplaceFfxFpeConfig", js.undefined)
    
    @scala.inline
    def setDateShiftConfig(value: SchemaGooglePrivacyDlpV2DateShiftConfig): Self = this.set("dateShiftConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateShiftConfig: Self = this.set("dateShiftConfig", js.undefined)
    
    @scala.inline
    def setFixedSizeBucketingConfig(value: SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig): Self = this.set("fixedSizeBucketingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedSizeBucketingConfig: Self = this.set("fixedSizeBucketingConfig", js.undefined)
    
    @scala.inline
    def setRedactConfig(value: SchemaGooglePrivacyDlpV2RedactConfig): Self = this.set("redactConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedactConfig: Self = this.set("redactConfig", js.undefined)
    
    @scala.inline
    def setReplaceConfig(value: SchemaGooglePrivacyDlpV2ReplaceValueConfig): Self = this.set("replaceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceConfig: Self = this.set("replaceConfig", js.undefined)
    
    @scala.inline
    def setReplaceWithInfoTypeConfig(value: SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig): Self = this.set("replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceWithInfoTypeConfig: Self = this.set("replaceWithInfoTypeConfig", js.undefined)
    
    @scala.inline
    def setTimePartConfig(value: SchemaGooglePrivacyDlpV2TimePartConfig): Self = this.set("timePartConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePartConfig: Self = this.set("timePartConfig", js.undefined)
  }
}
