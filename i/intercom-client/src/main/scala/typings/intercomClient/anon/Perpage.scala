package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Perpage extends js.Object {
  var per_page: js.UndefOr[Double] = js.undefined
  var `type`: user
}

object Perpage {
  @scala.inline
  def apply(`type`: user, per_page: js.UndefOr[Double] = js.undefined): Perpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Perpage]
  }
}

