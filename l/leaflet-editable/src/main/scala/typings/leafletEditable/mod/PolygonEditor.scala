package typings.leafletEditable.mod

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inherit from L.Editable.PathEditor.
  */
@js.native
trait PolygonEditor extends PathEditor {
  
  /**
    * Set up drawing tools for creating a new hole on the polygon. If the latlng param is given, a first
    * point is created.
    */
  def newHole(latlng: LatLng_): Unit = js.native
}
object PolygonEditor {
  
  @scala.inline
  def apply(
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    newHole: LatLng_ => Unit,
    reset: () => Unit
  ): PolygonEditor = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), newHole = js.Any.fromFunction1(newHole), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[PolygonEditor]
  }
  
  @scala.inline
  implicit class PolygonEditorOps[Self <: PolygonEditor] (val x: Self) extends AnyVal {
    
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
    def setNewHole(value: LatLng_ => Unit): Self = this.set("newHole", js.Any.fromFunction1(value))
  }
}
