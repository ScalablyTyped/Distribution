package typings.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait InfoControl_ extends js.Object {
  /**
  			 * Adds an info string to infoControl.
  			 */
  def addInfo(info: String): js.Any
  def onAdd(map: Map_): js.Any
  def onRemove(map: Map_): js.Any
  /**
  			 * Removes an info string from infoControl
  			 */
  def removeInfo(info: String): js.Any
}

object InfoControl_ {
  @scala.inline
  def apply(
    addInfo: String => js.Any,
    onAdd: Map_ => js.Any,
    onRemove: Map_ => js.Any,
    removeInfo: String => js.Any
  ): InfoControl_ = {
    val __obj = js.Dynamic.literal(addInfo = js.Any.fromFunction1(addInfo), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), removeInfo = js.Any.fromFunction1(removeInfo))
    __obj.asInstanceOf[InfoControl_]
  }
}

