package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nestedHeaders {
  
  @js.native
  trait NestedHeader extends StObject {
    
    var colspan: Double = js.native
    
    var label: String = js.native
  }
  object NestedHeader {
    
    @scala.inline
    def apply(colspan: Double, label: String): NestedHeader = {
      val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedHeader]
    }
    
    @scala.inline
    implicit class NestedHeaderMutableBuilder[Self <: NestedHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
}
