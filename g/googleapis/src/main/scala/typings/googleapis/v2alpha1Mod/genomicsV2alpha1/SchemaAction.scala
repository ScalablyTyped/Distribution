package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a single action that runs a Docker container.
  */
@js.native
trait SchemaAction extends js.Object {
  /**
    * If specified, overrides the `CMD` specified in the container. If the
    * container also has an `ENTRYPOINT` the values are used as entrypoint
    * arguments. Otherwise, they are used as a command and arguments to run
    * inside the container.
    */
  var commands: js.UndefOr[js.Array[String]] = js.native
  /**
    * If the specified image is hosted on a private registry other than Google
    * Container Registry, the credentials required to pull the image must be
    * specified here as an encrypted secret.  The secret must decrypt to a
    * JSON-encoded dictionary containing both `username` and `password` keys.
    */
  var credentials: js.UndefOr[SchemaSecret] = js.native
  /**
    * If specified, overrides the `ENTRYPOINT` specified in the container.
    */
  var entrypoint: js.UndefOr[String] = js.native
  /**
    * The environment to pass into the container. This environment is merged
    * with any values specified in the `Pipeline` message. These values
    * overwrite any in the `Pipeline` message.  In addition to the values
    * passed here, a few other values are automatically injected into the
    * environment. These cannot be hidden or overwritten.
    * `GOOGLE_PIPELINE_FAILED` will be set to &quot;1&quot; if the pipeline
    * failed because an action has exited with a non-zero status (and did not
    * have the `IGNORE_EXIT_STATUS` flag set). This can be used to determine if
    * additional debug or logging actions should execute.
    * `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
    * non-background action that executed. This can be used by workflow engine
    * authors to determine whether an individual action has succeeded or
    * failed.
    */
  var environment: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The set of flags to apply to this action.
    */
  var flags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URI to pull the container image from. Note that all images referenced
    * by actions in the pipeline are pulled before the first action runs. If
    * multiple actions reference the same image, it is only pulled once,
    * ensuring that the same image is used for all actions in a single
    * pipeline.
    */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Labels to associate with the action. This field is provided to assist
    * workflow engine authors in identifying actions (for example, to indicate
    * what sort of action they perform, such as localization or debugging).
    * They are returned in the operation metadata, but are otherwise ignored.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A list of mounts to make available to the action.  In addition to the
    * values specified here, every action has a special virtual disk mounted
    * under `/google` that contains log files and other operational components.
    * &lt;ul&gt;   &lt;li&gt;&lt;code&gt;/google/logs&lt;/code&gt; All logs
    * written during the pipeline   execution.&lt;/li&gt;
    * &lt;li&gt;&lt;code&gt;/google/logs/output&lt;/code&gt; The combined
    * standard output and   standard error of all actions run as part of the
    * pipeline   execution.&lt;/li&gt;
    * &lt;li&gt;&lt;code&gt;/google/logs/action/x/stdout&lt;/code&gt; The
    * complete contents of   each individual action&#39;s standard
    * output.&lt;/li&gt;
    * &lt;li&gt;&lt;code&gt;/google/logs/action/x/stderr&lt;/code&gt; The
    * complete contents of   each individual action&#39;s standard error
    * output.&lt;/li&gt; &lt;/ul&gt;
    */
  var mounts: js.UndefOr[js.Array[SchemaMount]] = js.native
  /**
    * An optional name for the container. The container hostname will be set to
    * this name, making it useful for inter-container communication. The name
    * must contain only upper and lowercase alphanumeric characters and hypens
    * and cannot start with a hypen.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An optional identifier for a PID namespace to run the action inside.
    * Multiple actions should use the same string to share a namespace.  If
    * unspecified, a separate isolated namespace is used.
    */
  var pidNamespace: js.UndefOr[String] = js.native
  /**
    * A map of containers to host port mappings for this container. If the
    * container already specifies exposed ports, use the
    * `PUBLISH_EXPOSED_PORTS` flag instead.  The host port number must be less
    * than 65536. If it is zero, an unused random port is assigned. To
    * determine the resulting port number, consult the `ContainerStartedEvent`
    * in the operation metadata.
    */
  var portMappings: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * The maximum amount of time to give the action to complete. If the action
    * fails to complete before the timeout, it will be terminated and the exit
    * status will be non-zero. The pipeline will continue or terminate based on
    * the rules defined by the `ALWAYS_RUN` and `IGNORE_EXIT_STATUS` flags.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaAction {
  @scala.inline
  def apply(
    commands: js.Array[String] = null,
    credentials: SchemaSecret = null,
    entrypoint: String = null,
    environment: StringDictionary[String] = null,
    flags: js.Array[String] = null,
    imageUri: String = null,
    labels: StringDictionary[String] = null,
    mounts: js.Array[SchemaMount] = null,
    name: String = null,
    pidNamespace: String = null,
    portMappings: StringDictionary[Double] = null,
    timeout: String = null
  ): SchemaAction = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (entrypoint != null) __obj.updateDynamic("entrypoint")(entrypoint.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (mounts != null) __obj.updateDynamic("mounts")(mounts.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pidNamespace != null) __obj.updateDynamic("pidNamespace")(pidNamespace.asInstanceOf[js.Any])
    if (portMappings != null) __obj.updateDynamic("portMappings")(portMappings.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAction]
  }
}

