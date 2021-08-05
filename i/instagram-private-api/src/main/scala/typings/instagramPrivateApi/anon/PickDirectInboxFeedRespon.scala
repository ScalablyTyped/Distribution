package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<instagram-private-api.instagram-private-api/dist/responses.DirectInboxFeedResponseThreadsItem, 'thread_id' | 'oldest_cursor'> */
trait PickDirectInboxFeedRespon extends StObject {
  
  var oldest_cursor: String
  
  var thread_id: String
}
object PickDirectInboxFeedRespon {
  
  inline def apply(oldest_cursor: String, thread_id: String): PickDirectInboxFeedRespon = {
    val __obj = js.Dynamic.literal(oldest_cursor = oldest_cursor.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDirectInboxFeedRespon]
  }
  
  extension [Self <: PickDirectInboxFeedRespon](x: Self) {
    
    inline def setOldest_cursor(value: String): Self = StObject.set(x, "oldest_cursor", value.asInstanceOf[js.Any])
    
    inline def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
