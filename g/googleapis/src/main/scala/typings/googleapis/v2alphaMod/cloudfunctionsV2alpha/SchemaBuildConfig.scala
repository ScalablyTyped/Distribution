package typings.googleapis.v2alphaMod.cloudfunctionsV2alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildConfig extends StObject {
  
  /**
    * Output only. The Cloud Build name of the latest successful deployment of the function.
    */
  var build: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User managed repository created in Artifact Registry optionally with a customer managed encryption key. This is the repository to which the function docker image will be pushed after it is built by Cloud Build. If unspecified, GCF will create and use a repository named 'gcf-artifacts' for every deployed region. It must match the pattern `projects/{project\}/locations/{location\}/repositories/{repository\}`. Cross-project repositories are not supported. Cross-location repositories are not supported. Repository format must be 'DOCKER'.
    */
  var dockerRepository: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the function (as defined in source code) that will be executed. Defaults to the resource name suffix, if not specified. For backward compatibility, if function with given name is not found, then the system will try to use function named "function". For Node.js this is name of a function exported by the module specified in `source_location`.
    */
  var entryPoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-provided build-time environment variables for the function
    */
  var environmentVariables: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The runtime in which to run the function. Required when deploying a new function, optional when updating an existing function. For a complete list of possible choices, see the [`gcloud` command reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
    */
  var runtime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location of the function source code.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
  
  /**
    * Output only. A permanent fixed identifier for source.
    */
  var sourceProvenance: js.UndefOr[SchemaSourceProvenance] = js.undefined
  
  /**
    * Name of the Cloud Build Custom Worker Pool that should be used to build the function. The format of this field is `projects/{project\}/locations/{region\}/workerPools/{workerPool\}` where {project\} and {region\} are the project id and region respectively where the worker pool is defined and {workerPool\} is the short name of the worker pool. If the project id is not the same as the function, then the Cloud Functions Service Agent (service-@gcf-admin-robot.iam.gserviceaccount.com) must be granted the role Cloud Build Custom Workers Builder (roles/cloudbuild.customworkers.builder) in the project.
    */
  var workerPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildConfig {
  
  inline def apply(): SchemaBuildConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildConfig]
  }
  
  extension [Self <: SchemaBuildConfig](x: Self) {
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildNull: Self = StObject.set(x, "build", null)
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setDockerRepository(value: String): Self = StObject.set(x, "dockerRepository", value.asInstanceOf[js.Any])
    
    inline def setDockerRepositoryNull: Self = StObject.set(x, "dockerRepository", null)
    
    inline def setDockerRepositoryUndefined: Self = StObject.set(x, "dockerRepository", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointNull: Self = StObject.set(x, "entryPoint", null)
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setEnvironmentVariables(value: StringDictionary[String]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesNull: Self = StObject.set(x, "environmentVariables", null)
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeNull: Self = StObject.set(x, "runtime", null)
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceProvenance(value: SchemaSourceProvenance): Self = StObject.set(x, "sourceProvenance", value.asInstanceOf[js.Any])
    
    inline def setSourceProvenanceUndefined: Self = StObject.set(x, "sourceProvenance", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolNull: Self = StObject.set(x, "workerPool", null)
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
