package typings.materialTabs

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarTypesMod {
  
  @js.native
  trait MDCTabBarChangeEvent
    extends StObject
       with Event {
    
    val detail: MDCTabBarChangeEventDetail = js.native
  }
  
  trait MDCTabBarChangeEventDetail extends StObject {
    
    var activeTabIndex: Double
  }
  object MDCTabBarChangeEventDetail {
    
    inline def apply(activeTabIndex: Double): MDCTabBarChangeEventDetail = {
      val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabBarChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCTabBarChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    }
  }
}
