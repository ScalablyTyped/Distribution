package typings.instagramPrivateApi.timelineFeedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedsOptions extends js.Object {
  var latestStoryPk: js.UndefOr[String | Double] = js.undefined
  var pushDisabled: js.UndefOr[Boolean] = js.undefined
  var reason: js.UndefOr[TimelineFeedReason] = js.undefined
  var recoveredFromCrash: js.UndefOr[String] = js.undefined
}

object TimelineFeedsOptions {
  @scala.inline
  def apply(
    latestStoryPk: String | Double = null,
    pushDisabled: js.UndefOr[Boolean] = js.undefined,
    reason: TimelineFeedReason = null,
    recoveredFromCrash: String = null
  ): TimelineFeedsOptions = {
    val __obj = js.Dynamic.literal()
    if (latestStoryPk != null) __obj.updateDynamic("latestStoryPk")(latestStoryPk.asInstanceOf[js.Any])
    if (!js.isUndefined(pushDisabled)) __obj.updateDynamic("pushDisabled")(pushDisabled.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (recoveredFromCrash != null) __obj.updateDynamic("recoveredFromCrash")(recoveredFromCrash.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedsOptions]
  }
}

