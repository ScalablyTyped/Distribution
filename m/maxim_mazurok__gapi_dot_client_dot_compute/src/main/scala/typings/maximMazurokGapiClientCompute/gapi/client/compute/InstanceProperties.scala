package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceProperties extends StObject {
  
  /**
    * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their
    * own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP
    * forwarding documentation for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies the Confidential Instance options. */
  var confidentialInstanceConfig: js.UndefOr[ConfidentialInstanceConfig] = js.undefined
  
  /** An optional text description for the instances that are created from these properties. */
  var description: js.UndefOr[String] = js.undefined
  
  /** An array of disks that are associated with the instances that are created from these properties. */
  var disks: js.UndefOr[js.Array[AttachedDisk]] = js.undefined
  
  /** A list of guest accelerator cards' type and count to use for instances created from these properties. */
  var guestAccelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  
  /** Labels to apply to instances that are created from these properties. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.InstanceProperties & TopLevel[js.Any]
  ] = js.undefined
  
  /** The machine type to use for instances that are created from these properties. */
  var machineType: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance
    * metadata for more information.
    */
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  /**
    * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such
    * as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
    */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
  
  /** An array of network access configurations for this interface. */
  var networkInterfaces: js.UndefOr[js.Array[NetworkInterface]] = js.undefined
  
  /** The private IPv6 google access type for VMs. If not specified, use  INHERIT_FROM_SUBNETWORK as default. */
  var privateIpv6GoogleAccess: js.UndefOr[String] = js.undefined
  
  /** Specifies the reservations that instances can consume from. */
  var reservationAffinity: js.UndefOr[ReservationAffinity] = js.undefined
  
  /** Resource policies (names, not ULRs) applied to instances created from these properties. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Specifies the scheduling options for the instances that are created from these properties. */
  var scheduling: js.UndefOr[Scheduling] = js.undefined
  
  /**
    * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata
    * queries to obtain the access tokens for these instances.
    */
  var serviceAccounts: js.UndefOr[js.Array[ServiceAccount]] = js.undefined
  
  var shieldedInstanceConfig: js.UndefOr[ShieldedInstanceConfig] = js.undefined
  
  /**
    * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this
    * list of tags. Each tag within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object InstanceProperties {
  
  @scala.inline
  def apply(): InstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceProperties]
  }
  
  @scala.inline
  implicit class InstancePropertiesMutableBuilder[Self <: InstanceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanIpForward(value: Boolean): Self = StObject.set(x, "canIpForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanIpForwardUndefined: Self = StObject.set(x, "canIpForward", js.undefined)
    
    @scala.inline
    def setConfidentialInstanceConfig(value: ConfidentialInstanceConfig): Self = StObject.set(x, "confidentialInstanceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidentialInstanceConfigUndefined: Self = StObject.set(x, "confidentialInstanceConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisks(value: js.Array[AttachedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: AttachedDisk*): Self = StObject.set(x, "disks", js.Array(value :_*))
    
    @scala.inline
    def setGuestAccelerators(value: js.Array[AcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    @scala.inline
    def setGuestAcceleratorsVarargs(value: AcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.InstanceProperties & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: js.Array[NetworkInterface]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setPrivateIpv6GoogleAccess(value: String): Self = StObject.set(x, "privateIpv6GoogleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpv6GoogleAccessUndefined: Self = StObject.set(x, "privateIpv6GoogleAccess", js.undefined)
    
    @scala.inline
    def setReservationAffinity(value: ReservationAffinity): Self = StObject.set(x, "reservationAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationAffinityUndefined: Self = StObject.set(x, "reservationAffinity", js.undefined)
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
    
    @scala.inline
    def setScheduling(value: Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    @scala.inline
    def setServiceAccounts(value: js.Array[ServiceAccount]): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountsUndefined: Self = StObject.set(x, "serviceAccounts", js.undefined)
    
    @scala.inline
    def setServiceAccountsVarargs(value: ServiceAccount*): Self = StObject.set(x, "serviceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
