package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelLoadedData extends StObject {
  
  var deliveryDirectives: HlsUrlParameters | Null
  
  var details: LevelDetails
  
  var id: Double
  
  var level: Double
  
  var networkDetails: Any
  
  var stats: LoaderStats
}
object LevelLoadedData {
  
  inline def apply(details: LevelDetails, id: Double, level: Double, networkDetails: Any, stats: LoaderStats): LevelLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], networkDetails = networkDetails.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], deliveryDirectives = null)
    __obj.asInstanceOf[LevelLoadedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelLoadedData] (val x: Self) extends AnyVal {
    
    inline def setDeliveryDirectives(value: HlsUrlParameters): Self = StObject.set(x, "deliveryDirectives", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDirectivesNull: Self = StObject.set(x, "deliveryDirectives", null)
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetails(value: Any): Self = StObject.set(x, "networkDetails", value.asInstanceOf[js.Any])
    
    inline def setStats(value: LoaderStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
