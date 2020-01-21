package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KnowledgeBases.ListKnowledgeBases.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse extends js.Object {
  /**
    * The list of knowledge bases.
    */
  var knowledgeBases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse {
  @scala.inline
  def apply(
    knowledgeBases: js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] = null,
    nextPageToken: String = null
  ): SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal()
    if (knowledgeBases != null) __obj.updateDynamic("knowledgeBases")(knowledgeBases.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  }
}

