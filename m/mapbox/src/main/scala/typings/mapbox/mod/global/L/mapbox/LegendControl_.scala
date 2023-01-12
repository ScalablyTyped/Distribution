package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait LegendControl_ extends StObject {
  
  /**
    * Adds a legend to the legendControl.
    */
  def addLegend(legend: String): Any
  
  def onAdd(map: Map_): Any
  
  /**
    * Removes a legend from the legendControl.
    */
  def removeLegend(legend: String): Any
}
object LegendControl_ {
  
  inline def apply(addLegend: String => Any, onAdd: Map_ => Any, removeLegend: String => Any): LegendControl_ = {
    val __obj = js.Dynamic.literal(addLegend = js.Any.fromFunction1(addLegend), onAdd = js.Any.fromFunction1(onAdd), removeLegend = js.Any.fromFunction1(removeLegend))
    __obj.asInstanceOf[LegendControl_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendControl_] (val x: Self) extends AnyVal {
    
    inline def setAddLegend(value: String => Any): Self = StObject.set(x, "addLegend", js.Any.fromFunction1(value))
    
    inline def setOnAdd(value: Map_ => Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setRemoveLegend(value: String => Any): Self = StObject.set(x, "removeLegend", js.Any.fromFunction1(value))
  }
}
