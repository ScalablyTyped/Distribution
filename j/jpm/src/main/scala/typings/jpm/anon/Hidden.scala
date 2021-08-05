package typings.jpm.anon

import typings.jpm.toolbarMod.Toolbar
import typings.jpm.toolbarMod.ToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hidden extends StObject {
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var items: js.Array[ToolbarItem]
  
  var onAttach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, js.Any]] = js.undefined
  
  var onDetach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, js.Any]] = js.undefined
  
  var onHide: js.UndefOr[js.Function1[/* toolbar */ Toolbar, js.Any]] = js.undefined
  
  var onShow: js.UndefOr[js.Function1[/* toolbar */ Toolbar, js.Any]] = js.undefined
  
  var title: String
}
object Hidden {
  
  inline def apply(items: js.Array[ToolbarItem], title: String): Hidden = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  
  extension [Self <: Hidden](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setItems(value: js.Array[ToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ToolbarItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setOnAttach(value: /* toolbar */ Toolbar => js.Any): Self = StObject.set(x, "onAttach", js.Any.fromFunction1(value))
    
    inline def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
    
    inline def setOnDetach(value: /* toolbar */ Toolbar => js.Any): Self = StObject.set(x, "onDetach", js.Any.fromFunction1(value))
    
    inline def setOnDetachUndefined: Self = StObject.set(x, "onDetach", js.undefined)
    
    inline def setOnHide(value: /* toolbar */ Toolbar => js.Any): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: /* toolbar */ Toolbar => js.Any): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
