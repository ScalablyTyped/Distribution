package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionGeoTargetArea extends StObject {
  
  /**
    * Required. A non-empty list of [location IDs](https://developers.google.com/adwords/api/docs/appendix/geotargeting). They must all be of the same location type (e.g., state).
    */
  var geotargetCriteriaIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRegionGeoTargetArea {
  
  inline def apply(): SchemaRegionGeoTargetArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionGeoTargetArea]
  }
  
  extension [Self <: SchemaRegionGeoTargetArea](x: Self) {
    
    inline def setGeotargetCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "geotargetCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setGeotargetCriteriaIdsNull: Self = StObject.set(x, "geotargetCriteriaIds", null)
    
    inline def setGeotargetCriteriaIdsUndefined: Self = StObject.set(x, "geotargetCriteriaIds", js.undefined)
    
    inline def setGeotargetCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "geotargetCriteriaIds", js.Array(value*))
  }
}
