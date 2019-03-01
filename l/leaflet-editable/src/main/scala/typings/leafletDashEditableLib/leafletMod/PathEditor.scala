package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit from L.Editable.BaseEditor.
  * Inherited by L.Editable.PolylineEditor and L.Editable.PolygonEditor.
  */
trait PathEditor extends BaseEditor {
  /**
    * Rebuild edit elements (vertex, middlemarker, etc.).
    */
  def reset(): scala.Unit
}

object PathEditor {
  @scala.inline
  def apply(
    disable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    enable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    reset: js.Function0[scala.Unit]
  ): PathEditor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[PathEditor]
  }
}

