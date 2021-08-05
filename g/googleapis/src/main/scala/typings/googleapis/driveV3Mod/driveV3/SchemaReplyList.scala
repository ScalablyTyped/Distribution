package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of replies to a comment on a file.
  */
trait SchemaReplyList extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#replyList&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of replies. This will be absent if the
    * end of the replies list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of replies. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var replies: js.UndefOr[js.Array[SchemaReply]] = js.undefined
}
object SchemaReplyList {
  
  inline def apply(): SchemaReplyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplyList]
  }
  
  extension [Self <: SchemaReplyList](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReplies(value: js.Array[SchemaReply]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: SchemaReply*): Self = StObject.set(x, "replies", js.Array(value :_*))
  }
}
