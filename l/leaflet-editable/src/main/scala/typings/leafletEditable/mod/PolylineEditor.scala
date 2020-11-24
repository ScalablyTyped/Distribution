package typings.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inherit from L.Editable.PathEditor.
  */
@js.native
trait PolylineEditor extends PathEditor {
  
  /**
    * Set up drawing tools to continue the line backward.
    */
  def continueBackward(): Unit = js.native
  
  /**
    * Set up drawing tools to continue the line forward.
    */
  def continueForward(): Unit = js.native
}
object PolylineEditor {
  
  @scala.inline
  def apply(
    continueBackward: () => Unit,
    continueForward: () => Unit,
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    reset: () => Unit
  ): PolylineEditor = {
    val __obj = js.Dynamic.literal(continueBackward = js.Any.fromFunction0(continueBackward), continueForward = js.Any.fromFunction0(continueForward), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[PolylineEditor]
  }
  
  @scala.inline
  implicit class PolylineEditorOps[Self <: PolylineEditor] (val x: Self) extends AnyVal {
    
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
    def setContinueBackward(value: () => Unit): Self = this.set("continueBackward", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContinueForward(value: () => Unit): Self = this.set("continueForward", js.Any.fromFunction0(value))
  }
}
