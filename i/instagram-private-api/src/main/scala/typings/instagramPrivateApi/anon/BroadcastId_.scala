package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastId_ extends js.Object {
  var broadcastId: String
  var commentsRequested: js.UndefOr[Double] = js.undefined
  var lastCommentTs: js.UndefOr[String | Double] = js.undefined
}

object BroadcastId_ {
  @scala.inline
  def apply(
    broadcastId: String,
    commentsRequested: js.UndefOr[Double] = js.undefined,
    lastCommentTs: String | Double = null
  ): BroadcastId_ = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any])
    if (!js.isUndefined(commentsRequested)) __obj.updateDynamic("commentsRequested")(commentsRequested.get.asInstanceOf[js.Any])
    if (lastCommentTs != null) __obj.updateDynamic("lastCommentTs")(lastCommentTs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastId_]
  }
}

