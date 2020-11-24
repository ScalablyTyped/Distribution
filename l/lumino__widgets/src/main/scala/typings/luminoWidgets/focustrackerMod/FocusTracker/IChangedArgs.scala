package typings.luminoWidgets.focustrackerMod.FocusTracker

import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arguments object for the changed signals.
  */
@js.native
trait IChangedArgs[T /* <: Widget */] extends js.Object {
  
  /**
    * The new value for the widget.
    */
  var newValue: T | Null = js.native
  
  /**
    * The old value for the widget.
    */
  var oldValue: T | Null = js.native
}
object IChangedArgs {
  
  @scala.inline
  def apply[T /* <: Widget */](): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChangedArgs[T]]
  }
  
  @scala.inline
  implicit class IChangedArgsOps[Self <: IChangedArgs[_], T /* <: Widget */] (val x: Self with IChangedArgs[T]) extends AnyVal {
    
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
    def setNewValue(value: T): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueNull: Self = this.set("newValue", null)
    
    @scala.inline
    def setOldValue(value: T): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNull: Self = this.set("oldValue", null)
  }
}
