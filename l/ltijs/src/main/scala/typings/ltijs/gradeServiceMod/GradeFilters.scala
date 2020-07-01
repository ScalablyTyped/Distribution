package typings.ltijs.gradeServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradeFilters extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var resourceLinkId: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[Boolean] = js.undefined
  var userId: js.UndefOr[Boolean] = js.undefined
}

object GradeFilters {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    resourceLinkId: js.UndefOr[Boolean] = js.undefined,
    tag: js.UndefOr[Boolean] = js.undefined,
    userId: js.UndefOr[Boolean] = js.undefined
  ): GradeFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceLinkId)) __obj.updateDynamic("resourceLinkId")(resourceLinkId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userId)) __obj.updateDynamic("userId")(userId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradeFilters]
  }
}

