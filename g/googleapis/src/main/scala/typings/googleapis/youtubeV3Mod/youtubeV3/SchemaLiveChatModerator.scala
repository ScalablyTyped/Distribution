package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A liveChatModerator resource represents a moderator for a YouTube live
  * chat. A chat moderator has the ability to ban/unban users from a chat,
  * remove message, etc.
  */
@js.native
trait SchemaLiveChatModerator extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube assigns to uniquely identify the moderator.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveChatModerator&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The snippet object contains basic details about the moderator.
    */
  var snippet: js.UndefOr[SchemaLiveChatModeratorSnippet] = js.native
}
object SchemaLiveChatModerator {
  
  @scala.inline
  def apply(): SchemaLiveChatModerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatModerator]
  }
  
  @scala.inline
  implicit class SchemaLiveChatModeratorMutableBuilder[Self <: SchemaLiveChatModerator] (val x: Self) extends AnyVal {
    
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
    def setSnippet(value: SchemaLiveChatModeratorSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
