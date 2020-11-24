package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ @js.native
trait LegendControl_ extends js.Object {
  
  /**
    * Adds a legend to the legendControl.
    */
  def addLegend(legend: String): js.Any = js.native
  
  def onAdd(map: Map_): js.Any = js.native
  
  /**
    * Removes a legend from the legendControl.
    */
  def removeLegend(legend: String): js.Any = js.native
}
object LegendControl_ {
  
  @scala.inline
  def apply(addLegend: String => js.Any, onAdd: Map_ => js.Any, removeLegend: String => js.Any): LegendControl_ = {
    val __obj = js.Dynamic.literal(addLegend = js.Any.fromFunction1(addLegend), onAdd = js.Any.fromFunction1(onAdd), removeLegend = js.Any.fromFunction1(removeLegend))
    __obj.asInstanceOf[LegendControl_]
  }
  
  @scala.inline
  implicit class LegendControl_Ops[Self <: LegendControl_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddLegend(value: String => js.Any): Self = this.set("addLegend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAdd(value: Map_ => js.Any): Self = this.set("onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLegend(value: String => js.Any): Self = this.set("removeLegend", js.Any.fromFunction1(value))
  }
}
