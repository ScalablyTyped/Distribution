package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CohortSpec extends StObject {
  
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
  implicit class CohortSpecMutableBuilder[Self <: CohortSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCohortReportSettings(value: CohortReportSettings): Self = StObject.set(x, "cohortReportSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCohortReportSettingsUndefined: Self = StObject.set(x, "cohortReportSettings", js.undefined)
    
    @scala.inline
    def setCohorts(value: js.Array[Cohort]): Self = StObject.set(x, "cohorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCohortsRange(value: CohortsRange): Self = StObject.set(x, "cohortsRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCohortsRangeUndefined: Self = StObject.set(x, "cohortsRange", js.undefined)
    
    @scala.inline
    def setCohortsUndefined: Self = StObject.set(x, "cohorts", js.undefined)
    
    @scala.inline
    def setCohortsVarargs(value: Cohort*): Self = StObject.set(x, "cohorts", js.Array(value :_*))
  }
}
