package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CohortGroup extends js.Object {
  
  /** The definition for the cohort. */
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.native
  
  /**
    * Enable Life Time Value (LTV). LTV measures lifetime value for users acquired through different channels. Please see: [Cohort
    * Analysis](https://support.google.com/analytics/answer/6074676) and [Lifetime Value](https://support.google.com/analytics/answer/6182550) If the value of lifetimeValue is false: -
    * The metric values are similar to the values in the web interface cohort report. - The cohort definition date ranges must be aligned to the calendar week and month. i.e. while
    * requesting `ga:cohortNthWeek` the `startDate` in the cohort definition should be a Sunday and the `endDate` should be the following Saturday, and for `ga:cohortNthMonth`, the
    * `startDate` should be the 1st of the month and `endDate` should be the last day of the month. When the lifetimeValue is true: - The metric values will correspond to the values in
    * the web interface LifeTime value report. - The Lifetime Value report shows you how user value (Revenue) and engagement (Appviews, Goal Completions, Sessions, and Session Duration)
    * grow during the 90 days after a user is acquired. - The metrics are calculated as a cumulative average per user per the time increment. - The cohort definition date ranges need not
    * be aligned to the calendar week and month boundaries. - The `viewId` must be an [app view ID](https://support.google.com/analytics/answer/2649553#WebVersusAppViews)
    */
  var lifetimeValue: js.UndefOr[Boolean] = js.native
}
object CohortGroup {
  
  @scala.inline
  def apply(): CohortGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortGroup]
  }
  
  @scala.inline
  implicit class CohortGroupOps[Self <: CohortGroup] (val x: Self) extends AnyVal {
    
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
    def setCohortsVarargs(value: Cohort*): Self = this.set("cohorts", js.Array(value :_*))
    
    @scala.inline
    def setCohorts(value: js.Array[Cohort]): Self = this.set("cohorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCohorts: Self = this.set("cohorts", js.undefined)
    
    @scala.inline
    def setLifetimeValue(value: Boolean): Self = this.set("lifetimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetimeValue: Self = this.set("lifetimeValue", js.undefined)
  }
}
