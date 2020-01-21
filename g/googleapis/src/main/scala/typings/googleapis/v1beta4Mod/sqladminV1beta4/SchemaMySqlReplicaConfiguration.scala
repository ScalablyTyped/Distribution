package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Read-replica configuration specific to MySQL databases.
  */
@js.native
trait SchemaMySqlReplicaConfiguration extends js.Object {
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
    * public key is encoded in the client&#39;s certificate.
    */
  var clientKey: js.UndefOr[String] = js.native
  /**
    * Seconds to wait between connect retries. MySQL&#39;s default is 60
    * seconds.
    */
  var connectRetryInterval: js.UndefOr[Double] = js.native
  /**
    * Path to a SQL dump file in Google Cloud Storage from which the slave
    * instance is to be created. The URI is in the form
    * gs://bucketName/fileName. Compressed gzip files (.gz) are also supported.
    * Dumps should have the binlog co-ordinates from which replication should
    * begin. This can be accomplished by setting --master-data to 1 when using
    * mysqldump.
    */
  var dumpFilePath: js.UndefOr[String] = js.native
  /**
    * This is always sql#mysqlReplicaConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Interval in milliseconds between replication heartbeats.
    */
  var masterHeartbeatPeriod: js.UndefOr[String] = js.native
  /**
    * The password for the replication connection.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * A list of permissible ciphers to use for SSL encryption.
    */
  var sslCipher: js.UndefOr[String] = js.native
  /**
    * The username for the replication connection.
    */
  var username: js.UndefOr[String] = js.native
  /**
    * Whether or not to check the master&#39;s Common Name value in the
    * certificate that it sends during the SSL handshake.
    */
  var verifyServerCertificate: js.UndefOr[Boolean] = js.native
}

object SchemaMySqlReplicaConfiguration {
  @scala.inline
  def apply(
    caCertificate: String = null,
    clientCertificate: String = null,
    clientKey: String = null,
    connectRetryInterval: Int | Double = null,
    dumpFilePath: String = null,
    kind: String = null,
    masterHeartbeatPeriod: String = null,
    password: String = null,
    sslCipher: String = null,
    username: String = null,
    verifyServerCertificate: js.UndefOr[Boolean] = js.undefined
  ): SchemaMySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (caCertificate != null) __obj.updateDynamic("caCertificate")(caCertificate.asInstanceOf[js.Any])
    if (clientCertificate != null) __obj.updateDynamic("clientCertificate")(clientCertificate.asInstanceOf[js.Any])
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey.asInstanceOf[js.Any])
    if (connectRetryInterval != null) __obj.updateDynamic("connectRetryInterval")(connectRetryInterval.asInstanceOf[js.Any])
    if (dumpFilePath != null) __obj.updateDynamic("dumpFilePath")(dumpFilePath.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (masterHeartbeatPeriod != null) __obj.updateDynamic("masterHeartbeatPeriod")(masterHeartbeatPeriod.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (sslCipher != null) __obj.updateDynamic("sslCipher")(sslCipher.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyServerCertificate)) __obj.updateDynamic("verifyServerCertificate")(verifyServerCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMySqlReplicaConfiguration]
  }
}

