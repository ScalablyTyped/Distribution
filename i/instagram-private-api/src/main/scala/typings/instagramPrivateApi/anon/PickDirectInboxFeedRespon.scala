package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<instagram-private-api.instagram-private-api/dist/responses.DirectInboxFeedResponseThreadsItem, 'thread_id' | 'oldest_cursor'> */
@js.native
trait PickDirectInboxFeedRespon extends js.Object {
  
  var oldest_cursor: String = js.native
  
  var thread_id: String = js.native
}
object PickDirectInboxFeedRespon {
  
  @scala.inline
  def apply(oldest_cursor: String, thread_id: String): PickDirectInboxFeedRespon = {
    val __obj = js.Dynamic.literal(oldest_cursor = oldest_cursor.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDirectInboxFeedRespon]
  }
  
  @scala.inline
  implicit class PickDirectInboxFeedResponOps[Self <: PickDirectInboxFeedRespon] (val x: Self) extends AnyVal {
    
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
    def setOldest_cursor(value: String): Self = this.set("oldest_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_id(value: String): Self = this.set("thread_id", value.asInstanceOf[js.Any])
  }
}
