package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A liveChatBan resource represents a ban for a YouTube live chat.
  */
trait SchemaLiveChatBan extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube assigns to uniquely identify the ban.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveChatBan&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The snippet object contains basic details about the ban.
    */
  var snippet: js.UndefOr[SchemaLiveChatBanSnippet] = js.undefined
}
object SchemaLiveChatBan {
  
  inline def apply(): SchemaLiveChatBan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatBan]
  }
  
  extension [Self <: SchemaLiveChatBan](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: SchemaLiveChatBanSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
