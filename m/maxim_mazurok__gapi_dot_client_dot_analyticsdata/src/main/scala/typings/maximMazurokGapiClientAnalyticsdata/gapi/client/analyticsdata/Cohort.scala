package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cohort extends StObject {
  
  /**
    * The cohort selects users whose first visit date is between start date and end date defined in the `dateRange`. In a cohort request, this `dateRange` is required and the `dateRanges`
    * in the `RunReportRequest` or `RunPivotReportRequest` must be unspecified. The date range should be aligned with the cohort's granularity. If CohortsRange uses daily granularity, the
    * date range can be aligned to any day. If CohortsRange uses weekly granularity, the date range should be aligned to the week boundary, starting at Sunday and ending Saturday. If
    * CohortsRange uses monthly granularity, the date range should be aligned to the month, starting at the first and ending on the last day of the month.
    */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  
  /** The dimension used by cohort. Only supports `firstTouchDate` for retention report. */
  var dimension: js.UndefOr[String] = js.undefined
  
  /**
    * Assigns a name to this cohort. The dimension `cohort` is valued to this name in a report response. If set, cannot begin with `cohort_` or `RESERVED_`. If not set, cohorts are named
    * by their zero based index `cohort_0`, `cohort_1`, etc.
    */
  var name: js.UndefOr[String] = js.undefined
}
object Cohort {
  
  @scala.inline
  def apply(): Cohort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cohort]
  }
  
  @scala.inline
  implicit class CohortMutableBuilder[Self <: Cohort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
