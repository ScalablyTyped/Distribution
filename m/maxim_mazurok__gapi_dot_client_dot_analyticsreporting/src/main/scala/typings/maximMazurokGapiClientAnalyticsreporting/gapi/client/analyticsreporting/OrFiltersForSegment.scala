package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrFiltersForSegment extends StObject {
  
  /** List of segment filters to be combined with a `OR` operator. */
  var segmentFilterClauses: js.UndefOr[js.Array[SegmentFilterClause]] = js.undefined
}
object OrFiltersForSegment {
  
  inline def apply(): OrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrFiltersForSegment]
  }
  
  extension [Self <: OrFiltersForSegment](x: Self) {
    
    inline def setSegmentFilterClauses(value: js.Array[SegmentFilterClause]): Self = StObject.set(x, "segmentFilterClauses", value.asInstanceOf[js.Any])
    
    inline def setSegmentFilterClausesUndefined: Self = StObject.set(x, "segmentFilterClauses", js.undefined)
    
    inline def setSegmentFilterClausesVarargs(value: SegmentFilterClause*): Self = StObject.set(x, "segmentFilterClauses", js.Array(value*))
  }
}
