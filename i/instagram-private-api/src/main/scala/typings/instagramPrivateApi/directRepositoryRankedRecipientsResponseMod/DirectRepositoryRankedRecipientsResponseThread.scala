package typings.instagramPrivateApi.directRepositoryRankedRecipientsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectRepositoryRankedRecipientsResponseThread extends js.Object {
  
  var canonical: Boolean = js.native
  
  var named: Boolean = js.native
  
  var pending: Boolean = js.native
  
  var thread_id: String = js.native
  
  var thread_title: String = js.native
  
  var thread_type: String = js.native
  
  var users: js.Array[DirectRepositoryRankedRecipientsResponseUsersItem] = js.native
  
  var viewer_id: Double = js.native
}
object DirectRepositoryRankedRecipientsResponseThread {
  
  @scala.inline
  def apply(
    canonical: Boolean,
    named: Boolean,
    pending: Boolean,
    thread_id: String,
    thread_title: String,
    thread_type: String,
    users: js.Array[DirectRepositoryRankedRecipientsResponseUsersItem],
    viewer_id: Double
  ): DirectRepositoryRankedRecipientsResponseThread = {
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseThread]
  }
  
  @scala.inline
  implicit class DirectRepositoryRankedRecipientsResponseThreadOps[Self <: DirectRepositoryRankedRecipientsResponseThread] (val x: Self) extends AnyVal {
    
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
    def setCanonical(value: Boolean): Self = this.set("canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamed(value: Boolean): Self = this.set("named", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_id(value: String): Self = this.set("thread_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_title(value: String): Self = this.set("thread_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_type(value: String): Self = this.set("thread_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: DirectRepositoryRankedRecipientsResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[DirectRepositoryRankedRecipientsResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_id(value: Double): Self = this.set("viewer_id", value.asInstanceOf[js.Any])
  }
}
