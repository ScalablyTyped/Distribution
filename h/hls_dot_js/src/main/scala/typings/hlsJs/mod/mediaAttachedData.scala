package typings.hlsJs.mod

import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait mediaAttachedData extends StObject {
  
  var media: HTMLMediaElement
  
  var mediaSource: String
}
object mediaAttachedData {
  
  inline def apply(media: HTMLMediaElement, mediaSource: String): mediaAttachedData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], mediaSource = mediaSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[mediaAttachedData]
  }
  
  extension [Self <: mediaAttachedData](x: Self) {
    
    inline def setMedia(value: HTMLMediaElement): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaSource(value: String): Self = StObject.set(x, "mediaSource", value.asInstanceOf[js.Any])
  }
}
