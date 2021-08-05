package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseMediasItem extends StObject {
  
  var media: TopicalExploreFeedResponseMedia
}
object TopicalExploreFeedResponseMediasItem {
  
  inline def apply(media: TopicalExploreFeedResponseMedia): TopicalExploreFeedResponseMediasItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseMediasItem]
  }
  
  extension [Self <: TopicalExploreFeedResponseMediasItem](x: Self) {
    
    inline def setMedia(value: TopicalExploreFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
