package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An answer from Knowledge Connector.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer extends js.Object {
  
  /**
    * The piece of text from the `source` knowledge base document that answers
    * this conversational query.
    */
  var answer: js.UndefOr[String] = js.native
  
  /**
    * The corresponding FAQ question if the answer was extracted from a FAQ
    * Document, empty otherwise.
    */
  var faqQuestion: js.UndefOr[String] = js.native
  
  /**
    * The system&#39;s confidence score that this Knowledge answer is a good
    * match for this conversational query. The range is from 0.0 (completely
    * uncertain) to 1.0 (completely certain). Note: The confidence score is
    * likely to vary somewhat (possibly even for identical requests), as the
    * underlying model is under constant improvement. It may be deprecated in
    * the future. We recommend using `match_confidence_level` which should be
    * generally more stable.
    */
  var matchConfidence: js.UndefOr[Double] = js.native
  
  /**
    * The system&#39;s confidence level that this knowledge answer is a good
    * match for this conversational query. NOTE: The confidence level for a
    * given `&lt;query, answer&gt;` pair may change without notice, as it
    * depends on models that are constantly being improved. However, it will
    * change less frequently than the confidence score below, and should be
    * preferred for referencing the quality of an answer.
    */
  var matchConfidenceLevel: js.UndefOr[String] = js.native
  
  /**
    * Indicates which Knowledge Document this answer was extracted from.
    * Format: `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base
    * ID&gt;/documents/&lt;Document ID&gt;`.
    */
  var source: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswerOps[Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer] (val x: Self) extends AnyVal {
    
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
    def setAnswer(value: String): Self = this.set("answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswer: Self = this.set("answer", js.undefined)
    
    @scala.inline
    def setFaqQuestion(value: String): Self = this.set("faqQuestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaqQuestion: Self = this.set("faqQuestion", js.undefined)
    
    @scala.inline
    def setMatchConfidence(value: Double): Self = this.set("matchConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchConfidence: Self = this.set("matchConfidence", js.undefined)
    
    @scala.inline
    def setMatchConfidenceLevel(value: String): Self = this.set("matchConfidenceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchConfidenceLevel: Self = this.set("matchConfidenceLevel", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
