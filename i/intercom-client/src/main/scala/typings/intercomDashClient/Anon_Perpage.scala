package typings.intercomDashClient

import typings.intercomDashClient.intercomDashClientStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Perpage extends js.Object {
  var per_page: js.UndefOr[Double] = js.undefined
  var `type`: user
}

object Anon_Perpage {
  @scala.inline
  def apply(`type`: user, per_page: Int | Double = null): Anon_Perpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Perpage]
  }
}

