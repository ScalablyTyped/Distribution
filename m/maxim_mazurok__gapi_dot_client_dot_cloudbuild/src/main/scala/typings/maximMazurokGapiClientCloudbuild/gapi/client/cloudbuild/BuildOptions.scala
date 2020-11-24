package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOptions extends js.Object {
  
  /**
    * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some of the space will be used by the operating system and build utilities. Also note that
    * this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that
    * request more than the maximum are rejected with an error.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /**
    * Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build
    * configuration file.
    */
  var dynamicSubstitutions: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will
    * use the build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  
  /** Option to define build log streaming behavior to Google Cloud Storage. */
  var logStreamingOption: js.UndefOr[String] = js.native
  
  /** Option to specify the logging mode, which determines if and where build logs are stored. */
  var logging: js.UndefOr[String] = js.native
  
  /** Compute Engine machine type on which to run the build. */
  var machineType: js.UndefOr[String] = js.native
  
  /** Requested verifiability options. */
  var requestedVerifyOption: js.UndefOr[String] = js.native
  
  /**
    * A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`. These variables
    * will be available to all build steps in this build.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.native
  
  /** Requested hash for SourceProvenance. */
  var sourceProvenanceHash: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build
    * configuration file.
    */
  var substitutionOption: js.UndefOr[String] = js.native
  
  /**
    * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their
    * contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it
    * is indicative of a build request with an incorrect configuration.
    */
  var volumes: js.UndefOr[js.Array[Volume]] = js.native
  
  /** Option to specify a `WorkerPool` for the build. Format: projects/{project}/locations/{location}/workerPools/{workerPool} This field is experimental. */
  var workerPool: js.UndefOr[String] = js.native
}
object BuildOptions {
  
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  
  @scala.inline
  implicit class BuildOptionsOps[Self <: BuildOptions] (val x: Self) extends AnyVal {
    
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
    def setDiskSizeGb(value: String): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setDynamicSubstitutions(value: Boolean): Self = this.set("dynamicSubstitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicSubstitutions: Self = this.set("dynamicSubstitutions", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setLogStreamingOption(value: String): Self = this.set("logStreamingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamingOption: Self = this.set("logStreamingOption", js.undefined)
    
    @scala.inline
    def setLogging(value: String): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setRequestedVerifyOption(value: String): Self = this.set("requestedVerifyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedVerifyOption: Self = this.set("requestedVerifyOption", js.undefined)
    
    @scala.inline
    def setSecretEnvVarargs(value: String*): Self = this.set("secretEnv", js.Array(value :_*))
    
    @scala.inline
    def setSecretEnv(value: js.Array[String]): Self = this.set("secretEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretEnv: Self = this.set("secretEnv", js.undefined)
    
    @scala.inline
    def setSourceProvenanceHashVarargs(value: String*): Self = this.set("sourceProvenanceHash", js.Array(value :_*))
    
    @scala.inline
    def setSourceProvenanceHash(value: js.Array[String]): Self = this.set("sourceProvenanceHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceProvenanceHash: Self = this.set("sourceProvenanceHash", js.undefined)
    
    @scala.inline
    def setSubstitutionOption(value: String): Self = this.set("substitutionOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutionOption: Self = this.set("substitutionOption", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
    
    @scala.inline
    def setWorkerPool(value: String): Self = this.set("workerPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerPool: Self = this.set("workerPool", js.undefined)
  }
}
