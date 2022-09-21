package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceProperties extends StObject {
  
  /**
    * Controls for advanced machine-related behavior features. Note that for MachineImage, this is not supported yet.
    */
  var advancedMachineFeatures: js.UndefOr[SchemaAdvancedMachineFeatures] = js.undefined
  
  /**
    * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
    */
  var canIpForward: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the Confidential Instance options. Note that for MachineImage, this is not supported yet.
    */
  var confidentialInstanceConfig: js.UndefOr[SchemaConfidentialInstanceConfig] = js.undefined
  
  /**
    * An optional text description for the instances that are created from these properties.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of disks that are associated with the instances that are created from these properties.
    */
  var disks: js.UndefOr[js.Array[SchemaAttachedDisk]] = js.undefined
  
  /**
    * A list of guest accelerator cards' type and count to use for instances created from these properties.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.undefined
  
  /**
    * KeyRevocationActionType of the instance. Supported options are "STOP" and "NONE". The default value is "NONE" if it is not specified.
    */
  var keyRevocationActionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels to apply to instances that are created from these properties.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The machine type to use for instances that are created from these properties.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.undefined
  
  /**
    * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
    */
  var minCpuPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of network access configurations for this interface.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.undefined
  
  /**
    * Note that for MachineImage, this is not supported yet.
    */
  var networkPerformanceConfig: js.UndefOr[SchemaNetworkPerformanceConfig] = js.undefined
  
  /**
    * The private IPv6 google access type for VMs. If not specified, use INHERIT_FROM_SUBNETWORK as default. Note that for MachineImage, this is not supported yet.
    */
  var privateIpv6GoogleAccess: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the reservations that instances can consume from. Note that for MachineImage, this is not supported yet.
    */
  var reservationAffinity: js.UndefOr[SchemaReservationAffinity] = js.undefined
  
  /**
    * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id\}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
    */
  var resourceManagerTags: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Resource policies (names, not URLs) applied to instances created from these properties. Note that for MachineImage, this is not supported yet.
    */
  var resourcePolicies: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies the scheduling options for the instances that are created from these properties.
    */
  var scheduling: js.UndefOr[SchemaScheduling] = js.undefined
  
  /**
    * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
    */
  var serviceAccounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.undefined
  
  /**
    * Note that for MachineImage, this is not supported yet.
    */
  var shieldedInstanceConfig: js.UndefOr[SchemaShieldedInstanceConfig] = js.undefined
  
  /**
    * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[SchemaTags] = js.undefined
}
object SchemaInstanceProperties {
  
  inline def apply(): SchemaInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceProperties]
  }
  
  extension [Self <: SchemaInstanceProperties](x: Self) {
    
    inline def setAdvancedMachineFeatures(value: SchemaAdvancedMachineFeatures): Self = StObject.set(x, "advancedMachineFeatures", value.asInstanceOf[js.Any])
    
    inline def setAdvancedMachineFeaturesUndefined: Self = StObject.set(x, "advancedMachineFeatures", js.undefined)
    
    inline def setCanIpForward(value: Boolean): Self = StObject.set(x, "canIpForward", value.asInstanceOf[js.Any])
    
    inline def setCanIpForwardNull: Self = StObject.set(x, "canIpForward", null)
    
    inline def setCanIpForwardUndefined: Self = StObject.set(x, "canIpForward", js.undefined)
    
    inline def setConfidentialInstanceConfig(value: SchemaConfidentialInstanceConfig): Self = StObject.set(x, "confidentialInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setConfidentialInstanceConfigUndefined: Self = StObject.set(x, "confidentialInstanceConfig", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisks(value: js.Array[SchemaAttachedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaAttachedDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    inline def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    inline def setGuestAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value*))
    
    inline def setKeyRevocationActionType(value: String): Self = StObject.set(x, "keyRevocationActionType", value.asInstanceOf[js.Any])
    
    inline def setKeyRevocationActionTypeNull: Self = StObject.set(x, "keyRevocationActionType", null)
    
    inline def setKeyRevocationActionTypeUndefined: Self = StObject.set(x, "keyRevocationActionType", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMetadata(value: SchemaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformNull: Self = StObject.set(x, "minCpuPlatform", null)
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    inline def setNetworkInterfaces(value: js.Array[SchemaNetworkInterface]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: SchemaNetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setNetworkPerformanceConfig(value: SchemaNetworkPerformanceConfig): Self = StObject.set(x, "networkPerformanceConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkPerformanceConfigUndefined: Self = StObject.set(x, "networkPerformanceConfig", js.undefined)
    
    inline def setPrivateIpv6GoogleAccess(value: String): Self = StObject.set(x, "privateIpv6GoogleAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv6GoogleAccessNull: Self = StObject.set(x, "privateIpv6GoogleAccess", null)
    
    inline def setPrivateIpv6GoogleAccessUndefined: Self = StObject.set(x, "privateIpv6GoogleAccess", js.undefined)
    
    inline def setReservationAffinity(value: SchemaReservationAffinity): Self = StObject.set(x, "reservationAffinity", value.asInstanceOf[js.Any])
    
    inline def setReservationAffinityUndefined: Self = StObject.set(x, "reservationAffinity", js.undefined)
    
    inline def setResourceManagerTags(value: StringDictionary[String]): Self = StObject.set(x, "resourceManagerTags", value.asInstanceOf[js.Any])
    
    inline def setResourceManagerTagsNull: Self = StObject.set(x, "resourceManagerTags", null)
    
    inline def setResourceManagerTagsUndefined: Self = StObject.set(x, "resourceManagerTags", js.undefined)
    
    inline def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesNull: Self = StObject.set(x, "resourcePolicies", null)
    
    inline def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    inline def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value*))
    
    inline def setScheduling(value: SchemaScheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setServiceAccounts(value: js.Array[SchemaServiceAccount]): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountsUndefined: Self = StObject.set(x, "serviceAccounts", js.undefined)
    
    inline def setServiceAccountsVarargs(value: SchemaServiceAccount*): Self = StObject.set(x, "serviceAccounts", js.Array(value*))
    
    inline def setShieldedInstanceConfig(value: SchemaShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    inline def setTags(value: SchemaTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
