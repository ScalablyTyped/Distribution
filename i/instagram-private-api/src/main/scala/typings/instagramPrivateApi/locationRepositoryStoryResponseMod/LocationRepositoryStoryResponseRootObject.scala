package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRepositoryStoryResponseRootObject extends StObject {
  
  var status: String = js.native
  
  var story: LocationRepositoryStoryResponseStory = js.native
}
object LocationRepositoryStoryResponseRootObject {
  
  @scala.inline
  def apply(status: String, story: LocationRepositoryStoryResponseStory): LocationRepositoryStoryResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseRootObject]
  }
  
  @scala.inline
  implicit class LocationRepositoryStoryResponseRootObjectMutableBuilder[Self <: LocationRepositoryStoryResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: LocationRepositoryStoryResponseStory): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
  }
}
