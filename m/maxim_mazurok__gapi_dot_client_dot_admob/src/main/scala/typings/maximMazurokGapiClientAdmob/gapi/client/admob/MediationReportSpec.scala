package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediationReportSpec extends StObject {
  
  /** The date range for which the report is generated. */
  var dateRange: js.UndefOr[DateRange] = js.native
  
  /** Describes which report rows to match based on their dimension values. */
  var dimensionFilters: js.UndefOr[js.Array[MediationReportSpecDimensionFilter]] = js.native
  
  /**
    * List of dimensions of the report. The value combination of these dimensions determines the row of the report. If no dimensions are specified, the report returns a single row of
    * requested metrics for the entire account.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  
  /** Localization settings of the report. */
  var localizationSettings: js.UndefOr[LocalizationSettings] = js.native
  
  /**
    * Maximum number of report data rows to return. If the value is not set, the API returns as many rows as possible, up to 100000. Acceptable values are 1-100000, inclusive. Values
    * larger than 100000 return an error.
    */
  var maxReportRows: js.UndefOr[Double] = js.native
  
  /** List of metrics of the report. A report must specify at least one metric. */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Describes the sorting of report rows. The order of the condition in the list defines its precedence; the earlier the condition, the higher its precedence. If no sort conditions are
    * specified, the row ordering is undefined.
    */
  var sortConditions: js.UndefOr[js.Array[MediationReportSpecSortCondition]] = js.native
  
  /**
    * A report time zone. Accepts an IANA TZ name values, such as "America/Los_Angeles." If no time zone is defined, the account default takes effect. Check default value by the get
    * account action. **Warning:** The "America/Los_Angeles" is the only supported value at the moment.
    */
  var timeZone: js.UndefOr[String] = js.native
}
object MediationReportSpec {
  
  @scala.inline
  def apply(): MediationReportSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediationReportSpec]
  }
  
  @scala.inline
  implicit class MediationReportSpecMutableBuilder[Self <: MediationReportSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDimensionFilters(value: js.Array[MediationReportSpecDimensionFilter]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: MediationReportSpecDimensionFilter*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setLocalizationSettings(value: LocalizationSettings): Self = StObject.set(x, "localizationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationSettingsUndefined: Self = StObject.set(x, "localizationSettings", js.undefined)
    
    @scala.inline
    def setMaxReportRows(value: Double): Self = StObject.set(x, "maxReportRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReportRowsUndefined: Self = StObject.set(x, "maxReportRows", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setSortConditions(value: js.Array[MediationReportSpecSortCondition]): Self = StObject.set(x, "sortConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortConditionsUndefined: Self = StObject.set(x, "sortConditions", js.undefined)
    
    @scala.inline
    def setSortConditionsVarargs(value: MediationReportSpecSortCondition*): Self = StObject.set(x, "sortConditions", js.Array(value :_*))
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
