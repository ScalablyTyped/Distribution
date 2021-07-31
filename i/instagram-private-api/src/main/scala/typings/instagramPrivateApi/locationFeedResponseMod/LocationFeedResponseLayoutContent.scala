package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseLayoutContent extends StObject {
  
  var medias: js.Array[LocationFeedResponseMediasItem]
}
object LocationFeedResponseLayoutContent {
  
  @scala.inline
  def apply(medias: js.Array[LocationFeedResponseMediasItem]): LocationFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseLayoutContent]
  }
  
  @scala.inline
  implicit class LocationFeedResponseLayoutContentMutableBuilder[Self <: LocationFeedResponseLayoutContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedias(value: js.Array[LocationFeedResponseMediasItem]): Self = StObject.set(x, "medias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediasVarargs(value: LocationFeedResponseMediasItem*): Self = StObject.set(x, "medias", js.Array(value :_*))
  }
}
