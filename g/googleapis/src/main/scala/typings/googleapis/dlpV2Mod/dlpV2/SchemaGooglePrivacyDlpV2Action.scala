package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task to execute on the completion of a job. See
  * https://cloud.google.com/dlp/docs/concepts-actions to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Action extends js.Object {
  /**
    * Enable email notification to project owners and editors on job&#39;s
    * completion/failure.
    */
  var jobNotificationEmails: js.UndefOr[SchemaGooglePrivacyDlpV2JobNotificationEmails] = js.native
  /**
    * Publish a notification to a pubsub topic.
    */
  var pubSub: js.UndefOr[SchemaGooglePrivacyDlpV2PublishToPubSub] = js.native
  /**
    * Publish summary to Cloud Security Command Center (Alpha).
    */
  var publishSummaryToCscc: js.UndefOr[SchemaGooglePrivacyDlpV2PublishSummaryToCscc] = js.native
  /**
    * Save resulting findings in a provided location.
    */
  var saveFindings: js.UndefOr[SchemaGooglePrivacyDlpV2SaveFindings] = js.native
}

object SchemaGooglePrivacyDlpV2Action {
  @scala.inline
  def apply(
    jobNotificationEmails: SchemaGooglePrivacyDlpV2JobNotificationEmails = null,
    pubSub: SchemaGooglePrivacyDlpV2PublishToPubSub = null,
    publishSummaryToCscc: SchemaGooglePrivacyDlpV2PublishSummaryToCscc = null,
    saveFindings: SchemaGooglePrivacyDlpV2SaveFindings = null
  ): SchemaGooglePrivacyDlpV2Action = {
    val __obj = js.Dynamic.literal()
    if (jobNotificationEmails != null) __obj.updateDynamic("jobNotificationEmails")(jobNotificationEmails.asInstanceOf[js.Any])
    if (pubSub != null) __obj.updateDynamic("pubSub")(pubSub.asInstanceOf[js.Any])
    if (publishSummaryToCscc != null) __obj.updateDynamic("publishSummaryToCscc")(publishSummaryToCscc.asInstanceOf[js.Any])
    if (saveFindings != null) __obj.updateDynamic("saveFindings")(saveFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Action]
  }
}

