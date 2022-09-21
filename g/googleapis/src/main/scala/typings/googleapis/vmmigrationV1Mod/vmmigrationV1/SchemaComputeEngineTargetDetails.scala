package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeEngineTargetDetails extends StObject {
  
  /**
    * Additional licenses to assign to the VM.
    */
  var additionalLicenses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The OS license returned from the adaptation module report.
    */
  var appliedLicense: js.UndefOr[SchemaAppliedLicense] = js.undefined
  
  /**
    * The VM Boot Option, as set in the source vm.
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
    * The hostname to assign to the VM.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
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
    * List of NICs connected to this VM.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.undefined
  
  /**
    * A map of network tags to associate with the VM.
    */
  var networkTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The GCP target project ID or project name.
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
    * The name of the VM to create.
    */
  var vmName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The zone in which to create the VM.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaComputeEngineTargetDetails {
  
  inline def apply(): SchemaComputeEngineTargetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeEngineTargetDetails]
  }
  
  extension [Self <: SchemaComputeEngineTargetDetails](x: Self) {
    
    inline def setAdditionalLicenses(value: js.Array[String]): Self = StObject.set(x, "additionalLicenses", value.asInstanceOf[js.Any])
    
    inline def setAdditionalLicensesNull: Self = StObject.set(x, "additionalLicenses", null)
    
    inline def setAdditionalLicensesUndefined: Self = StObject.set(x, "additionalLicenses", js.undefined)
    
    inline def setAdditionalLicensesVarargs(value: String*): Self = StObject.set(x, "additionalLicenses", js.Array(value*))
    
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
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
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
    
    inline def setNetworkInterfaces(value: js.Array[SchemaNetworkInterface]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: SchemaNetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsNull: Self = StObject.set(x, "networkTags", null)
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSecureBoot(value: Boolean): Self = StObject.set(x, "secureBoot", value.asInstanceOf[js.Any])
    
    inline def setSecureBootNull: Self = StObject.set(x, "secureBoot", null)
    
    inline def setSecureBootUndefined: Self = StObject.set(x, "secureBoot", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setVmName(value: String): Self = StObject.set(x, "vmName", value.asInstanceOf[js.Any])
    
    inline def setVmNameNull: Self = StObject.set(x, "vmName", null)
    
    inline def setVmNameUndefined: Self = StObject.set(x, "vmName", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
