package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseMediasItem extends StObject {
  
  var media: LocationFeedResponseMedia
}
object LocationFeedResponseMediasItem {
  
  inline def apply(media: LocationFeedResponseMedia): LocationFeedResponseMediasItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseMediasItem]
  }
  
  extension [Self <: LocationFeedResponseMediasItem](x: Self) {
    
    inline def setMedia(value: LocationFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
