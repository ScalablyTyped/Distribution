package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBroadcastId_ extends js.Object {
  var broadcastId: String
  var commentsRequested: js.UndefOr[Double] = js.undefined
  var lastCommentTs: js.UndefOr[String | Double] = js.undefined
}

object AnonBroadcastId_ {
  @scala.inline
  def apply(broadcastId: String, commentsRequested: Int | Double = null, lastCommentTs: String | Double = null): AnonBroadcastId_ = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any])
    if (commentsRequested != null) __obj.updateDynamic("commentsRequested")(commentsRequested.asInstanceOf[js.Any])
    if (lastCommentTs != null) __obj.updateDynamic("lastCommentTs")(lastCommentTs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBroadcastId_]
  }
}

