package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineSupport extends StObject {
  
  var filter: js.UndefOr[typings.matrixJsSdk.mod.Filter] = js.undefined
  
  var timelineSupport: js.UndefOr[Boolean] = js.undefined
  
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined
}
object TimelineSupport {
  
  inline def apply(): TimelineSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineSupport]
  }
  
  extension [Self <: TimelineSupport](x: Self) {
    
    inline def setFilter(value: typings.matrixJsSdk.mod.Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setTimelineSupport(value: Boolean): Self = StObject.set(x, "timelineSupport", value.asInstanceOf[js.Any])
    
    inline def setTimelineSupportUndefined: Self = StObject.set(x, "timelineSupport", js.undefined)
    
    inline def setUnstableClientRelationAggregation(value: Boolean): Self = StObject.set(x, "unstableClientRelationAggregation", value.asInstanceOf[js.Any])
    
    inline def setUnstableClientRelationAggregationUndefined: Self = StObject.set(x, "unstableClientRelationAggregation", js.undefined)
  }
}
