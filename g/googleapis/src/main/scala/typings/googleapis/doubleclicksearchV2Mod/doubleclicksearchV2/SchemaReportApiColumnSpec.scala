package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request object used to create a DoubleClick Search report.
  */
@js.native
trait SchemaReportApiColumnSpec extends StObject {
  
  /**
    * Name of a DoubleClick Search column to include in the report.
    */
  var columnName: js.UndefOr[String] = js.native
  
  /**
    * Segments a report by a custom dimension. The report must be scoped to an
    * advertiser or lower, and the custom dimension must already be set up in
    * DoubleClick Search. The custom dimension name, which appears in
    * DoubleClick Search, is case sensitive. If used in a conversion report,
    * returns the value of the specified custom dimension for the given
    * conversion, if set. This column does not segment the conversion report.
    */
  var customDimensionName: js.UndefOr[String] = js.native
  
  /**
    * Name of a custom metric to include in the report. The report must be
    * scoped to an advertiser or lower, and the custom metric must already be
    * set up in DoubleClick Search. The custom metric name, which appears in
    * DoubleClick Search, is case sensitive.
    */
  var customMetricName: js.UndefOr[String] = js.native
  
  /**
    * Inclusive day in YYYY-MM-DD format. When provided, this overrides the
    * overall time range of the report for this column only. Must be provided
    * together with startDate.
    */
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * Synchronous report only. Set to true to group by this column. Defaults to
    * false.
    */
  var groupByColumn: js.UndefOr[Boolean] = js.native
  
  /**
    * Text used to identify this column in the report output; defaults to
    * columnName or savedColumnName when not specified. This can be used to
    * prevent collisions between DoubleClick Search columns and saved columns
    * with the same name.
    */
  var headerText: js.UndefOr[String] = js.native
  
  /**
    * The platform that is used to provide data for the custom dimension.
    * Acceptable values are &quot;floodlight&quot;.
    */
  var platformSource: js.UndefOr[String] = js.native
  
  /**
    * Returns metrics only for a specific type of product activity. Accepted
    * values are:   - &quot;sold&quot;: returns metrics only for products that
    * were sold  - &quot;advertised&quot;: returns metrics only for products
    * that were advertised in a Shopping campaign, and that might or might not
    * have been sold
    */
  var productReportPerspective: js.UndefOr[String] = js.native
  
  /**
    * Name of a saved column to include in the report. The report must be
    * scoped at advertiser or lower, and this saved column must already be
    * created in the DoubleClick Search UI.
    */
  var savedColumnName: js.UndefOr[String] = js.native
  
  /**
    * Inclusive date in YYYY-MM-DD format. When provided, this overrides the
    * overall time range of the report for this column only. Must be provided
    * together with endDate.
    */
  var startDate: js.UndefOr[String] = js.native
}
object SchemaReportApiColumnSpec {
  
  @scala.inline
  def apply(): SchemaReportApiColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportApiColumnSpec]
  }
  
  @scala.inline
  implicit class SchemaReportApiColumnSpecMutableBuilder[Self <: SchemaReportApiColumnSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    @scala.inline
    def setCustomDimensionName(value: String): Self = StObject.set(x, "customDimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDimensionNameUndefined: Self = StObject.set(x, "customDimensionName", js.undefined)
    
    @scala.inline
    def setCustomMetricName(value: String): Self = StObject.set(x, "customMetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetricNameUndefined: Self = StObject.set(x, "customMetricName", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setGroupByColumn(value: Boolean): Self = StObject.set(x, "groupByColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByColumnUndefined: Self = StObject.set(x, "groupByColumn", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    @scala.inline
    def setPlatformSource(value: String): Self = StObject.set(x, "platformSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformSourceUndefined: Self = StObject.set(x, "platformSource", js.undefined)
    
    @scala.inline
    def setProductReportPerspective(value: String): Self = StObject.set(x, "productReportPerspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductReportPerspectiveUndefined: Self = StObject.set(x, "productReportPerspective", js.undefined)
    
    @scala.inline
    def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
