package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInsighttypesGetconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the InsightTypeConfig to get. Acceptable formats: * `projects/[PROJECT_NUMBER]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config` * `projects/[PROJECT_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config` * `organizations/[ORGANIZATION_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInsighttypesGetconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsInsighttypesGetconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInsighttypesGetconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInsighttypesGetconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
