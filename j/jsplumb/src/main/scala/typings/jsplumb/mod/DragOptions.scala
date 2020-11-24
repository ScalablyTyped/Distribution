package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragOptions extends js.Object {
  
  var containment: js.UndefOr[String] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var drag: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.native
  
  var start: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.native
  
  var stop: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object DragOptions {
  
  @scala.inline
  def apply(): DragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragOptions]
  }
  
  @scala.inline
  implicit class DragOptionsOps[Self <: DragOptions] (val x: Self) extends AnyVal {
    
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
    def setContainment(value: String): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDrag(value: /* params */ DragEventCallbackOptions => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setStart(value: /* params */ DragEventCallbackOptions => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: /* params */ DragEventCallbackOptions => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
