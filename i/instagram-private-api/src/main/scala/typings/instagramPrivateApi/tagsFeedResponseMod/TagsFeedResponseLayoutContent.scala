package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsFeedResponseLayoutContent extends StObject {
  
  var medias: js.Array[TagsFeedResponseMediasItem]
}
object TagsFeedResponseLayoutContent {
  
  inline def apply(medias: js.Array[TagsFeedResponseMediasItem]): TagsFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseLayoutContent]
  }
  
  extension [Self <: TagsFeedResponseLayoutContent](x: Self) {
    
    inline def setMedias(value: js.Array[TagsFeedResponseMediasItem]): Self = StObject.set(x, "medias", value.asInstanceOf[js.Any])
    
    inline def setMediasVarargs(value: TagsFeedResponseMediasItem*): Self = StObject.set(x, "medias", js.Array(value :_*))
  }
}
