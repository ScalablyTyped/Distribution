package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseOldStoriesItem extends StObject {
  
  var args: NewsRepositoryInboxResponseArgs
  
  var counts: NewsRepositoryInboxResponseCounts
  
  var pk: js.UndefOr[String] = js.undefined
  
  var story_type: Double
  
  var `type`: Double
}
object NewsRepositoryInboxResponseOldStoriesItem {
  
  inline def apply(
    args: NewsRepositoryInboxResponseArgs,
    counts: NewsRepositoryInboxResponseCounts,
    story_type: Double,
    `type`: Double
  ): NewsRepositoryInboxResponseOldStoriesItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], counts = counts.asInstanceOf[js.Any], story_type = story_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseOldStoriesItem]
  }
  
  extension [Self <: NewsRepositoryInboxResponseOldStoriesItem](x: Self) {
    
    inline def setArgs(value: NewsRepositoryInboxResponseArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setCounts(value: NewsRepositoryInboxResponseCounts): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setPkUndefined: Self = StObject.set(x, "pk", js.undefined)
    
    inline def setStory_type(value: Double): Self = StObject.set(x, "story_type", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
