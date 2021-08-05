package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data part of the report.
  */
trait SchemaReportData extends StObject {
  
  /**
    * The last time the data in the report was refreshed. All the hits received
    * before this timestamp are included in the calculation of the report.
    */
  var dataLastRefreshed: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if response to this request is golden or not. Data is golden
    * when the exact same request will not produce any new results if asked at
    * a later point in time.
    */
  var isDataGolden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Minimum and maximum values seen over all matching rows. These are both
    * empty when `hideValueRanges` in the request is false, or when rowCount is
    * zero.
    */
  var maximums: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.undefined
  
  /**
    * Minimum and maximum values seen over all matching rows. These are both
    * empty when `hideValueRanges` in the request is false, or when rowCount is
    * zero.
    */
  var minimums: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.undefined
  
  /**
    * Total number of matching rows for this query.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * There&#39;s one ReportRow for every unique combination of dimensions.
    */
  var rows: js.UndefOr[js.Array[SchemaReportRow]] = js.undefined
  
  /**
    * If the results are
    * [sampled](https://support.google.com/analytics/answer/2637192), this
    * returns the total number of samples read, one entry per date range. If
    * the results are not sampled this field will not be defined. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplesReadCounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If the results are
    * [sampled](https://support.google.com/analytics/answer/2637192), this
    * returns the total number of samples present, one entry per date range. If
    * the results are not sampled this field will not be defined. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplingSpaceSizes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * For each requested date range, for the set of all rows that match the
    * query, every requested value format gets a total. The total for a value
    * format is computed by first totaling the metrics mentioned in the value
    * format and then evaluating the value format as a scalar expression. E.g.,
    * The &quot;totals&quot; for `3 / (ga:sessions + 2)` we compute `3 / ((sum
    * of all relevant ga:sessions) + 2)`. Totals are computed before
    * pagination.
    */
  var totals: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.undefined
}
object SchemaReportData {
  
  inline def apply(): SchemaReportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportData]
  }
  
  extension [Self <: SchemaReportData](x: Self) {
    
    inline def setDataLastRefreshed(value: String): Self = StObject.set(x, "dataLastRefreshed", value.asInstanceOf[js.Any])
    
    inline def setDataLastRefreshedUndefined: Self = StObject.set(x, "dataLastRefreshed", js.undefined)
    
    inline def setIsDataGolden(value: Boolean): Self = StObject.set(x, "isDataGolden", value.asInstanceOf[js.Any])
    
    inline def setIsDataGoldenUndefined: Self = StObject.set(x, "isDataGolden", js.undefined)
    
    inline def setMaximums(value: js.Array[SchemaDateRangeValues]): Self = StObject.set(x, "maximums", value.asInstanceOf[js.Any])
    
    inline def setMaximumsUndefined: Self = StObject.set(x, "maximums", js.undefined)
    
    inline def setMaximumsVarargs(value: SchemaDateRangeValues*): Self = StObject.set(x, "maximums", js.Array(value :_*))
    
    inline def setMinimums(value: js.Array[SchemaDateRangeValues]): Self = StObject.set(x, "minimums", value.asInstanceOf[js.Any])
    
    inline def setMinimumsUndefined: Self = StObject.set(x, "minimums", js.undefined)
    
    inline def setMinimumsVarargs(value: SchemaDateRangeValues*): Self = StObject.set(x, "minimums", js.Array(value :_*))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRows(value: js.Array[SchemaReportRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaReportRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setSamplesReadCounts(value: js.Array[String]): Self = StObject.set(x, "samplesReadCounts", value.asInstanceOf[js.Any])
    
    inline def setSamplesReadCountsUndefined: Self = StObject.set(x, "samplesReadCounts", js.undefined)
    
    inline def setSamplesReadCountsVarargs(value: String*): Self = StObject.set(x, "samplesReadCounts", js.Array(value :_*))
    
    inline def setSamplingSpaceSizes(value: js.Array[String]): Self = StObject.set(x, "samplingSpaceSizes", value.asInstanceOf[js.Any])
    
    inline def setSamplingSpaceSizesUndefined: Self = StObject.set(x, "samplingSpaceSizes", js.undefined)
    
    inline def setSamplingSpaceSizesVarargs(value: String*): Self = StObject.set(x, "samplingSpaceSizes", js.Array(value :_*))
    
    inline def setTotals(value: js.Array[SchemaDateRangeValues]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    inline def setTotalsVarargs(value: SchemaDateRangeValues*): Self = StObject.set(x, "totals", js.Array(value :_*))
  }
}
