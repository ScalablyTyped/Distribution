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

