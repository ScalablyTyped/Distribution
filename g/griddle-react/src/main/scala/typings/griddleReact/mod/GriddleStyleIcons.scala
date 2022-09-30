package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddleStyleIcons extends StObject {
  
  var sortAscendingIcon: js.UndefOr[Any] = js.undefined
  
  var sortDescendingIcon: js.UndefOr[Any] = js.undefined
}
object GriddleStyleIcons {
  
  inline def apply(): GriddleStyleIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleIcons]
  }
  
  extension [Self <: GriddleStyleIcons](x: Self) {
    
    inline def setSortAscendingIcon(value: Any): Self = StObject.set(x, "sortAscendingIcon", value.asInstanceOf[js.Any])
    
    inline def setSortAscendingIconUndefined: Self = StObject.set(x, "sortAscendingIcon", js.undefined)
    
    inline def setSortDescendingIcon(value: Any): Self = StObject.set(x, "sortDescendingIcon", value.asInstanceOf[js.Any])
    
    inline def setSortDescendingIconUndefined: Self = StObject.set(x, "sortDescendingIcon", js.undefined)
  }
}
