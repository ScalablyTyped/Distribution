package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoprovisioningNodePoolDefaults extends js.Object {
  
  /**
    * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form
    * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see:
    * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
    */
  var bootDiskKmsKey: js.UndefOr[String] = js.native
  
  /** Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB. */
  var diskSizeGb: js.UndefOr[Double] = js.native
  
  /** Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd') If unspecified, the default disk type is 'pd-standard' */
  var diskType: js.UndefOr[String] = js.native
  
  /** Specifies the node management options for NAP created node-pools. */
  var management: js.UndefOr[NodeManagement] = js.native
  
  /**
    * Minimum CPU platform to be used for NAP created node pools. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU
    * platforms, such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more information, read [how to specify min CPU
    * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) To unset the min cpu platform field pass "automatic" as field value.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /** Scopes that are used by NAP when creating node pools. */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.native
  
  /** The Google Cloud Platform Service Account to be used by the node VMs. */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /** Shielded Instance options. */
  var shieldedInstanceConfig: js.UndefOr[ShieldedInstanceConfig] = js.native
  
  /** Specifies the upgrade settings for NAP created node pools */
  var upgradeSettings: js.UndefOr[UpgradeSettings] = js.native
}
object AutoprovisioningNodePoolDefaults {
  
  @scala.inline
  def apply(): AutoprovisioningNodePoolDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoprovisioningNodePoolDefaults]
  }
  
  @scala.inline
  implicit class AutoprovisioningNodePoolDefaultsOps[Self <: AutoprovisioningNodePoolDefaults] (val x: Self) extends AnyVal {
    
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
    def setBootDiskKmsKey(value: String): Self = this.set("bootDiskKmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootDiskKmsKey: Self = this.set("bootDiskKmsKey", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: Double): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = this.set("diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskType: Self = this.set("diskType", js.undefined)
    
    @scala.inline
    def setManagement(value: NodeManagement): Self = this.set("management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagement: Self = this.set("management", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = this.set("minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCpuPlatform: Self = this.set("minCpuPlatform", js.undefined)
    
    @scala.inline
    def setOauthScopesVarargs(value: String*): Self = this.set("oauthScopes", js.Array(value :_*))
    
    @scala.inline
    def setOauthScopes(value: js.Array[String]): Self = this.set("oauthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauthScopes: Self = this.set("oauthScopes", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = this.set("shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShieldedInstanceConfig: Self = this.set("shieldedInstanceConfig", js.undefined)
    
    @scala.inline
    def setUpgradeSettings(value: UpgradeSettings): Self = this.set("upgradeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeSettings: Self = this.set("upgradeSettings", js.undefined)
  }
}
