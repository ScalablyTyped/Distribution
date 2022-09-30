package typings.griddleReact.mod

import typings.griddleReact.anon.FilterPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined 
- typings.griddleReact.mod.GriddleInitialState because Inheritance from two classes. Inlined enableSettings, pageProperties, sortMethod, sortProperties, textProperties */ trait GriddleProps[T]
  extends StObject
     with GriddlePlugin {
  
  var core: js.UndefOr[GriddlePlugin] = js.undefined
  
  var data: js.UndefOr[js.Array[T]] = js.undefined
  
  var enableSettings: js.UndefOr[Boolean] = js.undefined
  
  var pageProperties: js.UndefOr[GriddlePageProperties] = js.undefined
  
  var plugins: js.UndefOr[js.Array[GriddlePlugin]] = js.undefined
  
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[Any], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  
  var sortProperties: js.UndefOr[js.Array[GriddleSortKey]] = js.undefined
  
  var storeKey: js.UndefOr[String] = js.undefined
  
  var textProperties: js.UndefOr[FilterPlaceholder] = js.undefined
}
object GriddleProps {
  
  inline def apply[T](): GriddleProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleProps[T]]
  }
  
  extension [Self <: GriddleProps[?], T](x: Self & GriddleProps[T]) {
    
    inline def setCore(value: GriddlePlugin): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    inline def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEnableSettings(value: Boolean): Self = StObject.set(x, "enableSettings", value.asInstanceOf[js.Any])
    
    inline def setEnableSettingsUndefined: Self = StObject.set(x, "enableSettings", js.undefined)
    
    inline def setPageProperties(value: GriddlePageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
    
    inline def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
    
    inline def setPlugins(value: js.Array[GriddlePlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: GriddlePlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setSortMethod(
      value: (/* data */ js.Array[Any], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "sortMethod", js.Any.fromFunction3(value))
    
    inline def setSortMethodUndefined: Self = StObject.set(x, "sortMethod", js.undefined)
    
    inline def setSortProperties(value: js.Array[GriddleSortKey]): Self = StObject.set(x, "sortProperties", value.asInstanceOf[js.Any])
    
    inline def setSortPropertiesUndefined: Self = StObject.set(x, "sortProperties", js.undefined)
    
    inline def setSortPropertiesVarargs(value: GriddleSortKey*): Self = StObject.set(x, "sortProperties", js.Array(value*))
    
    inline def setStoreKey(value: String): Self = StObject.set(x, "storeKey", value.asInstanceOf[js.Any])
    
    inline def setStoreKeyUndefined: Self = StObject.set(x, "storeKey", js.undefined)
    
    inline def setTextProperties(value: FilterPlaceholder): Self = StObject.set(x, "textProperties", value.asInstanceOf[js.Any])
    
    inline def setTextPropertiesUndefined: Self = StObject.set(x, "textProperties", js.undefined)
  }
}
