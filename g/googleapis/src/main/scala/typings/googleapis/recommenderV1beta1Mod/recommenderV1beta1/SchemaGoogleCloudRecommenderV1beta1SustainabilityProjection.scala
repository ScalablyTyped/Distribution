package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1SustainabilityProjection extends StObject {
  
  /**
    * Duration for which this sustanability applies.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Carbon Footprint generated in kg of CO2 equivalent. Chose kg_c_o2e so that the name renders correctly in camelCase (kgCO2e).
    */
  var kgCO2e: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1SustainabilityProjection {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1SustainabilityProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1SustainabilityProjection]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1SustainabilityProjection](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setKgCO2e(value: Double): Self = StObject.set(x, "kgCO2e", value.asInstanceOf[js.Any])
    
    inline def setKgCO2eNull: Self = StObject.set(x, "kgCO2e", null)
    
    inline def setKgCO2eUndefined: Self = StObject.set(x, "kgCO2e", js.undefined)
  }
}
