package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPatchJobInstanceDetailsSummary extends StObject {
  
  /**
    * Number of instances that have acked and will start shortly.
    */
  var ackedInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that are applying patches.
    */
  var applyingPatchesInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that are downloading patches.
    */
  var downloadingPatchesInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that failed.
    */
  var failedInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that are inactive.
    */
  var inactiveInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that do not appear to be running the agent. Check to ensure that the agent is installed, running, and able to communicate with the service.
    */
  var noAgentDetectedInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances notified about patch job.
    */
  var notifiedInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances pending patch job.
    */
  var pendingInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that are running the post-patch step.
    */
  var postPatchStepInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that are running the pre-patch step.
    */
  var prePatchStepInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances rebooting.
    */
  var rebootingInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that have started.
    */
  var startedInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that have completed successfully.
    */
  var succeededInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that require reboot.
    */
  var succeededRebootRequiredInstanceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of instances that exceeded the time out while applying the patch.
    */
  var timedOutInstanceCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaPatchJobInstanceDetailsSummary {
  
  inline def apply(): SchemaPatchJobInstanceDetailsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatchJobInstanceDetailsSummary]
  }
  
  extension [Self <: SchemaPatchJobInstanceDetailsSummary](x: Self) {
    
    inline def setAckedInstanceCount(value: String): Self = StObject.set(x, "ackedInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setAckedInstanceCountNull: Self = StObject.set(x, "ackedInstanceCount", null)
    
    inline def setAckedInstanceCountUndefined: Self = StObject.set(x, "ackedInstanceCount", js.undefined)
    
    inline def setApplyingPatchesInstanceCount(value: String): Self = StObject.set(x, "applyingPatchesInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setApplyingPatchesInstanceCountNull: Self = StObject.set(x, "applyingPatchesInstanceCount", null)
    
    inline def setApplyingPatchesInstanceCountUndefined: Self = StObject.set(x, "applyingPatchesInstanceCount", js.undefined)
    
    inline def setDownloadingPatchesInstanceCount(value: String): Self = StObject.set(x, "downloadingPatchesInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setDownloadingPatchesInstanceCountNull: Self = StObject.set(x, "downloadingPatchesInstanceCount", null)
    
    inline def setDownloadingPatchesInstanceCountUndefined: Self = StObject.set(x, "downloadingPatchesInstanceCount", js.undefined)
    
    inline def setFailedInstanceCount(value: String): Self = StObject.set(x, "failedInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setFailedInstanceCountNull: Self = StObject.set(x, "failedInstanceCount", null)
    
    inline def setFailedInstanceCountUndefined: Self = StObject.set(x, "failedInstanceCount", js.undefined)
    
    inline def setInactiveInstanceCount(value: String): Self = StObject.set(x, "inactiveInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInactiveInstanceCountNull: Self = StObject.set(x, "inactiveInstanceCount", null)
    
    inline def setInactiveInstanceCountUndefined: Self = StObject.set(x, "inactiveInstanceCount", js.undefined)
    
    inline def setNoAgentDetectedInstanceCount(value: String): Self = StObject.set(x, "noAgentDetectedInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setNoAgentDetectedInstanceCountNull: Self = StObject.set(x, "noAgentDetectedInstanceCount", null)
    
    inline def setNoAgentDetectedInstanceCountUndefined: Self = StObject.set(x, "noAgentDetectedInstanceCount", js.undefined)
    
    inline def setNotifiedInstanceCount(value: String): Self = StObject.set(x, "notifiedInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setNotifiedInstanceCountNull: Self = StObject.set(x, "notifiedInstanceCount", null)
    
    inline def setNotifiedInstanceCountUndefined: Self = StObject.set(x, "notifiedInstanceCount", js.undefined)
    
    inline def setPendingInstanceCount(value: String): Self = StObject.set(x, "pendingInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setPendingInstanceCountNull: Self = StObject.set(x, "pendingInstanceCount", null)
    
    inline def setPendingInstanceCountUndefined: Self = StObject.set(x, "pendingInstanceCount", js.undefined)
    
    inline def setPostPatchStepInstanceCount(value: String): Self = StObject.set(x, "postPatchStepInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setPostPatchStepInstanceCountNull: Self = StObject.set(x, "postPatchStepInstanceCount", null)
    
    inline def setPostPatchStepInstanceCountUndefined: Self = StObject.set(x, "postPatchStepInstanceCount", js.undefined)
    
    inline def setPrePatchStepInstanceCount(value: String): Self = StObject.set(x, "prePatchStepInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setPrePatchStepInstanceCountNull: Self = StObject.set(x, "prePatchStepInstanceCount", null)
    
    inline def setPrePatchStepInstanceCountUndefined: Self = StObject.set(x, "prePatchStepInstanceCount", js.undefined)
    
    inline def setRebootingInstanceCount(value: String): Self = StObject.set(x, "rebootingInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setRebootingInstanceCountNull: Self = StObject.set(x, "rebootingInstanceCount", null)
    
    inline def setRebootingInstanceCountUndefined: Self = StObject.set(x, "rebootingInstanceCount", js.undefined)
    
    inline def setStartedInstanceCount(value: String): Self = StObject.set(x, "startedInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setStartedInstanceCountNull: Self = StObject.set(x, "startedInstanceCount", null)
    
    inline def setStartedInstanceCountUndefined: Self = StObject.set(x, "startedInstanceCount", js.undefined)
    
    inline def setSucceededInstanceCount(value: String): Self = StObject.set(x, "succeededInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setSucceededInstanceCountNull: Self = StObject.set(x, "succeededInstanceCount", null)
    
    inline def setSucceededInstanceCountUndefined: Self = StObject.set(x, "succeededInstanceCount", js.undefined)
    
    inline def setSucceededRebootRequiredInstanceCount(value: String): Self = StObject.set(x, "succeededRebootRequiredInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setSucceededRebootRequiredInstanceCountNull: Self = StObject.set(x, "succeededRebootRequiredInstanceCount", null)
    
    inline def setSucceededRebootRequiredInstanceCountUndefined: Self = StObject.set(x, "succeededRebootRequiredInstanceCount", js.undefined)
    
    inline def setTimedOutInstanceCount(value: String): Self = StObject.set(x, "timedOutInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setTimedOutInstanceCountNull: Self = StObject.set(x, "timedOutInstanceCount", null)
    
    inline def setTimedOutInstanceCountUndefined: Self = StObject.set(x, "timedOutInstanceCount", js.undefined)
  }
}
