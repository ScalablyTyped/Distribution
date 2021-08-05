package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadRepositoryGetByParticipantsResponseMod {
  
  trait DirectThreadRepositoryGetByParticipantsResponseFriendshipStatus extends StObject {
    
    var blocking: Boolean
    
    var following: Boolean
    
    var incoming_request: Boolean
    
    var is_bestie: Boolean
    
    var is_private: Boolean
    
    var is_restricted: Boolean
    
    var outgoing_request: Boolean
  }
  object DirectThreadRepositoryGetByParticipantsResponseFriendshipStatus {
    
    inline def apply(
      blocking: Boolean,
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      outgoing_request: Boolean
    ): DirectThreadRepositoryGetByParticipantsResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseFriendshipStatus]
    }
    
    extension [Self <: DirectThreadRepositoryGetByParticipantsResponseFriendshipStatus](x: Self) {
      
      inline def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      inline def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      inline def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryGetByParticipantsResponseInviter extends StObject {
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object DirectThreadRepositoryGetByParticipantsResponseInviter {
    
    inline def apply(
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): DirectThreadRepositoryGetByParticipantsResponseInviter = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseInviter]
    }
    
    extension [Self <: DirectThreadRepositoryGetByParticipantsResponseInviter](x: Self) {
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryGetByParticipantsResponseItemsItem extends StObject {
    
    var item_id: String
    
    var item_type: String
    
    var text: String
    
    var timestamp: String
    
    var user_id: Double
  }
  object DirectThreadRepositoryGetByParticipantsResponseItemsItem {
    
    inline def apply(item_id: String, item_type: String, text: String, timestamp: String, user_id: Double): DirectThreadRepositoryGetByParticipantsResponseItemsItem = {
      val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseItemsItem]
    }
    
    extension [Self <: DirectThreadRepositoryGetByParticipantsResponseItemsItem](x: Self) {
      
      inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      inline def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem extends StObject {
    
    var item_id: String
    
    var item_type: String
    
    var text: String
    
    var timestamp: String
    
    var user_id: Double
  }
  object DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem {
    
    inline def apply(item_id: String, item_type: String, text: String, timestamp: String, user_id: Double): DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem = {
      val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem]
    }
    
    extension [Self <: DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem](x: Self) {
      
      inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      inline def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryGetByParticipantsResponseRootObject extends StObject {
    
    var status: String
    
    var thread: DirectThreadRepositoryGetByParticipantsResponseThread
  }
  object DirectThreadRepositoryGetByParticipantsResponseRootObject {
    
    inline def apply(status: String, thread: DirectThreadRepositoryGetByParticipantsResponseThread): DirectThreadRepositoryGetByParticipantsResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseRootObject]
    }
    
    extension [Self <: DirectThreadRepositoryGetByParticipantsResponseRootObject](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setThread(value: DirectThreadRepositoryGetByParticipantsResponseThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryGetByParticipantsResponseThread extends StObject {
    
    var admin_user_ids: js.Array[js.Any]
    
    var approval_required_for_new_members: Boolean
    
    var archived: Boolean
    
    var business_thread_folder: Double
    
    var canonical: Boolean
    
    var folder: Double
    
    var has_newer: Boolean
    
    var has_older: Boolean
    
    var input_mode: Double
    
    var inviter: DirectThreadRepositoryGetByParticipantsResponseInviter
    
    var is_group: Boolean
    
    var is_pin: Boolean
    
    var items: js.Array[DirectThreadRepositoryGetByParticipantsResponseItemsItem]
    
    var last_activity_at: String
    
    var last_permanent_item: DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem
    
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
    
    var users: js.Array[DirectThreadRepositoryGetByParticipantsResponseUsersItem]
    
    var valued_request: Boolean
    
    var vc_muted: Boolean
    
    var viewer_id: Double
  }
  object DirectThreadRepositoryGetByParticipantsResponseThread {
    
    inline def apply(
      admin_user_ids: js.Array[js.Any],
      approval_required_for_new_members: Boolean,
      archived: Boolean,
      business_thread_folder: Double,
      canonical: Boolean,
      folder: Double,
      has_newer: Boolean,
      has_older: Boolean,
      input_mode: Double,
      inviter: DirectThreadRepositoryGetByParticipantsResponseInviter,
      is_group: Boolean,
      is_pin: Boolean,
      items: js.Array[DirectThreadRepositoryGetByParticipantsResponseItemsItem],
      last_activity_at: String,
      last_permanent_item: DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem,
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
      users: js.Array[DirectThreadRepositoryGetByParticipantsResponseUsersItem],
      valued_request: Boolean,
      vc_muted: Boolean,
      viewer_id: Double
    ): DirectThreadRepositoryGetByParticipantsResponseThread = {
      val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids.asInstanceOf[js.Any], approval_required_for_new_members = approval_required_for_new_members.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], business_thread_folder = business_thread_folder.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], has_newer = has_newer.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], input_mode = input_mode.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], is_group = is_group.asInstanceOf[js.Any], is_pin = is_pin.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], last_permanent_item = last_permanent_item.asInstanceOf[js.Any], last_seen_at = last_seen_at.asInstanceOf[js.Any], left_users = left_users.asInstanceOf[js.Any], mentions_muted = mentions_muted.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], newest_cursor = newest_cursor.asInstanceOf[js.Any], next_cursor = next_cursor.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pending_score = pending_score.asInstanceOf[js.Any], prev_cursor = prev_cursor.asInstanceOf[js.Any], read_state = read_state.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], thread_v2_id = thread_v2_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], valued_request = valued_request.asInstanceOf[js.Any], vc_muted = vc_muted.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseThread]
    }
    
    extension [Self <: DirectThreadRepositoryGetByParticipantsResponseThread](x: Self) {
      
      inline def setAdmin_user_ids(value: js.Array[js.Any]): Self = StObject.set(x, "admin_user_ids", value.asInstanceOf[js.Any])
      
      inline def setAdmin_user_idsVarargs(value: js.Any*): Self = StObject.set(x, "admin_user_ids", js.Array(value :_*))
      
      inline def setApproval_required_for_new_members(value: Boolean): Self = StObject.set(x, "approval_required_for_new_members", value.asInstanceOf[js.Any])
      
      inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      inline def setBusiness_thread_folder(value: Double): Self = StObject.set(x, "business_thread_folder", value.asInstanceOf[js.Any])
      
      inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setFolder(value: Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setHas_newer(value: Boolean): Self = StObject.set(x, "has_newer", value.asInstanceOf[js.Any])
      
      inline def setHas_older(value: Boolean): Self = StObject.set(x, "has_older", value.asInstanceOf[js.Any])
      
      inline def setInput_mode(value: Double): Self = StObject.set(x, "input_mode", value.asInstanceOf[js.Any])
      
      inline def setInviter(value: DirectThreadRepositoryGetByParticipantsResponseInviter): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
      
      inline def setIs_group(value: Boolean): Self = StObject.set(x, "is_group", value.asInstanceOf[js.Any])
      
      inline def setIs_pin(value: Boolean): Self = StObject.set(x, "is_pin", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[DirectThreadRepositoryGetByParticipantsResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: DirectThreadRepositoryGetByParticipantsResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLast_activity_at(value: String): Self = StObject.set(x, "last_activity_at", value.asInstanceOf[js.Any])
      
      inline def setLast_permanent_item(value: DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem): Self = StObject.set(x, "last_permanent_item", value.asInstanceOf[js.Any])
      
      inline def setLast_seen_at(value: js.Any): Self = StObject.set(x, "last_seen_at", value.asInstanceOf[js.Any])
      
      inline def setLeft_users(value: js.Array[js.Any]): Self = StObject.set(x, "left_users", value.asInstanceOf[js.Any])
      
      inline def setLeft_usersVarargs(value: js.Any*): Self = StObject.set(x, "left_users", js.Array(value :_*))
      
      inline def setMentions_muted(value: Boolean): Self = StObject.set(x, "mentions_muted", value.asInstanceOf[js.Any])
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNewest_cursor(value: String): Self = StObject.set(x, "newest_cursor", value.asInstanceOf[js.Any])
      
      inline def setNext_cursor(value: String): Self = StObject.set(x, "next_cursor", value.asInstanceOf[js.Any])
      
      inline def setOldest_cursor(value: String): Self = StObject.set(x, "oldest_cursor", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPending_score(value: String): Self = StObject.set(x, "pending_score", value.asInstanceOf[js.Any])
      
      inline def setPrev_cursor(value: String): Self = StObject.set(x, "prev_cursor", value.asInstanceOf[js.Any])
      
      inline def setRead_state(value: Double): Self = StObject.set(x, "read_state", value.asInstanceOf[js.Any])
      
      inline def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      inline def setThread_title(value: String): Self = StObject.set(x, "thread_title", value.asInstanceOf[js.Any])
      
      inline def setThread_type(value: String): Self = StObject.set(x, "thread_type", value.asInstanceOf[js.Any])
      
      inline def setThread_v2_id(value: String): Self = StObject.set(x, "thread_v2_id", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[DirectThreadRepositoryGetByParticipantsResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: DirectThreadRepositoryGetByParticipantsResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
      
      inline def setValued_request(value: Boolean): Self = StObject.set(x, "valued_request", value.asInstanceOf[js.Any])
      
      inline def setVc_muted(value: Boolean): Self = StObject.set(x, "vc_muted", value.asInstanceOf[js.Any])
      
      inline def setViewer_id(value: Double): Self = StObject.set(x, "viewer_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryGetByParticipantsResponseUsersItem extends StObject {
    
    var friendship_status: DirectThreadRepositoryGetByParticipantsResponseFriendshipStatus
    
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
  object DirectThreadRepositoryGetByParticipantsResponseUsersItem {
    
    inline def apply(
      friendship_status: DirectThreadRepositoryGetByParticipantsResponseFriendshipStatus,
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
    ): DirectThreadRepositoryGetByParticipantsResponseUsersItem = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_directapp_installed = is_directapp_installed.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_using_unified_inbox_for_direct = is_using_unified_inbox_for_direct.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseUsersItem]
    }
    
    extension [Self <: DirectThreadRepositoryGetByParticipantsResponseUsersItem](x: Self) {
      
      inline def setFriendship_status(value: DirectThreadRepositoryGetByParticipantsResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      inline def setIs_directapp_installed(value: Boolean): Self = StObject.set(x, "is_directapp_installed", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_using_unified_inbox_for_direct(value: Boolean): Self = StObject.set(x, "is_using_unified_inbox_for_direct", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
