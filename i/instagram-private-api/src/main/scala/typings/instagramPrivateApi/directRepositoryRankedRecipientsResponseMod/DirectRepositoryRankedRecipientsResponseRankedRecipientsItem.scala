package typings.instagramPrivateApi.directRepositoryRankedRecipientsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectRepositoryRankedRecipientsResponseRankedRecipientsItem extends js.Object {
  
  var thread: js.UndefOr[DirectRepositoryRankedRecipientsResponseThread] = js.native
  
  var user: js.UndefOr[DirectRepositoryRankedRecipientsResponseUser] = js.native
}
object DirectRepositoryRankedRecipientsResponseRankedRecipientsItem {
  
  @scala.inline
  def apply(): DirectRepositoryRankedRecipientsResponseRankedRecipientsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem]
  }
  
  @scala.inline
  implicit class DirectRepositoryRankedRecipientsResponseRankedRecipientsItemOps[Self <: DirectRepositoryRankedRecipientsResponseRankedRecipientsItem] (val x: Self) extends AnyVal {
    
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
    def setThread(value: DirectRepositoryRankedRecipientsResponseThread): Self = this.set("thread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThread: Self = this.set("thread", js.undefined)
    
    @scala.inline
    def setUser(value: DirectRepositoryRankedRecipientsResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
