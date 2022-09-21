package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesGenerateconfigreport
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateConfigReportRequest] = js.undefined
}
object ParamsResourceServicesGenerateconfigreport {
  
  inline def apply(): ParamsResourceServicesGenerateconfigreport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesGenerateconfigreport]
  }
  
  extension [Self <: ParamsResourceServicesGenerateconfigreport](x: Self) {
    
    inline def setRequestBody(value: SchemaGenerateConfigReportRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
