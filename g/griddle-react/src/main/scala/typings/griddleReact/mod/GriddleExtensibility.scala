package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleExtensibility extends StObject {
  
  var components: js.UndefOr[GriddleComponents] = js.native
  
  var events: js.UndefOr[GriddleEvents] = js.native
  
  var listeners: js.UndefOr[PropertyBag[Listener]] = js.native
  
  var reducer: js.UndefOr[PropertyBag[Reducer]] = js.native
  
  var renderProperties: js.UndefOr[GriddleRenderProperties] = js.native
  
  var selectors: js.UndefOr[PropertyBag[Selector]] = js.native
  
  var settingsComponentObjects: js.UndefOr[PropertyBag[SettingsComponentObject]] = js.native
  
  var styleConfig: js.UndefOr[GriddleStyleConfig] = js.native
}
object GriddleExtensibility {
  
  @scala.inline
  def apply(): GriddleExtensibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleExtensibility]
  }
  
  @scala.inline
  implicit class GriddleExtensibilityMutableBuilder[Self <: GriddleExtensibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: GriddleComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setEvents(value: GriddleEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setListeners(value: PropertyBag[Listener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    @scala.inline
    def setReducer(value: PropertyBag[Reducer]): Self = StObject.set(x, "reducer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReducerUndefined: Self = StObject.set(x, "reducer", js.undefined)
    
    @scala.inline
    def setRenderProperties(value: GriddleRenderProperties): Self = StObject.set(x, "renderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPropertiesUndefined: Self = StObject.set(x, "renderProperties", js.undefined)
    
    @scala.inline
    def setSelectors(value: PropertyBag[Selector]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    @scala.inline
    def setSettingsComponentObjects(value: PropertyBag[SettingsComponentObject]): Self = StObject.set(x, "settingsComponentObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsComponentObjectsUndefined: Self = StObject.set(x, "settingsComponentObjects", js.undefined)
    
    @scala.inline
    def setStyleConfig(value: GriddleStyleConfig): Self = StObject.set(x, "styleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleConfigUndefined: Self = StObject.set(x, "styleConfig", js.undefined)
  }
}
