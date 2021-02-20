package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A live stream describes a live ingestion point.
  */
@js.native
trait SchemaLiveStream extends StObject {
  
  /**
    * The cdn object defines the live stream&#39;s content delivery network
    * (CDN) settings. These settings provide details about the manner in which
    * you stream your content to YouTube.
    */
  var cdn: js.UndefOr[SchemaCdnSettings] = js.native
  
  /**
    * The content_details object contains information about the stream,
    * including the closed captions ingestion URL.
    */
  var contentDetails: js.UndefOr[SchemaLiveStreamContentDetails] = js.native
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube assigns to uniquely identify the stream.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveStream&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The snippet object contains basic details about the stream, including its
    * channel, title, and description.
    */
  var snippet: js.UndefOr[SchemaLiveStreamSnippet] = js.native
  
  /**
    * The status object contains information about live stream&#39;s status.
    */
  var status: js.UndefOr[SchemaLiveStreamStatus] = js.native
}
object SchemaLiveStream {
  
  @scala.inline
  def apply(): SchemaLiveStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStream]
  }
  
  @scala.inline
  implicit class SchemaLiveStreamMutableBuilder[Self <: SchemaLiveStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdn(value: SchemaCdnSettings): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
    
    @scala.inline
    def setContentDetails(value: SchemaLiveStreamContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
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
    def setSnippet(value: SchemaLiveStreamSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaLiveStreamStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
