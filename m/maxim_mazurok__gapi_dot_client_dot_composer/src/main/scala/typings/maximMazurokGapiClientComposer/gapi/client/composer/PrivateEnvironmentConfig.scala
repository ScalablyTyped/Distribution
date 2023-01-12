package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateEnvironmentConfig extends StObject {
  
  /**
    * Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the
    * Customer Project will use an IP address from this subnetwork.
    */
  var cloudComposerConnectionSubnetwork: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block
    * and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
    */
  var cloudComposerNetworkIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The IP range reserved for the tenant project's Cloud Composer network. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.*
    * and newer.
    */
  var cloudComposerNetworkIpv4ReservedRange: js.UndefOr[String] = js.undefined
  
  /** Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`. */
  var cloudSqlIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer
    * environments in versions composer-1.*.*-airflow-*.*.*.
    */
  var enablePrivateEnvironment: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. When enabled, IPs from public (non-RFC1918) ranges can be used for `IPAllocationPolicy.cluster_ipv4_cidr_block` and `IPAllocationPolicy.service_ipv4_cidr_block`. */
  var enablePrivatelyUsedPublicIps: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment. */
  var privateClusterConfig: js.UndefOr[PrivateClusterConfig] = js.undefined
  
  /**
    * Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and
    * `cloud_sql_ipv4_cidr_block`. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
    */
  var webServerIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /** Output only. The IP range reserved for the tenant project's App Engine VMs. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. */
  var webServerIpv4ReservedRange: js.UndefOr[String] = js.undefined
}
object PrivateEnvironmentConfig {
  
  inline def apply(): PrivateEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateEnvironmentConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateEnvironmentConfig] (val x: Self) extends AnyVal {
    
    inline def setCloudComposerConnectionSubnetwork(value: String): Self = StObject.set(x, "cloudComposerConnectionSubnetwork", value.asInstanceOf[js.Any])
    
    inline def setCloudComposerConnectionSubnetworkUndefined: Self = StObject.set(x, "cloudComposerConnectionSubnetwork", js.undefined)
    
    inline def setCloudComposerNetworkIpv4CidrBlock(value: String): Self = StObject.set(x, "cloudComposerNetworkIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCloudComposerNetworkIpv4CidrBlockUndefined: Self = StObject.set(x, "cloudComposerNetworkIpv4CidrBlock", js.undefined)
    
    inline def setCloudComposerNetworkIpv4ReservedRange(value: String): Self = StObject.set(x, "cloudComposerNetworkIpv4ReservedRange", value.asInstanceOf[js.Any])
    
    inline def setCloudComposerNetworkIpv4ReservedRangeUndefined: Self = StObject.set(x, "cloudComposerNetworkIpv4ReservedRange", js.undefined)
    
    inline def setCloudSqlIpv4CidrBlock(value: String): Self = StObject.set(x, "cloudSqlIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlIpv4CidrBlockUndefined: Self = StObject.set(x, "cloudSqlIpv4CidrBlock", js.undefined)
    
    inline def setEnablePrivateEnvironment(value: Boolean): Self = StObject.set(x, "enablePrivateEnvironment", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivateEnvironmentUndefined: Self = StObject.set(x, "enablePrivateEnvironment", js.undefined)
    
    inline def setEnablePrivatelyUsedPublicIps(value: Boolean): Self = StObject.set(x, "enablePrivatelyUsedPublicIps", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivatelyUsedPublicIpsUndefined: Self = StObject.set(x, "enablePrivatelyUsedPublicIps", js.undefined)
    
    inline def setPrivateClusterConfig(value: PrivateClusterConfig): Self = StObject.set(x, "privateClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setPrivateClusterConfigUndefined: Self = StObject.set(x, "privateClusterConfig", js.undefined)
    
    inline def setWebServerIpv4CidrBlock(value: String): Self = StObject.set(x, "webServerIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setWebServerIpv4CidrBlockUndefined: Self = StObject.set(x, "webServerIpv4CidrBlock", js.undefined)
    
    inline def setWebServerIpv4ReservedRange(value: String): Self = StObject.set(x, "webServerIpv4ReservedRange", value.asInstanceOf[js.Any])
    
    inline def setWebServerIpv4ReservedRangeUndefined: Self = StObject.set(x, "webServerIpv4ReservedRange", js.undefined)
  }
}
