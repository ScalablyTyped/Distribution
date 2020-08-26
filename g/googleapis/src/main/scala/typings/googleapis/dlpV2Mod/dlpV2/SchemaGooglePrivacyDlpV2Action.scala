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
  def apply(): SchemaGooglePrivacyDlpV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Action]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ActionOps[Self <: SchemaGooglePrivacyDlpV2Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobNotificationEmails(value: SchemaGooglePrivacyDlpV2JobNotificationEmails): Self = this.set("jobNotificationEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobNotificationEmails: Self = this.set("jobNotificationEmails", js.undefined)
    @scala.inline
    def setPubSub(value: SchemaGooglePrivacyDlpV2PublishToPubSub): Self = this.set("pubSub", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubSub: Self = this.set("pubSub", js.undefined)
    @scala.inline
    def setPublishSummaryToCscc(value: SchemaGooglePrivacyDlpV2PublishSummaryToCscc): Self = this.set("publishSummaryToCscc", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishSummaryToCscc: Self = this.set("publishSummaryToCscc", js.undefined)
    @scala.inline
    def setSaveFindings(value: SchemaGooglePrivacyDlpV2SaveFindings): Self = this.set("saveFindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveFindings: Self = this.set("saveFindings", js.undefined)
  }
  
}

