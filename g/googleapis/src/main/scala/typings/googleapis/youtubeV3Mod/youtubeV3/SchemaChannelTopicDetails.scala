package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Freebase topic information related to the channel.
  */
trait SchemaChannelTopicDetails extends StObject {
  
  /**
    * A list of Wikipedia URLs that describe the channel&#39;s content.
    */
  var topicCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of Freebase topic IDs associated with the channel. You can
    * retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaChannelTopicDetails {
  
  @scala.inline
  def apply(): SchemaChannelTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelTopicDetails]
  }
  
  @scala.inline
  implicit class SchemaChannelTopicDetailsMutableBuilder[Self <: SchemaChannelTopicDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicCategories(value: js.Array[String]): Self = StObject.set(x, "topicCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicCategoriesUndefined: Self = StObject.set(x, "topicCategories", js.undefined)
    
    @scala.inline
    def setTopicCategoriesVarargs(value: String*): Self = StObject.set(x, "topicCategories", js.Array(value :_*))
    
    @scala.inline
    def setTopicIds(value: js.Array[String]): Self = StObject.set(x, "topicIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdsUndefined: Self = StObject.set(x, "topicIds", js.undefined)
    
    @scala.inline
    def setTopicIdsVarargs(value: String*): Self = StObject.set(x, "topicIds", js.Array(value :_*))
  }
}
