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
  def apply(): SchemaInfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInfoTypeTransformation]
  }
  @scala.inline
  implicit class SchemaInfoTypeTransformationOps[Self <: SchemaInfoTypeTransformation] (val x: Self) extends AnyVal {
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
    def setCharacterMaskConfig(value: SchemaCharacterMaskConfig): Self = this.set("characterMaskConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterMaskConfig: Self = this.set("characterMaskConfig", js.undefined)
    @scala.inline
    def setCryptoHashConfig(value: SchemaCryptoHashConfig): Self = this.set("cryptoHashConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCryptoHashConfig: Self = this.set("cryptoHashConfig", js.undefined)
    @scala.inline
    def setDateShiftConfig(value: SchemaDateShiftConfig): Self = this.set("dateShiftConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateShiftConfig: Self = this.set("dateShiftConfig", js.undefined)
    @scala.inline
    def setInfoTypesVarargs(value: String*): Self = this.set("infoTypes", js.Array(value :_*))
    @scala.inline
    def setInfoTypes(value: js.Array[String]): Self = this.set("infoTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoTypes: Self = this.set("infoTypes", js.undefined)
    @scala.inline
    def setRedactConfig(value: SchemaRedactConfig): Self = this.set("redactConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedactConfig: Self = this.set("redactConfig", js.undefined)
    @scala.inline
    def setReplaceWithInfoTypeConfig(value: SchemaReplaceWithInfoTypeConfig): Self = this.set("replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceWithInfoTypeConfig: Self = this.set("replaceWithInfoTypeConfig", js.undefined)
  }
  
}

