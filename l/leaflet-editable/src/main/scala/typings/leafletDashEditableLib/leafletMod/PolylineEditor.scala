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
    continueBackward: () => scala.Unit,
    continueForward: () => scala.Unit,
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    reset: () => scala.Unit
  ): PolylineEditor = {
    val __obj = js.Dynamic.literal(continueBackward = js.Any.fromFunction0(continueBackward), continueForward = js.Any.fromFunction0(continueForward), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[PolylineEditor]
  }
}

