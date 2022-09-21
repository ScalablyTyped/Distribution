package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoTopicDetails extends StObject {
  
  /**
    * Similar to topic_id, except that these topics are merely relevant to the video. These are topics that may be mentioned in, or appear in the video. You can retrieve information about each topic using Freebase Topic API.
    */
  var relevantTopicIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of Wikipedia URLs that provide a high-level description of the video's content.
    */
  var topicCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of Freebase topic IDs that are centrally associated with the video. These are topics that are centrally featured in the video, and it can be said that the video is mainly about each of these. You can retrieve information about each topic using the < a href="http://wiki.freebase.com/wiki/Topic_API"\>Freebase Topic API.
    */
  var topicIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaVideoTopicDetails {
  
  inline def apply(): SchemaVideoTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoTopicDetails]
  }
  
  extension [Self <: SchemaVideoTopicDetails](x: Self) {
    
    inline def setRelevantTopicIds(value: js.Array[String]): Self = StObject.set(x, "relevantTopicIds", value.asInstanceOf[js.Any])
    
    inline def setRelevantTopicIdsNull: Self = StObject.set(x, "relevantTopicIds", null)
    
    inline def setRelevantTopicIdsUndefined: Self = StObject.set(x, "relevantTopicIds", js.undefined)
    
    inline def setRelevantTopicIdsVarargs(value: String*): Self = StObject.set(x, "relevantTopicIds", js.Array(value*))
    
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
