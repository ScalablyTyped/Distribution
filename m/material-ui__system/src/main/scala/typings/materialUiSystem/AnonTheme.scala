package typings.materialUiSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTheme[Theme /* <: js.Object */] extends js.Object {
  var theme: Theme
}

object AnonTheme {
  @scala.inline
  def apply[Theme /* <: js.Object */](theme: Theme): AnonTheme[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTheme[Theme]]
  }
}

