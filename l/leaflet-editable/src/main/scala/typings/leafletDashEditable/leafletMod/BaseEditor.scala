package typings.leafletDashEditable.leafletMod

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
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor
  ): BaseEditor = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
  
    __obj.asInstanceOf[BaseEditor]
  }
}

