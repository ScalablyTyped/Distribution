package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseStoryCtaItem extends StObject {
  
  var links: js.Array[ReelsMediaFeedResponseLinksItem]
}
object ReelsMediaFeedResponseStoryCtaItem {
  
  inline def apply(links: js.Array[ReelsMediaFeedResponseLinksItem]): ReelsMediaFeedResponseStoryCtaItem = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseStoryCtaItem]
  }
  
  extension [Self <: ReelsMediaFeedResponseStoryCtaItem](x: Self) {
    
    inline def setLinks(value: js.Array[ReelsMediaFeedResponseLinksItem]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: ReelsMediaFeedResponseLinksItem*): Self = StObject.set(x, "links", js.Array(value :_*))
  }
}
