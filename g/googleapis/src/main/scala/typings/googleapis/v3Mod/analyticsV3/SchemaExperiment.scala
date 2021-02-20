package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Href
import typings.googleapis.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Analytics experiment resource.
  */
@js.native
trait SchemaExperiment extends StObject {
  
  /**
    * Account ID to which this experiment belongs. This field is read-only.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Time the experiment was created. This field is read-only.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Notes about this experiment.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * If true, the end user will be able to edit the experiment via the Google
    * Analytics user interface.
    */
  var editableInGaUi: js.UndefOr[Boolean] = js.native
  
  /**
    * The ending time of the experiment (the time the status changed from
    * RUNNING to ENDED). This field is present only if the experiment has
    * ended. This field is read-only.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Boolean specifying whether to distribute traffic evenly across all
    * variations. If the value is False, content experiments follows the
    * default behavior of adjusting traffic dynamically based on variation
    * performance. Optional -- defaults to False. This field may not be changed
    * for an experiment whose status is ENDED.
    */
  var equalWeighting: js.UndefOr[Boolean] = js.native
  
  /**
    * Experiment ID. Required for patch and update. Disallowed for create.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Internal ID for the web property to which this experiment belongs. This
    * field is read-only.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  /**
    * Resource type for an Analytics experiment. This field is read-only.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * An integer number in [3, 90]. Specifies the minimum length of the
    * experiment. Can be changed for a running experiment. This field may not
    * be changed for an experiments whose status is ENDED.
    */
  var minimumExperimentLengthInDays: js.UndefOr[Double] = js.native
  
  /**
    * Experiment name. This field may not be changed for an experiment whose
    * status is ENDED. This field is required when creating an experiment.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The metric that the experiment is optimizing. Valid values:
    * &quot;ga:goal(n)Completions&quot;, &quot;ga:adsenseAdsClicks&quot;,
    * &quot;ga:adsenseAdsViewed&quot;, &quot;ga:adsenseRevenue&quot;,
    * &quot;ga:bounces&quot;, &quot;ga:pageviews&quot;,
    * &quot;ga:sessionDuration&quot;, &quot;ga:transactions&quot;,
    * &quot;ga:transactionRevenue&quot;. This field is required if status is
    * &quot;RUNNING&quot; and servingFramework is one of &quot;REDIRECT&quot;
    * or &quot;API&quot;.
    */
  var objectiveMetric: js.UndefOr[String] = js.native
  
  /**
    * Whether the objectiveMetric should be minimized or maximized. Possible
    * values: &quot;MAXIMUM&quot;, &quot;MINIMUM&quot;. Optional--defaults to
    * &quot;MAXIMUM&quot;. Cannot be specified without objectiveMetric. Cannot
    * be modified when status is &quot;RUNNING&quot; or &quot;ENDED&quot;.
    */
  var optimizationType: js.UndefOr[String] = js.native
  
  /**
    * Parent link for an experiment. Points to the view (profile) to which this
    * experiment belongs.
    */
  var parentLink: js.UndefOr[Href] = js.native
  
  /**
    * View (Profile) ID to which this experiment belongs. This field is
    * read-only.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Why the experiment ended. Possible values: &quot;STOPPED_BY_USER&quot;,
    * &quot;WINNER_FOUND&quot;, &quot;EXPERIMENT_EXPIRED&quot;,
    * &quot;ENDED_WITH_NO_WINNER&quot;, &quot;GOAL_OBJECTIVE_CHANGED&quot;.
    * &quot;ENDED_WITH_NO_WINNER&quot; means that the experiment didn&#39;t
    * expire but no winner was projected to be found. If the experiment status
    * is changed via the API to ENDED this field is set to STOPPED_BY_USER.
    * This field is read-only.
    */
  var reasonExperimentEnded: js.UndefOr[String] = js.native
  
  /**
    * Boolean specifying whether variations URLS are rewritten to match those
    * of the original. This field may not be changed for an experiments whose
    * status is ENDED.
    */
  var rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean] = js.native
  
  /**
    * Link for this experiment. This field is read-only.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The framework used to serve the experiment variations and evaluate the
    * results. One of:   - REDIRECT: Google Analytics redirects traffic to
    * different variation pages, reports the chosen variation and evaluates the
    * results. - API: Google Analytics chooses and reports the variation to
    * serve and evaluates the results; the caller is responsible for serving
    * the selected variation. - EXTERNAL: The variations will be served
    * externally and the chosen variation reported to Google Analytics. The
    * caller is responsible for serving the selected variation and evaluating
    * the results.
    */
  var servingFramework: js.UndefOr[String] = js.native
  
  /**
    * The snippet of code to include on the control page(s). This field is
    * read-only.
    */
  var snippet: js.UndefOr[String] = js.native
  
  /**
    * The starting time of the experiment (the time the status changed from
    * READY_TO_RUN to RUNNING). This field is present only if the experiment
    * has started. This field is read-only.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Experiment status. Possible values: &quot;DRAFT&quot;,
    * &quot;READY_TO_RUN&quot;, &quot;RUNNING&quot;, &quot;ENDED&quot;.
    * Experiments can be created in the &quot;DRAFT&quot;,
    * &quot;READY_TO_RUN&quot; or &quot;RUNNING&quot; state. This field is
    * required when creating an experiment.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * A floating-point number in (0, 1]. Specifies the fraction of the traffic
    * that participates in the experiment. Can be changed for a running
    * experiment. This field may not be changed for an experiments whose status
    * is ENDED.
    */
  var trafficCoverage: js.UndefOr[Double] = js.native
  
  /**
    * Time the experiment was last modified. This field is read-only.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Array of variations. The first variation in the array is the original.
    * The number of variations may not change once an experiment is in the
    * RUNNING state. At least two variations are required before status can be
    * set to RUNNING.
    */
  var variations: js.UndefOr[js.Array[Status]] = js.native
  
  /**
    * Web property ID to which this experiment belongs. The web property ID is
    * of the form UA-XXXXX-YY. This field is read-only.
    */
  var webPropertyId: js.UndefOr[String] = js.native
  
  /**
    * A floating-point number in (0, 1). Specifies the necessary confidence
    * level to choose a winner. This field may not be changed for an
    * experiments whose status is ENDED.
    */
  var winnerConfidenceLevel: js.UndefOr[Double] = js.native
  
  /**
    * Boolean specifying whether a winner has been found for this experiment.
    * This field is read-only.
    */
  var winnerFound: js.UndefOr[Boolean] = js.native
}
object SchemaExperiment {
  
  @scala.inline
  def apply(): SchemaExperiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExperiment]
  }
  
  @scala.inline
  implicit class SchemaExperimentMutableBuilder[Self <: SchemaExperiment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEditableInGaUi(value: Boolean): Self = StObject.set(x, "editableInGaUi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableInGaUiUndefined: Self = StObject.set(x, "editableInGaUi", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEqualWeighting(value: Boolean): Self = StObject.set(x, "equalWeighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualWeightingUndefined: Self = StObject.set(x, "equalWeighting", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMinimumExperimentLengthInDays(value: Double): Self = StObject.set(x, "minimumExperimentLengthInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumExperimentLengthInDaysUndefined: Self = StObject.set(x, "minimumExperimentLengthInDays", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObjectiveMetric(value: String): Self = StObject.set(x, "objectiveMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectiveMetricUndefined: Self = StObject.set(x, "objectiveMetric", js.undefined)
    
    @scala.inline
    def setOptimizationType(value: String): Self = StObject.set(x, "optimizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizationTypeUndefined: Self = StObject.set(x, "optimizationType", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setReasonExperimentEnded(value: String): Self = StObject.set(x, "reasonExperimentEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonExperimentEndedUndefined: Self = StObject.set(x, "reasonExperimentEnded", js.undefined)
    
    @scala.inline
    def setRewriteVariationUrlsAsOriginal(value: Boolean): Self = StObject.set(x, "rewriteVariationUrlsAsOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewriteVariationUrlsAsOriginalUndefined: Self = StObject.set(x, "rewriteVariationUrlsAsOriginal", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setServingFramework(value: String): Self = StObject.set(x, "servingFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServingFrameworkUndefined: Self = StObject.set(x, "servingFramework", js.undefined)
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTrafficCoverage(value: Double): Self = StObject.set(x, "trafficCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficCoverageUndefined: Self = StObject.set(x, "trafficCoverage", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setVariations(value: js.Array[Status]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationsUndefined: Self = StObject.set(x, "variations", js.undefined)
    
    @scala.inline
    def setVariationsVarargs(value: Status*): Self = StObject.set(x, "variations", js.Array(value :_*))
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
    
    @scala.inline
    def setWinnerConfidenceLevel(value: Double): Self = StObject.set(x, "winnerConfidenceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinnerConfidenceLevelUndefined: Self = StObject.set(x, "winnerConfidenceLevel", js.undefined)
    
    @scala.inline
    def setWinnerFound(value: Boolean): Self = StObject.set(x, "winnerFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinnerFoundUndefined: Self = StObject.set(x, "winnerFound", js.undefined)
  }
}
