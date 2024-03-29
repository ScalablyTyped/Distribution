package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsFeedResponseMediasItem extends StObject {
  
  var media: TagsFeedResponseMedia
}
object TagsFeedResponseMediasItem {
  
  inline def apply(media: TagsFeedResponseMedia): TagsFeedResponseMediasItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseMediasItem]
  }
  
  extension [Self <: TagsFeedResponseMediasItem](x: Self) {
    
    inline def setMedia(value: TagsFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
