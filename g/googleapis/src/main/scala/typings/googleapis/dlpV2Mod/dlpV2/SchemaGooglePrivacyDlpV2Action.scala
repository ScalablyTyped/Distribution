package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Action extends StObject {
  
  /**
    * Create a de-identified copy of the input data.
    */
  var deidentify: js.UndefOr[SchemaGooglePrivacyDlpV2Deidentify] = js.undefined
  
  /**
    * Enable email notification for project owners and editors on job's completion/failure.
    */
  var jobNotificationEmails: js.UndefOr[SchemaGooglePrivacyDlpV2JobNotificationEmails] = js.undefined
  
  /**
    * Publish a notification to a pubsub topic.
    */
  var pubSub: js.UndefOr[SchemaGooglePrivacyDlpV2PublishToPubSub] = js.undefined
  
  /**
    * Publish findings to Cloud Datahub.
    */
  var publishFindingsToCloudDataCatalog: js.UndefOr[SchemaGooglePrivacyDlpV2PublishFindingsToCloudDataCatalog] = js.undefined
  
  /**
    * Publish summary to Cloud Security Command Center (Alpha).
    */
  var publishSummaryToCscc: js.UndefOr[SchemaGooglePrivacyDlpV2PublishSummaryToCscc] = js.undefined
  
  /**
    * Enable Stackdriver metric dlp.googleapis.com/finding_count.
    */
  var publishToStackdriver: js.UndefOr[SchemaGooglePrivacyDlpV2PublishToStackdriver] = js.undefined
  
  /**
    * Save resulting findings in a provided location.
    */
  var saveFindings: js.UndefOr[SchemaGooglePrivacyDlpV2SaveFindings] = js.undefined
}
object SchemaGooglePrivacyDlpV2Action {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Action]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Action](x: Self) {
    
    inline def setDeidentify(value: SchemaGooglePrivacyDlpV2Deidentify): Self = StObject.set(x, "deidentify", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyUndefined: Self = StObject.set(x, "deidentify", js.undefined)
    
    inline def setJobNotificationEmails(value: SchemaGooglePrivacyDlpV2JobNotificationEmails): Self = StObject.set(x, "jobNotificationEmails", value.asInstanceOf[js.Any])
    
    inline def setJobNotificationEmailsUndefined: Self = StObject.set(x, "jobNotificationEmails", js.undefined)
    
    inline def setPubSub(value: SchemaGooglePrivacyDlpV2PublishToPubSub): Self = StObject.set(x, "pubSub", value.asInstanceOf[js.Any])
    
    inline def setPubSubUndefined: Self = StObject.set(x, "pubSub", js.undefined)
    
    inline def setPublishFindingsToCloudDataCatalog(value: SchemaGooglePrivacyDlpV2PublishFindingsToCloudDataCatalog): Self = StObject.set(x, "publishFindingsToCloudDataCatalog", value.asInstanceOf[js.Any])
    
    inline def setPublishFindingsToCloudDataCatalogUndefined: Self = StObject.set(x, "publishFindingsToCloudDataCatalog", js.undefined)
    
    inline def setPublishSummaryToCscc(value: SchemaGooglePrivacyDlpV2PublishSummaryToCscc): Self = StObject.set(x, "publishSummaryToCscc", value.asInstanceOf[js.Any])
    
    inline def setPublishSummaryToCsccUndefined: Self = StObject.set(x, "publishSummaryToCscc", js.undefined)
    
    inline def setPublishToStackdriver(value: SchemaGooglePrivacyDlpV2PublishToStackdriver): Self = StObject.set(x, "publishToStackdriver", value.asInstanceOf[js.Any])
    
    inline def setPublishToStackdriverUndefined: Self = StObject.set(x, "publishToStackdriver", js.undefined)
    
    inline def setSaveFindings(value: SchemaGooglePrivacyDlpV2SaveFindings): Self = StObject.set(x, "saveFindings", value.asInstanceOf[js.Any])
    
    inline def setSaveFindingsUndefined: Self = StObject.set(x, "saveFindings", js.undefined)
  }
}
