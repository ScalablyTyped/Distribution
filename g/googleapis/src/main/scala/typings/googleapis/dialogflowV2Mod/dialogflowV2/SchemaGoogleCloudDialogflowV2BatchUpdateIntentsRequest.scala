package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Intents.BatchUpdateIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest extends js.Object {
  /**
    * The collection of intents to update or create.
    */
  var intentBatchInline: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentBatch] = js.native
  /**
    * The URI to a Google Cloud Storage file containing intents to update or
    * create. The file format can either be a serialized proto (of IntentBatch
    * type) or JSON object. Note: The URI must start with &quot;gs://&quot;.
    */
  var intentBatchUri: js.UndefOr[String] = js.native
  /**
    * Optional. The resource view to apply to the returned intent.
    */
  var intentView: js.UndefOr[String] = js.native
  /**
    * Optional. The language of training phrases, parameters and rich messages
    * defined in `intents`. If not specified, the agent&#39;s default language
    * is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest {
  @scala.inline
  def apply(
    intentBatchInline: SchemaGoogleCloudDialogflowV2IntentBatch = null,
    intentBatchUri: String = null,
    intentView: String = null,
    languageCode: String = null,
    updateMask: String = null
  ): SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intentBatchInline != null) __obj.updateDynamic("intentBatchInline")(intentBatchInline.asInstanceOf[js.Any])
    if (intentBatchUri != null) __obj.updateDynamic("intentBatchUri")(intentBatchUri.asInstanceOf[js.Any])
    if (intentView != null) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchUpdateIntentsRequest]
  }
}

