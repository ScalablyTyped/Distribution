package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleMapsPlayablelocationsV3SampleAreaFilter extends StObject {
  
  /**
    * Required. The S2 cell ID of the area you want. This must be between cell level 11 and 14 (inclusive). S2 cells are 64-bit integers that identify areas on the Earth. They are hierarchical, and can therefore be used for spatial indexing. The S2 geometry library is available in a number of languages: * [C++](https://github.com/google/s2geometry) * [Java](https://github.com/google/s2-geometry-library-java) * [Go](https://github.com/golang/geo) * [Python](https://github.com/google/s2geometry/tree/master/src/python)
    */
  var s2CellId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleMapsPlayablelocationsV3SampleAreaFilter {
  
  inline def apply(): SchemaGoogleMapsPlayablelocationsV3SampleAreaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleMapsPlayablelocationsV3SampleAreaFilter]
  }
  
  extension [Self <: SchemaGoogleMapsPlayablelocationsV3SampleAreaFilter](x: Self) {
    
    inline def setS2CellId(value: String): Self = StObject.set(x, "s2CellId", value.asInstanceOf[js.Any])
    
    inline def setS2CellIdNull: Self = StObject.set(x, "s2CellId", null)
    
    inline def setS2CellIdUndefined: Self = StObject.set(x, "s2CellId", js.undefined)
  }
}
