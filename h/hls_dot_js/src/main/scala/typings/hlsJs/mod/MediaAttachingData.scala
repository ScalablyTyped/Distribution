package typings.hlsJs.mod

import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaAttachingData extends StObject {
  
  var media: HTMLMediaElement
}
object MediaAttachingData {
  
  inline def apply(media: HTMLMediaElement): MediaAttachingData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaAttachingData]
  }
  
  extension [Self <: MediaAttachingData](x: Self) {
    
    inline def setMedia(value: HTMLMediaElement): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
