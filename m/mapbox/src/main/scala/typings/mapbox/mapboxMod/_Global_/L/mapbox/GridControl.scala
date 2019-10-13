package typings.mapbox.mapboxMod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Control * / any */ trait GridControl extends js.Object {
  /**
  			 * If a tooltip is currently shown by the gridControl, hide and close it.
  			 */
  def hide(): js.Any
  def onAdd(map: Map): js.Any
  def onRemove(map: Map): js.Any
  /**
  			 * Change the Mustache template used to transform the UTFGrid data in the map's interactivity into HTML for display.
  			 */
  def setTemplate(template: String): js.Any
}

object GridControl {
  @scala.inline
  def apply(hide: () => js.Any, onAdd: Map => js.Any, onRemove: Map => js.Any, setTemplate: String => js.Any): GridControl = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), setTemplate = js.Any.fromFunction1(setTemplate))
  
    __obj.asInstanceOf[GridControl]
  }
}

@JSGlobal("L.mapbox.gridControl")
@js.native
object gridControl extends js.Object {
  // GridControl
  //////////////////////////////////////////////////////////////////////
  /**
  		 * Interaction is what we call interactive parts of maps that are created with
  		 * the powerful tooltips & regions system in TileMill. Under the hood, it's powered by the open UTFGrid specification.
  		 */
  def apply(layer: String): GridControl = js.native
  def apply(layer: String, options: GridControlOptions): GridControl = js.native
}

