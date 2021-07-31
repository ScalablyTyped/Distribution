package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait LegendControl_ extends StObject {
  
  /**
    * Adds a legend to the legendControl.
    */
  def addLegend(legend: String): js.Any
  
  def onAdd(map: Map_): js.Any
  
  /**
    * Removes a legend from the legendControl.
    */
  def removeLegend(legend: String): js.Any
}
object LegendControl_ {
  
  @scala.inline
  def apply(addLegend: String => js.Any, onAdd: Map_ => js.Any, removeLegend: String => js.Any): LegendControl_ = {
    val __obj = js.Dynamic.literal(addLegend = js.Any.fromFunction1(addLegend), onAdd = js.Any.fromFunction1(onAdd), removeLegend = js.Any.fromFunction1(removeLegend))
    __obj.asInstanceOf[LegendControl_]
  }
  
  @scala.inline
  implicit class LegendControl_MutableBuilder[Self <: LegendControl_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLegend(value: String => js.Any): Self = StObject.set(x, "addLegend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAdd(value: Map_ => js.Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLegend(value: String => js.Any): Self = StObject.set(x, "removeLegend", js.Any.fromFunction1(value))
  }
}
