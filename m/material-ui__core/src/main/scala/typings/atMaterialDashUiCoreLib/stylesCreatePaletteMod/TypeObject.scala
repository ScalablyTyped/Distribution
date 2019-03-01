package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("background")(background)
    __obj.updateDynamic("divider")(divider)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TypeObject]
  }
}

