package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPatchJob extends StObject {
  
  /**
    * Time this patch job was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the patch job. Length of the description is limited to 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name for this patch job. This is not a unique identifier.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this patch job is a dry run, the agent reports that it has finished without running any updates on the VM instance.
    */
  var dryRun: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Duration of the patch job. After the duration ends, the patch job times out.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this patch job failed, this message provides information about the failure.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Summary of instance details.
    */
  var instanceDetailsSummary: js.UndefOr[SchemaPatchJobInstanceDetailsSummary] = js.undefined
  
  /**
    * Instances to patch.
    */
  var instanceFilter: js.UndefOr[SchemaPatchInstanceFilter] = js.undefined
  
  /**
    * Unique identifier for this patch job in the form `projects/x/patchJobs/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Patch configuration being applied.
    */
  var patchConfig: js.UndefOr[SchemaPatchConfig] = js.undefined
  
  /**
    * Output only. Name of the patch deployment that created this patch job.
    */
  var patchDeployment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reflects the overall progress of the patch job in the range of 0.0 being no progress to 100.0 being complete.
    */
  var percentComplete: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rollout strategy being applied.
    */
  var rollout: js.UndefOr[SchemaPatchRollout] = js.undefined
  
  /**
    * The current state of the PatchJob.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last time this patch job was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPatchJob {
  
  inline def apply(): SchemaPatchJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatchJob]
  }
  
  extension [Self <: SchemaPatchJob](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunNull: Self = StObject.set(x, "dryRun", null)
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setInstanceDetailsSummary(value: SchemaPatchJobInstanceDetailsSummary): Self = StObject.set(x, "instanceDetailsSummary", value.asInstanceOf[js.Any])
    
    inline def setInstanceDetailsSummaryUndefined: Self = StObject.set(x, "instanceDetailsSummary", js.undefined)
    
    inline def setInstanceFilter(value: SchemaPatchInstanceFilter): Self = StObject.set(x, "instanceFilter", value.asInstanceOf[js.Any])
    
    inline def setInstanceFilterUndefined: Self = StObject.set(x, "instanceFilter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPatchConfig(value: SchemaPatchConfig): Self = StObject.set(x, "patchConfig", value.asInstanceOf[js.Any])
    
    inline def setPatchConfigUndefined: Self = StObject.set(x, "patchConfig", js.undefined)
    
    inline def setPatchDeployment(value: String): Self = StObject.set(x, "patchDeployment", value.asInstanceOf[js.Any])
    
    inline def setPatchDeploymentNull: Self = StObject.set(x, "patchDeployment", null)
    
    inline def setPatchDeploymentUndefined: Self = StObject.set(x, "patchDeployment", js.undefined)
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteNull: Self = StObject.set(x, "percentComplete", null)
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setRollout(value: SchemaPatchRollout): Self = StObject.set(x, "rollout", value.asInstanceOf[js.Any])
    
    inline def setRolloutUndefined: Self = StObject.set(x, "rollout", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
