package typings.leafletDashDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Subtext extends js.Object {
  var subtext: js.UndefOr[String] = js.undefined
  var text: String
}

object Anon_Subtext {
  @scala.inline
  def apply(text: String, subtext: String = null): Anon_Subtext = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (subtext != null) __obj.updateDynamic("subtext")(subtext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Subtext]
  }
}

