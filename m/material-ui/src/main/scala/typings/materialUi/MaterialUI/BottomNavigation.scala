package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomNavigation {
  
  type BottomNavigation = Component[BottomNavigationProps, js.Object, js.Any]
  
  @js.native
  trait BottomNavigationItem
    extends Component[BottomNavigationItemProps, js.Object, js.Any]
  
  trait BottomNavigationItemProps
    extends StObject
       with SharedEnhancedButtonProps[BottomNavigationItem] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
  }
  object BottomNavigationItemProps {
    
    inline def apply(): BottomNavigationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BottomNavigationItemProps]
    }
    
    extension [Self <: BottomNavigationItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait BottomNavigationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object BottomNavigationProps {
    
    inline def apply(): BottomNavigationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BottomNavigationProps]
    }
    
    extension [Self <: BottomNavigationProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
