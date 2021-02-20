package typings.materialTabs

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCTabBarChangeEvent extends Event {
    
    val detail: MDCTabBarChangeEventDetail = js.native
  }
  
  @js.native
  trait MDCTabBarChangeEventDetail extends StObject {
    
    var activeTabIndex: Double = js.native
  }
  object MDCTabBarChangeEventDetail {
    
    @scala.inline
    def apply(activeTabIndex: Double): MDCTabBarChangeEventDetail = {
      val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabBarChangeEventDetail]
    }
    
    @scala.inline
    implicit class MDCTabBarChangeEventDetailMutableBuilder[Self <: MDCTabBarChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    }
  }
}
