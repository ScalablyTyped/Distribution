package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponse extends StObject {
  
  var more_available: Boolean
  
  var next_max_id: String
  
  var next_media_ids: js.Array[String]
  
  var next_page: Double
  
  var sections: js.Array[LocationFeedResponseSectionsItem]
  
  var status: String
}
object LocationFeedResponse {
  
  inline def apply(
    more_available: Boolean,
    next_max_id: String,
    next_media_ids: js.Array[String],
    next_page: Double,
    sections: js.Array[LocationFeedResponseSectionsItem],
    status: String
  ): LocationFeedResponse = {
    val __obj = js.Dynamic.literal(more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_media_ids = next_media_ids.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponse]
  }
  
  extension [Self <: LocationFeedResponse](x: Self) {
    
    inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    inline def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    inline def setNext_media_ids(value: js.Array[String]): Self = StObject.set(x, "next_media_ids", value.asInstanceOf[js.Any])
    
    inline def setNext_media_idsVarargs(value: String*): Self = StObject.set(x, "next_media_ids", js.Array(value :_*))
    
    inline def setNext_page(value: Double): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
    
    inline def setSections(value: js.Array[LocationFeedResponseSectionsItem]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: LocationFeedResponseSectionsItem*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
