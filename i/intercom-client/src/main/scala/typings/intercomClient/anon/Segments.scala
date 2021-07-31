package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.segmentDotlist
import typings.intercomClient.userMod.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segments extends StObject {
  
  var segments: js.Array[Segment]
  
  var `type`: segmentDotlist
}
object Segments {
  
  @scala.inline
  def apply(segments: js.Array[Segment]): Segments = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("segment.list")
    __obj.asInstanceOf[Segments]
  }
  
  @scala.inline
  implicit class SegmentsMutableBuilder[Self <: Segments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setType(value: segmentDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
