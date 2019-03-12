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
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    newHole: leafletLib.leafletMod.LatLng => scala.Unit,
    reset: () => scala.Unit
  ): PolygonEditor = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), newHole = js.Any.fromFunction1(newHole), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[PolygonEditor]
  }
}

