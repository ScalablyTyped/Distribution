package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of querying a Knowledge base.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers extends js.Object {
  /**
    * A list of answers from Knowledge Connector.
    */
  var answers: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers {
  @scala.inline
  def apply(answers: js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer] = null): SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    if (answers != null) __obj.updateDynamic("answers")(answers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers]
  }
}

