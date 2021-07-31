package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An auxiliary table containing statistical information on the relative
  * frequency of different quasi-identifiers values. It has one or several
  * quasi-identifiers columns, and one column that indicates the relative
  * frequency of each quasi-identifier tuple. If a tuple is present in the data
  * but not in the auxiliary table, the corresponding relative frequency is
  * assumed to be zero (and thus, the tuple is highly reidentifiable).
  */
trait SchemaGooglePrivacyDlpV2StatisticalTable extends StObject {
  
  /**
    * Quasi-identifier columns. [required]
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2QuasiIdentifierField]] = js.undefined
  
  /**
    * The relative frequency column must contain a floating-point number
    * between 0 and 1 (inclusive). Null values are assumed to be zero.
    * [required]
    */
  var relativeFrequency: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
  
  /**
    * Auxiliary table location. [required]
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object SchemaGooglePrivacyDlpV2StatisticalTable {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StatisticalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StatisticalTable]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StatisticalTableMutableBuilder[Self <: SchemaGooglePrivacyDlpV2StatisticalTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2QuasiIdentifierField]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    @scala.inline
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2QuasiIdentifierField*): Self = StObject.set(x, "quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setRelativeFrequency(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "relativeFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeFrequencyUndefined: Self = StObject.set(x, "relativeFrequency", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
