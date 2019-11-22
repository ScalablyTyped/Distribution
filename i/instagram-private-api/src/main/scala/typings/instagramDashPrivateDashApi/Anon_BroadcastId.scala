package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BroadcastId extends js.Object {
  var broadcastId: String
  var commentsRequested: js.UndefOr[Double] = js.undefined
  var lastCommentTs: js.UndefOr[String | Double] = js.undefined
}

trait Anon_Broadcastid extends js.Object {
  var broadcast_id: String
  var upload_url: String
}

object Anon_BroadcastId {
  @scala.inline
  def apply(broadcastId: String, commentsRequested: Int | Double = null, lastCommentTs: String | Double = null): Anon_BroadcastId = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId)
    if (commentsRequested != null) __obj.updateDynamic("commentsRequested")(commentsRequested.asInstanceOf[js.Any])
    if (lastCommentTs != null) __obj.updateDynamic("lastCommentTs")(lastCommentTs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BroadcastId]
  }
}

object Anon_Broadcastid {
  @scala.inline
  def apply(broadcast_id: String, upload_url: String): Anon_Broadcastid = {
    val __obj = js.Dynamic.literal(broadcast_id = broadcast_id, upload_url = upload_url)
  
    __obj.asInstanceOf[Anon_Broadcastid]
  }
}

