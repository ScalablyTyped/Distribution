package typings.materialMenu

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCMenuItemComponentEvent
    extends StObject
       with Event {
    
    val detail: MDCMenuItemComponentEventDetail = js.native
  }
  
  trait MDCMenuItemComponentEventDetail
    extends StObject
       with MDCMenuItemEventDetail {
    
    var item: Element
  }
  object MDCMenuItemComponentEventDetail {
    
    inline def apply(index: Double, item: Element): MDCMenuItemComponentEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCMenuItemComponentEventDetail]
    }
    
    extension [Self <: MDCMenuItemComponentEventDetail](x: Self) {
      
      inline def setItem(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MDCMenuItemEvent
    extends StObject
       with Event {
    
    val detail: MDCMenuItemEventDetail = js.native
  }
  
  trait MDCMenuItemEventDetail extends StObject {
    
    var index: Double
  }
  object MDCMenuItemEventDetail {
    
    inline def apply(index: Double): MDCMenuItemEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCMenuItemEventDetail]
    }
    
    extension [Self <: MDCMenuItemEventDetail](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
