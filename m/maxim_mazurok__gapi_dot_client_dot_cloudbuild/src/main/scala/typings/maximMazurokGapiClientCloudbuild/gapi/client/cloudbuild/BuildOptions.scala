package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptions extends StObject {
  
  /**
    * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some of the space will be used by the operating system and build utilities. Also note that
    * this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that
    * request more than the maximum are rejected with an error.
    */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
  /**
    * Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build
    * configuration file.
    */
  var dynamicSubstitutions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will
    * use the build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
    */
  var env: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Option to define build log streaming behavior to Google Cloud Storage. */
  var logStreamingOption: js.UndefOr[String] = js.undefined
  
  /** Option to specify the logging mode, which determines if and where build logs are stored. */
  var logging: js.UndefOr[String] = js.undefined
  
  /** Compute Engine machine type on which to run the build. */
  var machineType: js.UndefOr[String] = js.undefined
  
  /** Requested verifiability options. */
  var requestedVerifyOption: js.UndefOr[String] = js.undefined
  
  /**
    * A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`. These variables
    * will be available to all build steps in this build.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Requested hash for SourceProvenance. */
  var sourceProvenanceHash: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build
    * configuration file.
    */
  var substitutionOption: js.UndefOr[String] = js.undefined
  
  /**
    * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their
    * contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it
    * is indicative of a build request with an incorrect configuration.
    */
  var volumes: js.UndefOr[js.Array[Volume]] = js.undefined
  
  /** Option to specify a `WorkerPool` for the build. Format: projects/{project}/locations/{location}/workerPools/{workerPool} This field is experimental. */
  var workerPool: js.UndefOr[String] = js.undefined
}
object BuildOptions {
  
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  
  @scala.inline
  implicit class BuildOptionsMutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setDynamicSubstitutions(value: Boolean): Self = StObject.set(x, "dynamicSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicSubstitutionsUndefined: Self = StObject.set(x, "dynamicSubstitutions", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setLogStreamingOption(value: String): Self = StObject.set(x, "logStreamingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamingOptionUndefined: Self = StObject.set(x, "logStreamingOption", js.undefined)
    
    @scala.inline
    def setLogging(value: String): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setRequestedVerifyOption(value: String): Self = StObject.set(x, "requestedVerifyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedVerifyOptionUndefined: Self = StObject.set(x, "requestedVerifyOption", js.undefined)
    
    @scala.inline
    def setSecretEnv(value: js.Array[String]): Self = StObject.set(x, "secretEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretEnvUndefined: Self = StObject.set(x, "secretEnv", js.undefined)
    
    @scala.inline
    def setSecretEnvVarargs(value: String*): Self = StObject.set(x, "secretEnv", js.Array(value :_*))
    
    @scala.inline
    def setSourceProvenanceHash(value: js.Array[String]): Self = StObject.set(x, "sourceProvenanceHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceProvenanceHashUndefined: Self = StObject.set(x, "sourceProvenanceHash", js.undefined)
    
    @scala.inline
    def setSourceProvenanceHashVarargs(value: String*): Self = StObject.set(x, "sourceProvenanceHash", js.Array(value :_*))
    
    @scala.inline
    def setSubstitutionOption(value: String): Self = StObject.set(x, "substitutionOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionOptionUndefined: Self = StObject.set(x, "substitutionOption", js.undefined)
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
    
    @scala.inline
    def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
