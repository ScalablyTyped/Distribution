package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A superChatEvent resource represents a Super Chat purchase on a YouTube
  * channel.
  */
@js.native
trait SchemaSuperChatEvent extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube assigns to uniquely identify the Super Chat event.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#superChatEvent&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The snippet object contains basic details about the Super Chat event.
    */
  var snippet: js.UndefOr[SchemaSuperChatEventSnippet] = js.native
}
object SchemaSuperChatEvent {
  
  @scala.inline
  def apply(): SchemaSuperChatEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuperChatEvent]
  }
  
  @scala.inline
  implicit class SchemaSuperChatEventMutableBuilder[Self <: SchemaSuperChatEvent] (val x: Self) extends AnyVal {
    
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
    def setSnippet(value: SchemaSuperChatEventSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
