package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A task to execute on the completion of a job. See
  * https://cloud.google.com/dlp/docs/concepts-actions to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Action extends StObject {
  
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
  implicit class SchemaGooglePrivacyDlpV2ActionMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobNotificationEmails(value: SchemaGooglePrivacyDlpV2JobNotificationEmails): Self = StObject.set(x, "jobNotificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNotificationEmailsUndefined: Self = StObject.set(x, "jobNotificationEmails", js.undefined)
    
    @scala.inline
    def setPubSub(value: SchemaGooglePrivacyDlpV2PublishToPubSub): Self = StObject.set(x, "pubSub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubSubUndefined: Self = StObject.set(x, "pubSub", js.undefined)
    
    @scala.inline
    def setPublishSummaryToCscc(value: SchemaGooglePrivacyDlpV2PublishSummaryToCscc): Self = StObject.set(x, "publishSummaryToCscc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishSummaryToCsccUndefined: Self = StObject.set(x, "publishSummaryToCscc", js.undefined)
    
    @scala.inline
    def setSaveFindings(value: SchemaGooglePrivacyDlpV2SaveFindings): Self = StObject.set(x, "saveFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveFindingsUndefined: Self = StObject.set(x, "saveFindings", js.undefined)
  }
}
