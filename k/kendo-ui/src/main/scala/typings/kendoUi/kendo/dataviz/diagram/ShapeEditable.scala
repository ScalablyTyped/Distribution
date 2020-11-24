package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeEditable extends js.Object {
  
  var connect: js.UndefOr[Boolean] = js.native
}
object ShapeEditable {
  
  @scala.inline
  def apply(): ShapeEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeEditable]
  }
  
  @scala.inline
  implicit class ShapeEditableOps[Self <: ShapeEditable] (val x: Self) extends AnyVal {
    
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
    def setConnect(value: Boolean): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
  }
}
