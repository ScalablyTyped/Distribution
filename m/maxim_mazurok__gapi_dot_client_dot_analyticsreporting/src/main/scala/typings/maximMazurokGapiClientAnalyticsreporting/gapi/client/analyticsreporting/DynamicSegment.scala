package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicSegment extends StObject {
  
  /** The name of the dynamic segment. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Session Segment to select sessions to include in the segment. */
  var sessionSegment: js.UndefOr[SegmentDefinition] = js.undefined
  
  /** User Segment to select users to include in the segment. */
  var userSegment: js.UndefOr[SegmentDefinition] = js.undefined
}
object DynamicSegment {
  
  inline def apply(): DynamicSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicSegment] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSessionSegment(value: SegmentDefinition): Self = StObject.set(x, "sessionSegment", value.asInstanceOf[js.Any])
    
    inline def setSessionSegmentUndefined: Self = StObject.set(x, "sessionSegment", js.undefined)
    
    inline def setUserSegment(value: SegmentDefinition): Self = StObject.set(x, "userSegment", value.asInstanceOf[js.Any])
    
    inline def setUserSegmentUndefined: Self = StObject.set(x, "userSegment", js.undefined)
  }
}
