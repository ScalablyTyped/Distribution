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
    disable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    disableEdit: js.Function0[scala.Unit],
    editEnabled: js.Function0[scala.Boolean],
    enable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    enableEdit: js.Function0[js.Any],
    newHole: js.Function1[leafletLib.leafletMod.LatLng, scala.Unit],
    reset: js.Function0[scala.Unit],
    toggleEdit: js.Function0[scala.Unit]
  ): Polygon = {
    val __obj = js.Dynamic.literal(disable = disable, disableEdit = disableEdit, editEnabled = editEnabled, enable = enable, enableEdit = enableEdit, newHole = newHole, reset = reset, toggleEdit = toggleEdit)
  
    __obj.asInstanceOf[Polygon]
  }
}

