package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CohortSpec extends js.Object {
  
  /** Settings of a cohort report. */
  var cohortReportSettings: js.UndefOr[CohortReportSettings] = js.native
  
  /** The definition for the cohorts. */
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.native
  
  /** The data ranges of cohorts. */
  var cohortsRange: js.UndefOr[CohortsRange] = js.native
}
object CohortSpec {
  
  @scala.inline
  def apply(): CohortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortSpec]
  }
  
  @scala.inline
  implicit class CohortSpecOps[Self <: CohortSpec] (val x: Self) extends AnyVal {
    
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
    def setCohortReportSettings(value: CohortReportSettings): Self = this.set("cohortReportSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCohortReportSettings: Self = this.set("cohortReportSettings", js.undefined)
    
    @scala.inline
    def setCohortsVarargs(value: Cohort*): Self = this.set("cohorts", js.Array(value :_*))
    
    @scala.inline
    def setCohorts(value: js.Array[Cohort]): Self = this.set("cohorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCohorts: Self = this.set("cohorts", js.undefined)
    
    @scala.inline
    def setCohortsRange(value: CohortsRange): Self = this.set("cohortsRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCohortsRange: Self = this.set("cohortsRange", js.undefined)
  }
}
