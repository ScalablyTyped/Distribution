package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransferJob extends StObject {
  
  /**
    * Output only. The time that the transfer job was created.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time that the transfer job was deleted.
    */
  var deletionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time that the transfer job was last modified.
    */
  var lastModificationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
    */
  var latestOperationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Logging configuration.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.undefined
  
  /**
    * A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `"transferJobs/"` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `"transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$"` PosixFilesystem example: `"transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$"` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notification configuration. This is not supported for transfers involving PosixFilesystem.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.undefined
  
  /**
    * The ID of the Google Cloud project that owns the job.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
    */
  var schedule: js.UndefOr[SchemaSchedule] = js.undefined
  
  /**
    * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeNull: Self = StObject.set(x, "deletionTime", null)
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModificationTime(value: String): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeNull: Self = StObject.set(x, "lastModificationTime", null)
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "lastModificationTime", js.undefined)
    
    inline def setLatestOperationName(value: String): Self = StObject.set(x, "latestOperationName", value.asInstanceOf[js.Any])
    
    inline def setLatestOperationNameNull: Self = StObject.set(x, "latestOperationName", null)
    
    inline def setLatestOperationNameUndefined: Self = StObject.set(x, "latestOperationName", js.undefined)
    
    inline def setLoggingConfig(value: SchemaLoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationConfig(value: SchemaNotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSchedule(value: SchemaSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTransferSpec(value: SchemaTransferSpec): Self = StObject.set(x, "transferSpec", value.asInstanceOf[js.Any])
    
    inline def setTransferSpecUndefined: Self = StObject.set(x, "transferSpec", js.undefined)
  }
}
