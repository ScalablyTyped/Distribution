package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CohortReportSettings extends StObject {
  
  /** If true, accumulates the result from first visit day to the end day. Not supported in `RunReportRequest`. */
  var accumulate: js.UndefOr[Boolean] = js.undefined
}
object CohortReportSettings {
  
  inline def apply(): CohortReportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortReportSettings]
  }
  
  extension [Self <: CohortReportSettings](x: Self) {
    
    inline def setAccumulate(value: Boolean): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
    
    inline def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
  }
}
