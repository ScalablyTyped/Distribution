package typings.griddleReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.anon.FilterPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddleInitialState
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  var enableSettings: js.UndefOr[Boolean] = js.undefined
  
  var pageProperties: js.UndefOr[GriddlePageProperties] = js.undefined
  
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[Any], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  
  var sortProperties: js.UndefOr[js.Array[GriddleSortKey]] = js.undefined
  
  var textProperties: js.UndefOr[FilterPlaceholder] = js.undefined
}
object GriddleInitialState {
  
  inline def apply(): GriddleInitialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleInitialState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GriddleInitialState] (val x: Self) extends AnyVal {
    
    inline def setEnableSettings(value: Boolean): Self = StObject.set(x, "enableSettings", value.asInstanceOf[js.Any])
    
    inline def setEnableSettingsUndefined: Self = StObject.set(x, "enableSettings", js.undefined)
    
    inline def setPageProperties(value: GriddlePageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
    
    inline def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
    
    inline def setSortMethod(
      value: (/* data */ js.Array[Any], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "sortMethod", js.Any.fromFunction3(value))
    
    inline def setSortMethodUndefined: Self = StObject.set(x, "sortMethod", js.undefined)
    
    inline def setSortProperties(value: js.Array[GriddleSortKey]): Self = StObject.set(x, "sortProperties", value.asInstanceOf[js.Any])
    
    inline def setSortPropertiesUndefined: Self = StObject.set(x, "sortProperties", js.undefined)
    
    inline def setSortPropertiesVarargs(value: GriddleSortKey*): Self = StObject.set(x, "sortProperties", js.Array(value*))
    
    inline def setTextProperties(value: FilterPlaceholder): Self = StObject.set(x, "textProperties", value.asInstanceOf[js.Any])
    
    inline def setTextPropertiesUndefined: Self = StObject.set(x, "textProperties", js.undefined)
  }
}
