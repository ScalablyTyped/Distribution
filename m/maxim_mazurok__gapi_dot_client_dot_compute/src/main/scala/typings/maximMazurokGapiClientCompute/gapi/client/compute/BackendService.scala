package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendService extends js.Object {
  
  /**
    * Lifetime of cookies in seconds. Only applicable if the loadBalancingScheme is EXTERNAL, INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED, the protocol is HTTP or HTTPS, and the
    * sessionAffinity is GENERATED_COOKIE, or HTTP_COOKIE.
    *
    * If set to 0, the cookie is non-persistent and lasts only until the end of the browser session (or equivalent). The maximum allowed value is one day (86,400).
    *
    * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var affinityCookieTtlSec: js.UndefOr[Double] = js.native
  
  /** The list of backends that serve this BackendService. */
  var backends: js.UndefOr[js.Array[Backend]] = js.native
  
  /** Cloud CDN configuration for this BackendService. */
  var cdnPolicy: js.UndefOr[BackendServiceCdnPolicy] = js.native
  
  /**
    * Settings controlling the volume of connections to a backend service. If not set, this feature is considered disabled.
    *
    * This field is applicable to either:
    * - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED.
    * - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    *
    * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var circuitBreakers: js.UndefOr[CircuitBreakers] = js.native
  
  var connectionDraining: js.UndefOr[ConnectionDraining] = js.native
  
  /**
    * Consistent Hash-based load balancing can be used to provide soft session affinity based on HTTP headers, cookies or other properties. This load balancing policy is applicable only
    * for HTTP connections. The affinity to a particular destination host will be lost when one or more hosts are added/removed from the destination service. This field specifies
    * parameters that control consistent hashing. This field is only applicable when localityLbPolicy is set to MAGLEV or RING_HASH.
    *
    * This field is applicable to either:
    * - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED.
    * - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    *
    * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var consistentHash: js.UndefOr[ConsistentHashLoadBalancerSettings] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** Headers that the HTTP/S load balancer should add to proxied requests. */
  var customRequestHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** If true, enables Cloud CDN for the backend service. Only applicable if the loadBalancingScheme is EXTERNAL and the protocol is HTTP or HTTPS. */
  var enableCDN: js.UndefOr[Boolean] = js.native
  
  /** Applicable only to Failover for Internal TCP/UDP Load Balancing. Requires at least one backend instance group to be defined as a backup (failover) backend. */
  var failoverPolicy: js.UndefOr[BackendServiceFailoverPolicy] = js.native
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a BackendService. An
    * up-to-date fingerprint must be provided in order to update the BackendService, otherwise the request will fail with error 412 conditionNotMet.
    *
    * To see the latest fingerprint, make a get() request to retrieve a BackendService.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The list of URLs to the healthChecks, httpHealthChecks (legacy), or httpsHealthChecks (legacy) resource for health checking this backend service. Not all backend services support
    * legacy health checks. See  Load balancer guide. Currently, at most one health check can be specified for each backend service. Backend services with instance group or zonal NEG
    * backends must have a health check. Backend services with internet or serverless NEG backends must not have a health check.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  
  /** The configurations for Identity-Aware Proxy on this resource. */
  var iap: js.UndefOr[BackendServiceIAP] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of resource. Always compute#backendService for backend services. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Specifies the load balancer type. Choose EXTERNAL for load balancers that receive traffic from external clients. Choose INTERNAL for Internal TCP/UDP Load Balancing. Choose
    * INTERNAL_MANAGED for Internal HTTP(S) Load Balancing. Choose INTERNAL_SELF_MANAGED for Traffic Director. A backend service created for one type of load balancing cannot be used with
    * another. For more information, refer to Choosing a load balancer.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.native
  
  /**
    * The load balancing algorithm used within the scope of the locality. The possible values are:
    * - ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in round robin order. This is the default.
    * - LEAST_REQUEST: An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests.
    * - RING_HASH: The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts
    * only affects 1/N of the requests.
    * - RANDOM: The load balancer selects a random healthy host.
    * - ORIGINAL_DESTINATION: Backend host is selected based on the client connection metadata, i.e., connections are opened to the same address as the destination address of the incoming
    * connection before the connection was redirected to the load balancer.
    * - MAGLEV: used as a drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For
    * more information about Maglev, see https://ai.google/research/pubs/pub44824
    *
    * This field is applicable to either:
    * - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED.
    * - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    *
    * If sessionAffinity is not NONE, and this field is not set to MAGLEV or RING_HASH, session affinity settings will not take effect.
    *
    * Only the default ROUND_ROBIN policy is supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to
    * true.
    */
  var localityLbPolicy: js.UndefOr[String] = js.native
  
  /** This field denotes the logging options for the load balancer traffic served by this backend service. If logging is enabled, logs will be exported to Stackdriver. */
  var logConfig: js.UndefOr[BackendServiceLogConfig] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The URL of the network to which this backend service belongs. This field can only be spcified when the load balancing scheme is set to INTERNAL. */
  var network: js.UndefOr[String] = js.native
  
  /**
    * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend service. If not set, this feature is considered disabled.
    *
    * This field is applicable to either:
    * - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED.
    * - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    *
    * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var outlierDetection: js.UndefOr[OutlierDetection] = js.native
  
  /**
    * Deprecated in favor of portName. The TCP port to connect on the backend. The default value is 80.
    *
    * This cannot be used if the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load Balancing).
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * A named port on a backend instance group representing the port for communication to the backend VMs in that group. Required when the loadBalancingScheme is EXTERNAL,
    * INTERNAL_MANAGED, or INTERNAL_SELF_MANAGED and the backends are instance groups. The named port must be defined on each backend instance group. This parameter has no meaning if the
    * backends are NEGs.
    *
    *
    *
    * Must be omitted when the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load Balancing).
    */
  var portName: js.UndefOr[String] = js.native
  
  /**
    * The protocol this BackendService uses to communicate with backends.
    *
    * Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, UDP or GRPC. depending on the chosen load balancer or Traffic Director configuration. Refer to the documentation for the load
    * balancer or for Traffic Director for more information.
    *
    * Must be set to GRPC when the backend service is referenced by a URL map that is bound to target gRPC proxy.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] URL of the region where the regional backend service resides. This field is not applicable to global backend services. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] The resource URL for the security policy associated with this backend service. */
  var securityPolicy: js.UndefOr[String] = js.native
  
  /**
    * This field specifies the security policy that applies to this backend service. This field is applicable to either:
    * - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED.
    * - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    */
  var securitySettings: js.UndefOr[SecuritySettings] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Type of session affinity to use. The default is NONE. Session affinity is not applicable if the --protocol is UDP.
    *
    * When the loadBalancingScheme is EXTERNAL, possible values are NONE, CLIENT_IP, or GENERATED_COOKIE. You can use GENERATED_COOKIE if the protocol is HTTP or HTTPS.
    *
    * When the loadBalancingScheme is INTERNAL, possible values are NONE, CLIENT_IP, CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.
    *
    * When the loadBalancingScheme is INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED, possible values are NONE, CLIENT_IP, GENERATED_COOKIE, HEADER_FIELD, or HTTP_COOKIE.
    *
    * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var sessionAffinity: js.UndefOr[String] = js.native
  
  /** The backend service timeout has a different meaning depending on the type of load balancer. For more information see,  Backend service settings The default is 30 seconds. */
  var timeoutSec: js.UndefOr[Double] = js.native
}
object BackendService {
  
  @scala.inline
  def apply(): BackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendService]
  }
  
  @scala.inline
  implicit class BackendServiceOps[Self <: BackendService] (val x: Self) extends AnyVal {
    
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
    def setAffinityCookieTtlSec(value: Double): Self = this.set("affinityCookieTtlSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffinityCookieTtlSec: Self = this.set("affinityCookieTtlSec", js.undefined)
    
    @scala.inline
    def setBackendsVarargs(value: Backend*): Self = this.set("backends", js.Array(value :_*))
    
    @scala.inline
    def setBackends(value: js.Array[Backend]): Self = this.set("backends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackends: Self = this.set("backends", js.undefined)
    
    @scala.inline
    def setCdnPolicy(value: BackendServiceCdnPolicy): Self = this.set("cdnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdnPolicy: Self = this.set("cdnPolicy", js.undefined)
    
    @scala.inline
    def setCircuitBreakers(value: CircuitBreakers): Self = this.set("circuitBreakers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircuitBreakers: Self = this.set("circuitBreakers", js.undefined)
    
    @scala.inline
    def setConnectionDraining(value: ConnectionDraining): Self = this.set("connectionDraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionDraining: Self = this.set("connectionDraining", js.undefined)
    
    @scala.inline
    def setConsistentHash(value: ConsistentHashLoadBalancerSettings): Self = this.set("consistentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistentHash: Self = this.set("consistentHash", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setCustomRequestHeadersVarargs(value: String*): Self = this.set("customRequestHeaders", js.Array(value :_*))
    
    @scala.inline
    def setCustomRequestHeaders(value: js.Array[String]): Self = this.set("customRequestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRequestHeaders: Self = this.set("customRequestHeaders", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnableCDN(value: Boolean): Self = this.set("enableCDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCDN: Self = this.set("enableCDN", js.undefined)
    
    @scala.inline
    def setFailoverPolicy(value: BackendServiceFailoverPolicy): Self = this.set("failoverPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverPolicy: Self = this.set("failoverPolicy", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: String*): Self = this.set("healthChecks", js.Array(value :_*))
    
    @scala.inline
    def setHealthChecks(value: js.Array[String]): Self = this.set("healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthChecks: Self = this.set("healthChecks", js.undefined)
    
    @scala.inline
    def setIap(value: BackendServiceIAP): Self = this.set("iap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIap: Self = this.set("iap", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLoadBalancingScheme(value: String): Self = this.set("loadBalancingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancingScheme: Self = this.set("loadBalancingScheme", js.undefined)
    
    @scala.inline
    def setLocalityLbPolicy(value: String): Self = this.set("localityLbPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalityLbPolicy: Self = this.set("localityLbPolicy", js.undefined)
    
    @scala.inline
    def setLogConfig(value: BackendServiceLogConfig): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setOutlierDetection(value: OutlierDetection): Self = this.set("outlierDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlierDetection: Self = this.set("outlierDetection", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPortName(value: String): Self = this.set("portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortName: Self = this.set("portName", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: String): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPolicy: Self = this.set("securityPolicy", js.undefined)
    
    @scala.inline
    def setSecuritySettings(value: SecuritySettings): Self = this.set("securitySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecuritySettings: Self = this.set("securitySettings", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSessionAffinity(value: String): Self = this.set("sessionAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAffinity: Self = this.set("sessionAffinity", js.undefined)
    
    @scala.inline
    def setTimeoutSec(value: Double): Self = this.set("timeoutSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSec: Self = this.set("timeoutSec", js.undefined)
  }
}
