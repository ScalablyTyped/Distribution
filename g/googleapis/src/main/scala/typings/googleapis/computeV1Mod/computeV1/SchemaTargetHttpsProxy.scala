package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TargetHttpsProxy resource. This resource defines an HTTPS proxy. (==
  * resource_for beta.targetHttpsProxies ==) (== resource_for
  * v1.targetHttpsProxies ==)
  */
@js.native
trait SchemaTargetHttpsProxy extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of resource. Always compute#targetHttpsProxy for
    * target HTTPS proxies.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specifies the QUIC override policy for this TargetHttpsProxy resource.
    * This determines whether the load balancer will attempt to negotiate QUIC
    * with clients or not. Can specify one of NONE, ENABLE, or DISABLE. Specify
    * ENABLE to always enable QUIC, Enables QUIC when set to ENABLE, and
    * disables QUIC when set to DISABLE. If NONE is specified, uses the QUIC
    * policy with no user overrides, which is equivalent to DISABLE. Not
    * specifying this field is equivalent to specifying NONE.
    */
  var quicOverride: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * URLs to SslCertificate resources that are used to authenticate
    * connections between users and the load balancer. At least one SSL
    * certificate must be specified. Currently, you may specify up to 15 SSL
    * certificates.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * URL of SslPolicy resource that will be associated with the
    * TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource will
    * not have any SSL policy configured.
    */
  var sslPolicy: js.UndefOr[String] = js.native
  
  /**
    * A fully-qualified or valid partial URL to the UrlMap resource that
    * defines the mapping from URL to the BackendService. For example, the
    * following are all valid URLs for specifying a URL map:   -
    * https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map
    * - projects/project/global/urlMaps/url-map  - global/urlMaps/url-map
    */
  var urlMap: js.UndefOr[String] = js.native
}
object SchemaTargetHttpsProxy {
  
  @scala.inline
  def apply(): SchemaTargetHttpsProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpsProxy]
  }
  
  @scala.inline
  implicit class SchemaTargetHttpsProxyMutableBuilder[Self <: SchemaTargetHttpsProxy] (val x: Self) extends AnyVal {
    
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
    def setQuicOverride(value: String): Self = StObject.set(x, "quicOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuicOverrideUndefined: Self = StObject.set(x, "quicOverride", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
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
