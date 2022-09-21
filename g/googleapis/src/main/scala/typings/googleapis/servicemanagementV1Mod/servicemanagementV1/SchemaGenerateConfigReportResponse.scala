package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateConfigReportResponse extends StObject {
  
  /**
    * list of ChangeReport, each corresponding to comparison between two service configurations.
    */
  var changeReports: js.UndefOr[js.Array[SchemaChangeReport]] = js.undefined
  
  /**
    * Errors / Linter warnings associated with the service definition this report belongs to.
    */
  var diagnostics: js.UndefOr[js.Array[SchemaDiagnostic]] = js.undefined
  
  /**
    * ID of the service configuration this report belongs to.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the service this report belongs to.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateConfigReportResponse {
  
  inline def apply(): SchemaGenerateConfigReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateConfigReportResponse]
  }
  
  extension [Self <: SchemaGenerateConfigReportResponse](x: Self) {
    
    inline def setChangeReports(value: js.Array[SchemaChangeReport]): Self = StObject.set(x, "changeReports", value.asInstanceOf[js.Any])
    
    inline def setChangeReportsUndefined: Self = StObject.set(x, "changeReports", js.undefined)
    
    inline def setChangeReportsVarargs(value: SchemaChangeReport*): Self = StObject.set(x, "changeReports", js.Array(value*))
    
    inline def setDiagnostics(value: js.Array[SchemaDiagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: SchemaDiagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
