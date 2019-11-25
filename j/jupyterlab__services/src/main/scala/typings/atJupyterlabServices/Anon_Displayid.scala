package typings.atJupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Displayid extends js.Object {
  var display_id: js.UndefOr[String] = js.undefined
}

object Anon_Displayid {
  @scala.inline
  def apply(display_id: String = null): Anon_Displayid = {
    val __obj = js.Dynamic.literal()
    if (display_id != null) __obj.updateDynamic("display_id")(display_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Displayid]
  }
}

