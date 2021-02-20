package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains additional info about the report operation.
  */
@js.native
trait SchemaReportInfo extends StObject {
  
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    * Quota usage info when processing the `Operation`.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.native
}
object SchemaReportInfo {
  
  @scala.inline
  def apply(): SchemaReportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportInfo]
  }
  
  @scala.inline
  implicit class SchemaReportInfoMutableBuilder[Self <: SchemaReportInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setQuotaInfo(value: SchemaQuotaInfo): Self = StObject.set(x, "quotaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaInfoUndefined: Self = StObject.set(x, "quotaInfo", js.undefined)
  }
}
