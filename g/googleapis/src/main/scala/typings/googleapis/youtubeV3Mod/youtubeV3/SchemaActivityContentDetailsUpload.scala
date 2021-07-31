package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the uploaded video.
  */
trait SchemaActivityContentDetailsUpload extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the uploaded video.
    */
  var videoId: js.UndefOr[String] = js.undefined
}
object SchemaActivityContentDetailsUpload {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsUpload]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsUploadMutableBuilder[Self <: SchemaActivityContentDetailsUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
