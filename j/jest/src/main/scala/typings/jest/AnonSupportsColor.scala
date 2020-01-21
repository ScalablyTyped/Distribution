package typings.jest

import typings.jest.mod.jest.ChalkColorSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSupportsColor extends js.Object {
  var supportsColor: ChalkColorSupport
}

object AnonSupportsColor {
  @scala.inline
  def apply(supportsColor: ChalkColorSupport): AnonSupportsColor = {
    val __obj = js.Dynamic.literal(supportsColor = supportsColor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSupportsColor]
  }
}

