package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon
  extends PolygonEditor
     with EditableMixin

object Polygon {
  @scala.inline
  def apply(
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    disableEdit: () => scala.Unit,
    editEnabled: () => scala.Boolean,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enableEdit: () => js.Any,
    newHole: leafletLib.leafletMod.LatLng => scala.Unit,
    reset: () => scala.Unit,
    toggleEdit: () => scala.Unit
  ): Polygon = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enable = js.Any.fromFunction0(enable), enableEdit = js.Any.fromFunction0(enableEdit), newHole = js.Any.fromFunction1(newHole), reset = js.Any.fromFunction0(reset), toggleEdit = js.Any.fromFunction0(toggleEdit))
  
    __obj.asInstanceOf[Polygon]
  }
}

