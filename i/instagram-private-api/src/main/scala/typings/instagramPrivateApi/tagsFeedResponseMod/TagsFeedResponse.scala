package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsFeedResponse extends StObject {
  
  var more_available: Boolean
  
  var next_max_id: String
  
  var next_media_ids: js.Array[String]
  
  var next_page: Double
  
  var sections: js.Array[TagsFeedResponseSectionsItem]
  
  var status: String
}
object TagsFeedResponse {
  
  @scala.inline
  def apply(
    more_available: Boolean,
    next_max_id: String,
    next_media_ids: js.Array[String],
    next_page: Double,
    sections: js.Array[TagsFeedResponseSectionsItem],
    status: String
  ): TagsFeedResponse = {
    val __obj = js.Dynamic.literal(more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_media_ids = next_media_ids.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponse]
  }
  
  @scala.inline
  implicit class TagsFeedResponseMutableBuilder[Self <: TagsFeedResponse] (val x: Self) extends AnyVal {
    
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
    def setSections(value: js.Array[TagsFeedResponseSectionsItem]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsVarargs(value: TagsFeedResponseSectionsItem*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
