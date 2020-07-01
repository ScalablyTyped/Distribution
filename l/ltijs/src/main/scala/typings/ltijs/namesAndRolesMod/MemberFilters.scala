package typings.ltijs.namesAndRolesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberFilters extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var pages: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object MemberFilters {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    pages: js.UndefOr[Double] = js.undefined,
    role: String = null,
    url: String = null
  ): MemberFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pages)) __obj.updateDynamic("pages")(pages.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberFilters]
  }
}

