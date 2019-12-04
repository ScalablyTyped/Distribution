package typings.mapbox.mapboxMod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait InfoControl extends js.Object {
  /**
  			 * Adds an info string to infoControl.
  			 */
  def addInfo(info: String): js.Any
  def onAdd(map: Map): js.Any
  def onRemove(map: Map): js.Any
  /**
  			 * Removes an info string from infoControl
  			 */
  def removeInfo(info: String): js.Any
}

object InfoControl {
  @scala.inline
  def apply(
    addInfo: String => js.Any,
    onAdd: Map => js.Any,
    onRemove: Map => js.Any,
    removeInfo: String => js.Any
  ): InfoControl = {
    val __obj = js.Dynamic.literal(addInfo = js.Any.fromFunction1(addInfo), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), removeInfo = js.Any.fromFunction1(removeInfo))
  
    __obj.asInstanceOf[InfoControl]
  }
}

@JSGlobal("L.mapbox.infoControl")
@js.native
object infoControl extends js.Object {
  // InfoControl
  //////////////////////////////////////////////////////////////////////
  /**
  		 * A map control that shows a toggleable info container. If set, attribution is auto-detected from active layers and added to the info container.
  		 */
  def apply(): InfoControl = js.native
  def apply(options: ControlOptions): InfoControl = js.native
}

