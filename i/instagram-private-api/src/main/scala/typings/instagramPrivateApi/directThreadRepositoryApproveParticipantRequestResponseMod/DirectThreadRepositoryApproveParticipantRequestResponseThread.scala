package typings.instagramPrivateApi.directThreadRepositoryApproveParticipantRequestResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadRepositoryApproveParticipantRequestResponseThread extends js.Object {
  
  var admin_user_ids: js.Array[Double] = js.native
  
  var approval_required_for_new_members: Boolean = js.native
  
  var archived: Boolean = js.native
  
  var business_thread_folder: Double = js.native
  
  var canonical: Boolean = js.native
  
  var folder: Double = js.native
  
  var has_newer: Boolean = js.native
  
  var has_older: Boolean = js.native
  
  var input_mode: Double = js.native
  
  var inviter: DirectThreadRepositoryApproveParticipantRequestResponseInviter = js.native
  
  var is_group: Boolean = js.native
  
  var is_pin: Boolean = js.native
  
  var items: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem] = js.native
  
  var last_activity_at: String = js.native
  
  var last_permanent_item: DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem = js.native
  
  var last_seen_at: DirectThreadRepositoryApproveParticipantRequestResponseLastSeenAt = js.native
  
  var left_users: js.Array[_] = js.native
  
  var mentions_muted: Boolean = js.native
  
  var muted: Boolean = js.native
  
  var named: Boolean = js.native
  
  var newest_cursor: String = js.native
  
  var next_cursor: String = js.native
  
  var oldest_cursor: String = js.native
  
  var pending: Boolean = js.native
  
  var pending_score: String = js.native
  
  var prev_cursor: String = js.native
  
  var read_state: Double = js.native
  
  var thread_id: String = js.native
  
  var thread_title: String = js.native
  
  var thread_type: String = js.native
  
  var thread_v2_id: String = js.native
  
  var users: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseUsersItem] = js.native
  
  var valued_request: Boolean = js.native
  
  var vc_muted: Boolean = js.native
  
  var viewer_id: Double = js.native
}
object DirectThreadRepositoryApproveParticipantRequestResponseThread {
  
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
    inviter: DirectThreadRepositoryApproveParticipantRequestResponseInviter,
    is_group: Boolean,
    is_pin: Boolean,
    items: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem],
    last_activity_at: String,
    last_permanent_item: DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem,
    last_seen_at: DirectThreadRepositoryApproveParticipantRequestResponseLastSeenAt,
    left_users: js.Array[_],
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
    users: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseUsersItem],
    valued_request: Boolean,
    vc_muted: Boolean,
    viewer_id: Double
  ): DirectThreadRepositoryApproveParticipantRequestResponseThread = {
    val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids.asInstanceOf[js.Any], approval_required_for_new_members = approval_required_for_new_members.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], business_thread_folder = business_thread_folder.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], has_newer = has_newer.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], input_mode = input_mode.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], is_group = is_group.asInstanceOf[js.Any], is_pin = is_pin.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], last_permanent_item = last_permanent_item.asInstanceOf[js.Any], last_seen_at = last_seen_at.asInstanceOf[js.Any], left_users = left_users.asInstanceOf[js.Any], mentions_muted = mentions_muted.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], newest_cursor = newest_cursor.asInstanceOf[js.Any], next_cursor = next_cursor.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pending_score = pending_score.asInstanceOf[js.Any], prev_cursor = prev_cursor.asInstanceOf[js.Any], read_state = read_state.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], thread_v2_id = thread_v2_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], valued_request = valued_request.asInstanceOf[js.Any], vc_muted = vc_muted.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseThread]
  }
  
  @scala.inline
  implicit class DirectThreadRepositoryApproveParticipantRequestResponseThreadOps[Self <: DirectThreadRepositoryApproveParticipantRequestResponseThread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdmin_user_idsVarargs(value: Double*): Self = this.set("admin_user_ids", js.Array(value :_*))
    
    @scala.inline
    def setAdmin_user_ids(value: js.Array[Double]): Self = this.set("admin_user_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproval_required_for_new_members(value: Boolean): Self = this.set("approval_required_for_new_members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness_thread_folder(value: Double): Self = this.set("business_thread_folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonical(value: Boolean): Self = this.set("canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: Double): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_newer(value: Boolean): Self = this.set("has_newer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_older(value: Boolean): Self = this.set("has_older", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_mode(value: Double): Self = this.set("input_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviter(value: DirectThreadRepositoryApproveParticipantRequestResponseInviter): Self = this.set("inviter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_group(value: Boolean): Self = this.set("is_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pin(value: Boolean): Self = this.set("is_pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: DirectThreadRepositoryApproveParticipantRequestResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_activity_at(value: String): Self = this.set("last_activity_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_permanent_item(value: DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem): Self = this.set("last_permanent_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_seen_at(value: DirectThreadRepositoryApproveParticipantRequestResponseLastSeenAt): Self = this.set("last_seen_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft_usersVarargs(value: js.Any*): Self = this.set("left_users", js.Array(value :_*))
    
    @scala.inline
    def setLeft_users(value: js.Array[_]): Self = this.set("left_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentions_muted(value: Boolean): Self = this.set("mentions_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamed(value: Boolean): Self = this.set("named", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewest_cursor(value: String): Self = this.set("newest_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_cursor(value: String): Self = this.set("next_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldest_cursor(value: String): Self = this.set("oldest_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending_score(value: String): Self = this.set("pending_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev_cursor(value: String): Self = this.set("prev_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead_state(value: Double): Self = this.set("read_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_id(value: String): Self = this.set("thread_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_title(value: String): Self = this.set("thread_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_type(value: String): Self = this.set("thread_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_v2_id(value: String): Self = this.set("thread_v2_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: DirectThreadRepositoryApproveParticipantRequestResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValued_request(value: Boolean): Self = this.set("valued_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVc_muted(value: Boolean): Self = this.set("vc_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_id(value: Double): Self = this.set("viewer_id", value.asInstanceOf[js.Any])
  }
}
