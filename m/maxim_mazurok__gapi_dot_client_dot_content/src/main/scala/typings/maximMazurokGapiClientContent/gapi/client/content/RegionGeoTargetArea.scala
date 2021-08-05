package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionGeoTargetArea extends StObject {
  
  /** Required. A non-empty list of [location IDs](https://developers.google.com/adwords/api/docs/appendix/geotargeting). They must all be of the same location type (e.g., state). */
  var geotargetCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
}
object RegionGeoTargetArea {
  
  inline def apply(): RegionGeoTargetArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionGeoTargetArea]
  }
  
  extension [Self <: RegionGeoTargetArea](x: Self) {
    
    inline def setGeotargetCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "geotargetCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setGeotargetCriteriaIdsUndefined: Self = StObject.set(x, "geotargetCriteriaIds", js.undefined)
    
    inline def setGeotargetCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "geotargetCriteriaIds", js.Array(value :_*))
  }
}
