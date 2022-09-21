package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateConfigReportRequest extends StObject {
  
  /**
    * Required. Service configuration for which we want to generate the report. For this version of API, the supported types are google.api.servicemanagement.v1.ConfigRef, google.api.servicemanagement.v1.ConfigSource, and google.api.Service
    */
  var newConfig: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Optional. Service configuration against which the comparison will be done. For this version of API, the supported types are google.api.servicemanagement.v1.ConfigRef, google.api.servicemanagement.v1.ConfigSource, and google.api.Service
    */
  var oldConfig: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGenerateConfigReportRequest {
  
  inline def apply(): SchemaGenerateConfigReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateConfigReportRequest]
  }
  
  extension [Self <: SchemaGenerateConfigReportRequest](x: Self) {
    
    inline def setNewConfig(value: StringDictionary[Any]): Self = StObject.set(x, "newConfig", value.asInstanceOf[js.Any])
    
    inline def setNewConfigNull: Self = StObject.set(x, "newConfig", null)
    
    inline def setNewConfigUndefined: Self = StObject.set(x, "newConfig", js.undefined)
    
    inline def setOldConfig(value: StringDictionary[Any]): Self = StObject.set(x, "oldConfig", value.asInstanceOf[js.Any])
    
    inline def setOldConfigNull: Self = StObject.set(x, "oldConfig", null)
    
    inline def setOldConfigUndefined: Self = StObject.set(x, "oldConfig", js.undefined)
  }
}
