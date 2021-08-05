package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRepositoryStoryResponseRootObject extends StObject {
  
  var status: String
  
  var story: LocationRepositoryStoryResponseStory
}
object LocationRepositoryStoryResponseRootObject {
  
  inline def apply(status: String, story: LocationRepositoryStoryResponseStory): LocationRepositoryStoryResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseRootObject]
  }
  
  extension [Self <: LocationRepositoryStoryResponseRootObject](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStory(value: LocationRepositoryStoryResponseStory): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
  }
}
