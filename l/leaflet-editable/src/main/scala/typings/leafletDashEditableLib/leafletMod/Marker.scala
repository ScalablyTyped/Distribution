package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker
  extends EditableMixin
     with BaseEditor

object Marker {
  @scala.inline
  def apply(
    disable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    disableEdit: js.Function0[scala.Unit],
    editEnabled: js.Function0[scala.Boolean],
    enable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    enableEdit: js.Function0[js.Any],
    toggleEdit: js.Function0[scala.Unit]
  ): Marker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("disableEdit")(disableEdit)
    __obj.updateDynamic("editEnabled")(editEnabled)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("enableEdit")(enableEdit)
    __obj.updateDynamic("toggleEdit")(toggleEdit)
    __obj.asInstanceOf[Marker]
  }
}

