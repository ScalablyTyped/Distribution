package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Read-replica configuration specific to MySQL databases.
  */
@js.native
trait SchemaDemoteMasterMySqlReplicaConfiguration extends js.Object {
  /**
    * PEM representation of the trusted CA&#39;s x509 certificate.
    */
  var caCertificate: js.UndefOr[String] = js.native
  /**
    * PEM representation of the slave&#39;s x509 certificate.
    */
  var clientCertificate: js.UndefOr[String] = js.native
  /**
    * PEM representation of the slave&#39;s private key. The corresponsing
    * public key is encoded in the client&#39;s certificate. The format of the
    * slave&#39;s private key can be either PKCS #1 or PKCS #8.
    */
  var clientKey: js.UndefOr[String] = js.native
  /**
    * This is always sql#demoteMasterMysqlReplicaConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The password for the replication connection.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The username for the replication connection.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaDemoteMasterMySqlReplicaConfiguration {
  @scala.inline
  def apply(
    caCertificate: String = null,
    clientCertificate: String = null,
    clientKey: String = null,
    kind: String = null,
    password: String = null,
    username: String = null
  ): SchemaDemoteMasterMySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (caCertificate != null) __obj.updateDynamic("caCertificate")(caCertificate.asInstanceOf[js.Any])
    if (clientCertificate != null) __obj.updateDynamic("clientCertificate")(clientCertificate.asInstanceOf[js.Any])
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDemoteMasterMySqlReplicaConfiguration]
  }
}

