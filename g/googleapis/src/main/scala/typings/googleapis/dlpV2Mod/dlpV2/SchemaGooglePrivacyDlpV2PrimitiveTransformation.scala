package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    bucketingConfig: SchemaGooglePrivacyDlpV2BucketingConfig = null,
    characterMaskConfig: SchemaGooglePrivacyDlpV2CharacterMaskConfig = null,
    cryptoDeterministicConfig: SchemaGooglePrivacyDlpV2CryptoDeterministicConfig = null,
    cryptoHashConfig: SchemaGooglePrivacyDlpV2CryptoHashConfig = null,
    cryptoReplaceFfxFpeConfig: SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig = null,
    dateShiftConfig: SchemaGooglePrivacyDlpV2DateShiftConfig = null,
    fixedSizeBucketingConfig: SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig = null,
    redactConfig: SchemaGooglePrivacyDlpV2RedactConfig = null,
    replaceConfig: SchemaGooglePrivacyDlpV2ReplaceValueConfig = null,
    replaceWithInfoTypeConfig: SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig = null,
    timePartConfig: SchemaGooglePrivacyDlpV2TimePartConfig = null
  ): SchemaGooglePrivacyDlpV2PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    if (bucketingConfig != null) __obj.updateDynamic("bucketingConfig")(bucketingConfig.asInstanceOf[js.Any])
    if (characterMaskConfig != null) __obj.updateDynamic("characterMaskConfig")(characterMaskConfig.asInstanceOf[js.Any])
    if (cryptoDeterministicConfig != null) __obj.updateDynamic("cryptoDeterministicConfig")(cryptoDeterministicConfig.asInstanceOf[js.Any])
    if (cryptoHashConfig != null) __obj.updateDynamic("cryptoHashConfig")(cryptoHashConfig.asInstanceOf[js.Any])
    if (cryptoReplaceFfxFpeConfig != null) __obj.updateDynamic("cryptoReplaceFfxFpeConfig")(cryptoReplaceFfxFpeConfig.asInstanceOf[js.Any])
    if (dateShiftConfig != null) __obj.updateDynamic("dateShiftConfig")(dateShiftConfig.asInstanceOf[js.Any])
    if (fixedSizeBucketingConfig != null) __obj.updateDynamic("fixedSizeBucketingConfig")(fixedSizeBucketingConfig.asInstanceOf[js.Any])
    if (redactConfig != null) __obj.updateDynamic("redactConfig")(redactConfig.asInstanceOf[js.Any])
    if (replaceConfig != null) __obj.updateDynamic("replaceConfig")(replaceConfig.asInstanceOf[js.Any])
    if (replaceWithInfoTypeConfig != null) __obj.updateDynamic("replaceWithInfoTypeConfig")(replaceWithInfoTypeConfig.asInstanceOf[js.Any])
    if (timePartConfig != null) __obj.updateDynamic("timePartConfig")(timePartConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrimitiveTransformation]
  }
}

