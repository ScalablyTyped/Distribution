package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleSegment extends StObject {
  
  /** A list of segment filters groups which are combined with logical `AND` operator. */
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
}
object SimpleSegment {
  
  inline def apply(): SimpleSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleSegment]
  }
  
  extension [Self <: SimpleSegment](x: Self) {
    
    inline def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
    
    inline def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
    
    inline def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value*))
  }
}
