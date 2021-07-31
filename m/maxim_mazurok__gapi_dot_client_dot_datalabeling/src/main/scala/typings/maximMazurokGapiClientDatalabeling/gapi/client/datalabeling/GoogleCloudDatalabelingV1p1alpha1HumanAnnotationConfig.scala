package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig extends StObject {
  
  /** Optional. A human-readable description for AnnotatedDataset. The description can be up to 10000 characters long. */
  var annotatedDatasetDescription: js.UndefOr[String] = js.undefined
  
  /** Required. A human-readable name for AnnotatedDataset defined by users. Maximum of 64 characters . */
  var annotatedDatasetDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If you want your own labeling contributors to manage and work on this labeling request, you can set these contributors here. We will give them access to the question types
    * in crowdcompute. Note that these emails must be registered in crowdcompute worker UI: https://crowd-compute.appspot.com/
    */
  var contributorEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Instruction resource name. */
  var instruction: js.UndefOr[String] = js.undefined
  
  /** Optional. A human-readable label used to logically group labeling tasks. This string must match the regular expression `[a-zA-Z\\d_-]{0,128}`. */
  var labelGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Language of this question, as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). Default value is en-US. Only need to set this when task is language related.
    * For example, French text classification.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Optional. Maximum duration for contributors to answer a question. Maximum is 3600 seconds. Default is 3600 seconds. */
  var questionDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Replication of questions. Each question will be sent to up to this number of contributors to label. Aggregated answers will be returned. Default is set to 1. For image
    * related labeling, valid values are 1, 3, 5.
    */
  var replicaCount: js.UndefOr[Double] = js.undefined
  
  /** Email of the user who started the labeling task and should be notified by email. If empty no notification will be sent. */
  var userEmailAddress: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotatedDatasetDescription(value: String): Self = StObject.set(x, "annotatedDatasetDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatedDatasetDescriptionUndefined: Self = StObject.set(x, "annotatedDatasetDescription", js.undefined)
    
    @scala.inline
    def setAnnotatedDatasetDisplayName(value: String): Self = StObject.set(x, "annotatedDatasetDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatedDatasetDisplayNameUndefined: Self = StObject.set(x, "annotatedDatasetDisplayName", js.undefined)
    
    @scala.inline
    def setContributorEmails(value: js.Array[String]): Self = StObject.set(x, "contributorEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorEmailsUndefined: Self = StObject.set(x, "contributorEmails", js.undefined)
    
    @scala.inline
    def setContributorEmailsVarargs(value: String*): Self = StObject.set(x, "contributorEmails", js.Array(value :_*))
    
    @scala.inline
    def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    @scala.inline
    def setLabelGroup(value: String): Self = StObject.set(x, "labelGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelGroupUndefined: Self = StObject.set(x, "labelGroup", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setQuestionDuration(value: String): Self = StObject.set(x, "questionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionDurationUndefined: Self = StObject.set(x, "questionDuration", js.undefined)
    
    @scala.inline
    def setReplicaCount(value: Double): Self = StObject.set(x, "replicaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaCountUndefined: Self = StObject.set(x, "replicaCount", js.undefined)
    
    @scala.inline
    def setUserEmailAddress(value: String): Self = StObject.set(x, "userEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailAddressUndefined: Self = StObject.set(x, "userEmailAddress", js.undefined)
  }
}
