package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options defining BigQuery table and row identifiers.
  */
trait SchemaGooglePrivacyDlpV2BigQueryOptions extends StObject {
  
  /**
    * References to fields excluded from scanning. This allows you to skip
    * inspection of entire columns which you know have no findings.
    */
  var excludedFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
  
  /**
    * References to fields uniquely identifying rows within the table. Nested
    * fields in the format, like `person.birthdate.year`, are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
  
  /**
    * Max number of rows to scan. If the table has more rows than this value,
    * the rest of the rows are omitted. If not set, or if set to 0, all rows
    * will be scanned. Only one of rows_limit and rows_limit_percent can be
    * specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimit: js.UndefOr[String] = js.undefined
  
  /**
    * Max percentage of rows to scan. The rest are omitted. The number of rows
    * scanned is rounded down. Must be between 0 and 100, inclusively. Both 0
    * and 100 means no limit. Defaults to 0. Only one of rows_limit and
    * rows_limit_percent can be specified. Cannot be used in conjunction with
    * TimespanConfig.
    */
  var rowsLimitPercent: js.UndefOr[Double] = js.undefined
  
  var sampleMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object SchemaGooglePrivacyDlpV2BigQueryOptions {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryOptions]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BigQueryOptionsMutableBuilder[Self <: SchemaGooglePrivacyDlpV2BigQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "excludedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedFieldsUndefined: Self = StObject.set(x, "excludedFields", js.undefined)
    
    @scala.inline
    def setExcludedFieldsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "excludedFields", js.Array(value :_*))
    
    @scala.inline
    def setIdentifyingFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "identifyingFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifyingFieldsUndefined: Self = StObject.set(x, "identifyingFields", js.undefined)
    
    @scala.inline
    def setIdentifyingFieldsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "identifyingFields", js.Array(value :_*))
    
    @scala.inline
    def setRowsLimit(value: String): Self = StObject.set(x, "rowsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsLimitPercent(value: Double): Self = StObject.set(x, "rowsLimitPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsLimitPercentUndefined: Self = StObject.set(x, "rowsLimitPercent", js.undefined)
    
    @scala.inline
    def setRowsLimitUndefined: Self = StObject.set(x, "rowsLimit", js.undefined)
    
    @scala.inline
    def setSampleMethod(value: String): Self = StObject.set(x, "sampleMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleMethodUndefined: Self = StObject.set(x, "sampleMethod", js.undefined)
    
    @scala.inline
    def setTableReference(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
  }
}
