package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId\}/scanConfigs/{scanConfigId\}/scanRuns/{scanRunId\}'.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList {
  
  inline def apply(): ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList]
  }
  
  extension [Self <: ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
