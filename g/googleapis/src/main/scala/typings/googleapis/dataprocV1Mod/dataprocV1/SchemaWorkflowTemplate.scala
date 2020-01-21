package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc workflow template resource.
  */
@js.native
trait SchemaWorkflowTemplate extends js.Object {
  /**
    * Output only. The time template was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Required. The template id.The id must contain only letters (a-z, A-Z),
    * numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with
    * underscore or hyphen. Must consist of between 3 and 50 characters.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Required. The Directed Acyclic Graph of Jobs to submit.
    */
  var jobs: js.UndefOr[js.Array[SchemaOrderedJob]] = js.native
  /**
    * Optional. The labels to associate with this template. These labels will
    * be propagated to all jobs and clusters created by the workflow
    * instance.Label keys must contain 1 to 63 characters, and must conform to
    * RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be
    * empty, but, if present, must contain 1 to 63 characters, and must conform
    * to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels
    * can be associated with a template.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The &quot;resource name&quot; of the template, as described
    * in https://cloud.google.com/apis/design/resource_names of the form
    * projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. Template parameters whose values are substituted into the
    * template. Values for parameters must be provided when the template is
    * instantiated.
    */
  var parameters: js.UndefOr[js.Array[SchemaTemplateParameter]] = js.native
  /**
    * Required. WorkflowTemplate scheduling information.
    */
  var placement: js.UndefOr[SchemaWorkflowTemplatePlacement] = js.native
  /**
    * Output only. The time template was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Optional. Used to perform a consistent read-modify-write.This field
    * should be left blank for a CreateWorkflowTemplate request. It is required
    * for an UpdateWorkflowTemplate request, and must match the current server
    * version. A typical update template flow would fetch the current template
    * with a GetWorkflowTemplate request, which will return the current
    * template with the version field filled in with the current server
    * version. The user updates other fields in the template, then returns it
    * as part of the UpdateWorkflowTemplate request.
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaWorkflowTemplate {
  @scala.inline
  def apply(
    createTime: String = null,
    id: String = null,
    jobs: js.Array[SchemaOrderedJob] = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    parameters: js.Array[SchemaTemplateParameter] = null,
    placement: SchemaWorkflowTemplatePlacement = null,
    updateTime: String = null,
    version: Int | Double = null
  ): SchemaWorkflowTemplate = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkflowTemplate]
  }
}

