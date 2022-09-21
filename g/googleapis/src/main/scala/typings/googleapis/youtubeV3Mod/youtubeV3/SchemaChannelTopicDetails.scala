package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelTopicDetails extends StObject {
  
  /**
    * A list of Wikipedia URLs that describe the channel's content.
    */
  var topicCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of Freebase topic IDs associated with the channel. You can retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaChannelTopicDetails {
  
  inline def apply(): SchemaChannelTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelTopicDetails]
  }
  
  extension [Self <: SchemaChannelTopicDetails](x: Self) {
    
    inline def setTopicCategories(value: js.Array[String]): Self = StObject.set(x, "topicCategories", value.asInstanceOf[js.Any])
    
    inline def setTopicCategoriesNull: Self = StObject.set(x, "topicCategories", null)
    
    inline def setTopicCategoriesUndefined: Self = StObject.set(x, "topicCategories", js.undefined)
    
    inline def setTopicCategoriesVarargs(value: String*): Self = StObject.set(x, "topicCategories", js.Array(value*))
    
    inline def setTopicIds(value: js.Array[String]): Self = StObject.set(x, "topicIds", value.asInstanceOf[js.Any])
    
    inline def setTopicIdsNull: Self = StObject.set(x, "topicIds", null)
    
    inline def setTopicIdsUndefined: Self = StObject.set(x, "topicIds", js.undefined)
    
    inline def setTopicIdsVarargs(value: String*): Self = StObject.set(x, "topicIds", js.Array(value*))
  }
}
