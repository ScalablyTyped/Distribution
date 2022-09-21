package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsScanconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the ScanConfig in the form projects/{project_id\}/scanConfigs/{scan_config_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsScanconfigsGet {
  
  inline def apply(): ParamsResourceProjectsScanconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsScanconfigsGet]
  }
  
  extension [Self <: ParamsResourceProjectsScanconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
