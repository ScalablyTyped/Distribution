package typings.jui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var event: js.UndefOr[js.Any] = js.undefined
  
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var sort: js.UndefOr[String] = js.undefined
  
  var tpl: js.UndefOr[js.Any] = js.undefined
  
  // name, group, type
  var viewport: js.UndefOr[String] = js.undefined
}
object Items {
  
  inline def apply(): Items = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    inline def setViewport(value: String): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
