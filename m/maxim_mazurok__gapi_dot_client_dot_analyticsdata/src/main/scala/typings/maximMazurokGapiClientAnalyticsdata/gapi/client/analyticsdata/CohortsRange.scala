package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CohortsRange extends StObject {
  
  /** For daily cohorts, this will be the end day offset. For weekly cohorts, this will be the week offset. */
  var endOffset: js.UndefOr[Double] = js.undefined
  
  /** Reporting date range for each cohort is calculated based on these three fields. */
  var granularity: js.UndefOr[String] = js.undefined
  
  /** For daily cohorts, this will be the start day offset. For weekly cohorts, this will be the week offset. */
  var startOffset: js.UndefOr[Double] = js.undefined
}
object CohortsRange {
  
  inline def apply(): CohortsRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortsRange]
  }
  
  extension [Self <: CohortsRange](x: Self) {
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setGranularity(value: String): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
  }
}
