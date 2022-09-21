package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1TaskExecutionSpec extends StObject {
  
  /**
    * Optional. The arguments to pass to the task. The args can use placeholders of the format ${placeholder\} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${task_id\} - ${job_time\} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument.
    */
  var args: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The Cloud KMS key to use for encryption, of the form: projects/{project_number\}/locations/{location_id\}/keyRings/{key-ring-name\}/cryptoKeys/{key-name\}.
    */
  var kmsKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The maximum duration after which the job execution is expired.
    */
  var maxJobExecutionLifetime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the ExecutionSpec.service_account must belong to this project.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1TaskExecutionSpec {
  
  inline def apply(): SchemaGoogleCloudDataplexV1TaskExecutionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1TaskExecutionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1TaskExecutionSpec](x: Self) {
    
    inline def setArgs(value: StringDictionary[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNull: Self = StObject.set(x, "kmsKey", null)
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setMaxJobExecutionLifetime(value: String): Self = StObject.set(x, "maxJobExecutionLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaxJobExecutionLifetimeNull: Self = StObject.set(x, "maxJobExecutionLifetime", null)
    
    inline def setMaxJobExecutionLifetimeUndefined: Self = StObject.set(x, "maxJobExecutionLifetime", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
