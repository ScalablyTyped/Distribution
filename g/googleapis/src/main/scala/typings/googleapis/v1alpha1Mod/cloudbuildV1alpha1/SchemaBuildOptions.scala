package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional arguments to enable specific features of builds.
  */
trait SchemaBuildOptions extends StObject {
  
  /**
    * Requested disk size for the VM that runs the build. Note that this is
    * *NOT* &quot;disk free&quot;; some of the space will be used by the
    * operating system and build utilities. Also note that this is the minimum
    * disk size that will be allocated for the build -- the build may run with
    * a larger disk than requested. At present, the maximum disk size is
    * 1000GB; builds that request more than the maximum are rejected with an
    * error.
    */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
  /**
    * A list of global environment variable definitions that will exist for all
    * build steps in this build. If a variable is defined in both globally and
    * in a build step, the variable will use the build step value.  The
    * elements are of the form &quot;KEY=VALUE&quot; for the environment
    * variable &quot;KEY&quot; being given the value &quot;VALUE&quot;.
    */
  var env: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Option to define build log streaming behavior to Google Cloud Storage.
    */
  var logStreamingOption: js.UndefOr[String] = js.undefined
  
  /**
    * Option to specify the logging mode, which determines where the logs are
    * stored.
    */
  var logging: js.UndefOr[String] = js.undefined
  
  /**
    * Compute Engine machine type on which to run the build.
    */
  var machineType: js.UndefOr[String] = js.undefined
  
  /**
    * Requested verifiability options.
    */
  var requestedVerifyOption: js.UndefOr[String] = js.undefined
  
  /**
    * A list of global environment variables, which are encrypted using a Cloud
    * Key Management Service crypto key. These values must be specified in the
    * build&#39;s `Secret`. These variables will be available to all build
    * steps in this build.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requested hash for SourceProvenance.
    */
  var sourceProvenanceHash: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Option to specify behavior when there is an error in the substitution
    * checks.
    */
  var substitutionOption: js.UndefOr[String] = js.undefined
  
  /**
    * Global list of volumes to mount for ALL build steps  Each volume is
    * created as an empty volume prior to starting the build process. Upon
    * completion of the build, volumes and their contents are discarded. Global
    * volume names and paths cannot conflict with the volumes defined a build
    * step.  Using a global volume in a build with only one step is not valid
    * as it is indicative of a build request with an incorrect configuration.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
  
  /**
    * Option to specify a `WorkerPool` for the build. User specifies the pool
    * with the format &quot;[WORKERPOOL_PROJECT_ID]/[WORKERPOOL_NAME]&quot;.
    * This is an experimental field.
    */
  var workerPool: js.UndefOr[String] = js.undefined
}
object SchemaBuildOptions {
  
  inline def apply(): SchemaBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildOptions]
  }
  
  extension [Self <: SchemaBuildOptions](x: Self) {
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    inline def setLogStreamingOption(value: String): Self = StObject.set(x, "logStreamingOption", value.asInstanceOf[js.Any])
    
    inline def setLogStreamingOptionUndefined: Self = StObject.set(x, "logStreamingOption", js.undefined)
    
    inline def setLogging(value: String): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setRequestedVerifyOption(value: String): Self = StObject.set(x, "requestedVerifyOption", value.asInstanceOf[js.Any])
    
    inline def setRequestedVerifyOptionUndefined: Self = StObject.set(x, "requestedVerifyOption", js.undefined)
    
    inline def setSecretEnv(value: js.Array[String]): Self = StObject.set(x, "secretEnv", value.asInstanceOf[js.Any])
    
    inline def setSecretEnvUndefined: Self = StObject.set(x, "secretEnv", js.undefined)
    
    inline def setSecretEnvVarargs(value: String*): Self = StObject.set(x, "secretEnv", js.Array(value :_*))
    
    inline def setSourceProvenanceHash(value: js.Array[String]): Self = StObject.set(x, "sourceProvenanceHash", value.asInstanceOf[js.Any])
    
    inline def setSourceProvenanceHashUndefined: Self = StObject.set(x, "sourceProvenanceHash", js.undefined)
    
    inline def setSourceProvenanceHashVarargs(value: String*): Self = StObject.set(x, "sourceProvenanceHash", js.Array(value :_*))
    
    inline def setSubstitutionOption(value: String): Self = StObject.set(x, "substitutionOption", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionOptionUndefined: Self = StObject.set(x, "substitutionOption", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaVolume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaVolume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
    
    inline def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
