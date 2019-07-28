package typings.leafletDashEditable.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker
  extends EditableMixin
     with BaseEditor

object Marker {
  @scala.inline
  def apply(
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    disableEdit: () => Unit,
    editEnabled: () => Boolean,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enableEdit: () => js.Any,
    toggleEdit: () => Unit
  ): Marker = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enable = js.Any.fromFunction0(enable), enableEdit = js.Any.fromFunction0(enableEdit), toggleEdit = js.Any.fromFunction0(toggleEdit))
  
    __obj.asInstanceOf[Marker]
  }
}

