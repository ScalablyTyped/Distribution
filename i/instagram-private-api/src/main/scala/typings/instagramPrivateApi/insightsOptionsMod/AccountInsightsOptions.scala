package typings.instagramPrivateApi.insightsOptionsMod

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
    gridMediaSize: js.UndefOr[Double] = js.undefined,
    userId: String = null
  ): AccountInsightsOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (!js.isUndefined(activityTab)) __obj.updateDynamic("activityTab")(activityTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(audienceTab)) __obj.updateDynamic("audienceTab")(audienceTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contentTab)) __obj.updateDynamic("contentTab")(contentTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridMediaSize)) __obj.updateDynamic("gridMediaSize")(gridMediaSize.get.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInsightsOptions]
  }
}

