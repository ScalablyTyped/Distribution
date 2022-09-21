package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingEventOrdering extends StObject {
  
  // <optional> Controls where pending messages appear in a room's timeline. If "chronological", messages will appear in the timeline
  var pendingEventOrdering: js.UndefOr[String] = js.undefined
  
  // Optional. The token which a data store can use to remember the state of the room. What this means is dependent on the store implementation.
  var storageToken: js.UndefOr[Any] = js.undefined
  
  // <optional> false Set to true to enable improved timeline support.
  var timelineSupport: js.UndefOr[Boolean] = js.undefined
  
  // <optional> false Optional. Set to true to enable client-side aggregation of event relations via `EventTimelineSet#getRelationsForEvent`.
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined
}
object PendingEventOrdering {
  
  inline def apply(): PendingEventOrdering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingEventOrdering]
  }
  
  extension [Self <: PendingEventOrdering](x: Self) {
    
    inline def setPendingEventOrdering(value: String): Self = StObject.set(x, "pendingEventOrdering", value.asInstanceOf[js.Any])
    
    inline def setPendingEventOrderingUndefined: Self = StObject.set(x, "pendingEventOrdering", js.undefined)
    
    inline def setStorageToken(value: Any): Self = StObject.set(x, "storageToken", value.asInstanceOf[js.Any])
    
    inline def setStorageTokenUndefined: Self = StObject.set(x, "storageToken", js.undefined)
    
    inline def setTimelineSupport(value: Boolean): Self = StObject.set(x, "timelineSupport", value.asInstanceOf[js.Any])
    
    inline def setTimelineSupportUndefined: Self = StObject.set(x, "timelineSupport", js.undefined)
    
    inline def setUnstableClientRelationAggregation(value: Boolean): Self = StObject.set(x, "unstableClientRelationAggregation", value.asInstanceOf[js.Any])
    
    inline def setUnstableClientRelationAggregationUndefined: Self = StObject.set(x, "unstableClientRelationAggregation", js.undefined)
  }
}
