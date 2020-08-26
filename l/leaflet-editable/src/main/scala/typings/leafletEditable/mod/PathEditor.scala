package typings.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit from L.Editable.BaseEditor.
  * Inherited by L.Editable.PolylineEditor and L.Editable.PolygonEditor.
  */
@js.native
trait PathEditor extends BaseEditor {
  /**
    * Rebuild edit elements (vertex, middlemarker, etc.).
    */
  def reset(): Unit = js.native
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
  @scala.inline
  implicit class PathEditorOps[Self <: PathEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

