package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc workflow template resource.
  */
trait SchemaWorkflowTemplate extends StObject {
  
  /**
    * Output only. The time template was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The template id.The id must contain only letters (a-z, A-Z),
    * numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with
    * underscore or hyphen. Must consist of between 3 and 50 characters.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Directed Acyclic Graph of Jobs to submit.
    */
  var jobs: js.UndefOr[js.Array[SchemaOrderedJob]] = js.undefined
  
  /**
    * Optional. The labels to associate with this template. These labels will
    * be propagated to all jobs and clusters created by the workflow
    * instance.Label keys must contain 1 to 63 characters, and must conform to
    * RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be
    * empty, but, if present, must contain 1 to 63 characters, and must conform
    * to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels
    * can be associated with a template.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Output only. The &quot;resource name&quot; of the template, as described
    * in https://cloud.google.com/apis/design/resource_names of the form
    * projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Template parameters whose values are substituted into the
    * template. Values for parameters must be provided when the template is
    * instantiated.
    */
  var parameters: js.UndefOr[js.Array[SchemaTemplateParameter]] = js.undefined
  
  /**
    * Required. WorkflowTemplate scheduling information.
    */
  var placement: js.UndefOr[SchemaWorkflowTemplatePlacement] = js.undefined
  
  /**
    * Output only. The time template was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
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
  var version: js.UndefOr[Double] = js.undefined
}
object SchemaWorkflowTemplate {
  
  inline def apply(): SchemaWorkflowTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowTemplate]
  }
  
  extension [Self <: SchemaWorkflowTemplate](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJobs(value: js.Array[SchemaOrderedJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SchemaOrderedJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaTemplateParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaTemplateParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setPlacement(value: SchemaWorkflowTemplatePlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
