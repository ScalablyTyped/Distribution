package typings.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeObject extends js.Object {
  var action: TypeAction = js.native
  var background: TypeBackground = js.native
  var divider: TypeDivider = js.native
  var text: TypeText = js.native
}

object TypeObject {
  @scala.inline
  def apply(action: TypeAction, background: TypeBackground, divider: TypeDivider, text: TypeText): TypeObject = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeObject]
  }
  @scala.inline
  implicit class TypeObjectOps[Self <: TypeObject] (val x: Self) extends AnyVal {
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
    def setAction(value: TypeAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: TypeBackground): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setDivider(value: TypeDivider): Self = this.set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: TypeText): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

