package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This resource represents the configuration of a transfer job that runs
  * periodically.
  */
@js.native
trait SchemaTransferJob extends StObject {
  
  /**
    * This field cannot be changed by user requests.
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * This field cannot be changed by user requests.
    */
  var deletionTime: js.UndefOr[String] = js.native
  
  /**
    * A description provided by the user for the job. Its max length is 1024
    * bytes when Unicode-encoded.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * This field cannot be changed by user requests.
    */
  var lastModificationTime: js.UndefOr[String] = js.native
  
  /**
    * A globally unique name assigned by Storage Transfer Service when the job
    * is created. This field should be left empty in requests to create a new
    * transfer job; otherwise, the requests result in an `INVALID_ARGUMENT`
    * error.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Google Cloud Platform Project that owns the job.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Schedule specification.
    */
  var schedule: js.UndefOr[SchemaSchedule] = js.native
  
  /**
    * Status of the job. This value MUST be specified for
    * `CreateTransferJobRequests`.  NOTE: The effect of the new job status
    * takes place during a subsequent job run. For example, if you change the
    * job status from `ENABLED` to `DISABLED`, and an operation spawned by the
    * transfer is running, the status change would not affect the current
    * operation.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Transfer specification.
    */
  var transferSpec: js.UndefOr[SchemaTransferSpec] = js.native
}
object SchemaTransferJob {
  
  @scala.inline
  def apply(): SchemaTransferJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferJob]
  }
  
  @scala.inline
  implicit class SchemaTransferJobMutableBuilder[Self <: SchemaTransferJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: String): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSchedule(value: SchemaSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTransferSpec(value: SchemaTransferSpec): Self = StObject.set(x, "transferSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferSpecUndefined: Self = StObject.set(x, "transferSpec", js.undefined)
  }
}
