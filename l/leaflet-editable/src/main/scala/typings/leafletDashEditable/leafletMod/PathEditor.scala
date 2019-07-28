package typings.leafletDashEditable.leafletMod

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
  def reset(): Unit
}

object PathEditor {
  @scala.inline
  def apply(
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    reset: () => Unit
  ): PathEditor = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[PathEditor]
  }
}

