package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A step in the build pipeline.
  */
@js.native
trait SchemaBuildStep extends js.Object {
  /**
    * A list of arguments that will be presented to the step when it is
    * started.  If the image used to run the step&#39;s container has an
    * entrypoint, the `args` are used as arguments to that entrypoint. If the
    * image does not define an entrypoint, the first element in args is used as
    * the entrypoint, and the remainder will be used as arguments.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Working directory to use when running this step&#39;s container.  If this
    * value is a relative path, it is relative to the build&#39;s working
    * directory. If this value is absolute, it may be outside the build&#39;s
    * working directory, in which case the contents of the path may not be
    * persisted across build step executions, unless a `volume` for that path
    * is specified.  If the build specifies a `RepoSource` with `dir` and a
    * step with a `dir`, which specifies an absolute path, the `RepoSource`
    * `dir` is ignored for the step&#39;s execution.
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * Entrypoint to be used instead of the build step image&#39;s default
    * entrypoint. If unset, the image&#39;s default entrypoint is used.
    */
  var entrypoint: js.UndefOr[String] = js.native
  /**
    * A list of environment variable definitions to be used when running a
    * step.  The elements are of the form &quot;KEY=VALUE&quot; for the
    * environment variable &quot;KEY&quot; being given the value
    * &quot;VALUE&quot;.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  /**
    * Unique identifier for this build step, used in `wait_for` to reference
    * this build step as a dependency.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Required. The name of the container image that will run this particular
    * build step.  If the image is available in the host&#39;s Docker
    * daemon&#39;s cache, it will be run directly. If not, the host will
    * attempt to pull the image first, using the builder service account&#39;s
    * credentials if necessary.  The Docker daemon&#39;s cache will already
    * have the latest versions of all of the officially supported build steps
    * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
    * The Docker daemon will also have cached many of the layers for some
    * popular images, like &quot;ubuntu&quot;, &quot;debian&quot;, but they
    * will be refreshed at the time you attempt to use them.  If you built an
    * image in a previous build step, it will be stored in the host&#39;s
    * Docker daemon&#39;s cache and is available to use as the name for a later
    * build step.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Stores timing information for pulling this build step&#39;s
    * builder image only.
    */
  var pullTiming: js.UndefOr[SchemaTimeSpan] = js.native
  /**
    * A list of environment variables which are encrypted using a Cloud Key
    * Management Service crypto key. These values must be specified in the
    * build&#39;s `Secret`.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. Status of the build step. At this time, build step status is
    * only updated on build completion; step status is not updated in real-time
    * as the build progresses.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Time limit for executing this build step. If not defined, the step has no
    * time limit and will be allowed to continue to run until either it
    * completes or the build itself times out.
    */
  var timeout: js.UndefOr[String] = js.native
  /**
    * Output only. Stores timing information for executing this build step.
    */
  var timing: js.UndefOr[SchemaTimeSpan] = js.native
  /**
    * List of volumes to mount into the build step.  Each volume is created as
    * an empty volume prior to execution of the build step. Upon completion of
    * the build, volumes and their contents are discarded.  Using a named
    * volume in only one step is not valid as it is indicative of a build
    * request with an incorrect configuration.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
  /**
    * The ID(s) of the step(s) that this build step depends on. This build step
    * will not start until all the build steps in `wait_for` have completed
    * successfully. If `wait_for` is empty, this build step will start when all
    * previous build steps in the `Build.Steps` list have completed
    * successfully.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBuildStep {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    dir: String = null,
    entrypoint: String = null,
    env: js.Array[String] = null,
    id: String = null,
    name: String = null,
    pullTiming: SchemaTimeSpan = null,
    secretEnv: js.Array[String] = null,
    status: String = null,
    timeout: String = null,
    timing: SchemaTimeSpan = null,
    volumes: js.Array[SchemaVolume] = null,
    waitFor: js.Array[String] = null
  ): SchemaBuildStep = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (entrypoint != null) __obj.updateDynamic("entrypoint")(entrypoint.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pullTiming != null) __obj.updateDynamic("pullTiming")(pullTiming.asInstanceOf[js.Any])
    if (secretEnv != null) __obj.updateDynamic("secretEnv")(secretEnv.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildStep]
  }
}

