package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDistribution extends StObject {
  
  /**
    * Output only. The estimated fraction (0-1) of the total market with this configuration.
    */
  var marketShare: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The time this distribution was measured.
    */
  var measurementTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaDistribution {
  
  inline def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  
  extension [Self <: SchemaDistribution](x: Self) {
    
    inline def setMarketShare(value: Double): Self = StObject.set(x, "marketShare", value.asInstanceOf[js.Any])
    
    inline def setMarketShareNull: Self = StObject.set(x, "marketShare", null)
    
    inline def setMarketShareUndefined: Self = StObject.set(x, "marketShare", js.undefined)
    
    inline def setMeasurementTime(value: String): Self = StObject.set(x, "measurementTime", value.asInstanceOf[js.Any])
    
    inline def setMeasurementTimeNull: Self = StObject.set(x, "measurementTime", null)
    
    inline def setMeasurementTimeUndefined: Self = StObject.set(x, "measurementTime", js.undefined)
  }
}
