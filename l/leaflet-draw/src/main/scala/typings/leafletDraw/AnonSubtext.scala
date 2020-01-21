package typings.leafletDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubtext extends js.Object {
  var subtext: js.UndefOr[String] = js.undefined
  var text: String
}

object AnonSubtext {
  @scala.inline
  def apply(text: String, subtext: String = null): AnonSubtext = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (subtext != null) __obj.updateDynamic("subtext")(subtext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubtext]
  }
}

