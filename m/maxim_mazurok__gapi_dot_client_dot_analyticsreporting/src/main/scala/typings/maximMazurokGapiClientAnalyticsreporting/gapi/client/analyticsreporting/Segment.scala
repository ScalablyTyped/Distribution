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
  
  @scala.inline
  def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicSegment(value: DynamicSegment): Self = StObject.set(x, "dynamicSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicSegmentUndefined: Self = StObject.set(x, "dynamicSegment", js.undefined)
    
    @scala.inline
    def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
  }
}
