package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.googleapis.anon.AdGroupId
import typings.googleapis.anon.ChangedAttributesSinceTimestamp
import typings.googleapis.anon.Column
import typings.googleapis.anon.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request object used to create a DoubleClick Search report.
  */
trait SchemaReportRequest extends StObject {
  
  /**
    * The columns to include in the report. This includes both DoubleClick
    * Search columns and saved columns. For DoubleClick Search columns, only
    * the columnName parameter is required. For saved columns only the
    * savedColumnName parameter is required. Both columnName and
    * savedColumnName cannot be set in the same stanza. The maximum number of
    * columns per request is 300.
    */
  var columns: js.UndefOr[js.Array[SchemaReportApiColumnSpec]] = js.undefined
  
  /**
    * Format that the report should be returned in. Currently csv or tsv is
    * supported.
    */
  var downloadFormat: js.UndefOr[String] = js.undefined
  
  /**
    * A list of filters to be applied to the report. The maximum number of
    * filters per request is 300.
    */
  var filters: js.UndefOr[js.Array[Column]] = js.undefined
  
  /**
    * Determines if removed entities should be included in the report. Defaults
    * to false. Deprecated, please use includeRemovedEntities instead.
    */
  var includeDeletedEntities: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines if removed entities should be included in the report. Defaults
    * to false.
    */
  var includeRemovedEntities: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Asynchronous report only. The maximum number of rows per report file. A
    * large report is split into many files based on this field. Acceptable
    * values are 1000000 to 100000000, inclusive.
    */
  var maxRowsPerFile: js.UndefOr[Double] = js.undefined
  
  /**
    * Synchronous report only. A list of columns and directions defining
    * sorting to be performed on the report rows. The maximum number of
    * orderings per request is 300.
    */
  var orderBy: js.UndefOr[js.Array[SortOrder]] = js.undefined
  
  /**
    * The reportScope is a set of IDs that are used to determine which subset
    * of entities will be returned in the report. The full lineage of IDs from
    * the lowest scoped level desired up through agency is required.
    */
  var reportScope: js.UndefOr[AdGroupId] = js.undefined
  
  /**
    * Determines the type of rows that are returned in the report. For example,
    * if you specify reportType: keyword, each row in the report will contain
    * data about a keyword. See the Types of Reports reference for the columns
    * that are available for each type.
    */
  var reportType: js.UndefOr[String] = js.undefined
  
  /**
    * Synchronous report only. The maximum number of rows to return; additional
    * rows are dropped. Acceptable values are 0 to 10000, inclusive. Defaults
    * to 10000.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Synchronous report only. Zero-based index of the first row to return.
    * Acceptable values are 0 to 50000, inclusive. Defaults to 0.
    */
  var startRow: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the currency in which monetary will be returned. Possible
    * values are: usd, agency (valid if the report is scoped to agency or
    * lower), advertiser (valid if the report is scoped to * advertiser or
    * lower), or account (valid if the report is scoped to engine account or
    * lower).
    */
  var statisticsCurrency: js.UndefOr[String] = js.undefined
  
  /**
    * If metrics are requested in a report, this argument will be used to
    * restrict the metrics to a specific time range.
    */
  var timeRange: js.UndefOr[ChangedAttributesSinceTimestamp] = js.undefined
  
  /**
    * If true, the report would only be created if all the requested stat data
    * are sourced from a single timezone. Defaults to false.
    */
  var verifySingleTimeZone: js.UndefOr[Boolean] = js.undefined
}
object SchemaReportRequest {
  
  @scala.inline
  def apply(): SchemaReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRequest]
  }
  
  @scala.inline
  implicit class SchemaReportRequestMutableBuilder[Self <: SchemaReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[SchemaReportApiColumnSpec]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: SchemaReportApiColumnSpec*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDownloadFormat(value: String): Self = StObject.set(x, "downloadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadFormatUndefined: Self = StObject.set(x, "downloadFormat", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[Column]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Column*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setIncludeDeletedEntities(value: Boolean): Self = StObject.set(x, "includeDeletedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedEntitiesUndefined: Self = StObject.set(x, "includeDeletedEntities", js.undefined)
    
    @scala.inline
    def setIncludeRemovedEntities(value: Boolean): Self = StObject.set(x, "includeRemovedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRemovedEntitiesUndefined: Self = StObject.set(x, "includeRemovedEntities", js.undefined)
    
    @scala.inline
    def setMaxRowsPerFile(value: Double): Self = StObject.set(x, "maxRowsPerFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRowsPerFileUndefined: Self = StObject.set(x, "maxRowsPerFile", js.undefined)
    
    @scala.inline
    def setOrderBy(value: js.Array[SortOrder]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setOrderByVarargs(value: SortOrder*): Self = StObject.set(x, "orderBy", js.Array(value :_*))
    
    @scala.inline
    def setReportScope(value: AdGroupId): Self = StObject.set(x, "reportScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportScopeUndefined: Self = StObject.set(x, "reportScope", js.undefined)
    
    @scala.inline
    def setReportType(value: String): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
    
    @scala.inline
    def setStatisticsCurrency(value: String): Self = StObject.set(x, "statisticsCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsCurrencyUndefined: Self = StObject.set(x, "statisticsCurrency", js.undefined)
    
    @scala.inline
    def setTimeRange(value: ChangedAttributesSinceTimestamp): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    @scala.inline
    def setVerifySingleTimeZone(value: Boolean): Self = StObject.set(x, "verifySingleTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifySingleTimeZoneUndefined: Self = StObject.set(x, "verifySingleTimeZone", js.undefined)
  }
}
