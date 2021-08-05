package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseLayoutContent extends StObject {
  
  var medias: js.Array[LocationFeedResponseMediasItem]
}
object LocationFeedResponseLayoutContent {
  
  inline def apply(medias: js.Array[LocationFeedResponseMediasItem]): LocationFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseLayoutContent]
  }
  
  extension [Self <: LocationFeedResponseLayoutContent](x: Self) {
    
    inline def setMedias(value: js.Array[LocationFeedResponseMediasItem]): Self = StObject.set(x, "medias", value.asInstanceOf[js.Any])
    
    inline def setMediasVarargs(value: LocationFeedResponseMediasItem*): Self = StObject.set(x, "medias", js.Array(value :_*))
  }
}
