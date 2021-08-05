package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CohortSpec extends StObject {
  
  /** Settings of a cohort report. */
  var cohortReportSettings: js.UndefOr[CohortReportSettings] = js.undefined
  
  /** The definition for the cohorts. */
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.undefined
  
  /** The data ranges of cohorts. */
  var cohortsRange: js.UndefOr[CohortsRange] = js.undefined
}
object CohortSpec {
  
  inline def apply(): CohortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortSpec]
  }
  
  extension [Self <: CohortSpec](x: Self) {
    
    inline def setCohortReportSettings(value: CohortReportSettings): Self = StObject.set(x, "cohortReportSettings", value.asInstanceOf[js.Any])
    
    inline def setCohortReportSettingsUndefined: Self = StObject.set(x, "cohortReportSettings", js.undefined)
    
    inline def setCohorts(value: js.Array[Cohort]): Self = StObject.set(x, "cohorts", value.asInstanceOf[js.Any])
    
    inline def setCohortsRange(value: CohortsRange): Self = StObject.set(x, "cohortsRange", value.asInstanceOf[js.Any])
    
    inline def setCohortsRangeUndefined: Self = StObject.set(x, "cohortsRange", js.undefined)
    
    inline def setCohortsUndefined: Self = StObject.set(x, "cohorts", js.undefined)
    
    inline def setCohortsVarargs(value: Cohort*): Self = StObject.set(x, "cohorts", js.Array(value :_*))
  }
}
