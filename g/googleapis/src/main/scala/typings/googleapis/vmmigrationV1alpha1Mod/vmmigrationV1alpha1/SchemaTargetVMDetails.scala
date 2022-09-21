package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetVMDetails extends StObject {
  
  /**
    * Output only. The OS license returned from the adaptation module report.
    */
  var appliedLicense: js.UndefOr[SchemaAppliedLicense] = js.undefined
  
  /**
    * Output only. The VM Boot Option, as set in the source vm.
    */
  var bootOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Compute instance scheduling information (if empty default is used).
    */
  var computeScheduling: js.UndefOr[SchemaComputeScheduling] = js.undefined
  
  /**
    * The disk type to use in the VM.
    */
  var diskType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The external IP to define in the VM.
    */
  var externalIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The internal IP to define in the VM. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
    */
  var internalIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map of labels to associate with the VM.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The license type to use in OS adaptation.
    */
  var licenseType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The machine type to create the VM with.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The machine type series to create the VM with.
    */
  var machineTypeSeries: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metadata key/value pairs to assign to the VM.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The name of the VM to create.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The network to connect the VM to.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of NICs connected to this VM.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.undefined
  
  /**
    * A map of network tags to associate with the VM.
    */
  var networkTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The project in which to create the VM.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
    */
  var secureBoot: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The service account to associate the VM with.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The subnetwork to connect the VM to.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
    */
  var targetProject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The zone in which to create the VM.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetVMDetails {
  
  inline def apply(): SchemaTargetVMDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetVMDetails]
  }
  
  extension [Self <: SchemaTargetVMDetails](x: Self) {
    
    inline def setAppliedLicense(value: SchemaAppliedLicense): Self = StObject.set(x, "appliedLicense", value.asInstanceOf[js.Any])
    
    inline def setAppliedLicenseUndefined: Self = StObject.set(x, "appliedLicense", js.undefined)
    
    inline def setBootOption(value: String): Self = StObject.set(x, "bootOption", value.asInstanceOf[js.Any])
    
    inline def setBootOptionNull: Self = StObject.set(x, "bootOption", null)
    
    inline def setBootOptionUndefined: Self = StObject.set(x, "bootOption", js.undefined)
    
    inline def setComputeScheduling(value: SchemaComputeScheduling): Self = StObject.set(x, "computeScheduling", value.asInstanceOf[js.Any])
    
    inline def setComputeSchedulingUndefined: Self = StObject.set(x, "computeScheduling", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeNull: Self = StObject.set(x, "diskType", null)
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setExternalIpNull: Self = StObject.set(x, "externalIp", null)
    
    inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
    
    inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIpNull: Self = StObject.set(x, "internalIp", null)
    
    inline def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLicenseType(value: String): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeNull: Self = StObject.set(x, "licenseType", null)
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "licenseType", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeSeries(value: String): Self = StObject.set(x, "machineTypeSeries", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeSeriesNull: Self = StObject.set(x, "machineTypeSeries", null)
    
    inline def setMachineTypeSeriesUndefined: Self = StObject.set(x, "machineTypeSeries", js.undefined)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaces(value: js.Array[SchemaNetworkInterface]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: SchemaNetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsNull: Self = StObject.set(x, "networkTags", null)
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSecureBoot(value: Boolean): Self = StObject.set(x, "secureBoot", value.asInstanceOf[js.Any])
    
    inline def setSecureBootNull: Self = StObject.set(x, "secureBoot", null)
    
    inline def setSecureBootUndefined: Self = StObject.set(x, "secureBoot", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTargetProject(value: String): Self = StObject.set(x, "targetProject", value.asInstanceOf[js.Any])
    
    inline def setTargetProjectNull: Self = StObject.set(x, "targetProject", null)
    
    inline def setTargetProjectUndefined: Self = StObject.set(x, "targetProject", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
