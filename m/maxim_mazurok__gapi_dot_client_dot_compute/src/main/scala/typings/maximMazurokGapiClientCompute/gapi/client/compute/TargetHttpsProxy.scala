package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetHttpsProxy extends StObject {
  
  /**
    * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be
    * restricted by an authorization policy.
    * Refer to the AuthorizationPolicy resource for additional details.
    * authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    * Note: This field currently has no impact.
    */
  var authorizationPolicy: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    *
    * When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when
    * using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when
    * it receives them.
    *
    * The default is false.
    */
  var proxyBind: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify
    * NONE, ENABLE, or DISABLE.
    * - When quic-override is set to NONE, Google manages whether QUIC is used.
    * - When quic-override is set to ENABLE, the load balancer uses QUIC when possible.
    * - When quic-override is set to DISABLE, the load balancer doesn't use QUIC.
    * - If the quic-override flag is not specified, NONE is implied.
    * -
    */
  var quicOverride: js.UndefOr[String] = js.undefined
  
  /** [Output Only] URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies. */
  var region: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic.
    * serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    * If left blank, communications are not encrypted.
    * Note: This field currently has no impact.
    */
  var serverTlsPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may
    * specify up to 15 SSL certificates.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.undefined
  
  /** URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured. */
  var sslPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a
    * URL map:
    * - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map
    * - projects/project/global/urlMaps/url-map
    * - global/urlMaps/url-map
    */
  var urlMap: js.UndefOr[String] = js.undefined
}
object TargetHttpsProxy {
  
  @scala.inline
  def apply(): TargetHttpsProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpsProxy]
  }
  
  @scala.inline
  implicit class TargetHttpsProxyMutableBuilder[Self <: TargetHttpsProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationPolicy(value: String): Self = StObject.set(x, "authorizationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationPolicyUndefined: Self = StObject.set(x, "authorizationPolicy", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProxyBind(value: Boolean): Self = StObject.set(x, "proxyBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyBindUndefined: Self = StObject.set(x, "proxyBind", js.undefined)
    
    @scala.inline
    def setQuicOverride(value: String): Self = StObject.set(x, "quicOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuicOverrideUndefined: Self = StObject.set(x, "quicOverride", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setServerTlsPolicy(value: String): Self = StObject.set(x, "serverTlsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTlsPolicyUndefined: Self = StObject.set(x, "serverTlsPolicy", js.undefined)
    
    @scala.inline
    def setSslCertificates(value: js.Array[String]): Self = StObject.set(x, "sslCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificatesUndefined: Self = StObject.set(x, "sslCertificates", js.undefined)
    
    @scala.inline
    def setSslCertificatesVarargs(value: String*): Self = StObject.set(x, "sslCertificates", js.Array(value :_*))
    
    @scala.inline
    def setSslPolicy(value: String): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPolicyUndefined: Self = StObject.set(x, "sslPolicy", js.undefined)
    
    @scala.inline
    def setUrlMap(value: String): Self = StObject.set(x, "urlMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMapUndefined: Self = StObject.set(x, "urlMap", js.undefined)
  }
}
