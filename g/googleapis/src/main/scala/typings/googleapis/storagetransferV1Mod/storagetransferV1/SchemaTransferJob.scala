package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This resource represents the configuration of a transfer job that runs
  * periodically.
  */
trait SchemaTransferJob extends StObject {
  
  /**
    * This field cannot be changed by user requests.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * This field cannot be changed by user requests.
    */
  var deletionTime: js.UndefOr[String] = js.undefined
  
  /**
    * A description provided by the user for the job. Its max length is 1024
    * bytes when Unicode-encoded.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * This field cannot be changed by user requests.
    */
  var lastModificationTime: js.UndefOr[String] = js.undefined
  
  /**
    * A globally unique name assigned by Storage Transfer Service when the job
    * is created. This field should be left empty in requests to create a new
    * transfer job; otherwise, the requests result in an `INVALID_ARGUMENT`
    * error.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Google Cloud Platform Project that owns the job.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Schedule specification.
    */
  var schedule: js.UndefOr[SchemaSchedule] = js.undefined
  
  /**
    * Status of the job. This value MUST be specified for
    * `CreateTransferJobRequests`.  NOTE: The effect of the new job status
    * takes place during a subsequent job run. For example, if you change the
    * job status from `ENABLED` to `DISABLED`, and an operation spawned by the
    * transfer is running, the status change would not affect the current
    * operation.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Transfer specification.
    */
  var transferSpec: js.UndefOr[SchemaTransferSpec] = js.undefined
}
object SchemaTransferJob {
  
  inline def apply(): SchemaTransferJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferJob]
  }
  
  extension [Self <: SchemaTransferJob](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModificationTime(value: String): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSchedule(value: SchemaSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTransferSpec(value: SchemaTransferSpec): Self = StObject.set(x, "transferSpec", value.asInstanceOf[js.Any])
    
    inline def setTransferSpecUndefined: Self = StObject.set(x, "transferSpec", js.undefined)
  }
}
