package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseHashtag extends StObject {
  
  var id: String
  
  var name: String
}
object ListReelMediaViewerFeedResponseHashtag {
  
  inline def apply(id: String, name: String): ListReelMediaViewerFeedResponseHashtag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseHashtag]
  }
  
  extension [Self <: ListReelMediaViewerFeedResponseHashtag](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
