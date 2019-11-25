package typings.instagramDashPrivateDashApi.distTypesInsightsDotOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInsightsOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var activityTab: js.UndefOr[Boolean] = js.undefined
  var audienceTab: js.UndefOr[Boolean] = js.undefined
  var contentTab: js.UndefOr[Boolean] = js.undefined
  var gridMediaSize: js.UndefOr[Double] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object AccountInsightsOptions {
  @scala.inline
  def apply(
    accessToken: String = null,
    activityTab: js.UndefOr[Boolean] = js.undefined,
    audienceTab: js.UndefOr[Boolean] = js.undefined,
    contentTab: js.UndefOr[Boolean] = js.undefined,
    gridMediaSize: Int | Double = null,
    userId: String = null
  ): AccountInsightsOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (!js.isUndefined(activityTab)) __obj.updateDynamic("activityTab")(activityTab.asInstanceOf[js.Any])
    if (!js.isUndefined(audienceTab)) __obj.updateDynamic("audienceTab")(audienceTab.asInstanceOf[js.Any])
    if (!js.isUndefined(contentTab)) __obj.updateDynamic("contentTab")(contentTab.asInstanceOf[js.Any])
    if (gridMediaSize != null) __obj.updateDynamic("gridMediaSize")(gridMediaSize.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInsightsOptions]
  }
}

