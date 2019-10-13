package typings.mapbox.mapboxMod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Control * / any */ trait LegendControl extends js.Object {
  /**
  			 * Adds a legend to the legendControl.
  			 */
  def addLegend(legend: String): js.Any
  def onAdd(map: Map): js.Any
  /**
  			 * Removes a legend from the legendControl.
  			 */
  def removeLegend(legend: String): js.Any
}

object LegendControl {
  @scala.inline
  def apply(addLegend: String => js.Any, onAdd: Map => js.Any, removeLegend: String => js.Any): LegendControl = {
    val __obj = js.Dynamic.literal(addLegend = js.Any.fromFunction1(addLegend), onAdd = js.Any.fromFunction1(onAdd), removeLegend = js.Any.fromFunction1(removeLegend))
  
    __obj.asInstanceOf[LegendControl]
  }
}

@JSGlobal("L.mapbox.legendControl")
@js.native
object legendControl extends js.Object {
  // LegendControl
  //////////////////////////////////////////////////////////////////////
  /**
  		 * A map control that shows legends added to maps in Mapbox.
  		 * Legends are auto-detected from active layers.
  		 */
  def apply(): LegendControl = js.native
  def apply(options: ControlOptions): LegendControl = js.native
}

