package typings.intercomClient

import typings.intercomClient.intercomClientStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPerpage extends js.Object {
  var per_page: js.UndefOr[Double] = js.undefined
  var `type`: user
}

object AnonPerpage {
  @scala.inline
  def apply(`type`: user, per_page: Int | Double = null): AnonPerpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPerpage]
  }
}

