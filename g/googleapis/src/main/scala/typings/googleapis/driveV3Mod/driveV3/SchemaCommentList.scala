package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of comments on a file.
  */
trait SchemaCommentList extends StObject {
  
  /**
    * The list of comments. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#commentList&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of comments. This will be absent if the
    * end of the comments list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCommentList {
  
  @scala.inline
  def apply(): SchemaCommentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentList]
  }
  
  @scala.inline
  implicit class SchemaCommentListMutableBuilder[Self <: SchemaCommentList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[SchemaComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: SchemaComment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
