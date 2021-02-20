package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement kind representing a video.
  */
@js.native
trait SchemaVideo extends StObject {
  
  /**
    * The video source&#39;s unique identifier for this video.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The video source.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * An URL to a video. The URL is valid as long as the source video exists
    * and sharing settings do not change.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * The properties of the video.
    */
  var videoProperties: js.UndefOr[SchemaVideoProperties] = js.native
}
object SchemaVideo {
  
  @scala.inline
  def apply(): SchemaVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideo]
  }
  
  @scala.inline
  implicit class SchemaVideoMutableBuilder[Self <: SchemaVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVideoProperties(value: SchemaVideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPropertiesUndefined: Self = StObject.set(x, "videoProperties", js.undefined)
  }
}
