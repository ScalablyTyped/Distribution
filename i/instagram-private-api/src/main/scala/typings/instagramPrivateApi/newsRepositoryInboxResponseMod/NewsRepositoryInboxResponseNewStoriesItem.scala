package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseNewStoriesItem extends StObject {
  
  var args: NewsRepositoryInboxResponseArgs
  
  var counts: NewsRepositoryInboxResponseCounts
  
  var pk: String
  
  var story_type: Double
  
  var `type`: Double
}
object NewsRepositoryInboxResponseNewStoriesItem {
  
  @scala.inline
  def apply(
    args: NewsRepositoryInboxResponseArgs,
    counts: NewsRepositoryInboxResponseCounts,
    pk: String,
    story_type: Double,
    `type`: Double
  ): NewsRepositoryInboxResponseNewStoriesItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], counts = counts.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], story_type = story_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseNewStoriesItem]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseNewStoriesItemMutableBuilder[Self <: NewsRepositoryInboxResponseNewStoriesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: NewsRepositoryInboxResponseArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounts(value: NewsRepositoryInboxResponseCounts): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_type(value: Double): Self = StObject.set(x, "story_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
