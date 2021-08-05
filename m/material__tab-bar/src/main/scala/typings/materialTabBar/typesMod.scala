package typings.materialTabBar

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCTabBarActivatedEvent
    extends StObject
       with Event {
    
    val detail: MDCTabBarActivatedEventDetail = js.native
  }
  
  trait MDCTabBarActivatedEventDetail extends StObject {
    
    var index: Double
  }
  object MDCTabBarActivatedEventDetail {
    
    inline def apply(index: Double): MDCTabBarActivatedEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabBarActivatedEventDetail]
    }
    
    extension [Self <: MDCTabBarActivatedEventDetail](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
