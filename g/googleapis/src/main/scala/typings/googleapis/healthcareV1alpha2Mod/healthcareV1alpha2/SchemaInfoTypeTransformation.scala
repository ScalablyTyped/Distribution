package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait SchemaInfoTypeTransformation extends js.Object {
  /**
    * Config for character mask.
    */
  var characterMaskConfig: js.UndefOr[SchemaCharacterMaskConfig] = js.native
  /**
    * Config for crypto hash.
    */
  var cryptoHashConfig: js.UndefOr[SchemaCryptoHashConfig] = js.native
  /**
    * Config for date shift.
    */
  var dateShiftConfig: js.UndefOr[SchemaDateShiftConfig] = js.native
  /**
    * InfoTypes to apply this transformation to. If this is not specified, the
    * transformation applies to any info_type.
    */
  var infoTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Config for text redaction.
    */
  var redactConfig: js.UndefOr[SchemaRedactConfig] = js.native
  /**
    * Config for replace with InfoType.
    */
  var replaceWithInfoTypeConfig: js.UndefOr[SchemaReplaceWithInfoTypeConfig] = js.native
}

object SchemaInfoTypeTransformation {
  @scala.inline
  def apply(
    characterMaskConfig: SchemaCharacterMaskConfig = null,
    cryptoHashConfig: SchemaCryptoHashConfig = null,
    dateShiftConfig: SchemaDateShiftConfig = null,
    infoTypes: js.Array[String] = null,
    redactConfig: SchemaRedactConfig = null,
    replaceWithInfoTypeConfig: SchemaReplaceWithInfoTypeConfig = null
  ): SchemaInfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    if (characterMaskConfig != null) __obj.updateDynamic("characterMaskConfig")(characterMaskConfig.asInstanceOf[js.Any])
    if (cryptoHashConfig != null) __obj.updateDynamic("cryptoHashConfig")(cryptoHashConfig.asInstanceOf[js.Any])
    if (dateShiftConfig != null) __obj.updateDynamic("dateShiftConfig")(dateShiftConfig.asInstanceOf[js.Any])
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    if (redactConfig != null) __obj.updateDynamic("redactConfig")(redactConfig.asInstanceOf[js.Any])
    if (replaceWithInfoTypeConfig != null) __obj.updateDynamic("replaceWithInfoTypeConfig")(replaceWithInfoTypeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInfoTypeTransformation]
  }
}

