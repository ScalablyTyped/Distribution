package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.asc
import typings.materialUiCore.materialUiCoreStrings.desc
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var IconComponent: js.UndefOr[ComponentType[ClassName]] = js.undefined
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  var hideSortIcon: js.UndefOr[Boolean] = js.undefined
}
object Direction {
  
  inline def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHideSortIcon(value: Boolean): Self = StObject.set(x, "hideSortIcon", value.asInstanceOf[js.Any])
    
    inline def setHideSortIconUndefined: Self = StObject.set(x, "hideSortIcon", js.undefined)
    
    inline def setIconComponent(value: ComponentType[ClassName]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
    
    inline def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
  }
}
