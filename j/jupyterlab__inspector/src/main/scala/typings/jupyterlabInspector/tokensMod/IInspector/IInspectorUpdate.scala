package typings.jupyterlabInspector.tokensMod.IInspector

import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An update value for code inspectors.
  */
@js.native
trait IInspectorUpdate extends js.Object {
  
  /**
    * The content being sent to the inspector for display.
    */
  var content: Widget | Null = js.native
}
object IInspectorUpdate {
  
  @scala.inline
  def apply(): IInspectorUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInspectorUpdate]
  }
  
  @scala.inline
  implicit class IInspectorUpdateOps[Self <: IInspectorUpdate] (val x: Self) extends AnyVal {
    
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
    def setContent(value: Widget): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
  }
}
