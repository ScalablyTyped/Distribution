package typings.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When editing a feature (marker, polyline…), an editor is attached to it. This editor basically knows
  * how to handle the edition.
  */
@js.native
trait BaseEditor extends js.Object {
  /**
    * Remove editing tools.
    */
  def disable(): MarkerEditor | PolylineEditor | PolygonEditor = js.native
  /**
    * Set up the drawing tools for the feature to be editable.
    */
  def enable(): MarkerEditor | PolylineEditor | PolygonEditor = js.native
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
  @scala.inline
  implicit class BaseEditorOps[Self <: BaseEditor] (val x: Self) extends AnyVal {
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
    def setDisable(value: () => MarkerEditor | PolylineEditor | PolygonEditor): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => MarkerEditor | PolylineEditor | PolygonEditor): Self = this.set("enable", js.Any.fromFunction0(value))
  }
  
}

