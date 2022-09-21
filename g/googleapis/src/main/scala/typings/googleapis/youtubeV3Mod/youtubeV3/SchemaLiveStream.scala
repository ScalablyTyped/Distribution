package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveStream extends StObject {
  
  /**
    * The cdn object defines the live stream's content delivery network (CDN) settings. These settings provide details about the manner in which you stream your content to YouTube.
    */
  var cdn: js.UndefOr[SchemaCdnSettings] = js.undefined
  
  /**
    * The content_details object contains information about the stream, including the closed captions ingestion URL.
    */
  var contentDetails: js.UndefOr[SchemaLiveStreamContentDetails] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube assigns to uniquely identify the stream.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "youtube#liveStream".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The snippet object contains basic details about the stream, including its channel, title, and description.
    */
  var snippet: js.UndefOr[SchemaLiveStreamSnippet] = js.undefined
  
  /**
    * The status object contains information about live stream's status.
    */
  var status: js.UndefOr[SchemaLiveStreamStatus] = js.undefined
}
object SchemaLiveStream {
  
  inline def apply(): SchemaLiveStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStream]
  }
  
  extension [Self <: SchemaLiveStream](x: Self) {
    
    inline def setCdn(value: SchemaCdnSettings): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
    
    inline def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
    
    inline def setContentDetails(value: SchemaLiveStreamContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: SchemaLiveStreamSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatus(value: SchemaLiveStreamStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
