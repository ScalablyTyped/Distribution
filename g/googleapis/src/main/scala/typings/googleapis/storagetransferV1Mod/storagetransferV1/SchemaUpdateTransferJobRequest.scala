package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request passed to UpdateTransferJob.
  */
@js.native
trait SchemaUpdateTransferJobRequest extends StObject {
  
  /**
    * The ID of the Google Cloud Platform Console project that owns the job.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * The job to update. `transferJob` is expected to specify only three
    * fields: `description`, `transferSpec`, and `status`.  An
    * UpdateTransferJobRequest that specifies other fields will be rejected
    * with an error `INVALID_ARGUMENT`. Required.
    */
  var transferJob: js.UndefOr[SchemaTransferJob] = js.native
  
  /**
    * The field mask of the fields in `transferJob` that are to be updated in
    * this request.  Fields in `transferJob` that can be updated are:
    * `description`, `transferSpec`, and `status`.  To update the
    * `transferSpec` of the job, a complete transfer specification has to be
    * provided. An incomplete specification which misses any required fields
    * will be rejected with the error `INVALID_ARGUMENT`.
    */
  var updateTransferJobFieldMask: js.UndefOr[String] = js.native
}
object SchemaUpdateTransferJobRequest {
  
  @scala.inline
  def apply(): SchemaUpdateTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTransferJobRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateTransferJobRequestMutableBuilder[Self <: SchemaUpdateTransferJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setTransferJob(value: SchemaTransferJob): Self = StObject.set(x, "transferJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferJobUndefined: Self = StObject.set(x, "transferJob", js.undefined)
    
    @scala.inline
    def setUpdateTransferJobFieldMask(value: String): Self = StObject.set(x, "updateTransferJobFieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTransferJobFieldMaskUndefined: Self = StObject.set(x, "updateTransferJobFieldMask", js.undefined)
  }
}
