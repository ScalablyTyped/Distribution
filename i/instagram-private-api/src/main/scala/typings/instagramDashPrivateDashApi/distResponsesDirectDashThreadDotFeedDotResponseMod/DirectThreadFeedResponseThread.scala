package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadFeedResponseThread extends js.Object {
  var admin_user_ids: js.Array[_]
  var archived: Boolean
  var canonical: Boolean
  var folder: Double
  var has_newer: Boolean
  var has_older: Boolean
  var inviter: DirectThreadFeedResponseInviter
  var is_group: Boolean
  var is_pin: Boolean
  var items: js.Array[DirectThreadFeedResponseItemsItem]
  var last_activity_at: String
  var last_permanent_item: DirectThreadFeedResponseLast_permanent_item
  var last_seen_at: DirectThreadFeedResponseLast_seen_at
  var left_users: js.Array[_]
  var mentions_muted: Boolean
  var muted: Boolean
  var named: Boolean
  var newest_cursor: String
  var oldest_cursor: String
  var pending: Boolean
  var pending_score: String
  var prev_cursor: String
  var thread_id: String
  var thread_title: String
  var thread_type: String
  var thread_v2_id: String
  var users: js.Array[_]
  var valued_request: Boolean
  var vc_muted: Boolean
  var viewer_id: Double
}

object DirectThreadFeedResponseThread {
  @scala.inline
  def apply(
    admin_user_ids: js.Array[_],
    archived: Boolean,
    canonical: Boolean,
    folder: Double,
    has_newer: Boolean,
    has_older: Boolean,
    inviter: DirectThreadFeedResponseInviter,
    is_group: Boolean,
    is_pin: Boolean,
    items: js.Array[DirectThreadFeedResponseItemsItem],
    last_activity_at: String,
    last_permanent_item: DirectThreadFeedResponseLast_permanent_item,
    last_seen_at: DirectThreadFeedResponseLast_seen_at,
    left_users: js.Array[_],
    mentions_muted: Boolean,
    muted: Boolean,
    named: Boolean,
    newest_cursor: String,
    oldest_cursor: String,
    pending: Boolean,
    pending_score: String,
    prev_cursor: String,
    thread_id: String,
    thread_title: String,
    thread_type: String,
    thread_v2_id: String,
    users: js.Array[_],
    valued_request: Boolean,
    vc_muted: Boolean,
    viewer_id: Double
  ): DirectThreadFeedResponseThread = {
    val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids, archived = archived, canonical = canonical, folder = folder, has_newer = has_newer, has_older = has_older, inviter = inviter, is_group = is_group, is_pin = is_pin, items = items, last_activity_at = last_activity_at, last_permanent_item = last_permanent_item, last_seen_at = last_seen_at, left_users = left_users, mentions_muted = mentions_muted, muted = muted, named = named, newest_cursor = newest_cursor, oldest_cursor = oldest_cursor, pending = pending, pending_score = pending_score, prev_cursor = prev_cursor, thread_id = thread_id, thread_title = thread_title, thread_type = thread_type, thread_v2_id = thread_v2_id, users = users, valued_request = valued_request, vc_muted = vc_muted, viewer_id = viewer_id)
  
    __obj.asInstanceOf[DirectThreadFeedResponseThread]
  }
}

