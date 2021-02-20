package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadFeedResponseMod {
  
  @js.native
  trait DirectThreadFeedResponse extends StObject {
    
    var status: String = js.native
    
    var thread: DirectThreadFeedResponseThread = js.native
  }
  object DirectThreadFeedResponse {
    
    @scala.inline
    def apply(status: String, thread: DirectThreadFeedResponseThread): DirectThreadFeedResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponse]
    }
    
    @scala.inline
    implicit class DirectThreadFeedResponseMutableBuilder[Self <: DirectThreadFeedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread(value: DirectThreadFeedResponseThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadFeedResponse300687565 extends StObject {
    
    var item_id: String = js.native
    
    var timestamp: String = js.native
  }
  object DirectThreadFeedResponse300687565 {
    
    @scala.inline
    def apply(item_id: String, timestamp: String): DirectThreadFeedResponse300687565 = {
      val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponse300687565]
    }
    
    @scala.inline
    implicit class DirectThreadFeedResponse300687565MutableBuilder[Self <: DirectThreadFeedResponse300687565] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadFeedResponseInviter extends StObject {
    
    var allowed_commenter_type: String = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var reel_auto_archive: String = js.native
    
    var username: String = js.native
  }
  object DirectThreadFeedResponseInviter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DirectThreadFeedResponseInviterMutableBuilder[Self <: DirectThreadFeedResponseInviter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadFeedResponseItemsItem extends StObject {
    
    var client_context: String = js.native
    
    var item_id: String = js.native
    
    var item_type: String = js.native
    
    var text: String = js.native
    
    var timestamp: String = js.native
    
    var user_id: Double = js.native
  }
  object DirectThreadFeedResponseItemsItem {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DirectThreadFeedResponseItemsItemMutableBuilder[Self <: DirectThreadFeedResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadFeedResponseLastPermanentItem extends StObject {
    
    var client_context: String = js.native
    
    var item_id: String = js.native
    
    var item_type: String = js.native
    
    var text: String = js.native
    
    var timestamp: String = js.native
    
    var user_id: Double = js.native
  }
  object DirectThreadFeedResponseLastPermanentItem {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DirectThreadFeedResponseLastPermanentItemMutableBuilder[Self <: DirectThreadFeedResponseLastPermanentItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadFeedResponseLastSeenAt extends StObject {
    
    var `300687565`: DirectThreadFeedResponse300687565 = js.native
  }
  object DirectThreadFeedResponseLastSeenAt {
    
    @scala.inline
    def apply(`300687565`: DirectThreadFeedResponse300687565): DirectThreadFeedResponseLastSeenAt = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("300687565")(`300687565`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponseLastSeenAt]
    }
    
    @scala.inline
    implicit class DirectThreadFeedResponseLastSeenAtMutableBuilder[Self <: DirectThreadFeedResponseLastSeenAt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set300687565(value: DirectThreadFeedResponse300687565): Self = StObject.set(x, "300687565", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadFeedResponseThread extends StObject {
    
    var admin_user_ids: js.Array[_] = js.native
    
    var archived: Boolean = js.native
    
    var canonical: Boolean = js.native
    
    var folder: Double = js.native
    
    var has_newer: Boolean = js.native
    
    var has_older: Boolean = js.native
    
    var inviter: DirectThreadFeedResponseInviter = js.native
    
    var is_group: Boolean = js.native
    
    var is_pin: Boolean = js.native
    
    var items: js.Array[DirectThreadFeedResponseItemsItem] = js.native
    
    var last_activity_at: String = js.native
    
    var last_permanent_item: DirectThreadFeedResponseLastPermanentItem = js.native
    
    var last_seen_at: DirectThreadFeedResponseLastSeenAt = js.native
    
    var left_users: js.Array[_] = js.native
    
    var mentions_muted: Boolean = js.native
    
    var muted: Boolean = js.native
    
    var named: Boolean = js.native
    
    var newest_cursor: String = js.native
    
    var oldest_cursor: String = js.native
    
    var pending: Boolean = js.native
    
    var pending_score: String = js.native
    
    var prev_cursor: String = js.native
    
    var thread_id: String = js.native
    
    var thread_title: String = js.native
    
    var thread_type: String = js.native
    
    var thread_v2_id: String = js.native
    
    var users: js.Array[_] = js.native
    
    var valued_request: Boolean = js.native
    
    var vc_muted: Boolean = js.native
    
    var viewer_id: Double = js.native
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
      last_permanent_item: DirectThreadFeedResponseLastPermanentItem,
      last_seen_at: DirectThreadFeedResponseLastSeenAt,
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
      val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], has_newer = has_newer.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], is_group = is_group.asInstanceOf[js.Any], is_pin = is_pin.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], last_permanent_item = last_permanent_item.asInstanceOf[js.Any], last_seen_at = last_seen_at.asInstanceOf[js.Any], left_users = left_users.asInstanceOf[js.Any], mentions_muted = mentions_muted.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], newest_cursor = newest_cursor.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pending_score = pending_score.asInstanceOf[js.Any], prev_cursor = prev_cursor.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], thread_v2_id = thread_v2_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], valued_request = valued_request.asInstanceOf[js.Any], vc_muted = vc_muted.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadFeedResponseThread]
    }
    
    @scala.inline
    implicit class DirectThreadFeedResponseThreadMutableBuilder[Self <: DirectThreadFeedResponseThread] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin_user_ids(value: js.Array[_]): Self = StObject.set(x, "admin_user_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdmin_user_idsVarargs(value: js.Any*): Self = StObject.set(x, "admin_user_ids", js.Array(value :_*))
      
      @scala.inline
      def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolder(value: Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_newer(value: Boolean): Self = StObject.set(x, "has_newer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_older(value: Boolean): Self = StObject.set(x, "has_older", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviter(value: DirectThreadFeedResponseInviter): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_group(value: Boolean): Self = StObject.set(x, "is_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_pin(value: Boolean): Self = StObject.set(x, "is_pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[DirectThreadFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: DirectThreadFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLast_activity_at(value: String): Self = StObject.set(x, "last_activity_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_permanent_item(value: DirectThreadFeedResponseLastPermanentItem): Self = StObject.set(x, "last_permanent_item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_seen_at(value: DirectThreadFeedResponseLastSeenAt): Self = StObject.set(x, "last_seen_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft_users(value: js.Array[_]): Self = StObject.set(x, "left_users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft_usersVarargs(value: js.Any*): Self = StObject.set(x, "left_users", js.Array(value :_*))
      
      @scala.inline
      def setMentions_muted(value: Boolean): Self = StObject.set(x, "mentions_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewest_cursor(value: String): Self = StObject.set(x, "newest_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldest_cursor(value: String): Self = StObject.set(x, "oldest_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_score(value: String): Self = StObject.set(x, "pending_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev_cursor(value: String): Self = StObject.set(x, "prev_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_title(value: String): Self = StObject.set(x, "thread_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_type(value: String): Self = StObject.set(x, "thread_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_v2_id(value: String): Self = StObject.set(x, "thread_v2_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[_]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: js.Any*): Self = StObject.set(x, "users", js.Array(value :_*))
      
      @scala.inline
      def setValued_request(value: Boolean): Self = StObject.set(x, "valued_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVc_muted(value: Boolean): Self = StObject.set(x, "vc_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewer_id(value: Double): Self = StObject.set(x, "viewer_id", value.asInstanceOf[js.Any])
    }
  }
}
