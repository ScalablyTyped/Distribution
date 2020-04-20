package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteColor extends js.Object {
  var normal: String
  var normalActive: String
  var normalHover: String
}

object WhiteColor {
  @scala.inline
  def apply(normal: String, normalActive: String, normalHover: String): WhiteColor = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteColor]
  }
}

