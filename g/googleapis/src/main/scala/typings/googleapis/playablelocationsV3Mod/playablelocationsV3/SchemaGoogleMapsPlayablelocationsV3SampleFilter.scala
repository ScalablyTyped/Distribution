package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleMapsPlayablelocationsV3SampleFilter extends StObject {
  
  /**
    * Restricts the set of playable locations to just the [types](/maps/documentation/gaming/tt/types) that you want.
    */
  var includedTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies the maximum number of playable locations to return. This value must not be greater than 1000. The default value is 100. Only the top-ranking playable locations are returned.
    */
  var maxLocationCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A set of options that control the spacing between playable locations. By default the minimum distance between locations is 200m.
    */
  var spacing: js.UndefOr[SchemaGoogleMapsPlayablelocationsV3SampleSpacingOptions] = js.undefined
}
object SchemaGoogleMapsPlayablelocationsV3SampleFilter {
  
  inline def apply(): SchemaGoogleMapsPlayablelocationsV3SampleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleMapsPlayablelocationsV3SampleFilter]
  }
  
  extension [Self <: SchemaGoogleMapsPlayablelocationsV3SampleFilter](x: Self) {
    
    inline def setIncludedTypes(value: js.Array[String]): Self = StObject.set(x, "includedTypes", value.asInstanceOf[js.Any])
    
    inline def setIncludedTypesNull: Self = StObject.set(x, "includedTypes", null)
    
    inline def setIncludedTypesUndefined: Self = StObject.set(x, "includedTypes", js.undefined)
    
    inline def setIncludedTypesVarargs(value: String*): Self = StObject.set(x, "includedTypes", js.Array(value*))
    
    inline def setMaxLocationCount(value: Double): Self = StObject.set(x, "maxLocationCount", value.asInstanceOf[js.Any])
    
    inline def setMaxLocationCountNull: Self = StObject.set(x, "maxLocationCount", null)
    
    inline def setMaxLocationCountUndefined: Self = StObject.set(x, "maxLocationCount", js.undefined)
    
    inline def setSpacing(value: SchemaGoogleMapsPlayablelocationsV3SampleSpacingOptions): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
