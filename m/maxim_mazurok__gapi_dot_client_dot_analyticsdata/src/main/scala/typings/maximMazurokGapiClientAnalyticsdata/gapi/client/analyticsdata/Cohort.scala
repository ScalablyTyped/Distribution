package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cohort extends js.Object {
  
  /**
    * The cohort selects users whose first visit date is between start date and end date defined in the `dateRange`. In a cohort request, this `dateRange` is required and the `dateRanges`
    * in the `RunReportRequest` or `RunPivotReportRequest` must be unspecified. The date range should be aligned with the cohort's granularity. If CohortsRange uses daily granularity, the
    * date range can be aligned to any day. If CohortsRange uses weekly granularity, the date range should be aligned to the week boundary, starting at Sunday and ending Saturday. If
    * CohortsRange uses monthly granularity, the date range should be aligned to the month, starting at the first and ending on the last day of the month.
    */
  var dateRange: js.UndefOr[DateRange] = js.native
  
  /** The dimension used by cohort. Only supports `firstTouchDate` for retention report. */
  var dimension: js.UndefOr[String] = js.native
  
  /**
    * Assigns a name to this cohort. The dimension `cohort` is valued to this name in a report response. If set, cannot begin with `cohort_` or `RESERVED_`. If not set, cohorts are named
    * by their zero based index `cohort_0`, `cohort_1`, etc.
    */
  var name: js.UndefOr[String] = js.native
}
object Cohort {
  
  @scala.inline
  def apply(): Cohort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cohort]
  }
  
  @scala.inline
  implicit class CohortOps[Self <: Cohort] (val x: Self) extends AnyVal {
    
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
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
