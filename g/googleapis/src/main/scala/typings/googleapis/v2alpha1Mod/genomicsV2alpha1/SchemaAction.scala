package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a single action that runs a Docker container.
  */
@js.native
trait SchemaAction extends StObject {
  
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
  implicit class SchemaActionMutableBuilder[Self <: SchemaAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: js.Array[String]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    @scala.inline
    def setCommandsVarargs(value: String*): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    @scala.inline
    def setCredentials(value: SchemaSecret): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setEntrypoint(value: String): Self = StObject.set(x, "entrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrypointUndefined: Self = StObject.set(x, "entrypoint", js.undefined)
    
    @scala.inline
    def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMounts(value: js.Array[SchemaMount]): Self = StObject.set(x, "mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountsUndefined: Self = StObject.set(x, "mounts", js.undefined)
    
    @scala.inline
    def setMountsVarargs(value: SchemaMount*): Self = StObject.set(x, "mounts", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPidNamespace(value: String): Self = StObject.set(x, "pidNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidNamespaceUndefined: Self = StObject.set(x, "pidNamespace", js.undefined)
    
    @scala.inline
    def setPortMappings(value: StringDictionary[Double]): Self = StObject.set(x, "portMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortMappingsUndefined: Self = StObject.set(x, "portMappings", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
