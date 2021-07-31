package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseHashtag extends StObject {
  
  var id: String
  
  var name: String
}
object TagFeedResponseHashtag {
  
  @scala.inline
  def apply(id: String, name: String): TagFeedResponseHashtag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseHashtag]
  }
  
  @scala.inline
  implicit class TagFeedResponseHashtagMutableBuilder[Self <: TagFeedResponseHashtag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
