package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoprovisioningNodePoolDefaults extends StObject {
  
  /**
    * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form
    * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see:
    * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
    */
  var bootDiskKmsKey: js.UndefOr[String] = js.undefined
  
  /** Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB. */
  var diskSizeGb: js.UndefOr[Double] = js.undefined
  
  /** Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd') If unspecified, the default disk type is 'pd-standard' */
  var diskType: js.UndefOr[String] = js.undefined
  
  /** Specifies the node management options for NAP created node-pools. */
  var management: js.UndefOr[NodeManagement] = js.undefined
  
  /**
    * Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU
    * platforms, such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more information, read [how to specify min CPU
    * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) To unset the min cpu platform field pass "automatic" as field value.
    */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
  
  /** Scopes that are used by NAP when creating node pools. */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The Google Cloud Platform Service Account to be used by the node VMs. */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** Shielded Instance options. */
  var shieldedInstanceConfig: js.UndefOr[ShieldedInstanceConfig] = js.undefined
  
  /** Specifies the upgrade settings for NAP created node pools */
  var upgradeSettings: js.UndefOr[UpgradeSettings] = js.undefined
}
object AutoprovisioningNodePoolDefaults {
  
  @scala.inline
  def apply(): AutoprovisioningNodePoolDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoprovisioningNodePoolDefaults]
  }
  
  @scala.inline
  implicit class AutoprovisioningNodePoolDefaultsMutableBuilder[Self <: AutoprovisioningNodePoolDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootDiskKmsKey(value: String): Self = StObject.set(x, "bootDiskKmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDiskKmsKeyUndefined: Self = StObject.set(x, "bootDiskKmsKey", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    @scala.inline
    def setManagement(value: NodeManagement): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    @scala.inline
    def setOauthScopes(value: js.Array[String]): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    @scala.inline
    def setOauthScopesVarargs(value: String*): Self = StObject.set(x, "oauthScopes", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    @scala.inline
    def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    @scala.inline
    def setUpgradeSettings(value: UpgradeSettings): Self = StObject.set(x, "upgradeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeSettingsUndefined: Self = StObject.set(x, "upgradeSettings", js.undefined)
  }
}
