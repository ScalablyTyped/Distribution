package typings.leafletDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var subtext: String
  var text: String
}

object AnonText {
  @scala.inline
  def apply(subtext: String, text: String): AnonText = {
    val __obj = js.Dynamic.literal(subtext = subtext.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

