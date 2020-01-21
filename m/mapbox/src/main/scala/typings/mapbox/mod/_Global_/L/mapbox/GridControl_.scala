package typings.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait GridControl_ extends js.Object {
  /**
  			 * If a tooltip is currently shown by the gridControl, hide and close it.
  			 */
  def hide(): js.Any
  def onAdd(map: Map_): js.Any
  def onRemove(map: Map_): js.Any
  /**
  			 * Change the Mustache template used to transform the UTFGrid data in the map's interactivity into HTML for display.
  			 */
  def setTemplate(template: String): js.Any
}

object GridControl_ {
  @scala.inline
  def apply(hide: () => js.Any, onAdd: Map_ => js.Any, onRemove: Map_ => js.Any, setTemplate: String => js.Any): GridControl_ = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), setTemplate = js.Any.fromFunction1(setTemplate))
  
    __obj.asInstanceOf[GridControl_]
  }
}

