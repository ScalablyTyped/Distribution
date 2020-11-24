package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig extends js.Object {
  
  /** Optional. A human-readable description for AnnotatedDataset. The description can be up to 10000 characters long. */
  var annotatedDatasetDescription: js.UndefOr[String] = js.native
  
  /** Required. A human-readable name for AnnotatedDataset defined by users. Maximum of 64 characters . */
  var annotatedDatasetDisplayName: js.UndefOr[String] = js.native
  
  /**
    * Optional. If you want your own labeling contributors to manage and work on this labeling request, you can set these contributors here. We will give them access to the question types
    * in crowdcompute. Note that these emails must be registered in crowdcompute worker UI: https://crowd-compute.appspot.com/
    */
  var contributorEmails: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. Instruction resource name. */
  var instruction: js.UndefOr[String] = js.native
  
  /** Optional. A human-readable label used to logically group labeling tasks. This string must match the regular expression `[a-zA-Z\\d_-]{0,128}`. */
  var labelGroup: js.UndefOr[String] = js.native
  
  /**
    * Optional. The Language of this question, as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). Default value is en-US. Only need to set this when task is language related.
    * For example, French text classification.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Optional. Maximum duration for contributors to answer a question. Maximum is 3600 seconds. Default is 3600 seconds. */
  var questionDuration: js.UndefOr[String] = js.native
  
  /**
    * Optional. Replication of questions. Each question will be sent to up to this number of contributors to label. Aggregated answers will be returned. Default is set to 1. For image
    * related labeling, valid values are 1, 3, 5.
    */
  var replicaCount: js.UndefOr[Double] = js.native
  
  /** Email of the user who started the labeling task and should be notified by email. If empty no notification will be sent. */
  var userEmailAddress: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfigOps[Self <: GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig] (val x: Self) extends AnyVal {
    
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
    def setAnnotatedDatasetDescription(value: String): Self = this.set("annotatedDatasetDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedDatasetDescription: Self = this.set("annotatedDatasetDescription", js.undefined)
    
    @scala.inline
    def setAnnotatedDatasetDisplayName(value: String): Self = this.set("annotatedDatasetDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedDatasetDisplayName: Self = this.set("annotatedDatasetDisplayName", js.undefined)
    
    @scala.inline
    def setContributorEmailsVarargs(value: String*): Self = this.set("contributorEmails", js.Array(value :_*))
    
    @scala.inline
    def setContributorEmails(value: js.Array[String]): Self = this.set("contributorEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributorEmails: Self = this.set("contributorEmails", js.undefined)
    
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstruction: Self = this.set("instruction", js.undefined)
    
    @scala.inline
    def setLabelGroup(value: String): Self = this.set("labelGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelGroup: Self = this.set("labelGroup", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setQuestionDuration(value: String): Self = this.set("questionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuestionDuration: Self = this.set("questionDuration", js.undefined)
    
    @scala.inline
    def setReplicaCount(value: Double): Self = this.set("replicaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaCount: Self = this.set("replicaCount", js.undefined)
    
    @scala.inline
    def setUserEmailAddress(value: String): Self = this.set("userEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEmailAddress: Self = this.set("userEmailAddress", js.undefined)
  }
}
