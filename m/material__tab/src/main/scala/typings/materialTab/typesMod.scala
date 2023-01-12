package typings.materialTab

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCTabDimensions extends StObject {
    
    var contentLeft: Double
    
    var contentRight: Double
    
    var rootLeft: Double
    
    var rootRight: Double
  }
  object MDCTabDimensions {
    
    inline def apply(contentLeft: Double, contentRight: Double, rootLeft: Double, rootRight: Double): MDCTabDimensions = {
      val __obj = js.Dynamic.literal(contentLeft = contentLeft.asInstanceOf[js.Any], contentRight = contentRight.asInstanceOf[js.Any], rootLeft = rootLeft.asInstanceOf[js.Any], rootRight = rootRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabDimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCTabDimensions] (val x: Self) extends AnyVal {
      
      inline def setContentLeft(value: Double): Self = StObject.set(x, "contentLeft", value.asInstanceOf[js.Any])
      
      inline def setContentRight(value: Double): Self = StObject.set(x, "contentRight", value.asInstanceOf[js.Any])
      
      inline def setRootLeft(value: Double): Self = StObject.set(x, "rootLeft", value.asInstanceOf[js.Any])
      
      inline def setRootRight(value: Double): Self = StObject.set(x, "rootRight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MDCTabInteractionEvent
    extends StObject
       with Event {
    
    val detail: MDCTabInteractionEventDetail = js.native
  }
  
  trait MDCTabInteractionEventDetail extends StObject {
    
    var tabId: String
  }
  object MDCTabInteractionEventDetail {
    
    inline def apply(tabId: String): MDCTabInteractionEventDetail = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabInteractionEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCTabInteractionEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
}
