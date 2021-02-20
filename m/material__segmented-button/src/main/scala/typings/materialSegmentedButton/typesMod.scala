package typings.materialSegmentedButton

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCSegmentedButtonEvent extends Event {
    
    val detail: SegmentDetail = js.native
  }
  
  @js.native
  trait SegmentDetail extends StObject {
    
    var index: Double = js.native
    
    var segmentId: js.UndefOr[String] = js.native
    
    var selected: Boolean = js.native
  }
  object SegmentDetail {
    
    @scala.inline
    def apply(index: Double, selected: Boolean): SegmentDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentDetail]
    }
    
    @scala.inline
    implicit class SegmentDetailMutableBuilder[Self <: SegmentDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
