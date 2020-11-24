package typings.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:no-empty-interface
@js.native
trait Polyline
  extends PolylineEditor
     with EditableMixin
object Polyline {
  
  @scala.inline
  def apply(
    continueBackward: () => Unit,
    continueForward: () => Unit,
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    disableEdit: () => Unit,
    editEnabled: () => Boolean,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enableEdit: () => js.Any,
    reset: () => Unit,
    toggleEdit: () => Unit
  ): Polyline = {
    val __obj = js.Dynamic.literal(continueBackward = js.Any.fromFunction0(continueBackward), continueForward = js.Any.fromFunction0(continueForward), disable = js.Any.fromFunction0(disable), disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enable = js.Any.fromFunction0(enable), enableEdit = js.Any.fromFunction0(enableEdit), reset = js.Any.fromFunction0(reset), toggleEdit = js.Any.fromFunction0(toggleEdit))
    __obj.asInstanceOf[Polyline]
  }
}
