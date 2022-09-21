package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsScanconfigsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the ScanConfig to be deleted. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}'.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsScanconfigsDelete {
  
  inline def apply(): ParamsResourceProjectsScanconfigsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsScanconfigsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsScanconfigsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
