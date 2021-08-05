package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentDefinition extends StObject {
  
  /** A segment is defined by a set of segment filters which are combined together with a logical `AND` operation. */
  var segmentFilters: js.UndefOr[js.Array[SegmentFilter]] = js.undefined
}
object SegmentDefinition {
  
  inline def apply(): SegmentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDefinition]
  }
  
  extension [Self <: SegmentDefinition](x: Self) {
    
    inline def setSegmentFilters(value: js.Array[SegmentFilter]): Self = StObject.set(x, "segmentFilters", value.asInstanceOf[js.Any])
    
    inline def setSegmentFiltersUndefined: Self = StObject.set(x, "segmentFilters", js.undefined)
    
    inline def setSegmentFiltersVarargs(value: SegmentFilter*): Self = StObject.set(x, "segmentFilters", js.Array(value :_*))
  }
}
