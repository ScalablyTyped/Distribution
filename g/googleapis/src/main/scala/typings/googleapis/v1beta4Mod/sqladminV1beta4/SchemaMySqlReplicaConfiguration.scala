package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Read-replica configuration specific to MySQL databases.
  */
trait SchemaMySqlReplicaConfiguration extends StObject {
  
  /**
    * PEM representation of the trusted CA&#39;s x509 certificate.
    */
  var caCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * PEM representation of the slave&#39;s x509 certificate.
    */
  var clientCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * PEM representation of the slave&#39;s private key. The corresponsing
    * public key is encoded in the client&#39;s certificate.
    */
  var clientKey: js.UndefOr[String] = js.undefined
  
  /**
    * Seconds to wait between connect retries. MySQL&#39;s default is 60
    * seconds.
    */
  var connectRetryInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Path to a SQL dump file in Google Cloud Storage from which the slave
    * instance is to be created. The URI is in the form
    * gs://bucketName/fileName. Compressed gzip files (.gz) are also supported.
    * Dumps should have the binlog co-ordinates from which replication should
    * begin. This can be accomplished by setting --master-data to 1 when using
    * mysqldump.
    */
  var dumpFilePath: js.UndefOr[String] = js.undefined
  
  /**
    * This is always sql#mysqlReplicaConfiguration.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Interval in milliseconds between replication heartbeats.
    */
  var masterHeartbeatPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * The password for the replication connection.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * A list of permissible ciphers to use for SSL encryption.
    */
  var sslCipher: js.UndefOr[String] = js.undefined
  
  /**
    * The username for the replication connection.
    */
  var username: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to check the master&#39;s Common Name value in the
    * certificate that it sends during the SSL handshake.
    */
  var verifyServerCertificate: js.UndefOr[Boolean] = js.undefined
}
object SchemaMySqlReplicaConfiguration {
  
  inline def apply(): SchemaMySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMySqlReplicaConfiguration]
  }
  
  extension [Self <: SchemaMySqlReplicaConfiguration](x: Self) {
    
    inline def setCaCertificate(value: String): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateUndefined: Self = StObject.set(x, "caCertificate", js.undefined)
    
    inline def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    inline def setConnectRetryInterval(value: Double): Self = StObject.set(x, "connectRetryInterval", value.asInstanceOf[js.Any])
    
    inline def setConnectRetryIntervalUndefined: Self = StObject.set(x, "connectRetryInterval", js.undefined)
    
    inline def setDumpFilePath(value: String): Self = StObject.set(x, "dumpFilePath", value.asInstanceOf[js.Any])
    
    inline def setDumpFilePathUndefined: Self = StObject.set(x, "dumpFilePath", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMasterHeartbeatPeriod(value: String): Self = StObject.set(x, "masterHeartbeatPeriod", value.asInstanceOf[js.Any])
    
    inline def setMasterHeartbeatPeriodUndefined: Self = StObject.set(x, "masterHeartbeatPeriod", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSslCipher(value: String): Self = StObject.set(x, "sslCipher", value.asInstanceOf[js.Any])
    
    inline def setSslCipherUndefined: Self = StObject.set(x, "sslCipher", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVerifyServerCertificate(value: Boolean): Self = StObject.set(x, "verifyServerCertificate", value.asInstanceOf[js.Any])
    
    inline def setVerifyServerCertificateUndefined: Self = StObject.set(x, "verifyServerCertificate", js.undefined)
  }
}
