package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit from L.Editable.PathEditor.
  */
trait PolygonEditor extends PathEditor {
  /**
    * Set up drawing tools for creating a new hole on the polygon. If the latlng param is given, a first
    * point is created.
    */
  def newHole(latlng: leafletLib.leafletMod.LatLng): scala.Unit
}

object PolygonEditor {
  @scala.inline
  def apply(
    disable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    enable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    newHole: js.Function1[leafletLib.leafletMod.LatLng, scala.Unit],
    reset: js.Function0[scala.Unit]
  ): PolygonEditor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("newHole")(newHole)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[PolygonEditor]
  }
}

