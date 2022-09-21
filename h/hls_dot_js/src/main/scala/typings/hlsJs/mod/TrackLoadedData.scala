package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackLoadedData extends StObject {
  
  var deliveryDirectives: HlsUrlParameters | Null
  
  var details: LevelDetails
  
  var groupId: String
  
  var id: Double
  
  var networkDetails: Any
  
  var stats: LoaderStats
}
object TrackLoadedData {
  
  inline def apply(details: LevelDetails, groupId: String, id: Double, networkDetails: Any, stats: LoaderStats): TrackLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkDetails = networkDetails.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], deliveryDirectives = null)
    __obj.asInstanceOf[TrackLoadedData]
  }
  
  extension [Self <: TrackLoadedData](x: Self) {
    
    inline def setDeliveryDirectives(value: HlsUrlParameters): Self = StObject.set(x, "deliveryDirectives", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDirectivesNull: Self = StObject.set(x, "deliveryDirectives", null)
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetails(value: Any): Self = StObject.set(x, "networkDetails", value.asInstanceOf[js.Any])
    
    inline def setStats(value: LoaderStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
