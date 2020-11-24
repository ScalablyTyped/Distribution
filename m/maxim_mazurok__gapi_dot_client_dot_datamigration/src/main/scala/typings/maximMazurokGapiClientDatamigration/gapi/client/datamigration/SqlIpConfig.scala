package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlIpConfig extends js.Object {
  
  /**
    * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation
    * (e.g. `192.168.100.0/24`).
    */
  var authorizedNetworks: js.UndefOr[js.Array[SqlAclEntry]] = js.native
  
  /** Whether the instance should be assigned an IPv4 address or not. */
  var enableIpv4: js.UndefOr[Boolean] = js.native
  
  /**
    * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be
    * updated, but it cannot be removed after it is set.
    */
  var privateNetwork: js.UndefOr[String] = js.native
  
  /** Whether SSL connections over IP should be enforced or not. */
  var requireSsl: js.UndefOr[Boolean] = js.native
}
object SqlIpConfig {
  
  @scala.inline
  def apply(): SqlIpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlIpConfig]
  }
  
  @scala.inline
  implicit class SqlIpConfigOps[Self <: SqlIpConfig] (val x: Self) extends AnyVal {
    
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
    def setAuthorizedNetworksVarargs(value: SqlAclEntry*): Self = this.set("authorizedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizedNetworks(value: js.Array[SqlAclEntry]): Self = this.set("authorizedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedNetworks: Self = this.set("authorizedNetworks", js.undefined)
    
    @scala.inline
    def setEnableIpv4(value: Boolean): Self = this.set("enableIpv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIpv4: Self = this.set("enableIpv4", js.undefined)
    
    @scala.inline
    def setPrivateNetwork(value: String): Self = this.set("privateNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateNetwork: Self = this.set("privateNetwork", js.undefined)
    
    @scala.inline
    def setRequireSsl(value: Boolean): Self = this.set("requireSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSsl: Self = this.set("requireSsl", js.undefined)
  }
}
