package typings.materialToolbar

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCToolbarEvent
    extends StObject
       with Event {
    
    val detail: MDCToolbarEventDetail = js.native
  }
  
  trait MDCToolbarEventDetail extends StObject {
    
    var flexibleExpansionRatio: Double
  }
  object MDCToolbarEventDetail {
    
    inline def apply(flexibleExpansionRatio: Double): MDCToolbarEventDetail = {
      val __obj = js.Dynamic.literal(flexibleExpansionRatio = flexibleExpansionRatio.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCToolbarEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCToolbarEventDetail] (val x: Self) extends AnyVal {
      
      inline def setFlexibleExpansionRatio(value: Double): Self = StObject.set(x, "flexibleExpansionRatio", value.asInstanceOf[js.Any])
    }
  }
}
