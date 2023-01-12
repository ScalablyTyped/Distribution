package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceConfig extends StObject {
  
  /**
    * Whether 100% of traffic is routed to the latest revision. On CreateFunction and UpdateFunction, when set to true, the revision being deployed will serve 100% of traffic, ignoring
    * any traffic split settings, if any. On GetFunction, true will be returned if the latest revision is serving 100% of traffic.
    */
  var allTrafficOnLatestRevision: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The amount of memory available for a function. Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is supplied the value is interpreted as bytes. See
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go a full description.
    */
  var availableMemory: js.UndefOr[String] = js.undefined
  
  /** Environment variables that shall be available during function execution. */
  var environmentVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The ingress settings for the function, controlling what traffic can reach it. */
  var ingressSettings: js.UndefOr[String] = js.undefined
  
  /**
    * The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time,
    * create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max
    * instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
    */
  var maxInstanceCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The limit on the minimum number of function instances that may coexist at a given time. Function instances are kept in idle state for a short period after they finished executing
    * the request to reduce cold start time for subsequent requests. Setting a minimum instance count will ensure that the given number of instances are kept running in idle state always.
    * This can help with cold start times when jump in incoming request count occurs after the idle instance would have been stopped in the default case.
    */
  var minInstanceCount: js.UndefOr[Double] = js.undefined
  
  /** Output only. The name of service revision. */
  var revision: js.UndefOr[String] = js.undefined
  
  /** Secret environment variables configuration. */
  var secretEnvironmentVariables: js.UndefOr[js.Array[SecretEnvVar]] = js.undefined
  
  /** Secret volumes configuration. */
  var secretVolumes: js.UndefOr[js.Array[SecretVolume]] = js.undefined
  
  /** Output only. Name of the service associated with a Function. The format of this field is `projects/{project}/locations/{region}/services/{service}` */
  var service: js.UndefOr[String] = js.undefined
  
  /** The email of the service's service account. If empty, defaults to `{project_number}-compute@developer.gserviceaccount.com`. */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /** The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds. */
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
  
  /** Output only. URI of the Service deployed. */
  var uri: js.UndefOr[String] = js.undefined
  
  /** The Serverless VPC Access connector that this cloud function can connect to. The format of this field is `projects/ *‍/locations/ *‍/connectors/ *`. */
  var vpcConnector: js.UndefOr[String] = js.undefined
  
  /** The egress settings for the connector, controlling what traffic is diverted through it. */
  var vpcConnectorEgressSettings: js.UndefOr[String] = js.undefined
}
object ServiceConfig {
  
  inline def apply(): ServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceConfig] (val x: Self) extends AnyVal {
    
    inline def setAllTrafficOnLatestRevision(value: Boolean): Self = StObject.set(x, "allTrafficOnLatestRevision", value.asInstanceOf[js.Any])
    
    inline def setAllTrafficOnLatestRevisionUndefined: Self = StObject.set(x, "allTrafficOnLatestRevision", js.undefined)
    
    inline def setAvailableMemory(value: String): Self = StObject.set(x, "availableMemory", value.asInstanceOf[js.Any])
    
    inline def setAvailableMemoryUndefined: Self = StObject.set(x, "availableMemory", js.undefined)
    
    inline def setEnvironmentVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setIngressSettings(value: String): Self = StObject.set(x, "ingressSettings", value.asInstanceOf[js.Any])
    
    inline def setIngressSettingsUndefined: Self = StObject.set(x, "ingressSettings", js.undefined)
    
    inline def setMaxInstanceCount(value: Double): Self = StObject.set(x, "maxInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setMaxInstanceCountUndefined: Self = StObject.set(x, "maxInstanceCount", js.undefined)
    
    inline def setMinInstanceCount(value: Double): Self = StObject.set(x, "minInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setMinInstanceCountUndefined: Self = StObject.set(x, "minInstanceCount", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setSecretEnvironmentVariables(value: js.Array[SecretEnvVar]): Self = StObject.set(x, "secretEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setSecretEnvironmentVariablesUndefined: Self = StObject.set(x, "secretEnvironmentVariables", js.undefined)
    
    inline def setSecretEnvironmentVariablesVarargs(value: SecretEnvVar*): Self = StObject.set(x, "secretEnvironmentVariables", js.Array(value*))
    
    inline def setSecretVolumes(value: js.Array[SecretVolume]): Self = StObject.set(x, "secretVolumes", value.asInstanceOf[js.Any])
    
    inline def setSecretVolumesUndefined: Self = StObject.set(x, "secretVolumes", js.undefined)
    
    inline def setSecretVolumesVarargs(value: SecretVolume*): Self = StObject.set(x, "secretVolumes", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVpcConnector(value: String): Self = StObject.set(x, "vpcConnector", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorEgressSettings(value: String): Self = StObject.set(x, "vpcConnectorEgressSettings", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorEgressSettingsUndefined: Self = StObject.set(x, "vpcConnectorEgressSettings", js.undefined)
    
    inline def setVpcConnectorUndefined: Self = StObject.set(x, "vpcConnector", js.undefined)
  }
}
