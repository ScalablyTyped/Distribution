package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CohortSpec extends StObject {
  
  /** Optional settings for a cohort report. */
  var cohortReportSettings: js.UndefOr[CohortReportSettings] = js.undefined
  
  /**
    * Defines the selection criteria to group users into cohorts. Most cohort reports define only a single cohort. If multiple cohorts are specified, each cohort can be recognized in the
    * report by their name.
    */
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.undefined
  
  /** Cohort reports follow cohorts over an extended reporting date range. This range specifies an offset duration to follow the cohorts over. */
  var cohortsRange: js.UndefOr[CohortsRange] = js.undefined
}
object CohortSpec {
  
  inline def apply(): CohortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CohortSpec] (val x: Self) extends AnyVal {
    
    inline def setCohortReportSettings(value: CohortReportSettings): Self = StObject.set(x, "cohortReportSettings", value.asInstanceOf[js.Any])
    
    inline def setCohortReportSettingsUndefined: Self = StObject.set(x, "cohortReportSettings", js.undefined)
    
    inline def setCohorts(value: js.Array[Cohort]): Self = StObject.set(x, "cohorts", value.asInstanceOf[js.Any])
    
    inline def setCohortsRange(value: CohortsRange): Self = StObject.set(x, "cohortsRange", value.asInstanceOf[js.Any])
    
    inline def setCohortsRangeUndefined: Self = StObject.set(x, "cohortsRange", js.undefined)
    
    inline def setCohortsUndefined: Self = StObject.set(x, "cohorts", js.undefined)
    
    inline def setCohortsVarargs(value: Cohort*): Self = StObject.set(x, "cohorts", js.Array(value*))
  }
}
