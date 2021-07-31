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
    
    @scala.inline
    def apply(index: Double, item: Element): MDCMenuItemComponentEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCMenuItemComponentEventDetail]
    }
    
    @scala.inline
    implicit class MDCMenuItemComponentEventDetailMutableBuilder[Self <: MDCMenuItemComponentEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(index: Double): MDCMenuItemEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCMenuItemEventDetail]
    }
    
    @scala.inline
    implicit class MDCMenuItemEventDetailMutableBuilder[Self <: MDCMenuItemEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
