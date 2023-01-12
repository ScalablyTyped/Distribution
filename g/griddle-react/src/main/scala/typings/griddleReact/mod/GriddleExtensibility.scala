package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddleExtensibility extends StObject {
  
  var components: js.UndefOr[GriddleComponents] = js.undefined
  
  var events: js.UndefOr[GriddleEvents] = js.undefined
  
  var listeners: js.UndefOr[PropertyBag[Listener]] = js.undefined
  
  var reducer: js.UndefOr[PropertyBag[Reducer]] = js.undefined
  
  var renderProperties: js.UndefOr[GriddleRenderProperties] = js.undefined
  
  var selectors: js.UndefOr[PropertyBag[Selector]] = js.undefined
  
  var settingsComponentObjects: js.UndefOr[PropertyBag[SettingsComponentObject]] = js.undefined
  
  var styleConfig: js.UndefOr[GriddleStyleConfig] = js.undefined
}
object GriddleExtensibility {
  
  inline def apply(): GriddleExtensibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleExtensibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GriddleExtensibility] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: GriddleComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setEvents(value: GriddleEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setListeners(value: PropertyBag[Listener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setReducer(value: PropertyBag[Reducer]): Self = StObject.set(x, "reducer", value.asInstanceOf[js.Any])
    
    inline def setReducerUndefined: Self = StObject.set(x, "reducer", js.undefined)
    
    inline def setRenderProperties(value: GriddleRenderProperties): Self = StObject.set(x, "renderProperties", value.asInstanceOf[js.Any])
    
    inline def setRenderPropertiesUndefined: Self = StObject.set(x, "renderProperties", js.undefined)
    
    inline def setSelectors(value: PropertyBag[Selector]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setSettingsComponentObjects(value: PropertyBag[SettingsComponentObject]): Self = StObject.set(x, "settingsComponentObjects", value.asInstanceOf[js.Any])
    
    inline def setSettingsComponentObjectsUndefined: Self = StObject.set(x, "settingsComponentObjects", js.undefined)
    
    inline def setStyleConfig(value: GriddleStyleConfig): Self = StObject.set(x, "styleConfig", value.asInstanceOf[js.Any])
    
    inline def setStyleConfigUndefined: Self = StObject.set(x, "styleConfig", js.undefined)
  }
}
