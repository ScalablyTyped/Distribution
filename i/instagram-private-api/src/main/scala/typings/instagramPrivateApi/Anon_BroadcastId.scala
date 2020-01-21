package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BroadcastId extends js.Object {
  var broadcastId: String
  var commentsRequested: js.UndefOr[Double] = js.undefined
  var lastCommentTs: js.UndefOr[String | Double] = js.undefined
}

object Anon_BroadcastId {
  @scala.inline
  def apply(broadcastId: String, commentsRequested: Int | Double = null, lastCommentTs: String | Double = null): Anon_BroadcastId = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any])
    if (commentsRequested != null) __obj.updateDynamic("commentsRequested")(commentsRequested.asInstanceOf[js.Any])
    if (lastCommentTs != null) __obj.updateDynamic("lastCommentTs")(lastCommentTs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BroadcastId]
  }
}

