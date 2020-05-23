package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Displayid extends js.Object {
  var display_id: js.UndefOr[String] = js.undefined
}

object Displayid {
  @scala.inline
  def apply(display_id: String = null): Displayid = {
    val __obj = js.Dynamic.literal()
    if (display_id != null) __obj.updateDynamic("display_id")(display_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayid]
  }
}

