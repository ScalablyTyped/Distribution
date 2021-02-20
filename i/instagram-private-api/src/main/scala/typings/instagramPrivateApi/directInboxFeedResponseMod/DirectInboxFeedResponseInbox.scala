package typings.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectInboxFeedResponseInbox extends StObject {
  
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
  implicit class DirectInboxFeedResponseInboxMutableBuilder[Self <: DirectInboxFeedResponseInbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlended_inbox_enabled(value: Boolean): Self = StObject.set(x, "blended_inbox_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_older(value: Boolean): Self = StObject.set(x, "has_older", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldest_cursor(value: String): Self = StObject.set(x, "oldest_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreads(value: js.Array[DirectInboxFeedResponseThreadsItem]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsVarargs(value: DirectInboxFeedResponseThreadsItem*): Self = StObject.set(x, "threads", js.Array(value :_*))
    
    @scala.inline
    def setUnseen_count(value: Double): Self = StObject.set(x, "unseen_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnseen_count_ts(value: String): Self = StObject.set(x, "unseen_count_ts", value.asInstanceOf[js.Any])
  }
}
