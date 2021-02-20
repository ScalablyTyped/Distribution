package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A configurable parameter that replaces one or more fields in the template.
  * Parameterizable fields: - Labels - File uris - Job properties - Job
  * arguments - Script variables - Main class (in HadoopJob and SparkJob) -
  * Zone (in ClusterSelector)
  */
@js.native
trait SchemaTemplateParameter extends StObject {
  
  /**
    * Optional. Brief description of the parameter. Must not exceed 1024
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. Paths to all fields that the parameter replaces. A field is
    * allowed to appear in at most one parameter&#39;s list of field paths.A
    * field path is similar in syntax to a google.protobuf.FieldMask. For
    * example, a field path that references the zone field of a workflow
    * template&#39;s cluster selector would be specified as
    * placement.clusterSelector.zone.Also, field paths can reference fields
    * using the following syntax: Values in maps can be referenced by key:
    * labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39;
    * placement.managedCluster.labels&#39;key&#39;
    * placement.clusterSelector.clusterLabels&#39;key&#39;
    * jobs&#39;step-id&#39;.labels&#39;key&#39; Jobs in the jobs list can be
    * referenced by step-id: jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri
    * jobs&#39;step-id&#39;.hiveJob.queryFileUri
    * jobs&#39;step-id&#39;.pySparkJob.mainPythonFileUri
    * jobs&#39;step-id&#39;.hadoopJob.jarFileUris0
    * jobs&#39;step-id&#39;.hadoopJob.archiveUris0
    * jobs&#39;step-id&#39;.hadoopJob.fileUris0
    * jobs&#39;step-id&#39;.pySparkJob.pythonFileUris0 Items in repeated fields
    * can be referenced by a zero-based index:
    * jobs&#39;step-id&#39;.sparkJob.args0 Other examples:
    * jobs&#39;step-id&#39;.hadoopJob.properties&#39;key&#39;
    * jobs&#39;step-id&#39;.hadoopJob.args0
    * jobs&#39;step-id&#39;.hiveJob.scriptVariables&#39;key&#39;
    * jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri
    * placement.clusterSelector.zoneIt may not be possible to parameterize maps
    * and repeated fields in their entirety since only individual map values
    * and individual items in repeated fields can be referenced. For example,
    * the following field paths are invalid:
    * placement.clusterSelector.clusterLabels
    * jobs&#39;step-id&#39;.sparkJob.args
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. Parameter name. The parameter name is used as the key, and
    * paired with the parameter value, which are passed to the template when
    * the template is instantiated. The name must contain only capital letters
    * (A-Z), numbers (0-9), and underscores (_), and must not start with a
    * number. The maximum length is 40 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. Validation rules to be applied to this parameter&#39;s value.
    */
  var validation: js.UndefOr[SchemaParameterValidation] = js.native
}
object SchemaTemplateParameter {
  
  @scala.inline
  def apply(): SchemaTemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplateParameter]
  }
  
  @scala.inline
  implicit class SchemaTemplateParameterMutableBuilder[Self <: SchemaTemplateParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValidation(value: SchemaParameterValidation): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
