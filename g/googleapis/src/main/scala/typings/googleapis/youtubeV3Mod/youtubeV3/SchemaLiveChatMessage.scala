package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A liveChatMessage resource represents a chat message in a YouTube Live
  * Chat.
  */
@js.native
trait SchemaLiveChatMessage extends StObject {
  
  /**
    * The authorDetails object contains basic details about the user that
    * posted this message.
    */
  var authorDetails: js.UndefOr[SchemaLiveChatMessageAuthorDetails] = js.native
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube assigns to uniquely identify the message.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveChatMessage&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The snippet object contains basic details about the message.
    */
  var snippet: js.UndefOr[SchemaLiveChatMessageSnippet] = js.native
}
object SchemaLiveChatMessage {
  
  @scala.inline
  def apply(): SchemaLiveChatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessage]
  }
  
  @scala.inline
  implicit class SchemaLiveChatMessageMutableBuilder[Self <: SchemaLiveChatMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorDetails(value: SchemaLiveChatMessageAuthorDetails): Self = StObject.set(x, "authorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorDetailsUndefined: Self = StObject.set(x, "authorDetails", js.undefined)
    
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
    def setSnippet(value: SchemaLiveChatMessageSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
