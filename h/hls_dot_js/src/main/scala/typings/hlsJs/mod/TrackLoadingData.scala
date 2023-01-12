package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackLoadingData extends StObject {
  
  var deliveryDirectives: HlsUrlParameters | Null
  
  var groupId: String
  
  var id: Double
  
  var url: String
}
object TrackLoadingData {
  
  inline def apply(groupId: String, id: Double, url: String): TrackLoadingData = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], deliveryDirectives = null)
    __obj.asInstanceOf[TrackLoadingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackLoadingData] (val x: Self) extends AnyVal {
    
    inline def setDeliveryDirectives(value: HlsUrlParameters): Self = StObject.set(x, "deliveryDirectives", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDirectivesNull: Self = StObject.set(x, "deliveryDirectives", null)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
