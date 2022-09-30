package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait GridControl_ extends StObject {
  
  /**
    * If a tooltip is currently shown by the gridControl, hide and close it.
    */
  def hide(): Any
  
  def onAdd(map: Map_): Any
  
  def onRemove(map: Map_): Any
  
  /**
    * Change the Mustache template used to transform the UTFGrid data in the map's interactivity into HTML for display.
    */
  def setTemplate(template: String): Any
}
object GridControl_ {
  
  inline def apply(hide: () => Any, onAdd: Map_ => Any, onRemove: Map_ => Any, setTemplate: String => Any): GridControl_ = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), setTemplate = js.Any.fromFunction1(setTemplate))
    __obj.asInstanceOf[GridControl_]
  }
  
  extension [Self <: GridControl_](x: Self) {
    
    inline def setHide(value: () => Any): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setOnAdd(value: Map_ => Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnRemove(value: Map_ => Any): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setSetTemplate(value: String => Any): Self = StObject.set(x, "setTemplate", js.Any.fromFunction1(value))
  }
}
