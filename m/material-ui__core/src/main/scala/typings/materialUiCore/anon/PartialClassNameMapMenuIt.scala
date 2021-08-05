package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MenuItem/MenuItem.MenuItemClassKey>> */
trait PartialClassNameMapMenuIt extends StObject {
  
  var gutters: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapMenuIt {
  
  inline def apply(): PartialClassNameMapMenuIt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapMenuIt]
  }
  
  extension [Self <: PartialClassNameMapMenuIt](x: Self) {
    
    inline def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
