package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsMetricdescriptorsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The metric descriptor on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID] An example of [METRIC_ID] is: "custom.googleapis.com/my_test_metric".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsMetricdescriptorsDelete {
  
  inline def apply(): ParamsResourceProjectsMetricdescriptorsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsMetricdescriptorsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsMetricdescriptorsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
