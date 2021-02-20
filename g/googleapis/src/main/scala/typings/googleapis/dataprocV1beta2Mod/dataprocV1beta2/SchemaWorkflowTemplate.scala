package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc workflow template resource.
  */
@js.native
trait SchemaWorkflowTemplate extends StObject {
  
  /**
    * Output only. The time template was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The template id.The id must contain only letters (a-z, A-Z),
    * numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with
    * underscore or hyphen. Must consist of between 3 and 50 characters..
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
  implicit class SchemaWorkflowTemplateMutableBuilder[Self <: SchemaWorkflowTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setJobs(value: js.Array[SchemaOrderedJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: SchemaOrderedJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[SchemaTemplateParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SchemaTemplateParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: SchemaWorkflowTemplatePlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
