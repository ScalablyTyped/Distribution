package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevisionSpec extends StObject {
  
  /**
    * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per container instance of the Revision. Cloud Run fully managed: supported, defaults to 80 Cloud Run for Anthos: supported, defaults to 0, which means concurrency to the application is not limited, and the system decides the target concurrency for the autoscaler.
    */
  var containerConcurrency: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Containers holds the single container that defines the unit of execution for this Revision. In the context of a Revision, we disallow a number of fields on this Container, including: name and lifecycle. In Cloud Run, only a single container may be provided. The runtime contract is documented here: https://github.com/knative/serving/blob/main/docs/runtime-contract.md
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.undefined
  
  /**
    * Indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Cloud Run fully managed: Not supported. Cloud Run for Anthos: supported, defaults to true.
    */
  var enableServiceLinks: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod Cloud Run fully managed: Not supported. Cloud Run for Anthos: supported.
    */
  var imagePullSecrets: js.UndefOr[js.Array[SchemaLocalObjectReference]] = js.undefined
  
  /**
    * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
    */
  var serviceAccountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Cloud Run fully managed: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600 seconds (1 hour). Cloud Run for Anthos: defaults to 300 seconds (5 minutes). Maximum allowed value is configurable by the cluster operator.
    */
  var timeoutSeconds: js.UndefOr[Double | Null] = js.undefined
  
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
}
object SchemaRevisionSpec {
  
  inline def apply(): SchemaRevisionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionSpec]
  }
  
  extension [Self <: SchemaRevisionSpec](x: Self) {
    
    inline def setContainerConcurrency(value: Double): Self = StObject.set(x, "containerConcurrency", value.asInstanceOf[js.Any])
    
    inline def setContainerConcurrencyNull: Self = StObject.set(x, "containerConcurrency", null)
    
    inline def setContainerConcurrencyUndefined: Self = StObject.set(x, "containerConcurrency", js.undefined)
    
    inline def setContainers(value: js.Array[SchemaContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: SchemaContainer*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setEnableServiceLinks(value: Boolean): Self = StObject.set(x, "enableServiceLinks", value.asInstanceOf[js.Any])
    
    inline def setEnableServiceLinksNull: Self = StObject.set(x, "enableServiceLinks", null)
    
    inline def setEnableServiceLinksUndefined: Self = StObject.set(x, "enableServiceLinks", js.undefined)
    
    inline def setImagePullSecrets(value: js.Array[SchemaLocalObjectReference]): Self = StObject.set(x, "imagePullSecrets", value.asInstanceOf[js.Any])
    
    inline def setImagePullSecretsUndefined: Self = StObject.set(x, "imagePullSecrets", js.undefined)
    
    inline def setImagePullSecretsVarargs(value: SchemaLocalObjectReference*): Self = StObject.set(x, "imagePullSecrets", js.Array(value*))
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNameNull: Self = StObject.set(x, "serviceAccountName", null)
    
    inline def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsNull: Self = StObject.set(x, "timeoutSeconds", null)
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaVolume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaVolume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
