package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildStep extends StObject {
  
  /**
    * A list of arguments that will be presented to the step when it is started. If the image used to run the step's container has an entrypoint, the `args` are used as arguments to that
    * entrypoint. If the image does not define an entrypoint, the first element in args is used as the entrypoint, and the remainder will be used as arguments.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Working directory to use when running this step's container. If this value is a relative path, it is relative to the build's working directory. If this value is absolute, it may be
    * outside the build's working directory, in which case the contents of the path may not be persisted across build step executions, unless a `volume` for that path is specified. If the
    * build specifies a `RepoSource` with `dir` and a step with a `dir`, which specifies an absolute path, the `RepoSource` `dir` is ignored for the step's execution.
    */
  var dir: js.UndefOr[String] = js.undefined
  
  /** Entrypoint to be used instead of the build step image's default entrypoint. If unset, the image's default entrypoint is used. */
  var entrypoint: js.UndefOr[String] = js.undefined
  
  /** A list of environment variable definitions to be used when running a step. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE". */
  var env: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Unique identifier for this build step, used in `wait_for` to reference this build step as a dependency. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the container image that will run this particular build step. If the image is available in the host's Docker daemon's cache, it will be run directly. If not,
    * the host will attempt to pull the image first, using the builder service account's credentials if necessary. The Docker daemon's cache will already have the latest versions of all
    * of the officially supported build steps ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)). The Docker daemon will also
    * have cached many of the layers for some popular images, like "ubuntu", "debian", but they will be refreshed at the time you attempt to use them. If you built an image in a previous
    * build step, it will be stored in the host's Docker daemon's cache and is available to use as the name for a later build step.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Stores timing information for pulling this build step's builder image only. */
  var pullTiming: js.UndefOr[TimeSpan] = js.undefined
  
  /** A shell script to be executed in the step. When script is provided, the user cannot specify the entrypoint or args. */
  var script: js.UndefOr[String] = js.undefined
  
  /** A list of environment variables which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`. */
  var secretEnv: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Status of the build step. At this time, build step status is only updated on build completion; step status is not updated in real-time as the build progresses. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Time limit for executing this build step. If not defined, the step has no time limit and will be allowed to continue to run until either it completes or the build itself times out. */
  var timeout: js.UndefOr[String] = js.undefined
  
  /** Output only. Stores timing information for executing this build step. */
  var timing: js.UndefOr[TimeSpan] = js.undefined
  
  /**
    * List of volumes to mount into the build step. Each volume is created as an empty volume prior to execution of the build step. Upon completion of the build, volumes and their
    * contents are discarded. Using a named volume in only one step is not valid as it is indicative of a build request with an incorrect configuration.
    */
  var volumes: js.UndefOr[js.Array[Volume]] = js.undefined
  
  /**
    * The ID(s) of the step(s) that this build step depends on. This build step will not start until all the build steps in `wait_for` have completed successfully. If `wait_for` is empty,
    * this build step will start when all previous build steps in the `Build.Steps` list have completed successfully.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.undefined
}
object BuildStep {
  
  inline def apply(): BuildStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildStep]
  }
  
  extension [Self <: BuildStep](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEntrypoint(value: String): Self = StObject.set(x, "entrypoint", value.asInstanceOf[js.Any])
    
    inline def setEntrypointUndefined: Self = StObject.set(x, "entrypoint", js.undefined)
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPullTiming(value: TimeSpan): Self = StObject.set(x, "pullTiming", value.asInstanceOf[js.Any])
    
    inline def setPullTimingUndefined: Self = StObject.set(x, "pullTiming", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSecretEnv(value: js.Array[String]): Self = StObject.set(x, "secretEnv", value.asInstanceOf[js.Any])
    
    inline def setSecretEnvUndefined: Self = StObject.set(x, "secretEnv", js.undefined)
    
    inline def setSecretEnvVarargs(value: String*): Self = StObject.set(x, "secretEnv", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTiming(value: TimeSpan): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    inline def setVolumes(value: js.Array[Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value*))
    
    inline def setWaitFor(value: js.Array[String]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: String*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
