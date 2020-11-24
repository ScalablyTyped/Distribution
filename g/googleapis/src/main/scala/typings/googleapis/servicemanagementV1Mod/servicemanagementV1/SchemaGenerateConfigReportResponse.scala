package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for GenerateConfigReport method.
  */
@js.native
trait SchemaGenerateConfigReportResponse extends js.Object {
  
  /**
    * list of ChangeReport, each corresponding to comparison between two
    * service configurations.
    */
  var changeReports: js.UndefOr[js.Array[SchemaChangeReport]] = js.native
  
  /**
    * Errors / Linter warnings associated with the service definition this
    * report belongs to.
    */
  var diagnostics: js.UndefOr[js.Array[SchemaDiagnostic]] = js.native
  
  /**
    * ID of the service configuration this report belongs to.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of the service this report belongs to.
    */
  var serviceName: js.UndefOr[String] = js.native
}
object SchemaGenerateConfigReportResponse {
  
  @scala.inline
  def apply(): SchemaGenerateConfigReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateConfigReportResponse]
  }
  
  @scala.inline
  implicit class SchemaGenerateConfigReportResponseOps[Self <: SchemaGenerateConfigReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeReportsVarargs(value: SchemaChangeReport*): Self = this.set("changeReports", js.Array(value :_*))
    
    @scala.inline
    def setChangeReports(value: js.Array[SchemaChangeReport]): Self = this.set("changeReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeReports: Self = this.set("changeReports", js.undefined)
    
    @scala.inline
    def setDiagnosticsVarargs(value: SchemaDiagnostic*): Self = this.set("diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setDiagnostics(value: js.Array[SchemaDiagnostic]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
