package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An auxiliary table contains statistical information on the relative
  * frequency of different quasi-identifiers values. It has one or several
  * quasi-identifiers columns, and one column that indicates the relative
  * frequency of each quasi-identifier tuple. If a tuple is present in the data
  * but not in the auxiliary table, the corresponding relative frequency is
  * assumed to be zero (and thus, the tuple is highly reidentifiable).
  */
@js.native
trait SchemaGooglePrivacyDlpV2AuxiliaryTable extends js.Object {
  
  /**
    * Quasi-identifier columns. [required]
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2QuasiIdField]] = js.native
  
  /**
    * The relative frequency column must contain a floating-point number
    * between 0 and 1 (inclusive). Null values are assumed to be zero.
    * [required]
    */
  var relativeFrequency: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  
  /**
    * Auxiliary table location. [required]
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}
object SchemaGooglePrivacyDlpV2AuxiliaryTable {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2AuxiliaryTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2AuxiliaryTable]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2AuxiliaryTableOps[Self <: SchemaGooglePrivacyDlpV2AuxiliaryTable] (val x: Self) extends AnyVal {
    
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
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2QuasiIdField*): Self = this.set("quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2QuasiIdField]): Self = this.set("quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuasiIds: Self = this.set("quasiIds", js.undefined)
    
    @scala.inline
    def setRelativeFrequency(value: SchemaGooglePrivacyDlpV2FieldId): Self = this.set("relativeFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeFrequency: Self = this.set("relativeFrequency", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
}
