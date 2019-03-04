package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit from L.Editable.PathEditor.
  */
trait PolylineEditor extends PathEditor {
  /**
    * Set up drawing tools to continue the line backward.
    */
  def continueBackward(): scala.Unit
  /**
    * Set up drawing tools to continue the line forward.
    */
  def continueForward(): scala.Unit
}

object PolylineEditor {
  @scala.inline
  def apply(
    continueBackward: js.Function0[scala.Unit],
    continueForward: js.Function0[scala.Unit],
    disable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    enable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    reset: js.Function0[scala.Unit]
  ): PolylineEditor = {
    val __obj = js.Dynamic.literal(continueBackward = continueBackward, continueForward = continueForward, disable = disable, enable = enable, reset = reset)
  
    __obj.asInstanceOf[PolylineEditor]
  }
}

