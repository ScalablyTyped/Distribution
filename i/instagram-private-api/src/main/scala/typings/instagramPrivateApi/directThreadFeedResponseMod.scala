package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadFeedResponseMod {
  
  trait DirectThreadFeedResponse extends StObject {
    
    var status: String
    
    var thread: DirectThreadFeedResponseThread
  }
  object DirectThreadFeedResponse {
    
    inline def apply(status: String, thread: DirectThreadFeedResponseThread): DirectThreadFeedResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponse]
    }
    
    extension [Self <: DirectThreadFeedResponse](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setThread(value: DirectThreadFeedResponseThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadFeedResponse300687565 extends StObject {
    
    var item_id: String
    
    var timestamp: String
  }
  object DirectThreadFeedResponse300687565 {
    
    inline def apply(item_id: String, timestamp: String): DirectThreadFeedResponse300687565 = {
      val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponse300687565]
    }
    
    extension [Self <: DirectThreadFeedResponse300687565](x: Self) {
      
      inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadFeedResponseInviter extends StObject {
    
    var allowed_commenter_type: String
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var reel_auto_archive: String
    
    var username: String
  }
  object DirectThreadFeedResponseInviter {
    
    inline def apply(
      allowed_commenter_type: String,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      reel_auto_archive: String,
      username: String
    ): DirectThreadFeedResponseInviter = {
      val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponseInviter]
    }
    
    extension [Self <: DirectThreadFeedResponseInviter](x: Self) {
      
      inline def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadFeedResponseItemsItem extends StObject {
    
    var client_context: String
    
    var item_id: String
    
    var item_type: String
    
    var text: String
    
    var timestamp: String
    
    var user_id: Double
  }
  object DirectThreadFeedResponseItemsItem {
    
    inline def apply(
      client_context: String,
      item_id: String,
      item_type: String,
      text: String,
      timestamp: String,
      user_id: Double
    ): DirectThreadFeedResponseItemsItem = {
      val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponseItemsItem]
    }
    
    extension [Self <: DirectThreadFeedResponseItemsItem](x: Self) {
      
      inline def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
      
      inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      inline def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadFeedResponseLastPermanentItem extends StObject {
    
    var client_context: String
    
    var item_id: String
    
    var item_type: String
    
    var text: String
    
    var timestamp: String
    
    var user_id: Double
  }
  object DirectThreadFeedResponseLastPermanentItem {
    
    inline def apply(
      client_context: String,
      item_id: String,
      item_type: String,
      text: String,
      timestamp: String,
      user_id: Double
    ): DirectThreadFeedResponseLastPermanentItem = {
      val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponseLastPermanentItem]
    }
    
    extension [Self <: DirectThreadFeedResponseLastPermanentItem](x: Self) {
      
      inline def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
      
      inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      inline def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadFeedResponseLastSeenAt extends StObject {
    
    var `300687565`: DirectThreadFeedResponse300687565
  }
  object DirectThreadFeedResponseLastSeenAt {
    
    inline def apply(`300687565`: DirectThreadFeedResponse300687565): DirectThreadFeedResponseLastSeenAt = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("300687565")(`300687565`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponseLastSeenAt]
    }
    
    extension [Self <: DirectThreadFeedResponseLastSeenAt](x: Self) {
      
      inline def set300687565(value: DirectThreadFeedResponse300687565): Self = StObject.set(x, "300687565", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadFeedResponseThread extends StObject {
    
    var admin_user_ids: js.Array[js.Any]
    
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
    
    var last_permanent_item: DirectThreadFeedResponseLastPermanentItem
    
    var last_seen_at: DirectThreadFeedResponseLastSeenAt
    
    var left_users: js.Array[js.Any]
    
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
    
    var users: js.Array[js.Any]
    
    var valued_request: Boolean
    
    var vc_muted: Boolean
    
    var viewer_id: Double
  }
  object DirectThreadFeedResponseThread {
    
    inline def apply(
      admin_user_ids: js.Array[js.Any],
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
      last_permanent_item: DirectThreadFeedResponseLastPermanentItem,
      last_seen_at: DirectThreadFeedResponseLastSeenAt,
      left_users: js.Array[js.Any],
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
      users: js.Array[js.Any],
      valued_request: Boolean,
      vc_muted: Boolean,
      viewer_id: Double
    ): DirectThreadFeedResponseThread = {
      val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], has_newer = has_newer.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], is_group = is_group.asInstanceOf[js.Any], is_pin = is_pin.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], last_permanent_item = last_permanent_item.asInstanceOf[js.Any], last_seen_at = last_seen_at.asInstanceOf[js.Any], left_users = left_users.asInstanceOf[js.Any], mentions_muted = mentions_muted.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], newest_cursor = newest_cursor.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pending_score = pending_score.asInstanceOf[js.Any], prev_cursor = prev_cursor.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], thread_v2_id = thread_v2_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], valued_request = valued_request.asInstanceOf[js.Any], vc_muted = vc_muted.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponseThread]
    }
    
    extension [Self <: DirectThreadFeedResponseThread](x: Self) {
      
      inline def setAdmin_user_ids(value: js.Array[js.Any]): Self = StObject.set(x, "admin_user_ids", value.asInstanceOf[js.Any])
      
      inline def setAdmin_user_idsVarargs(value: js.Any*): Self = StObject.set(x, "admin_user_ids", js.Array(value :_*))
      
      inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setFolder(value: Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setHas_newer(value: Boolean): Self = StObject.set(x, "has_newer", value.asInstanceOf[js.Any])
      
      inline def setHas_older(value: Boolean): Self = StObject.set(x, "has_older", value.asInstanceOf[js.Any])
      
      inline def setInviter(value: DirectThreadFeedResponseInviter): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
      
      inline def setIs_group(value: Boolean): Self = StObject.set(x, "is_group", value.asInstanceOf[js.Any])
      
      inline def setIs_pin(value: Boolean): Self = StObject.set(x, "is_pin", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[DirectThreadFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: DirectThreadFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLast_activity_at(value: String): Self = StObject.set(x, "last_activity_at", value.asInstanceOf[js.Any])
      
      inline def setLast_permanent_item(value: DirectThreadFeedResponseLastPermanentItem): Self = StObject.set(x, "last_permanent_item", value.asInstanceOf[js.Any])
      
      inline def setLast_seen_at(value: DirectThreadFeedResponseLastSeenAt): Self = StObject.set(x, "last_seen_at", value.asInstanceOf[js.Any])
      
      inline def setLeft_users(value: js.Array[js.Any]): Self = StObject.set(x, "left_users", value.asInstanceOf[js.Any])
      
      inline def setLeft_usersVarargs(value: js.Any*): Self = StObject.set(x, "left_users", js.Array(value :_*))
      
      inline def setMentions_muted(value: Boolean): Self = StObject.set(x, "mentions_muted", value.asInstanceOf[js.Any])
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNewest_cursor(value: String): Self = StObject.set(x, "newest_cursor", value.asInstanceOf[js.Any])
      
      inline def setOldest_cursor(value: String): Self = StObject.set(x, "oldest_cursor", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPending_score(value: String): Self = StObject.set(x, "pending_score", value.asInstanceOf[js.Any])
      
      inline def setPrev_cursor(value: String): Self = StObject.set(x, "prev_cursor", value.asInstanceOf[js.Any])
      
      inline def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      inline def setThread_title(value: String): Self = StObject.set(x, "thread_title", value.asInstanceOf[js.Any])
      
      inline def setThread_type(value: String): Self = StObject.set(x, "thread_type", value.asInstanceOf[js.Any])
      
      inline def setThread_v2_id(value: String): Self = StObject.set(x, "thread_v2_id", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[js.Any]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: js.Any*): Self = StObject.set(x, "users", js.Array(value :_*))
      
      inline def setValued_request(value: Boolean): Self = StObject.set(x, "valued_request", value.asInstanceOf[js.Any])
      
      inline def setVc_muted(value: Boolean): Self = StObject.set(x, "vc_muted", value.asInstanceOf[js.Any])
      
      inline def setViewer_id(value: Double): Self = StObject.set(x, "viewer_id", value.asInstanceOf[js.Any])
    }
  }
}
