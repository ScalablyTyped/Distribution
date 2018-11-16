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

