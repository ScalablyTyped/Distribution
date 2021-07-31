package typings.hlsJs.mod

import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait mediaAttachingData extends StObject {
  
  var media: HTMLMediaElement
  
  var mediaSource: String
}
object mediaAttachingData {
  
  @scala.inline
  def apply(media: HTMLMediaElement, mediaSource: String): mediaAttachingData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], mediaSource = mediaSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[mediaAttachingData]
  }
  
  @scala.inline
  implicit class mediaAttachingDataMutableBuilder[Self <: mediaAttachingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: HTMLMediaElement): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSource(value: String): Self = StObject.set(x, "mediaSource", value.asInstanceOf[js.Any])
  }
}
