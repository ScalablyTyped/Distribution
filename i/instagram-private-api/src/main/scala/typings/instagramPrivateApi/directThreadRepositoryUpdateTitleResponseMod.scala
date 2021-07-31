package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadRepositoryUpdateTitleResponseMod {
  
  trait DirectThreadRepositoryUpdateTitleResponseActionLog extends StObject {
    
    var bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem]
    
    var description: String
    
    var text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
  }
  object DirectThreadRepositoryUpdateTitleResponseActionLog {
    
    @scala.inline
    def apply(
      bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem],
      description: String,
      text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
    ): DirectThreadRepositoryUpdateTitleResponseActionLog = {
      val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], text_attributes = text_attributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseActionLog]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseActionLogMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseActionLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldVarargs(value: DirectThreadRepositoryUpdateTitleResponseBoldItem*): Self = StObject.set(x, "bold", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText_attributes(value: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]): Self = StObject.set(x, "text_attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText_attributesVarargs(value: DirectThreadRepositoryUpdateTitleResponseTextAttributesItem*): Self = StObject.set(x, "text_attributes", js.Array(value :_*))
    }
  }
  
  trait DirectThreadRepositoryUpdateTitleResponseBoldItem extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object DirectThreadRepositoryUpdateTitleResponseBoldItem {
    
    @scala.inline
    def apply(end: Double, start: Double): DirectThreadRepositoryUpdateTitleResponseBoldItem = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseBoldItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseBoldItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseBoldItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryUpdateTitleResponseFriendshipStatus extends StObject {
    
    var blocking: Boolean
    
    var following: Boolean
    
    var incoming_request: Boolean
    
    var is_bestie: Boolean
    
    var is_private: Boolean
    
    var is_restricted: Boolean
    
    var outgoing_request: Boolean
  }
  object DirectThreadRepositoryUpdateTitleResponseFriendshipStatus {
    
    @scala.inline
    def apply(
      blocking: Boolean,
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      outgoing_request: Boolean
    ): DirectThreadRepositoryUpdateTitleResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseFriendshipStatusMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryUpdateTitleResponseInviter extends StObject {
    
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
  object DirectThreadRepositoryUpdateTitleResponseInviter {
    
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
    ): DirectThreadRepositoryUpdateTitleResponseInviter = {
      val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseInviter]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseInviterMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseInviter] (val x: Self) extends AnyVal {
      
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
  
  trait DirectThreadRepositoryUpdateTitleResponseItemsItem extends StObject {
    
    var action_log: DirectThreadRepositoryUpdateTitleResponseActionLog
    
    var item_id: String
    
    var item_type: String
    
    var timestamp: String
    
    var user_id: Double
  }
  object DirectThreadRepositoryUpdateTitleResponseItemsItem {
    
    @scala.inline
    def apply(
      action_log: DirectThreadRepositoryUpdateTitleResponseActionLog,
      item_id: String,
      item_type: String,
      timestamp: String,
      user_id: Double
    ): DirectThreadRepositoryUpdateTitleResponseItemsItem = {
      val __obj = js.Dynamic.literal(action_log = action_log.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseItemsItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseItemsItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction_log(value: DirectThreadRepositoryUpdateTitleResponseActionLog): Self = StObject.set(x, "action_log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryUpdateTitleResponseLastPermanentItem extends StObject {
    
    var action_log: DirectThreadRepositoryUpdateTitleResponseActionLog
    
    var item_id: String
    
    var item_type: String
    
    var timestamp: String
    
    var user_id: Double
  }
  object DirectThreadRepositoryUpdateTitleResponseLastPermanentItem {
    
    @scala.inline
    def apply(
      action_log: DirectThreadRepositoryUpdateTitleResponseActionLog,
      item_id: String,
      item_type: String,
      timestamp: String,
      user_id: Double
    ): DirectThreadRepositoryUpdateTitleResponseLastPermanentItem = {
      val __obj = js.Dynamic.literal(action_log = action_log.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseLastPermanentItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseLastPermanentItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseLastPermanentItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction_log(value: DirectThreadRepositoryUpdateTitleResponseActionLog): Self = StObject.set(x, "action_log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryUpdateTitleResponseRootObject extends StObject {
    
    var status: String
    
    var thread: DirectThreadRepositoryUpdateTitleResponseThread
  }
  object DirectThreadRepositoryUpdateTitleResponseRootObject {
    
    @scala.inline
    def apply(status: String, thread: DirectThreadRepositoryUpdateTitleResponseThread): DirectThreadRepositoryUpdateTitleResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseRootObject]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseRootObjectMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread(value: DirectThreadRepositoryUpdateTitleResponseThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryUpdateTitleResponseTextAttributesItem extends StObject {
    
    var bold: Double
    
    var color: String
    
    var end: Double
    
    var intent: String
    
    var start: Double
  }
  object DirectThreadRepositoryUpdateTitleResponseTextAttributesItem {
    
    @scala.inline
    def apply(bold: Double, color: String, end: Double, intent: String, start: Double): DirectThreadRepositoryUpdateTitleResponseTextAttributesItem = {
      val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseTextAttributesItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseTextAttributesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Double): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryUpdateTitleResponseThread extends StObject {
    
    var admin_user_ids: js.Array[Double]
    
    var approval_required_for_new_members: Boolean
    
    var archived: Boolean
    
    var business_thread_folder: Double
    
    var canonical: Boolean
    
    var folder: Double
    
    var has_newer: Boolean
    
    var has_older: Boolean
    
    var input_mode: Double
    
    var inviter: DirectThreadRepositoryUpdateTitleResponseInviter
    
    var is_group: Boolean
    
    var is_pin: Boolean
    
    var items: js.Array[DirectThreadRepositoryUpdateTitleResponseItemsItem]
    
    var last_activity_at: String
    
    var last_permanent_item: DirectThreadRepositoryUpdateTitleResponseLastPermanentItem
    
    var last_seen_at: js.Any
    
    var left_users: js.Array[js.Any]
    
    var mentions_muted: Boolean
    
    var muted: Boolean
    
    var named: Boolean
    
    var newest_cursor: String
    
    var next_cursor: String
    
    var oldest_cursor: String
    
    var pending: Boolean
    
    var pending_score: String
    
    var prev_cursor: String
    
    var read_state: Double
    
    var thread_id: String
    
    var thread_title: String
    
    var thread_type: String
    
    var thread_v2_id: String
    
    var users: js.Array[DirectThreadRepositoryUpdateTitleResponseUsersItem]
    
    var valued_request: Boolean
    
    var vc_muted: Boolean
    
    var viewer_id: Double
  }
  object DirectThreadRepositoryUpdateTitleResponseThread {
    
    @scala.inline
    def apply(
      admin_user_ids: js.Array[Double],
      approval_required_for_new_members: Boolean,
      archived: Boolean,
      business_thread_folder: Double,
      canonical: Boolean,
      folder: Double,
      has_newer: Boolean,
      has_older: Boolean,
      input_mode: Double,
      inviter: DirectThreadRepositoryUpdateTitleResponseInviter,
      is_group: Boolean,
      is_pin: Boolean,
      items: js.Array[DirectThreadRepositoryUpdateTitleResponseItemsItem],
      last_activity_at: String,
      last_permanent_item: DirectThreadRepositoryUpdateTitleResponseLastPermanentItem,
      last_seen_at: js.Any,
      left_users: js.Array[js.Any],
      mentions_muted: Boolean,
      muted: Boolean,
      named: Boolean,
      newest_cursor: String,
      next_cursor: String,
      oldest_cursor: String,
      pending: Boolean,
      pending_score: String,
      prev_cursor: String,
      read_state: Double,
      thread_id: String,
      thread_title: String,
      thread_type: String,
      thread_v2_id: String,
      users: js.Array[DirectThreadRepositoryUpdateTitleResponseUsersItem],
      valued_request: Boolean,
      vc_muted: Boolean,
      viewer_id: Double
    ): DirectThreadRepositoryUpdateTitleResponseThread = {
      val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids.asInstanceOf[js.Any], approval_required_for_new_members = approval_required_for_new_members.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], business_thread_folder = business_thread_folder.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], has_newer = has_newer.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], input_mode = input_mode.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], is_group = is_group.asInstanceOf[js.Any], is_pin = is_pin.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], last_permanent_item = last_permanent_item.asInstanceOf[js.Any], last_seen_at = last_seen_at.asInstanceOf[js.Any], left_users = left_users.asInstanceOf[js.Any], mentions_muted = mentions_muted.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], newest_cursor = newest_cursor.asInstanceOf[js.Any], next_cursor = next_cursor.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pending_score = pending_score.asInstanceOf[js.Any], prev_cursor = prev_cursor.asInstanceOf[js.Any], read_state = read_state.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], thread_v2_id = thread_v2_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], valued_request = valued_request.asInstanceOf[js.Any], vc_muted = vc_muted.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseThread]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseThreadMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseThread] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin_user_ids(value: js.Array[Double]): Self = StObject.set(x, "admin_user_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdmin_user_idsVarargs(value: Double*): Self = StObject.set(x, "admin_user_ids", js.Array(value :_*))
      
      @scala.inline
      def setApproval_required_for_new_members(value: Boolean): Self = StObject.set(x, "approval_required_for_new_members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusiness_thread_folder(value: Double): Self = StObject.set(x, "business_thread_folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolder(value: Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_newer(value: Boolean): Self = StObject.set(x, "has_newer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_older(value: Boolean): Self = StObject.set(x, "has_older", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_mode(value: Double): Self = StObject.set(x, "input_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviter(value: DirectThreadRepositoryUpdateTitleResponseInviter): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_group(value: Boolean): Self = StObject.set(x, "is_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_pin(value: Boolean): Self = StObject.set(x, "is_pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[DirectThreadRepositoryUpdateTitleResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: DirectThreadRepositoryUpdateTitleResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLast_activity_at(value: String): Self = StObject.set(x, "last_activity_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_permanent_item(value: DirectThreadRepositoryUpdateTitleResponseLastPermanentItem): Self = StObject.set(x, "last_permanent_item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_seen_at(value: js.Any): Self = StObject.set(x, "last_seen_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft_users(value: js.Array[js.Any]): Self = StObject.set(x, "left_users", value.asInstanceOf[js.Any])
      
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
      def setNext_cursor(value: String): Self = StObject.set(x, "next_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldest_cursor(value: String): Self = StObject.set(x, "oldest_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_score(value: String): Self = StObject.set(x, "pending_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev_cursor(value: String): Self = StObject.set(x, "prev_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead_state(value: Double): Self = StObject.set(x, "read_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_title(value: String): Self = StObject.set(x, "thread_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_type(value: String): Self = StObject.set(x, "thread_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_v2_id(value: String): Self = StObject.set(x, "thread_v2_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[DirectThreadRepositoryUpdateTitleResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: DirectThreadRepositoryUpdateTitleResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
      
      @scala.inline
      def setValued_request(value: Boolean): Self = StObject.set(x, "valued_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVc_muted(value: Boolean): Self = StObject.set(x, "vc_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewer_id(value: Double): Self = StObject.set(x, "viewer_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryUpdateTitleResponseUsersItem extends StObject {
    
    var friendship_status: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_directapp_installed: Boolean
    
    var is_private: Boolean
    
    var is_using_unified_inbox_for_direct: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object DirectThreadRepositoryUpdateTitleResponseUsersItem {
    
    @scala.inline
    def apply(
      friendship_status: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_directapp_installed: Boolean,
      is_private: Boolean,
      is_using_unified_inbox_for_direct: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): DirectThreadRepositoryUpdateTitleResponseUsersItem = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_directapp_installed = is_directapp_installed.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_using_unified_inbox_for_direct = is_using_unified_inbox_for_direct.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseUsersItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseUsersItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_directapp_installed(value: Boolean): Self = StObject.set(x, "is_directapp_installed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_using_unified_inbox_for_direct(value: Boolean): Self = StObject.set(x, "is_using_unified_inbox_for_direct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
