package typings.hlsJs.mod

import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaAttachedData extends StObject {
  
  var media: HTMLMediaElement
}
object MediaAttachedData {
  
  inline def apply(media: HTMLMediaElement): MediaAttachedData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaAttachedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaAttachedData] (val x: Self) extends AnyVal {
    
    inline def setMedia(value: HTMLMediaElement): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
