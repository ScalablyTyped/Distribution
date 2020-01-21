package typings.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayid extends js.Object {
  var display_id: js.UndefOr[String] = js.undefined
}

object AnonDisplayid {
  @scala.inline
  def apply(display_id: String = null): AnonDisplayid = {
    val __obj = js.Dynamic.literal()
    if (display_id != null) __obj.updateDynamic("display_id")(display_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayid]
  }
}

