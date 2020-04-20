package typings.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait LegendControl_ extends js.Object {
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
}

