package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainer extends StObject {
  
  /**
    * (Optional) Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var command: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * (Optional) List of environment variables to set in the container.
    */
  var env: js.UndefOr[js.Array[SchemaEnvVar]] = js.undefined
  
  /**
    * (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.UndefOr[js.Array[SchemaEnvFromSource]] = js.undefined
  
  /**
    * Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
    */
  var image: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var livenessProbe: js.UndefOr[SchemaProbe] = js.undefined
  
  /**
    * (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
    */
  var ports: js.UndefOr[js.Array[SchemaContainerPort]] = js.undefined
  
  /**
    * (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var readinessProbe: js.UndefOr[SchemaProbe] = js.undefined
  
  /**
    * (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: js.UndefOr[SchemaResourceRequirements] = js.undefined
  
  /**
    * (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var securityContext: js.UndefOr[SchemaSecurityContext] = js.undefined
  
  /**
    * (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var startupProbe: js.UndefOr[SchemaProbe] = js.undefined
  
  /**
    * (Optional) Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
    */
  var terminationMessagePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Volume to mount into the container's filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container's filesystem.
    */
  var volumeMounts: js.UndefOr[js.Array[SchemaVolumeMount]] = js.undefined
  
  /**
    * (Optional) Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image.
    */
  var workingDir: js.UndefOr[String | Null] = js.undefined
}
object SchemaContainer {
  
  inline def apply(): SchemaContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainer]
  }
  
  extension [Self <: SchemaContainer](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandNull: Self = StObject.set(x, "command", null)
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setEnv(value: js.Array[SchemaEnvVar]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvFrom(value: js.Array[SchemaEnvFromSource]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
    
    inline def setEnvFromUndefined: Self = StObject.set(x, "envFrom", js.undefined)
    
    inline def setEnvFromVarargs(value: SchemaEnvFromSource*): Self = StObject.set(x, "envFrom", js.Array(value*))
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: SchemaEnvVar*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImagePullPolicy(value: String): Self = StObject.set(x, "imagePullPolicy", value.asInstanceOf[js.Any])
    
    inline def setImagePullPolicyNull: Self = StObject.set(x, "imagePullPolicy", null)
    
    inline def setImagePullPolicyUndefined: Self = StObject.set(x, "imagePullPolicy", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLivenessProbe(value: SchemaProbe): Self = StObject.set(x, "livenessProbe", value.asInstanceOf[js.Any])
    
    inline def setLivenessProbeUndefined: Self = StObject.set(x, "livenessProbe", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPorts(value: js.Array[SchemaContainerPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: SchemaContainerPort*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setReadinessProbe(value: SchemaProbe): Self = StObject.set(x, "readinessProbe", value.asInstanceOf[js.Any])
    
    inline def setReadinessProbeUndefined: Self = StObject.set(x, "readinessProbe", js.undefined)
    
    inline def setResources(value: SchemaResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setSecurityContext(value: SchemaSecurityContext): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    inline def setStartupProbe(value: SchemaProbe): Self = StObject.set(x, "startupProbe", value.asInstanceOf[js.Any])
    
    inline def setStartupProbeUndefined: Self = StObject.set(x, "startupProbe", js.undefined)
    
    inline def setTerminationMessagePath(value: String): Self = StObject.set(x, "terminationMessagePath", value.asInstanceOf[js.Any])
    
    inline def setTerminationMessagePathNull: Self = StObject.set(x, "terminationMessagePath", null)
    
    inline def setTerminationMessagePathUndefined: Self = StObject.set(x, "terminationMessagePath", js.undefined)
    
    inline def setTerminationMessagePolicy(value: String): Self = StObject.set(x, "terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    inline def setTerminationMessagePolicyNull: Self = StObject.set(x, "terminationMessagePolicy", null)
    
    inline def setTerminationMessagePolicyUndefined: Self = StObject.set(x, "terminationMessagePolicy", js.undefined)
    
    inline def setVolumeMounts(value: js.Array[SchemaVolumeMount]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    inline def setVolumeMountsUndefined: Self = StObject.set(x, "volumeMounts", js.undefined)
    
    inline def setVolumeMountsVarargs(value: SchemaVolumeMount*): Self = StObject.set(x, "volumeMounts", js.Array(value*))
    
    inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirNull: Self = StObject.set(x, "workingDir", null)
    
    inline def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
  }
}
