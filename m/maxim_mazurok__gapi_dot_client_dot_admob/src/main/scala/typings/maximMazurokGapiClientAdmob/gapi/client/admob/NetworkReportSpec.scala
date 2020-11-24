package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkReportSpec extends js.Object {
  
  /** The date range for which the report is generated. */
  var dateRange: js.UndefOr[DateRange] = js.native
  
  /** Describes which report rows to match based on their dimension values. */
  var dimensionFilters: js.UndefOr[js.Array[NetworkReportSpecDimensionFilter]] = js.native
  
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
  var sortConditions: js.UndefOr[js.Array[NetworkReportSpecSortCondition]] = js.native
  
  /**
    * A report time zone. Accepts an IANA TZ name values, such as "America/Los_Angeles." If no time zone is defined, the account default takes effect. Check default value by the get
    * account action. **Warning:** The "America/Los_Angeles" is the only supported value at the moment.
    */
  var timeZone: js.UndefOr[String] = js.native
}
object NetworkReportSpec {
  
  @scala.inline
  def apply(): NetworkReportSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkReportSpec]
  }
  
  @scala.inline
  implicit class NetworkReportSpecOps[Self <: NetworkReportSpec] (val x: Self) extends AnyVal {
    
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
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: NetworkReportSpecDimensionFilter*): Self = this.set("dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilters(value: js.Array[NetworkReportSpecDimensionFilter]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: String*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[String]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setLocalizationSettings(value: LocalizationSettings): Self = this.set("localizationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizationSettings: Self = this.set("localizationSettings", js.undefined)
    
    @scala.inline
    def setMaxReportRows(value: Double): Self = this.set("maxReportRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReportRows: Self = this.set("maxReportRows", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: String*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setSortConditionsVarargs(value: NetworkReportSpecSortCondition*): Self = this.set("sortConditions", js.Array(value :_*))
    
    @scala.inline
    def setSortConditions(value: js.Array[NetworkReportSpecSortCondition]): Self = this.set("sortConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortConditions: Self = this.set("sortConditions", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
