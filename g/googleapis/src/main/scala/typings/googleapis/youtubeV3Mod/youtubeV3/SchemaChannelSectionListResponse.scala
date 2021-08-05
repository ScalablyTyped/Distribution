package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelSectionListResponse extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Serialized EventId of the request which produced this response.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of ChannelSections that match the request criteria.
    */
  var items: js.UndefOr[js.Array[SchemaChannelSection]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channelSectionListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The visitorId identifies the visitor.
    */
  var visitorId: js.UndefOr[String] = js.undefined
}
object SchemaChannelSectionListResponse {
  
  inline def apply(): SchemaChannelSectionListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionListResponse]
  }
  
  extension [Self <: SchemaChannelSectionListResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setItems(value: js.Array[SchemaChannelSection]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaChannelSection*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
