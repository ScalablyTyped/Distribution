package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request passed to UpdateTransferJob.
  */
trait SchemaUpdateTransferJobRequest extends StObject {
  
  /**
    * The ID of the Google Cloud Platform Console project that owns the job.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The job to update. `transferJob` is expected to specify only three
    * fields: `description`, `transferSpec`, and `status`.  An
    * UpdateTransferJobRequest that specifies other fields will be rejected
    * with an error `INVALID_ARGUMENT`. Required.
    */
  var transferJob: js.UndefOr[SchemaTransferJob] = js.undefined
  
  /**
    * The field mask of the fields in `transferJob` that are to be updated in
    * this request.  Fields in `transferJob` that can be updated are:
    * `description`, `transferSpec`, and `status`.  To update the
    * `transferSpec` of the job, a complete transfer specification has to be
    * provided. An incomplete specification which misses any required fields
    * will be rejected with the error `INVALID_ARGUMENT`.
    */
  var updateTransferJobFieldMask: js.UndefOr[String] = js.undefined
}
object SchemaUpdateTransferJobRequest {
  
  inline def apply(): SchemaUpdateTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTransferJobRequest]
  }
  
  extension [Self <: SchemaUpdateTransferJobRequest](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTransferJob(value: SchemaTransferJob): Self = StObject.set(x, "transferJob", value.asInstanceOf[js.Any])
    
    inline def setTransferJobUndefined: Self = StObject.set(x, "transferJob", js.undefined)
    
    inline def setUpdateTransferJobFieldMask(value: String): Self = StObject.set(x, "updateTransferJobFieldMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateTransferJobFieldMaskUndefined: Self = StObject.set(x, "updateTransferJobFieldMask", js.undefined)
  }
}
