package typings.jestDiff

import typings.chalk.mod.ColorSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSupportsColor extends js.Object {
  var supportsColor: ColorSupport
}

object AnonSupportsColor {
  @scala.inline
  def apply(supportsColor: ColorSupport): AnonSupportsColor = {
    val __obj = js.Dynamic.literal(supportsColor = supportsColor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSupportsColor]
  }
}

