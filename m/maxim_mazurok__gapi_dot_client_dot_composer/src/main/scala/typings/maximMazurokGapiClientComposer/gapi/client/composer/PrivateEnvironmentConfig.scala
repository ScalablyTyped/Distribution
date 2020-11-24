package typings.maximMazurokGapiClientComposer.gapi.client.composer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateEnvironmentConfig extends js.Object {
  
  /** Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`. */
  var cloudSqlIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /** Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true. */
  var enablePrivateEnvironment: js.UndefOr[Boolean] = js.native
  
  /** Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment. */
  var privateClusterConfig: js.UndefOr[PrivateClusterConfig] = js.native
  
  /**
    * Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and
    * `cloud_sql_ipv4_cidr_block`.
    */
  var webServerIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /** Output only. The IP range reserved for the tenant project's App Engine VMs. */
  var webServerIpv4ReservedRange: js.UndefOr[String] = js.native
}
object PrivateEnvironmentConfig {
  
  @scala.inline
  def apply(): PrivateEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateEnvironmentConfig]
  }
  
  @scala.inline
  implicit class PrivateEnvironmentConfigOps[Self <: PrivateEnvironmentConfig] (val x: Self) extends AnyVal {
    
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
    def setCloudSqlIpv4CidrBlock(value: String): Self = this.set("cloudSqlIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudSqlIpv4CidrBlock: Self = this.set("cloudSqlIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setEnablePrivateEnvironment(value: Boolean): Self = this.set("enablePrivateEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePrivateEnvironment: Self = this.set("enablePrivateEnvironment", js.undefined)
    
    @scala.inline
    def setPrivateClusterConfig(value: PrivateClusterConfig): Self = this.set("privateClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateClusterConfig: Self = this.set("privateClusterConfig", js.undefined)
    
    @scala.inline
    def setWebServerIpv4CidrBlock(value: String): Self = this.set("webServerIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebServerIpv4CidrBlock: Self = this.set("webServerIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setWebServerIpv4ReservedRange(value: String): Self = this.set("webServerIpv4ReservedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebServerIpv4ReservedRange: Self = this.set("webServerIpv4ReservedRange", js.undefined)
  }
}
