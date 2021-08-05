package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseImpressions extends StObject {
  
  var surfaces: InsightsServicePostResponseSurfaces
  
  var value: Double
}
object InsightsServicePostResponseImpressions {
  
  inline def apply(surfaces: InsightsServicePostResponseSurfaces, value: Double): InsightsServicePostResponseImpressions = {
    val __obj = js.Dynamic.literal(surfaces = surfaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseImpressions]
  }
  
  extension [Self <: InsightsServicePostResponseImpressions](x: Self) {
    
    inline def setSurfaces(value: InsightsServicePostResponseSurfaces): Self = StObject.set(x, "surfaces", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
