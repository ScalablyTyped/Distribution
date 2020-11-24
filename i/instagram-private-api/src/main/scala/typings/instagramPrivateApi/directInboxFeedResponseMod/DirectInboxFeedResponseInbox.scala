package typings.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectInboxFeedResponseInbox extends js.Object {
  
  var blended_inbox_enabled: Boolean = js.native
  
  var has_older: Boolean = js.native
  
  var oldest_cursor: String = js.native
  
  var threads: js.Array[DirectInboxFeedResponseThreadsItem] = js.native
  
  var unseen_count: Double = js.native
  
  var unseen_count_ts: String = js.native
}
object DirectInboxFeedResponseInbox {
  
  @scala.inline
  def apply(
    blended_inbox_enabled: Boolean,
    has_older: Boolean,
    oldest_cursor: String,
    threads: js.Array[DirectInboxFeedResponseThreadsItem],
    unseen_count: Double,
    unseen_count_ts: String
  ): DirectInboxFeedResponseInbox = {
    val __obj = js.Dynamic.literal(blended_inbox_enabled = blended_inbox_enabled.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any], unseen_count = unseen_count.asInstanceOf[js.Any], unseen_count_ts = unseen_count_ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseInbox]
  }
  
  @scala.inline
  implicit class DirectInboxFeedResponseInboxOps[Self <: DirectInboxFeedResponseInbox] (val x: Self) extends AnyVal {
    
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
    def setBlended_inbox_enabled(value: Boolean): Self = this.set("blended_inbox_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_older(value: Boolean): Self = this.set("has_older", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldest_cursor(value: String): Self = this.set("oldest_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsVarargs(value: DirectInboxFeedResponseThreadsItem*): Self = this.set("threads", js.Array(value :_*))
    
    @scala.inline
    def setThreads(value: js.Array[DirectInboxFeedResponseThreadsItem]): Self = this.set("threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnseen_count(value: Double): Self = this.set("unseen_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnseen_count_ts(value: String): Self = this.set("unseen_count_ts", value.asInstanceOf[js.Any])
  }
}
