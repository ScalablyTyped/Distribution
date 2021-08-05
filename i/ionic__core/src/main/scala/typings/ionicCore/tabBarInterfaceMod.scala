package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarInterfaceMod {
  
  trait TabBarChangedEventDetail extends StObject {
    
    var tab: js.UndefOr[String] = js.undefined
  }
  object TabBarChangedEventDetail {
    
    inline def apply(): TabBarChangedEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarChangedEventDetail]
    }
    
    extension [Self <: TabBarChangedEventDetail](x: Self) {
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
  
  trait TabButtonClickEventDetail extends StObject {
    
    var href: js.UndefOr[String] = js.undefined
    
    var selected: Boolean
    
    var tab: String
  }
  object TabButtonClickEventDetail {
    
    inline def apply(selected: Boolean, tab: String): TabButtonClickEventDetail = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabButtonClickEventDetail]
    }
    
    extension [Self <: TabButtonClickEventDetail](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.`icon-top`
    - typings.ionicCore.ionicCoreStrings.`icon-start`
    - typings.ionicCore.ionicCoreStrings.`icon-end`
    - typings.ionicCore.ionicCoreStrings.`icon-bottom`
    - typings.ionicCore.ionicCoreStrings.`icon-hide`
    - typings.ionicCore.ionicCoreStrings.`label-hide`
  */
  trait TabButtonLayout extends StObject
  object TabButtonLayout {
    
    inline def `icon-bottom`: typings.ionicCore.ionicCoreStrings.`icon-bottom` = "icon-bottom".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-bottom`]
    
    inline def `icon-end`: typings.ionicCore.ionicCoreStrings.`icon-end` = "icon-end".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-end`]
    
    inline def `icon-hide`: typings.ionicCore.ionicCoreStrings.`icon-hide` = "icon-hide".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-hide`]
    
    inline def `icon-start`: typings.ionicCore.ionicCoreStrings.`icon-start` = "icon-start".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-start`]
    
    inline def `icon-top`: typings.ionicCore.ionicCoreStrings.`icon-top` = "icon-top".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-top`]
    
    inline def `label-hide`: typings.ionicCore.ionicCoreStrings.`label-hide` = "label-hide".asInstanceOf[typings.ionicCore.ionicCoreStrings.`label-hide`]
  }
}
