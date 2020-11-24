package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaWorkflowTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowTemplate]
  }
  
  @scala.inline
  implicit class SchemaWorkflowTemplateOps[Self <: SchemaWorkflowTemplate] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: SchemaOrderedJob*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: js.Array[SchemaOrderedJob]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SchemaTemplateParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[SchemaTemplateParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPlacement(value: SchemaWorkflowTemplatePlacement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
