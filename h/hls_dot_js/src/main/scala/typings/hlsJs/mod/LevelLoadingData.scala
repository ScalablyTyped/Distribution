package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelLoadingData extends StObject {
  
  var deliveryDirectives: HlsUrlParameters | Null
  
  var id: Double
  
  var level: Double
  
  var url: String
}
object LevelLoadingData {
  
  inline def apply(id: Double, level: Double, url: String): LevelLoadingData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], deliveryDirectives = null)
    __obj.asInstanceOf[LevelLoadingData]
  }
  
  extension [Self <: LevelLoadingData](x: Self) {
    
    inline def setDeliveryDirectives(value: HlsUrlParameters): Self = StObject.set(x, "deliveryDirectives", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDirectivesNull: Self = StObject.set(x, "deliveryDirectives", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
