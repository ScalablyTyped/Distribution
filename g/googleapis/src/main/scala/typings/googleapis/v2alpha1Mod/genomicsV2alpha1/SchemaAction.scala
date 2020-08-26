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
  def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  @scala.inline
  implicit class SchemaActionOps[Self <: SchemaAction] (val x: Self) extends AnyVal {
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
    def setCommandsVarargs(value: String*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[String]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setCredentials(value: SchemaSecret): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setEntrypoint(value: String): Self = this.set("entrypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrypoint: Self = this.set("entrypoint", js.undefined)
    @scala.inline
    def setEnvironment(value: StringDictionary[String]): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setFlagsVarargs(value: String*): Self = this.set("flags", js.Array(value :_*))
    @scala.inline
    def setFlags(value: js.Array[String]): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMountsVarargs(value: SchemaMount*): Self = this.set("mounts", js.Array(value :_*))
    @scala.inline
    def setMounts(value: js.Array[SchemaMount]): Self = this.set("mounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMounts: Self = this.set("mounts", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPidNamespace(value: String): Self = this.set("pidNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePidNamespace: Self = this.set("pidNamespace", js.undefined)
    @scala.inline
    def setPortMappings(value: StringDictionary[Double]): Self = this.set("portMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortMappings: Self = this.set("portMappings", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

