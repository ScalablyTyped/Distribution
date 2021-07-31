package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment represents a single YouTube comment.
  */
trait SchemaComment extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the comment.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#comment&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The snippet object contains basic details about the comment.
    */
  var snippet: js.UndefOr[SchemaCommentSnippet] = js.undefined
}
object SchemaComment {
  
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  @scala.inline
  implicit class SchemaCommentMutableBuilder[Self <: SchemaComment] (val x: Self) extends AnyVal {
    
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
    def setSnippet(value: SchemaCommentSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
