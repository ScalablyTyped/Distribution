package typings.jupyterlabApputils.dialogMod.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a dialog.
  */
@js.native
trait IResult[T] extends js.Object {
  
  /**
    * The button that was pressed.
    */
  var button: IButton = js.native
  
  /**
    * The value retrieved from `.getValue()` if given on the widget.
    */
  var value: T | Null = js.native
}
object IResult {
  
  @scala.inline
  def apply[T](button: IButton): IResult[T] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
  
  @scala.inline
  implicit class IResultOps[Self <: IResult[_], T] (val x: Self with IResult[T]) extends AnyVal {
    
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
    def setButton(value: IButton): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
