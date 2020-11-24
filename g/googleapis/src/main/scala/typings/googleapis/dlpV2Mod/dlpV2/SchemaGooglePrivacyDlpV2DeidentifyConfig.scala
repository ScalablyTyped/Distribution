package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration that controls how the data will change.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyConfig extends js.Object {
  
  /**
    * Treat the dataset as free-form text and apply the same free text
    * transformation everywhere.
    */
  var infoTypeTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2InfoTypeTransformations] = js.native
  
  /**
    * Treat the dataset as structured. Transformations can be applied to
    * specific locations within structured datasets, such as transforming a
    * column within a table.
    */
  var recordTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2RecordTransformations] = js.native
}
object SchemaGooglePrivacyDlpV2DeidentifyConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyConfigOps[Self <: SchemaGooglePrivacyDlpV2DeidentifyConfig] (val x: Self) extends AnyVal {
    
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
    def setInfoTypeTransformations(value: SchemaGooglePrivacyDlpV2InfoTypeTransformations): Self = this.set("infoTypeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoTypeTransformations: Self = this.set("infoTypeTransformations", js.undefined)
    
    @scala.inline
    def setRecordTransformations(value: SchemaGooglePrivacyDlpV2RecordTransformations): Self = this.set("recordTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordTransformations: Self = this.set("recordTransformations", js.undefined)
  }
}
