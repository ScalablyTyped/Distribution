package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRepositoryStoryResponseHashtag extends StObject {
  
  var id: String
  
  var name: String
}
object LocationRepositoryStoryResponseHashtag {
  
  @scala.inline
  def apply(id: String, name: String): LocationRepositoryStoryResponseHashtag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseHashtag]
  }
  
  @scala.inline
  implicit class LocationRepositoryStoryResponseHashtagMutableBuilder[Self <: LocationRepositoryStoryResponseHashtag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
