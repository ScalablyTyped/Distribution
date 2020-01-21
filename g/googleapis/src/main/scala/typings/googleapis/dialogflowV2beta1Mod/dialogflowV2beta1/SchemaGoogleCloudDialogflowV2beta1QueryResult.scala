package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of conversational query or event processing.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1QueryResult extends js.Object {
  /**
    * The action name from the matched intent.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * This field is set to: - `false` if the matched intent has required
    * parameters and not all of    the required parameter values have been
    * collected. - `true` if all required parameter values have been collected,
    * or if the    matched intent doesn&#39;t contain any required parameters.
    */
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.native
  /**
    * The free-form diagnostic info. For example, this field could contain
    * webhook call latency. The string keys of the Struct&#39;s fields map can
    * change without notice.
    */
  var diagnosticInfo: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The collection of rich messages to present to the user.
    */
  var fulfillmentMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessage]] = js.native
  /**
    * The text to be pronounced to the user or shown on the screen. Note: This
    * is a legacy field, `fulfillment_messages` should be preferred.
    */
  var fulfillmentText: js.UndefOr[String] = js.native
  /**
    * The intent that matched the conversational query. Some, not all fields
    * are filled in this message, including but not limited to: `name`,
    * `display_name` and `webhook_state`.
    */
  var intent: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  /**
    * The intent detection confidence. Values range from 0.0 (completely
    * uncertain) to 1.0 (completely certain). If there are `multiple
    * knowledge_answers` messages, this value is set to the greatest
    * `knowledgeAnswers.match_confidence` value in the list.
    */
  var intentDetectionConfidence: js.UndefOr[Double] = js.native
  /**
    * The result from Knowledge Connector (if any), ordered by decreasing
    * `KnowledgeAnswers.match_confidence`.
    */
  var knowledgeAnswers: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers] = js.native
  /**
    * The language that was triggered during intent detection. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The collection of output contexts. If applicable,
    * `output_contexts.parameters` contains entries with name `&lt;parameter
    * name&gt;.original` containing the original parameter values before the
    * query.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Context]] = js.native
  /**
    * The collection of extracted parameters.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The original conversational query text: - If natural language text was
    * provided as input, `query_text` contains   a copy of the input. - If
    * natural language speech audio was provided as input, `query_text`
    * contains the speech recognition result. If speech recognizer produced
    * multiple alternatives, a particular one is picked. - If an event was
    * provided as input, `query_text` is not set.
    */
  var queryText: js.UndefOr[String] = js.native
  /**
    * The sentiment analysis result, which depends on the
    * `sentiment_analysis_request_config` specified in the request.
    */
  var sentimentAnalysisResult: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisResult] = js.native
  /**
    * The Speech recognition confidence between 0.0 and 1.0. A higher number
    * indicates an estimated greater likelihood that the recognized words are
    * correct. The default of 0.0 is a sentinel value indicating that
    * confidence was not set.  This field is not guaranteed to be accurate or
    * set. In particular this field isn&#39;t set for StreamingDetectIntent
    * since the streaming endpoint has separate confidence estimates per
    * portion of the audio in StreamingRecognitionResult.
    */
  var speechRecognitionConfidence: js.UndefOr[Double] = js.native
  /**
    * If the query was fulfilled by a webhook call, this field is set to the
    * value of the `payload` field returned in the webhook response.
    */
  var webhookPayload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * If the query was fulfilled by a webhook call, this field is set to the
    * value of the `source` field returned in the webhook response.
    */
  var webhookSource: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1QueryResult {
  @scala.inline
  def apply(
    action: String = null,
    allRequiredParamsPresent: js.UndefOr[Boolean] = js.undefined,
    diagnosticInfo: StringDictionary[js.Any] = null,
    fulfillmentMessages: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessage] = null,
    fulfillmentText: String = null,
    intent: SchemaGoogleCloudDialogflowV2beta1Intent = null,
    intentDetectionConfidence: Int | Double = null,
    knowledgeAnswers: SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers = null,
    languageCode: String = null,
    outputContexts: js.Array[SchemaGoogleCloudDialogflowV2beta1Context] = null,
    parameters: StringDictionary[js.Any] = null,
    queryText: String = null,
    sentimentAnalysisResult: SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisResult = null,
    speechRecognitionConfidence: Int | Double = null,
    webhookPayload: StringDictionary[js.Any] = null,
    webhookSource: String = null
  ): SchemaGoogleCloudDialogflowV2beta1QueryResult = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allRequiredParamsPresent)) __obj.updateDynamic("allRequiredParamsPresent")(allRequiredParamsPresent.asInstanceOf[js.Any])
    if (diagnosticInfo != null) __obj.updateDynamic("diagnosticInfo")(diagnosticInfo.asInstanceOf[js.Any])
    if (fulfillmentMessages != null) __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages.asInstanceOf[js.Any])
    if (fulfillmentText != null) __obj.updateDynamic("fulfillmentText")(fulfillmentText.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (intentDetectionConfidence != null) __obj.updateDynamic("intentDetectionConfidence")(intentDetectionConfidence.asInstanceOf[js.Any])
    if (knowledgeAnswers != null) __obj.updateDynamic("knowledgeAnswers")(knowledgeAnswers.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (queryText != null) __obj.updateDynamic("queryText")(queryText.asInstanceOf[js.Any])
    if (sentimentAnalysisResult != null) __obj.updateDynamic("sentimentAnalysisResult")(sentimentAnalysisResult.asInstanceOf[js.Any])
    if (speechRecognitionConfidence != null) __obj.updateDynamic("speechRecognitionConfidence")(speechRecognitionConfidence.asInstanceOf[js.Any])
    if (webhookPayload != null) __obj.updateDynamic("webhookPayload")(webhookPayload.asInstanceOf[js.Any])
    if (webhookSource != null) __obj.updateDynamic("webhookSource")(webhookSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1QueryResult]
  }
}

