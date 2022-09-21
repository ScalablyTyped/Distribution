package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2BigQueryOptions extends StObject {
  
  /**
    * References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings.
    */
  var excludedFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
  
  /**
    * Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
  
  /**
    * Limit scanning only to these fields.
    */
  var includedFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
  
  /**
    * Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimitPercent: js.UndefOr[Double | Null] = js.undefined
  
  var sampleMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object SchemaGooglePrivacyDlpV2BigQueryOptions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryOptions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2BigQueryOptions](x: Self) {
    
    inline def setExcludedFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "excludedFields", value.asInstanceOf[js.Any])
    
    inline def setExcludedFieldsUndefined: Self = StObject.set(x, "excludedFields", js.undefined)
    
    inline def setExcludedFieldsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "excludedFields", js.Array(value*))
    
    inline def setIdentifyingFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "identifyingFields", value.asInstanceOf[js.Any])
    
    inline def setIdentifyingFieldsUndefined: Self = StObject.set(x, "identifyingFields", js.undefined)
    
    inline def setIdentifyingFieldsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "identifyingFields", js.Array(value*))
    
    inline def setIncludedFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "includedFields", value.asInstanceOf[js.Any])
    
    inline def setIncludedFieldsUndefined: Self = StObject.set(x, "includedFields", js.undefined)
    
    inline def setIncludedFieldsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "includedFields", js.Array(value*))
    
    inline def setRowsLimit(value: String): Self = StObject.set(x, "rowsLimit", value.asInstanceOf[js.Any])
    
    inline def setRowsLimitNull: Self = StObject.set(x, "rowsLimit", null)
    
    inline def setRowsLimitPercent(value: Double): Self = StObject.set(x, "rowsLimitPercent", value.asInstanceOf[js.Any])
    
    inline def setRowsLimitPercentNull: Self = StObject.set(x, "rowsLimitPercent", null)
    
    inline def setRowsLimitPercentUndefined: Self = StObject.set(x, "rowsLimitPercent", js.undefined)
    
    inline def setRowsLimitUndefined: Self = StObject.set(x, "rowsLimit", js.undefined)
    
    inline def setSampleMethod(value: String): Self = StObject.set(x, "sampleMethod", value.asInstanceOf[js.Any])
    
    inline def setSampleMethodNull: Self = StObject.set(x, "sampleMethod", null)
    
    inline def setSampleMethodUndefined: Self = StObject.set(x, "sampleMethod", js.undefined)
    
    inline def setTableReference(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    inline def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
  }
}
