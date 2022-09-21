package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateTransferJobRequest extends StObject {
  
  /**
    * Required. The ID of the Google Cloud project that owns the job.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The job to update. `transferJob` is expected to specify one or more of five fields: description, transfer_spec, notification_config, logging_config, and status. An `UpdateTransferJobRequest` that specifies other fields are rejected with the error INVALID_ARGUMENT. Updating a job status to DELETED requires `storagetransfer.jobs.delete` permissions.
    */
  var transferJob: js.UndefOr[SchemaTransferJob] = js.undefined
  
  /**
    * The field mask of the fields in `transferJob` that are to be updated in this request. Fields in `transferJob` that can be updated are: description, transfer_spec, notification_config, logging_config, and status. To update the `transfer_spec` of the job, a complete transfer specification must be provided. An incomplete specification missing any required fields is rejected with the error INVALID_ARGUMENT.
    */
  var updateTransferJobFieldMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateTransferJobRequest {
  
  inline def apply(): SchemaUpdateTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTransferJobRequest]
  }
  
  extension [Self <: SchemaUpdateTransferJobRequest](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTransferJob(value: SchemaTransferJob): Self = StObject.set(x, "transferJob", value.asInstanceOf[js.Any])
    
    inline def setTransferJobUndefined: Self = StObject.set(x, "transferJob", js.undefined)
    
    inline def setUpdateTransferJobFieldMask(value: String): Self = StObject.set(x, "updateTransferJobFieldMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateTransferJobFieldMaskNull: Self = StObject.set(x, "updateTransferJobFieldMask", null)
    
    inline def setUpdateTransferJobFieldMaskUndefined: Self = StObject.set(x, "updateTransferJobFieldMask", js.undefined)
  }
}
