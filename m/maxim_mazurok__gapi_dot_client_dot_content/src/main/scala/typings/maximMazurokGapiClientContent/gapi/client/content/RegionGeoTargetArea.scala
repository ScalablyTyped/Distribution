package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionGeoTargetArea extends StObject {
  
  /** Required. A non-empty list of [location IDs](https://developers.google.com/adwords/api/docs/appendix/geotargeting). They must all be of the same location type (e.g., state). */
  var geotargetCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
}
object RegionGeoTargetArea {
  
  @scala.inline
  def apply(): RegionGeoTargetArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionGeoTargetArea]
  }
  
  @scala.inline
  implicit class RegionGeoTargetAreaMutableBuilder[Self <: RegionGeoTargetArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeotargetCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "geotargetCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeotargetCriteriaIdsUndefined: Self = StObject.set(x, "geotargetCriteriaIds", js.undefined)
    
    @scala.inline
    def setGeotargetCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "geotargetCriteriaIds", js.Array(value :_*))
  }
}
