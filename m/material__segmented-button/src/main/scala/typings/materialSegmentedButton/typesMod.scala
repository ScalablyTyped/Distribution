package typings.materialSegmentedButton

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCSegmentedButtonEvent
    extends StObject
       with Event {
    
    val detail: SegmentDetail = js.native
  }
  
  trait SegmentDetail extends StObject {
    
    var index: Double
    
    var segmentId: js.UndefOr[String] = js.undefined
    
    var selected: Boolean
  }
  object SegmentDetail {
    
    inline def apply(index: Double, selected: Boolean): SegmentDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentDetail] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
      
      inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
