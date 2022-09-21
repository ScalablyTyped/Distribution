package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsStudiesTrialsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the study that the trial belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsStudiesTrialsList {
  
  inline def apply(): ParamsResourceProjectsLocationsStudiesTrialsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsStudiesTrialsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsStudiesTrialsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
