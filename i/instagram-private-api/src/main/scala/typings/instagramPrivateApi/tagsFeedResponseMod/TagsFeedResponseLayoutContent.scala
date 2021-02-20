package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsFeedResponseLayoutContent extends StObject {
  
  var medias: js.Array[TagsFeedResponseMediasItem] = js.native
}
object TagsFeedResponseLayoutContent {
  
  @scala.inline
  def apply(medias: js.Array[TagsFeedResponseMediasItem]): TagsFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseLayoutContent]
  }
  
  @scala.inline
  implicit class TagsFeedResponseLayoutContentMutableBuilder[Self <: TagsFeedResponseLayoutContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedias(value: js.Array[TagsFeedResponseMediasItem]): Self = StObject.set(x, "medias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediasVarargs(value: TagsFeedResponseMediasItem*): Self = StObject.set(x, "medias", js.Array(value :_*))
  }
}
