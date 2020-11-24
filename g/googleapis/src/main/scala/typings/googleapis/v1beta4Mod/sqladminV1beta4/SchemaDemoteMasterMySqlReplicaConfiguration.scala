package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaDemoteMasterMySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDemoteMasterMySqlReplicaConfiguration]
  }
  
  @scala.inline
  implicit class SchemaDemoteMasterMySqlReplicaConfigurationOps[Self <: SchemaDemoteMasterMySqlReplicaConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCaCertificate(value: String): Self = this.set("caCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCertificate: Self = this.set("caCertificate", js.undefined)
    
    @scala.inline
    def setClientCertificate(value: String): Self = this.set("clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificate: Self = this.set("clientCertificate", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKey: Self = this.set("clientKey", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
