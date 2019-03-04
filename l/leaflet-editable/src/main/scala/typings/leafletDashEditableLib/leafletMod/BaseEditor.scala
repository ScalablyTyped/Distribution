package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When editing a feature (marker, polyline…), an editor is attached to it. This editor basically knows
  * how to handle the edition.
  */
trait BaseEditor extends js.Object {
  /**
    * Remove editing tools.
    */
  def disable(): MarkerEditor | PolylineEditor | PolygonEditor
  /**
    * Set up the drawing tools for the feature to be editable.
    */
  def enable(): MarkerEditor | PolylineEditor | PolygonEditor
}

object BaseEditor {
  @scala.inline
  def apply(
    disable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor],
    enable: js.Function0[MarkerEditor | PolylineEditor | PolygonEditor]
  ): BaseEditor = {
    val __obj = js.Dynamic.literal(disable = disable, enable = enable)
  
    __obj.asInstanceOf[BaseEditor]
  }
}

