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
    continueBackward: js.Function0[scala.Unit],
    continueForward: js.Function0[scala.Unit],
    disable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    disableEdit: js.Function0[scala.Unit],
    editEnabled: js.Function0[scala.Boolean],
    enable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    enableEdit: js.Function0[js.Any],
    reset: js.Function0[scala.Unit],
    toggleEdit: js.Function0[scala.Unit]
  ): Polyline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continueBackward")(continueBackward)
    __obj.updateDynamic("continueForward")(continueForward)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("disableEdit")(disableEdit)
    __obj.updateDynamic("editEnabled")(editEnabled)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("enableEdit")(enableEdit)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("toggleEdit")(toggleEdit)
    __obj.asInstanceOf[Polyline]
  }
}

