package typings.grommet

import typings.grommet.themeContextMod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var value: ThemeValue
}

object AnonValue {
  @scala.inline
  def apply(value: ThemeValue): AnonValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

