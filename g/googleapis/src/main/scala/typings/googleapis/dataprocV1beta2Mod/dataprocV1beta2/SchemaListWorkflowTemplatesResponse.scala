package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to a request to list workflow templates in a project.
  */
@js.native
trait SchemaListWorkflowTemplatesResponse extends js.Object {
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent
    * &lt;code&gt;ListWorkflowTemplatesRequest&lt;/code&gt;.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. WorkflowTemplates list.
    */
  var templates: js.UndefOr[js.Array[SchemaWorkflowTemplate]] = js.native
}

object SchemaListWorkflowTemplatesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, templates: js.Array[SchemaWorkflowTemplate] = null): SchemaListWorkflowTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListWorkflowTemplatesResponse]
  }
}

