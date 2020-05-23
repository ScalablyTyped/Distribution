package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subtext extends js.Object {
  var subtext: js.UndefOr[String] = js.undefined
  var text: String
}

object Subtext {
  @scala.inline
  def apply(text: String, subtext: String = null): Subtext = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (subtext != null) __obj.updateDynamic("subtext")(subtext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtext]
  }
}

