package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportRequest extends StObject {
  
  /**
    * Describes the list of operations to be reported. Each operation is represented as an AttributeContext, and contains all attributes around an API access.
    */
  var operations: js.UndefOr[js.Array[SchemaAttributeContext]] = js.undefined
  
  /**
    * Specifies the version of the service configuration that should be used to process the request. Must not be empty. Set this field to 'latest' to specify using the latest configuration.
    */
  var serviceConfigId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportRequest {
  
  inline def apply(): SchemaReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRequest]
  }
  
  extension [Self <: SchemaReportRequest](x: Self) {
    
    inline def setOperations(value: js.Array[SchemaAttributeContext]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaAttributeContext*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdNull: Self = StObject.set(x, "serviceConfigId", null)
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
