package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The authentication information for accessing the master endpoint.
  * Authentication can be done using HTTP basic auth or using client
  * certificates.
  */
@js.native
trait SchemaMasterAuth extends js.Object {
  /**
    * [Output only] Base64-encoded public certificate used by clients to
    * authenticate to the cluster endpoint.
    */
  var clientCertificate: js.UndefOr[String] = js.native
  /**
    * Configuration for client certificate authentication on the cluster. For
    * clusters before v1.12, if no configuration is specified, a client
    * certificate is issued.
    */
  var clientCertificateConfig: js.UndefOr[SchemaClientCertificateConfig] = js.native
  /**
    * [Output only] Base64-encoded private key used by clients to authenticate
    * to the cluster endpoint.
    */
  var clientKey: js.UndefOr[String] = js.native
  /**
    * [Output only] Base64-encoded public certificate that is the root of trust
    * for the cluster.
    */
  var clusterCaCertificate: js.UndefOr[String] = js.native
  /**
    * The password to use for HTTP basic authentication to the master endpoint.
    * Because the master endpoint is open to the Internet, you should create a
    * strong password.  If a password is provided for cluster creation,
    * username must be non-empty.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The username to use for HTTP basic authentication to the master endpoint.
    * For clusters v1.6.0 and later, basic authentication can be disabled by
    * leaving username unspecified (or setting it to the empty string).
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaMasterAuth {
  @scala.inline
  def apply(
    clientCertificate: String = null,
    clientCertificateConfig: SchemaClientCertificateConfig = null,
    clientKey: String = null,
    clusterCaCertificate: String = null,
    password: String = null,
    username: String = null
  ): SchemaMasterAuth = {
    val __obj = js.Dynamic.literal()
    if (clientCertificate != null) __obj.updateDynamic("clientCertificate")(clientCertificate.asInstanceOf[js.Any])
    if (clientCertificateConfig != null) __obj.updateDynamic("clientCertificateConfig")(clientCertificateConfig.asInstanceOf[js.Any])
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey.asInstanceOf[js.Any])
    if (clusterCaCertificate != null) __obj.updateDynamic("clusterCaCertificate")(clusterCaCertificate.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMasterAuth]
  }
}

