package typings.intercomClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segmentid extends StObject {
  
  var segment_id: js.UndefOr[String] = js.undefined
  
  var tag_id: js.UndefOr[String] = js.undefined
}
object Segmentid {
  
  @scala.inline
  def apply(): Segmentid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segmentid]
  }
  
  @scala.inline
  implicit class SegmentidMutableBuilder[Self <: Segmentid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegment_id(value: String): Self = StObject.set(x, "segment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegment_idUndefined: Self = StObject.set(x, "segment_id", js.undefined)
    
    @scala.inline
    def setTag_id(value: String): Self = StObject.set(x, "tag_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag_idUndefined: Self = StObject.set(x, "tag_id", js.undefined)
  }
}
