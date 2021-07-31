package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateEnvironmentConfig extends StObject {
  
  /** Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`. */
  var cloudSqlIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /** Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true. */
  var enablePrivateEnvironment: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment. */
  var privateClusterConfig: js.UndefOr[PrivateClusterConfig] = js.undefined
  
  /**
    * Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and
    * `cloud_sql_ipv4_cidr_block`.
    */
  var webServerIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /** Output only. The IP range reserved for the tenant project's App Engine VMs. */
  var webServerIpv4ReservedRange: js.UndefOr[String] = js.undefined
}
object PrivateEnvironmentConfig {
  
  @scala.inline
  def apply(): PrivateEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateEnvironmentConfig]
  }
  
  @scala.inline
  implicit class PrivateEnvironmentConfigMutableBuilder[Self <: PrivateEnvironmentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudSqlIpv4CidrBlock(value: String): Self = StObject.set(x, "cloudSqlIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudSqlIpv4CidrBlockUndefined: Self = StObject.set(x, "cloudSqlIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setEnablePrivateEnvironment(value: Boolean): Self = StObject.set(x, "enablePrivateEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePrivateEnvironmentUndefined: Self = StObject.set(x, "enablePrivateEnvironment", js.undefined)
    
    @scala.inline
    def setPrivateClusterConfig(value: PrivateClusterConfig): Self = StObject.set(x, "privateClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateClusterConfigUndefined: Self = StObject.set(x, "privateClusterConfig", js.undefined)
    
    @scala.inline
    def setWebServerIpv4CidrBlock(value: String): Self = StObject.set(x, "webServerIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebServerIpv4CidrBlockUndefined: Self = StObject.set(x, "webServerIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setWebServerIpv4ReservedRange(value: String): Self = StObject.set(x, "webServerIpv4ReservedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebServerIpv4ReservedRangeUndefined: Self = StObject.set(x, "webServerIpv4ReservedRange", js.undefined)
  }
}
