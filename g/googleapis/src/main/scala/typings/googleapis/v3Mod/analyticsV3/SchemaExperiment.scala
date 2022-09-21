package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Href
import typings.googleapis.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExperiment extends StObject {
  
  /**
    * Account ID to which this experiment belongs. This field is read-only.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the experiment was created. This field is read-only.
    */
  var created: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notes about this experiment.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the end user will be able to edit the experiment via the Google Analytics user interface.
    */
  var editableInGaUi: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The ending time of the experiment (the time the status changed from RUNNING to ENDED). This field is present only if the experiment has ended. This field is read-only.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Boolean specifying whether to distribute traffic evenly across all variations. If the value is False, content experiments follows the default behavior of adjusting traffic dynamically based on variation performance. Optional -- defaults to False. This field may not be changed for an experiment whose status is ENDED.
    */
  var equalWeighting: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Experiment ID. Required for patch and update. Disallowed for create.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Internal ID for the web property to which this experiment belongs. This field is read-only.
    */
  var internalWebPropertyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for an Analytics experiment. This field is read-only.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An integer number in [3, 90]. Specifies the minimum length of the experiment. Can be changed for a running experiment. This field may not be changed for an experiments whose status is ENDED.
    */
  var minimumExperimentLengthInDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Experiment name. This field may not be changed for an experiment whose status is ENDED. This field is required when creating an experiment.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metric that the experiment is optimizing. Valid values: "ga:goal(n)Completions", "ga:adsenseAdsClicks", "ga:adsenseAdsViewed", "ga:adsenseRevenue", "ga:bounces", "ga:pageviews", "ga:sessionDuration", "ga:transactions", "ga:transactionRevenue". This field is required if status is "RUNNING" and servingFramework is one of "REDIRECT" or "API".
    */
  var objectiveMetric: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the objectiveMetric should be minimized or maximized. Possible values: "MAXIMUM", "MINIMUM". Optional--defaults to "MAXIMUM". Cannot be specified without objectiveMetric. Cannot be modified when status is "RUNNING" or "ENDED".
    */
  var optimizationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parent link for an experiment. Points to the view (profile) to which this experiment belongs.
    */
  var parentLink: js.UndefOr[Href | Null] = js.undefined
  
  /**
    * View (Profile) ID to which this experiment belongs. This field is read-only.
    */
  var profileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Why the experiment ended. Possible values: "STOPPED_BY_USER", "WINNER_FOUND", "EXPERIMENT_EXPIRED", "ENDED_WITH_NO_WINNER", "GOAL_OBJECTIVE_CHANGED". "ENDED_WITH_NO_WINNER" means that the experiment didn't expire but no winner was projected to be found. If the experiment status is changed via the API to ENDED this field is set to STOPPED_BY_USER. This field is read-only.
    */
  var reasonExperimentEnded: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Boolean specifying whether variations URLS are rewritten to match those of the original. This field may not be changed for an experiments whose status is ENDED.
    */
  var rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Link for this experiment. This field is read-only.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The framework used to serve the experiment variations and evaluate the results. One of:
    * - REDIRECT: Google Analytics redirects traffic to different variation pages, reports the chosen variation and evaluates the results.
    * - API: Google Analytics chooses and reports the variation to serve and evaluates the results; the caller is responsible for serving the selected variation.
    * - EXTERNAL: The variations will be served externally and the chosen variation reported to Google Analytics. The caller is responsible for serving the selected variation and evaluating the results.
    */
  var servingFramework: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The snippet of code to include on the control page(s). This field is read-only.
    */
  var snippet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The starting time of the experiment (the time the status changed from READY_TO_RUN to RUNNING). This field is present only if the experiment has started. This field is read-only.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Experiment status. Possible values: "DRAFT", "READY_TO_RUN", "RUNNING", "ENDED". Experiments can be created in the "DRAFT", "READY_TO_RUN" or "RUNNING" state. This field is required when creating an experiment.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A floating-point number in (0, 1]. Specifies the fraction of the traffic that participates in the experiment. Can be changed for a running experiment. This field may not be changed for an experiments whose status is ENDED.
    */
  var trafficCoverage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time the experiment was last modified. This field is read-only.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Array of variations. The first variation in the array is the original. The number of variations may not change once an experiment is in the RUNNING state. At least two variations are required before status can be set to RUNNING.
    */
  var variations: js.UndefOr[js.Array[Status] | Null] = js.undefined
  
  /**
    * Web property ID to which this experiment belongs. The web property ID is of the form UA-XXXXX-YY. This field is read-only.
    */
  var webPropertyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A floating-point number in (0, 1). Specifies the necessary confidence level to choose a winner. This field may not be changed for an experiments whose status is ENDED.
    */
  var winnerConfidenceLevel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Boolean specifying whether a winner has been found for this experiment. This field is read-only.
    */
  var winnerFound: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaExperiment {
  
  inline def apply(): SchemaExperiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExperiment]
  }
  
  extension [Self <: SchemaExperiment](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedNull: Self = StObject.set(x, "created", null)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEditableInGaUi(value: Boolean): Self = StObject.set(x, "editableInGaUi", value.asInstanceOf[js.Any])
    
    inline def setEditableInGaUiNull: Self = StObject.set(x, "editableInGaUi", null)
    
    inline def setEditableInGaUiUndefined: Self = StObject.set(x, "editableInGaUi", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEqualWeighting(value: Boolean): Self = StObject.set(x, "equalWeighting", value.asInstanceOf[js.Any])
    
    inline def setEqualWeightingNull: Self = StObject.set(x, "equalWeighting", null)
    
    inline def setEqualWeightingUndefined: Self = StObject.set(x, "equalWeighting", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdNull: Self = StObject.set(x, "internalWebPropertyId", null)
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMinimumExperimentLengthInDays(value: Double): Self = StObject.set(x, "minimumExperimentLengthInDays", value.asInstanceOf[js.Any])
    
    inline def setMinimumExperimentLengthInDaysNull: Self = StObject.set(x, "minimumExperimentLengthInDays", null)
    
    inline def setMinimumExperimentLengthInDaysUndefined: Self = StObject.set(x, "minimumExperimentLengthInDays", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectiveMetric(value: String): Self = StObject.set(x, "objectiveMetric", value.asInstanceOf[js.Any])
    
    inline def setObjectiveMetricNull: Self = StObject.set(x, "objectiveMetric", null)
    
    inline def setObjectiveMetricUndefined: Self = StObject.set(x, "objectiveMetric", js.undefined)
    
    inline def setOptimizationType(value: String): Self = StObject.set(x, "optimizationType", value.asInstanceOf[js.Any])
    
    inline def setOptimizationTypeNull: Self = StObject.set(x, "optimizationType", null)
    
    inline def setOptimizationTypeUndefined: Self = StObject.set(x, "optimizationType", js.undefined)
    
    inline def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkNull: Self = StObject.set(x, "parentLink", null)
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdNull: Self = StObject.set(x, "profileId", null)
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setReasonExperimentEnded(value: String): Self = StObject.set(x, "reasonExperimentEnded", value.asInstanceOf[js.Any])
    
    inline def setReasonExperimentEndedNull: Self = StObject.set(x, "reasonExperimentEnded", null)
    
    inline def setReasonExperimentEndedUndefined: Self = StObject.set(x, "reasonExperimentEnded", js.undefined)
    
    inline def setRewriteVariationUrlsAsOriginal(value: Boolean): Self = StObject.set(x, "rewriteVariationUrlsAsOriginal", value.asInstanceOf[js.Any])
    
    inline def setRewriteVariationUrlsAsOriginalNull: Self = StObject.set(x, "rewriteVariationUrlsAsOriginal", null)
    
    inline def setRewriteVariationUrlsAsOriginalUndefined: Self = StObject.set(x, "rewriteVariationUrlsAsOriginal", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServingFramework(value: String): Self = StObject.set(x, "servingFramework", value.asInstanceOf[js.Any])
    
    inline def setServingFrameworkNull: Self = StObject.set(x, "servingFramework", null)
    
    inline def setServingFrameworkUndefined: Self = StObject.set(x, "servingFramework", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetNull: Self = StObject.set(x, "snippet", null)
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrafficCoverage(value: Double): Self = StObject.set(x, "trafficCoverage", value.asInstanceOf[js.Any])
    
    inline def setTrafficCoverageNull: Self = StObject.set(x, "trafficCoverage", null)
    
    inline def setTrafficCoverageUndefined: Self = StObject.set(x, "trafficCoverage", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVariations(value: js.Array[Status]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    inline def setVariationsNull: Self = StObject.set(x, "variations", null)
    
    inline def setVariationsUndefined: Self = StObject.set(x, "variations", js.undefined)
    
    inline def setVariationsVarargs(value: Status*): Self = StObject.set(x, "variations", js.Array(value*))
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdNull: Self = StObject.set(x, "webPropertyId", null)
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
    
    inline def setWinnerConfidenceLevel(value: Double): Self = StObject.set(x, "winnerConfidenceLevel", value.asInstanceOf[js.Any])
    
    inline def setWinnerConfidenceLevelNull: Self = StObject.set(x, "winnerConfidenceLevel", null)
    
    inline def setWinnerConfidenceLevelUndefined: Self = StObject.set(x, "winnerConfidenceLevel", js.undefined)
    
    inline def setWinnerFound(value: Boolean): Self = StObject.set(x, "winnerFound", value.asInstanceOf[js.Any])
    
    inline def setWinnerFoundNull: Self = StObject.set(x, "winnerFound", null)
    
    inline def setWinnerFoundUndefined: Self = StObject.set(x, "winnerFound", js.undefined)
  }
}
