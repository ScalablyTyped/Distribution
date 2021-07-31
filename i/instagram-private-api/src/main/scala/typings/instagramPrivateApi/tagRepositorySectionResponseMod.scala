package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagRepositorySectionResponseMod {
  
  trait TagRepositorySectionResponseRootObject extends StObject {
    
    var auto_load_more_enabled: Boolean
    
    var more_available: Boolean
    
    var next_max_id: String
    
    var next_media_ids: js.Array[String]
    
    var next_page: Double
    
    var sections: js.Array[TagRepositorySectionResponsesectionsItem]
    
    var status: String
  }
  object TagRepositorySectionResponseRootObject {
    
    @scala.inline
    def apply(
      auto_load_more_enabled: Boolean,
      more_available: Boolean,
      next_max_id: String,
      next_media_ids: js.Array[String],
      next_page: Double,
      sections: js.Array[TagRepositorySectionResponsesectionsItem],
      status: String
    ): TagRepositorySectionResponseRootObject = {
      val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_media_ids = next_media_ids.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagRepositorySectionResponseRootObject]
    }
    
    @scala.inline
    implicit class TagRepositorySectionResponseRootObjectMutableBuilder[Self <: TagRepositorySectionResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_media_ids(value: js.Array[String]): Self = StObject.set(x, "next_media_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_media_idsVarargs(value: String*): Self = StObject.set(x, "next_media_ids", js.Array(value :_*))
      
      @scala.inline
      def setNext_page(value: Double): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSections(value: js.Array[TagRepositorySectionResponsesectionsItem]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsVarargs(value: TagRepositorySectionResponsesectionsItem*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagRepositorySectionResponsesectionsItem extends StObject {
    
    var explore_item_info: js.Array[String]
    
    var feed_type: String
    
    var layout_content: js.Array[String]
    
    var layout_type: String
  }
  object TagRepositorySectionResponsesectionsItem {
    
    @scala.inline
    def apply(
      explore_item_info: js.Array[String],
      feed_type: String,
      layout_content: js.Array[String],
      layout_type: String
    ): TagRepositorySectionResponsesectionsItem = {
      val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagRepositorySectionResponsesectionsItem]
    }
    
    @scala.inline
    implicit class TagRepositorySectionResponsesectionsItemMutableBuilder[Self <: TagRepositorySectionResponsesectionsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExplore_item_info(value: js.Array[String]): Self = StObject.set(x, "explore_item_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplore_item_infoVarargs(value: String*): Self = StObject.set(x, "explore_item_info", js.Array(value :_*))
      
      @scala.inline
      def setFeed_type(value: String): Self = StObject.set(x, "feed_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout_content(value: js.Array[String]): Self = StObject.set(x, "layout_content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout_contentVarargs(value: String*): Self = StObject.set(x, "layout_content", js.Array(value :_*))
      
      @scala.inline
      def setLayout_type(value: String): Self = StObject.set(x, "layout_type", value.asInstanceOf[js.Any])
    }
  }
}
