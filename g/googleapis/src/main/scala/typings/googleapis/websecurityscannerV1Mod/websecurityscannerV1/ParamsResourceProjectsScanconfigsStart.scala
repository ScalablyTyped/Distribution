package typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsScanconfigsStart
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the ScanConfig to be used. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}'.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaStartScanRunRequest] = js.undefined
}
object ParamsResourceProjectsScanconfigsStart {
  
  inline def apply(): ParamsResourceProjectsScanconfigsStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsScanconfigsStart]
  }
  
  extension [Self <: ParamsResourceProjectsScanconfigsStart](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaStartScanRunRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
