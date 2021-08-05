package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  /** A dynamic segment definition in the request. */
  var dynamicSegment: js.UndefOr[DynamicSegment] = js.undefined
  
  /** The segment ID of a built-in or custom segment, for example `gaid::-3`. */
  var segmentId: js.UndefOr[String] = js.undefined
}
object Segment {
  
  inline def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  
  extension [Self <: Segment](x: Self) {
    
    inline def setDynamicSegment(value: DynamicSegment): Self = StObject.set(x, "dynamicSegment", value.asInstanceOf[js.Any])
    
    inline def setDynamicSegmentUndefined: Self = StObject.set(x, "dynamicSegment", js.undefined)
    
    inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
  }
}
