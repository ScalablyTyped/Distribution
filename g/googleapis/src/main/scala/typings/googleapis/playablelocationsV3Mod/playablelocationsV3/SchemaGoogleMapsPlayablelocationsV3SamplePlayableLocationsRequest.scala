package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest extends StObject {
  
  /**
    * Required. Specifies the area to search within for playable locations.
    */
  var areaFilter: js.UndefOr[SchemaGoogleMapsPlayablelocationsV3SampleAreaFilter] = js.undefined
  
  /**
    * Required. Specifies one or more (up to 5) criteria for filtering the returned playable locations.
    */
  var criteria: js.UndefOr[js.Array[SchemaGoogleMapsPlayablelocationsV3SampleCriterion]] = js.undefined
}
object SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest {
  
  inline def apply(): SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest]
  }
  
  extension [Self <: SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest](x: Self) {
    
    inline def setAreaFilter(value: SchemaGoogleMapsPlayablelocationsV3SampleAreaFilter): Self = StObject.set(x, "areaFilter", value.asInstanceOf[js.Any])
    
    inline def setAreaFilterUndefined: Self = StObject.set(x, "areaFilter", js.undefined)
    
    inline def setCriteria(value: js.Array[SchemaGoogleMapsPlayablelocationsV3SampleCriterion]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setCriteriaVarargs(value: SchemaGoogleMapsPlayablelocationsV3SampleCriterion*): Self = StObject.set(x, "criteria", js.Array(value*))
  }
}
