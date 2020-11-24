package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragStopEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the original position of the draggable element.
    */
  var originalPosition: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[js.Any] = js.native
}
object DragStopEventUIParam {
  
  @scala.inline
  def apply(): DragStopEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragStopEventUIParam]
  }
  
  @scala.inline
  implicit class DragStopEventUIParamOps[Self <: DragStopEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setHelper(value: String): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = this.set("originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPosition: Self = this.set("originalPosition", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
