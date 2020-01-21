package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for a webhook call.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2WebhookRequest extends js.Object {
  /**
    * Optional. The contents of the original request that was passed to
    * `[Streaming]DetectIntent` call.
    */
  var originalDetectIntentRequest: js.UndefOr[SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest] = js.native
  /**
    * The result of the conversational query or event processing. Contains the
    * same value as `[Streaming]DetectIntentResponse.query_result`.
    */
  var queryResult: js.UndefOr[SchemaGoogleCloudDialogflowV2QueryResult] = js.native
  /**
    * The unique identifier of the response. Contains the same value as
    * `[Streaming]DetectIntentResponse.response_id`.
    */
  var responseId: js.UndefOr[String] = js.native
  /**
    * The unique identifier of detectIntent request session. Can be used to
    * identify end-user inside webhook implementation. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
    * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment
    * ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session ID&gt;`.
    */
  var session: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2WebhookRequest {
  @scala.inline
  def apply(
    originalDetectIntentRequest: SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest = null,
    queryResult: SchemaGoogleCloudDialogflowV2QueryResult = null,
    responseId: String = null,
    session: String = null
  ): SchemaGoogleCloudDialogflowV2WebhookRequest = {
    val __obj = js.Dynamic.literal()
    if (originalDetectIntentRequest != null) __obj.updateDynamic("originalDetectIntentRequest")(originalDetectIntentRequest.asInstanceOf[js.Any])
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult.asInstanceOf[js.Any])
    if (responseId != null) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2WebhookRequest]
  }
}

