package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeObject extends js.Object {
  var action: TypeAction
  var background: TypeBackground
  var divider: TypeDivider
  var text: TypeText
}

object TypeObject {
  @scala.inline
  def apply(action: TypeAction, background: TypeBackground, divider: TypeDivider, text: TypeText): TypeObject = {
    val __obj = js.Dynamic.literal(action = action, background = background, divider = divider, text = text)
  
    __obj.asInstanceOf[TypeObject]
  }
}

