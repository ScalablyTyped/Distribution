package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TargetHttpsProxy resource. This resource defines an HTTPS proxy. (==
  * resource_for beta.targetHttpsProxies ==) (== resource_for
  * v1.targetHttpsProxies ==)
  */
@js.native
trait SchemaTargetHttpsProxy extends js.Object {
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
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    quicOverride: String = null,
    selfLink: String = null,
    sslCertificates: js.Array[String] = null,
    sslPolicy: String = null,
    urlMap: String = null
  ): SchemaTargetHttpsProxy = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (quicOverride != null) __obj.updateDynamic("quicOverride")(quicOverride.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (sslCertificates != null) __obj.updateDynamic("sslCertificates")(sslCertificates.asInstanceOf[js.Any])
    if (sslPolicy != null) __obj.updateDynamic("sslPolicy")(sslPolicy.asInstanceOf[js.Any])
    if (urlMap != null) __obj.updateDynamic("urlMap")(urlMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetHttpsProxy]
  }
}

