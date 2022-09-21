package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportApiColumnSpec extends StObject {
  
  /**
    * Name of a DoubleClick Search column to include in the report.
    */
  var columnName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Segments a report by a custom dimension. The report must be scoped to an advertiser or lower, and the custom dimension must already be set up in DoubleClick Search. The custom dimension name, which appears in DoubleClick Search, is case sensitive.\ If used in a conversion report, returns the value of the specified custom dimension for the given conversion, if set. This column does not segment the conversion report.
    */
  var customDimensionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of a custom metric to include in the report. The report must be scoped to an advertiser or lower, and the custom metric must already be set up in DoubleClick Search. The custom metric name, which appears in DoubleClick Search, is case sensitive.
    */
  var customMetricName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Inclusive day in YYYY-MM-DD format. When provided, this overrides the overall time range of the report for this column only. Must be provided together with `startDate`.
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Synchronous report only. Set to `true` to group by this column. Defaults to `false`.
    */
  var groupByColumn: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Text used to identify this column in the report output; defaults to `columnName` or `savedColumnName` when not specified. This can be used to prevent collisions between DoubleClick Search columns and saved columns with the same name.
    */
  var headerText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The platform that is used to provide data for the custom dimension. Acceptable values are "floodlight".
    */
  var platformSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Returns metrics only for a specific type of product activity. Accepted values are: - "`sold`": returns metrics only for products that were sold - "`advertised`": returns metrics only for products that were advertised in a Shopping campaign, and that might or might not have been sold
    */
  var productReportPerspective: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of a saved column to include in the report. The report must be scoped at advertiser or lower, and this saved column must already be created in the DoubleClick Search UI.
    */
  var savedColumnName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Inclusive date in YYYY-MM-DD format. When provided, this overrides the overall time range of the report for this column only. Must be provided together with `endDate`.
    */
  var startDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportApiColumnSpec {
  
  inline def apply(): SchemaReportApiColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportApiColumnSpec]
  }
  
  extension [Self <: SchemaReportApiColumnSpec](x: Self) {
    
    inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameNull: Self = StObject.set(x, "columnName", null)
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    inline def setCustomDimensionName(value: String): Self = StObject.set(x, "customDimensionName", value.asInstanceOf[js.Any])
    
    inline def setCustomDimensionNameNull: Self = StObject.set(x, "customDimensionName", null)
    
    inline def setCustomDimensionNameUndefined: Self = StObject.set(x, "customDimensionName", js.undefined)
    
    inline def setCustomMetricName(value: String): Self = StObject.set(x, "customMetricName", value.asInstanceOf[js.Any])
    
    inline def setCustomMetricNameNull: Self = StObject.set(x, "customMetricName", null)
    
    inline def setCustomMetricNameUndefined: Self = StObject.set(x, "customMetricName", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setGroupByColumn(value: Boolean): Self = StObject.set(x, "groupByColumn", value.asInstanceOf[js.Any])
    
    inline def setGroupByColumnNull: Self = StObject.set(x, "groupByColumn", null)
    
    inline def setGroupByColumnUndefined: Self = StObject.set(x, "groupByColumn", js.undefined)
    
    inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextNull: Self = StObject.set(x, "headerText", null)
    
    inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    inline def setPlatformSource(value: String): Self = StObject.set(x, "platformSource", value.asInstanceOf[js.Any])
    
    inline def setPlatformSourceNull: Self = StObject.set(x, "platformSource", null)
    
    inline def setPlatformSourceUndefined: Self = StObject.set(x, "platformSource", js.undefined)
    
    inline def setProductReportPerspective(value: String): Self = StObject.set(x, "productReportPerspective", value.asInstanceOf[js.Any])
    
    inline def setProductReportPerspectiveNull: Self = StObject.set(x, "productReportPerspective", null)
    
    inline def setProductReportPerspectiveUndefined: Self = StObject.set(x, "productReportPerspective", js.undefined)
    
    inline def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
    
    inline def setSavedColumnNameNull: Self = StObject.set(x, "savedColumnName", null)
    
    inline def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
