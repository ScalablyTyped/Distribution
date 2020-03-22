package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.AnonHref
import typings.googleapis.AnonStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics experiment resource.
  */
@js.native
trait SchemaExperiment extends js.Object {
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
  var parentLink: js.UndefOr[AnonHref] = js.native
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
  var variations: js.UndefOr[js.Array[AnonStatus]] = js.native
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
  def apply(
    accountId: String = null,
    created: String = null,
    description: String = null,
    editableInGaUi: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    equalWeighting: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    minimumExperimentLengthInDays: Int | Double = null,
    name: String = null,
    objectiveMetric: String = null,
    optimizationType: String = null,
    parentLink: AnonHref = null,
    profileId: String = null,
    reasonExperimentEnded: String = null,
    rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean] = js.undefined,
    selfLink: String = null,
    servingFramework: String = null,
    snippet: String = null,
    startTime: String = null,
    status: String = null,
    trafficCoverage: Int | Double = null,
    updated: String = null,
    variations: js.Array[AnonStatus] = null,
    webPropertyId: String = null,
    winnerConfidenceLevel: Int | Double = null,
    winnerFound: js.UndefOr[Boolean] = js.undefined
  ): SchemaExperiment = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(editableInGaUi)) __obj.updateDynamic("editableInGaUi")(editableInGaUi.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(equalWeighting)) __obj.updateDynamic("equalWeighting")(equalWeighting.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (minimumExperimentLengthInDays != null) __obj.updateDynamic("minimumExperimentLengthInDays")(minimumExperimentLengthInDays.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectiveMetric != null) __obj.updateDynamic("objectiveMetric")(objectiveMetric.asInstanceOf[js.Any])
    if (optimizationType != null) __obj.updateDynamic("optimizationType")(optimizationType.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (reasonExperimentEnded != null) __obj.updateDynamic("reasonExperimentEnded")(reasonExperimentEnded.asInstanceOf[js.Any])
    if (!js.isUndefined(rewriteVariationUrlsAsOriginal)) __obj.updateDynamic("rewriteVariationUrlsAsOriginal")(rewriteVariationUrlsAsOriginal.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (servingFramework != null) __obj.updateDynamic("servingFramework")(servingFramework.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trafficCoverage != null) __obj.updateDynamic("trafficCoverage")(trafficCoverage.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (variations != null) __obj.updateDynamic("variations")(variations.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    if (winnerConfidenceLevel != null) __obj.updateDynamic("winnerConfidenceLevel")(winnerConfidenceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(winnerFound)) __obj.updateDynamic("winnerFound")(winnerFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExperiment]
  }
}

