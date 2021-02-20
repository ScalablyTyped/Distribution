package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single application container. This specifies both the container to run,
  * the command to run in the container and the arguments to supply to it. Note
  * that additional arguments may be supplied by the system to the container at
  * runtime.
  */
@js.native
trait SchemaContainer extends StObject {
  
  /**
    * Arguments to the entrypoint. The docker image&#39;s CMD is used if this
    * is not provided. Variable references $(VAR_NAME) are expanded using the
    * container&#39;s environment. If a variable cannot be resolved, the
    * reference in the input string will be unchanged. The $(VAR_NAME) syntax
    * can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references
    * will never be expanded, regardless of whether the variable exists or not.
    * Cannot be updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    * +optional
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Entrypoint array. Not executed within a shell. The docker image&#39;s
    * ENTRYPOINT is used if this is not provided. Variable references
    * $(VAR_NAME) are expanded using the container&#39;s environment. If a
    * variable cannot be resolved, the reference in the input string will be
    * unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie:
    * $$(VAR_NAME). Escaped references will never be expanded, regardless of
    * whether the variable exists or not. Cannot be updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    * +optional
    */
  var command: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of environment variables to set in the container. Cannot be updated.
    * +optional
    */
  var env: js.UndefOr[js.Array[SchemaEnvVar]] = js.native
  
  /**
    * List of sources to populate environment variables in the container. The
    * keys defined within a source must be a C_IDENTIFIER. All invalid keys
    * will be reported as an event when the container is starting. When a key
    * exists in multiple sources, the value associated with the last source
    * will take precedence. Values defined by an Env with a duplicate key will
    * take precedence. Cannot be updated. +optional
    */
  var envFrom: js.UndefOr[js.Array[SchemaEnvFromSource]] = js.native
  
  /**
    * Docker image name. More info:
    * https://kubernetes.io/docs/concepts/containers/images
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always
    * if :latest tag is specified, or IfNotPresent otherwise. Cannot be
    * updated. More info:
    * https://kubernetes.io/docs/concepts/containers/images#updating-images
    * +optional
    */
  var imagePullPolicy: js.UndefOr[String] = js.native
  
  /**
    * Actions that the management system should take in response to container
    * lifecycle events. Cannot be updated. +optional
    */
  var lifecycle: js.UndefOr[SchemaLifecycle] = js.native
  
  /**
    * Periodic probe of container liveness. Container will be restarted if the
    * probe fails. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var livenessProbe: js.UndefOr[SchemaProbe] = js.native
  
  /**
    * Name of the container specified as a DNS_LABEL. Each container must have
    * a unique name (DNS_LABEL). Cannot be updated.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * List of ports to expose from the container. Exposing a port here gives
    * the system additional information about the network connections a
    * container uses, but is primarily informational. Not specifying a port
    * here DOES NOT prevent that port from being exposed. Any port which is
    * listening on the default &quot;0.0.0.0&quot; address inside a container
    * will be accessible from the network. Cannot be updated. +optional
    */
  var ports: js.UndefOr[js.Array[SchemaContainerPort]] = js.native
  
  /**
    * Periodic probe of container service readiness. Container will be removed
    * from service endpoints if the probe fails. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var readinessProbe: js.UndefOr[SchemaProbe] = js.native
  
  /**
    * Compute Resources required by this container. Cannot be updated. More
    * info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    * +optional
    */
  var resources: js.UndefOr[SchemaResourceRequirements] = js.native
  
  /**
    * Security options the pod should run with. More info:
    * https://kubernetes.io/docs/concepts/policy/security-context/ More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    * +optional
    */
  var securityContext: js.UndefOr[SchemaSecurityContext] = js.native
  
  /**
    * Whether this container should allocate a buffer for stdin in the
    * container runtime. If this is not set, reads from stdin in the container
    * will always result in EOF. Default is false. +optional
    */
  var stdin: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the container runtime should close the stdin channel after it has
    * been opened by a single attach. When stdin is true the stdin stream will
    * remain open across multiple attach sessions. If stdinOnce is set to true,
    * stdin is opened on container start, is empty until the first client
    * attaches to stdin, and then remains open and accepts data until the
    * client disconnects, at which time stdin is closed and remains closed
    * until the container is restarted. If this flag is false, a container
    * processes that reads from stdin will never receive an EOF. Default is
    * false +optional
    */
  var stdinOnce: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional: Path at which the file to which the container&#39;s termination
    * message will be written is mounted into the container&#39;s filesystem.
    * Message written is intended to be brief final status, such as an
    * assertion failure message. Will be truncated by the node if greater than
    * 4096 bytes. The total message length across all containers will be
    * limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    * +optional
    */
  var terminationMessagePath: js.UndefOr[String] = js.native
  
  /**
    * Indicate how the termination message should be populated. File will use
    * the contents of terminationMessagePath to populate the container status
    * message on both success and failure. FallbackToLogsOnError will use the
    * last chunk of container log output if the termination message file is
    * empty and the container exited with an error. The log output is limited
    * to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot
    * be updated. +optional
    */
  var terminationMessagePolicy: js.UndefOr[String] = js.native
  
  /**
    * Whether this container should allocate a TTY for itself, also requires
    * &#39;stdin&#39; to be true. Default is false. +optional
    */
  var tty: js.UndefOr[Boolean] = js.native
  
  /**
    * volumeDevices is the list of block devices to be used by the container.
    * This is an alpha feature and may change in the future. +optional
    */
  var volumeDevices: js.UndefOr[js.Array[SchemaVolumeDevice]] = js.native
  
  /**
    * Pod volumes to mount into the container&#39;s filesystem. Cannot be
    * updated. +optional
    */
  var volumeMounts: js.UndefOr[js.Array[SchemaVolumeMount]] = js.native
  
  /**
    * Container&#39;s working directory. If not specified, the container
    * runtime&#39;s default will be used, which might be configured in the
    * container image. Cannot be updated. +optional
    */
  var workingDir: js.UndefOr[String] = js.native
}
object SchemaContainer {
  
  @scala.inline
  def apply(): SchemaContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainer]
  }
  
  @scala.inline
  implicit class SchemaContainerMutableBuilder[Self <: SchemaContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[SchemaEnvVar]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFrom(value: js.Array[SchemaEnvFromSource]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFromUndefined: Self = StObject.set(x, "envFrom", js.undefined)
    
    @scala.inline
    def setEnvFromVarargs(value: SchemaEnvFromSource*): Self = StObject.set(x, "envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: SchemaEnvVar*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullPolicy(value: String): Self = StObject.set(x, "imagePullPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullPolicyUndefined: Self = StObject.set(x, "imagePullPolicy", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLifecycle(value: SchemaLifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    @scala.inline
    def setLivenessProbe(value: SchemaProbe): Self = StObject.set(x, "livenessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivenessProbeUndefined: Self = StObject.set(x, "livenessProbe", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[SchemaContainerPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: SchemaContainerPort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setReadinessProbe(value: SchemaProbe): Self = StObject.set(x, "readinessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadinessProbeUndefined: Self = StObject.set(x, "readinessProbe", js.undefined)
    
    @scala.inline
    def setResources(value: SchemaResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setSecurityContext(value: SchemaSecurityContext): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    @scala.inline
    def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinOnce(value: Boolean): Self = StObject.set(x, "stdinOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinOnceUndefined: Self = StObject.set(x, "stdinOnce", js.undefined)
    
    @scala.inline
    def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    @scala.inline
    def setTerminationMessagePath(value: String): Self = StObject.set(x, "terminationMessagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePathUndefined: Self = StObject.set(x, "terminationMessagePath", js.undefined)
    
    @scala.inline
    def setTerminationMessagePolicy(value: String): Self = StObject.set(x, "terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePolicyUndefined: Self = StObject.set(x, "terminationMessagePolicy", js.undefined)
    
    @scala.inline
    def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtyUndefined: Self = StObject.set(x, "tty", js.undefined)
    
    @scala.inline
    def setVolumeDevices(value: js.Array[SchemaVolumeDevice]): Self = StObject.set(x, "volumeDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeDevicesUndefined: Self = StObject.set(x, "volumeDevices", js.undefined)
    
    @scala.inline
    def setVolumeDevicesVarargs(value: SchemaVolumeDevice*): Self = StObject.set(x, "volumeDevices", js.Array(value :_*))
    
    @scala.inline
    def setVolumeMounts(value: js.Array[SchemaVolumeMount]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeMountsUndefined: Self = StObject.set(x, "volumeMounts", js.undefined)
    
    @scala.inline
    def setVolumeMountsVarargs(value: SchemaVolumeMount*): Self = StObject.set(x, "volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
  }
}
