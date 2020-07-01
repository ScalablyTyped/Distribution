package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.googleapis.anon.AdGroupId
import typings.googleapis.anon.ChangedAttributesSinceTimestamp
import typings.googleapis.anon.Column
import typings.googleapis.anon.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request object used to create a DoubleClick Search report.
  */
@js.native
trait SchemaReportRequest extends js.Object {
  /**
    * The columns to include in the report. This includes both DoubleClick
    * Search columns and saved columns. For DoubleClick Search columns, only
    * the columnName parameter is required. For saved columns only the
    * savedColumnName parameter is required. Both columnName and
    * savedColumnName cannot be set in the same stanza. The maximum number of
    * columns per request is 300.
    */
  var columns: js.UndefOr[js.Array[SchemaReportApiColumnSpec]] = js.native
  /**
    * Format that the report should be returned in. Currently csv or tsv is
    * supported.
    */
  var downloadFormat: js.UndefOr[String] = js.native
  /**
    * A list of filters to be applied to the report. The maximum number of
    * filters per request is 300.
    */
  var filters: js.UndefOr[js.Array[Column]] = js.native
  /**
    * Determines if removed entities should be included in the report. Defaults
    * to false. Deprecated, please use includeRemovedEntities instead.
    */
  var includeDeletedEntities: js.UndefOr[Boolean] = js.native
  /**
    * Determines if removed entities should be included in the report. Defaults
    * to false.
    */
  var includeRemovedEntities: js.UndefOr[Boolean] = js.native
  /**
    * Asynchronous report only. The maximum number of rows per report file. A
    * large report is split into many files based on this field. Acceptable
    * values are 1000000 to 100000000, inclusive.
    */
  var maxRowsPerFile: js.UndefOr[Double] = js.native
  /**
    * Synchronous report only. A list of columns and directions defining
    * sorting to be performed on the report rows. The maximum number of
    * orderings per request is 300.
    */
  var orderBy: js.UndefOr[js.Array[SortOrder]] = js.native
  /**
    * The reportScope is a set of IDs that are used to determine which subset
    * of entities will be returned in the report. The full lineage of IDs from
    * the lowest scoped level desired up through agency is required.
    */
  var reportScope: js.UndefOr[AdGroupId] = js.native
  /**
    * Determines the type of rows that are returned in the report. For example,
    * if you specify reportType: keyword, each row in the report will contain
    * data about a keyword. See the Types of Reports reference for the columns
    * that are available for each type.
    */
  var reportType: js.UndefOr[String] = js.native
  /**
    * Synchronous report only. The maximum number of rows to return; additional
    * rows are dropped. Acceptable values are 0 to 10000, inclusive. Defaults
    * to 10000.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    * Synchronous report only. Zero-based index of the first row to return.
    * Acceptable values are 0 to 50000, inclusive. Defaults to 0.
    */
  var startRow: js.UndefOr[Double] = js.native
  /**
    * Specifies the currency in which monetary will be returned. Possible
    * values are: usd, agency (valid if the report is scoped to agency or
    * lower), advertiser (valid if the report is scoped to * advertiser or
    * lower), or account (valid if the report is scoped to engine account or
    * lower).
    */
  var statisticsCurrency: js.UndefOr[String] = js.native
  /**
    * If metrics are requested in a report, this argument will be used to
    * restrict the metrics to a specific time range.
    */
  var timeRange: js.UndefOr[ChangedAttributesSinceTimestamp] = js.native
  /**
    * If true, the report would only be created if all the requested stat data
    * are sourced from a single timezone. Defaults to false.
    */
  var verifySingleTimeZone: js.UndefOr[Boolean] = js.native
}

object SchemaReportRequest {
  @scala.inline
  def apply(
    columns: js.Array[SchemaReportApiColumnSpec] = null,
    downloadFormat: String = null,
    filters: js.Array[Column] = null,
    includeDeletedEntities: js.UndefOr[Boolean] = js.undefined,
    includeRemovedEntities: js.UndefOr[Boolean] = js.undefined,
    maxRowsPerFile: js.UndefOr[Double] = js.undefined,
    orderBy: js.Array[SortOrder] = null,
    reportScope: AdGroupId = null,
    reportType: String = null,
    rowCount: js.UndefOr[Double] = js.undefined,
    startRow: js.UndefOr[Double] = js.undefined,
    statisticsCurrency: String = null,
    timeRange: ChangedAttributesSinceTimestamp = null,
    verifySingleTimeZone: js.UndefOr[Boolean] = js.undefined
  ): SchemaReportRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (downloadFormat != null) __obj.updateDynamic("downloadFormat")(downloadFormat.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDeletedEntities)) __obj.updateDynamic("includeDeletedEntities")(includeDeletedEntities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRemovedEntities)) __obj.updateDynamic("includeRemovedEntities")(includeRemovedEntities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRowsPerFile)) __obj.updateDynamic("maxRowsPerFile")(maxRowsPerFile.get.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (reportScope != null) __obj.updateDynamic("reportScope")(reportScope.asInstanceOf[js.Any])
    if (reportType != null) __obj.updateDynamic("reportType")(reportType.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startRow)) __obj.updateDynamic("startRow")(startRow.get.asInstanceOf[js.Any])
    if (statisticsCurrency != null) __obj.updateDynamic("statisticsCurrency")(statisticsCurrency.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    if (!js.isUndefined(verifySingleTimeZone)) __obj.updateDynamic("verifySingleTimeZone")(verifySingleTimeZone.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportRequest]
  }
}

