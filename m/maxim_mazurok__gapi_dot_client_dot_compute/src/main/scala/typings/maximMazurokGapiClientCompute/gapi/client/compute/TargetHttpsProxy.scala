package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpsProxy extends js.Object {
  
  /**
    * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be
    * restricted by an authorization policy.
    * Refer to the AuthorizationPolicy resource for additional details.
    * authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    * Note: This field currently has no impact.
    */
  var authorizationPolicy: js.UndefOr[String] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    *
    * When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when
    * using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when
    * it receives them.
    *
    * The default is false.
    */
  var proxyBind: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify
    * NONE, ENABLE, or DISABLE.
    * - When quic-override is set to NONE, Google manages whether QUIC is used.
    * - When quic-override is set to ENABLE, the load balancer uses QUIC when possible.
    * - When quic-override is set to DISABLE, the load balancer doesn't use QUIC.
    * - If the quic-override flag is not specified, NONE is implied.
    * -
    */
  var quicOverride: js.UndefOr[String] = js.native
  
  /** [Output Only] URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies. */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic.
    * serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    * If left blank, communications are not encrypted.
    * Note: This field currently has no impact.
    */
  var serverTlsPolicy: js.UndefOr[String] = js.native
  
  /**
    * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may
    * specify up to 15 SSL certificates.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.native
  
  /** URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured. */
  var sslPolicy: js.UndefOr[String] = js.native
  
  /**
    * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a
    * URL map:
    * - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map
    * - projects/project/global/urlMaps/url-map
    * - global/urlMaps/url-map
    */
  var urlMap: js.UndefOr[String] = js.native
}
object TargetHttpsProxy {
  
  @scala.inline
  def apply(): TargetHttpsProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpsProxy]
  }
  
  @scala.inline
  implicit class TargetHttpsProxyOps[Self <: TargetHttpsProxy] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationPolicy(value: String): Self = this.set("authorizationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationPolicy: Self = this.set("authorizationPolicy", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProxyBind(value: Boolean): Self = this.set("proxyBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyBind: Self = this.set("proxyBind", js.undefined)
    
    @scala.inline
    def setQuicOverride(value: String): Self = this.set("quicOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuicOverride: Self = this.set("quicOverride", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setServerTlsPolicy(value: String): Self = this.set("serverTlsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerTlsPolicy: Self = this.set("serverTlsPolicy", js.undefined)
    
    @scala.inline
    def setSslCertificatesVarargs(value: String*): Self = this.set("sslCertificates", js.Array(value :_*))
    
    @scala.inline
    def setSslCertificates(value: js.Array[String]): Self = this.set("sslCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCertificates: Self = this.set("sslCertificates", js.undefined)
    
    @scala.inline
    def setSslPolicy(value: String): Self = this.set("sslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslPolicy: Self = this.set("sslPolicy", js.undefined)
    
    @scala.inline
    def setUrlMap(value: String): Self = this.set("urlMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlMap: Self = this.set("urlMap", js.undefined)
  }
}
