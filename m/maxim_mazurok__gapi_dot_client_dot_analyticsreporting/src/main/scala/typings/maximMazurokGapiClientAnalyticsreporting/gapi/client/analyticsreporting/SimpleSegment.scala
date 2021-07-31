package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleSegment extends StObject {
  
  /** A list of segment filters groups which are combined with logical `AND` operator. */
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
}
object SimpleSegment {
  
  @scala.inline
  def apply(): SimpleSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleSegment]
  }
  
  @scala.inline
  implicit class SimpleSegmentMutableBuilder[Self <: SimpleSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
    
    @scala.inline
    def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value :_*))
  }
}
