package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-empty-interface
trait Polyline
  extends PolylineEditor
     with EditableMixin

object Polyline {
  @scala.inline
  def apply(
    continueBackward: () => scala.Unit,
    continueForward: () => scala.Unit,
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    disableEdit: () => scala.Unit,
    editEnabled: () => scala.Boolean,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enableEdit: () => js.Any,
    reset: () => scala.Unit,
    toggleEdit: () => scala.Unit
  ): Polyline = {
    val __obj = js.Dynamic.literal(continueBackward = js.Any.fromFunction0(continueBackward), continueForward = js.Any.fromFunction0(continueForward), disable = js.Any.fromFunction0(disable), disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enable = js.Any.fromFunction0(enable), enableEdit = js.Any.fromFunction0(enableEdit), reset = js.Any.fromFunction0(reset), toggleEdit = js.Any.fromFunction0(toggleEdit))
  
    __obj.asInstanceOf[Polyline]
  }
}

