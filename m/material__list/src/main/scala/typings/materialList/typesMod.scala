package typings.materialList

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCListActionEvent
    extends StObject
       with Event {
    
    var detail: MDCListActionEventDetail = js.native
  }
  
  trait MDCListActionEventDetail extends StObject {
    
    /**
      * Index of the list item that was activated.
      */
    var index: Double
  }
  object MDCListActionEventDetail {
    
    inline def apply(index: Double): MDCListActionEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCListActionEventDetail]
    }
    
    extension [Self <: MDCListActionEventDetail](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type MDCListIndex = Double | js.Array[Double]
  
  trait MDCListTextAndIndex extends StObject {
    
    var index: Double
    
    var text: String
  }
  object MDCListTextAndIndex {
    
    inline def apply(index: Double, text: String): MDCListTextAndIndex = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCListTextAndIndex]
    }
    
    extension [Self <: MDCListTextAndIndex](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
