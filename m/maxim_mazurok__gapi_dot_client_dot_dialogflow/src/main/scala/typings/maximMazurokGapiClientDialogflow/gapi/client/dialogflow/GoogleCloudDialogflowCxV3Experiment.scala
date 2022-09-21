package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Experiment extends StObject {
  
  /** Creation time of this experiment. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The definition of the experiment. */
  var definition: js.UndefOr[GoogleCloudDialogflowCxV3ExperimentDefinition] = js.undefined
  
  /** The human-readable description of the experiment. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The human-readable name of the experiment (unique in an environment). Limit of 64 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** End time of this experiment. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of days to run the experiment/rollout. If auto-rollout is not enabled, default value and maximum will be 30 days. If auto-rollout is enabled, default value and
    * maximum will be 6 days.
    */
  var experimentLength: js.UndefOr[String] = js.undefined
  
  /** Last update time of this experiment. */
  var lastUpdateTime: js.UndefOr[String] = js.undefined
  
  /** The name of the experiment. Format: projects//locations//agents//environments//experiments/.. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Inference result of the experiment. */
  var result: js.UndefOr[GoogleCloudDialogflowCxV3ExperimentResult] = js.undefined
  
  /**
    * The configuration for auto rollout. If set, there should be exactly two variants in the experiment (control variant being the default version of the flow), the traffic allocation
    * for the non-control variant will gradually increase to 100% when conditions are met, and eventually replace the control variant to become the default version of the flow.
    */
  var rolloutConfig: js.UndefOr[GoogleCloudDialogflowCxV3RolloutConfig] = js.undefined
  
  /** The reason why rollout has failed. Should only be set when state is ROLLOUT_FAILED. */
  var rolloutFailureReason: js.UndefOr[String] = js.undefined
  
  /** State of the auto rollout process. */
  var rolloutState: js.UndefOr[GoogleCloudDialogflowCxV3RolloutState] = js.undefined
  
  /** Start time of this experiment. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the experiment. Transition triggered by Experiments.StartExperiment: DRAFT->RUNNING. Transition triggered by Experiments.CancelExperiment: DRAFT->DONE or
    * RUNNING->DONE.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /** The history of updates to the experiment variants. */
  var variantsHistory: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3VariantsHistory]] = js.undefined
}
object GoogleCloudDialogflowCxV3Experiment {
  
  inline def apply(): GoogleCloudDialogflowCxV3Experiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Experiment]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3Experiment](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDefinition(value: GoogleCloudDialogflowCxV3ExperimentDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setExperimentLength(value: String): Self = StObject.set(x, "experimentLength", value.asInstanceOf[js.Any])
    
    inline def setExperimentLengthUndefined: Self = StObject.set(x, "experimentLength", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResult(value: GoogleCloudDialogflowCxV3ExperimentResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setRolloutConfig(value: GoogleCloudDialogflowCxV3RolloutConfig): Self = StObject.set(x, "rolloutConfig", value.asInstanceOf[js.Any])
    
    inline def setRolloutConfigUndefined: Self = StObject.set(x, "rolloutConfig", js.undefined)
    
    inline def setRolloutFailureReason(value: String): Self = StObject.set(x, "rolloutFailureReason", value.asInstanceOf[js.Any])
    
    inline def setRolloutFailureReasonUndefined: Self = StObject.set(x, "rolloutFailureReason", js.undefined)
    
    inline def setRolloutState(value: GoogleCloudDialogflowCxV3RolloutState): Self = StObject.set(x, "rolloutState", value.asInstanceOf[js.Any])
    
    inline def setRolloutStateUndefined: Self = StObject.set(x, "rolloutState", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVariantsHistory(value: js.Array[GoogleCloudDialogflowCxV3VariantsHistory]): Self = StObject.set(x, "variantsHistory", value.asInstanceOf[js.Any])
    
    inline def setVariantsHistoryUndefined: Self = StObject.set(x, "variantsHistory", js.undefined)
    
    inline def setVariantsHistoryVarargs(value: GoogleCloudDialogflowCxV3VariantsHistory*): Self = StObject.set(x, "variantsHistory", js.Array(value*))
  }
}
