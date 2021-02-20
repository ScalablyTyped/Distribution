package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment thread represents information that applies to a top level comment
  * and all its replies. It can also include the top level comment itself and
  * some of the replies.
  */
@js.native
trait SchemaCommentThread extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the comment thread.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#commentThread&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The replies object contains a limited number of replies (if any) to the
    * top level comment found in the snippet.
    */
  var replies: js.UndefOr[SchemaCommentThreadReplies] = js.native
  
  /**
    * The snippet object contains basic details about the comment thread and
    * also the top level comment.
    */
  var snippet: js.UndefOr[SchemaCommentThreadSnippet] = js.native
}
object SchemaCommentThread {
  
  @scala.inline
  def apply(): SchemaCommentThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentThread]
  }
  
  @scala.inline
  implicit class SchemaCommentThreadMutableBuilder[Self <: SchemaCommentThread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setReplies(value: SchemaCommentThreadReplies): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaCommentThreadSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
