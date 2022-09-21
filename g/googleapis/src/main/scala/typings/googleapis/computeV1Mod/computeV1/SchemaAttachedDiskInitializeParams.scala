package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttachedDiskInitializeParams extends StObject {
  
  /**
    * The architecture of the attached disk. Valid values are arm64 or x86_64.
    */
  var architecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description. Provide this property when creating the disk.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
    */
  var diskName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
    */
  var diskSizeGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
    */
  var diskType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A list of publicly visible licenses. Reserved for Google's use.
    */
  var licenses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
    */
  var onUpdateAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
    */
  var provisionedIops: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id\}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
    */
  var resourceManagerTags: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
    */
  var resourcePolicies: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
    */
  var sourceImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
    */
  var sourceImageEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
  
  /**
    * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
    */
  var sourceSnapshot: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer-supplied encryption key of the source snapshot.
    */
  var sourceSnapshotEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
}
object SchemaAttachedDiskInitializeParams {
  
  inline def apply(): SchemaAttachedDiskInitializeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachedDiskInitializeParams]
  }
  
  extension [Self <: SchemaAttachedDiskInitializeParams](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureNull: Self = StObject.set(x, "architecture", null)
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiskName(value: String): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    inline def setDiskNameNull: Self = StObject.set(x, "diskName", null)
    
    inline def setDiskNameUndefined: Self = StObject.set(x, "diskName", js.undefined)
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbNull: Self = StObject.set(x, "diskSizeGb", null)
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeNull: Self = StObject.set(x, "diskType", null)
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLicenses(value: js.Array[String]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesNull: Self = StObject.set(x, "licenses", null)
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: String*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def setOnUpdateAction(value: String): Self = StObject.set(x, "onUpdateAction", value.asInstanceOf[js.Any])
    
    inline def setOnUpdateActionNull: Self = StObject.set(x, "onUpdateAction", null)
    
    inline def setOnUpdateActionUndefined: Self = StObject.set(x, "onUpdateAction", js.undefined)
    
    inline def setProvisionedIops(value: String): Self = StObject.set(x, "provisionedIops", value.asInstanceOf[js.Any])
    
    inline def setProvisionedIopsNull: Self = StObject.set(x, "provisionedIops", null)
    
    inline def setProvisionedIopsUndefined: Self = StObject.set(x, "provisionedIops", js.undefined)
    
    inline def setResourceManagerTags(value: StringDictionary[String]): Self = StObject.set(x, "resourceManagerTags", value.asInstanceOf[js.Any])
    
    inline def setResourceManagerTagsNull: Self = StObject.set(x, "resourceManagerTags", null)
    
    inline def setResourceManagerTagsUndefined: Self = StObject.set(x, "resourceManagerTags", js.undefined)
    
    inline def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesNull: Self = StObject.set(x, "resourcePolicies", null)
    
    inline def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    inline def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value*))
    
    inline def setSourceImage(value: String): Self = StObject.set(x, "sourceImage", value.asInstanceOf[js.Any])
    
    inline def setSourceImageEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "sourceImageEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setSourceImageEncryptionKeyUndefined: Self = StObject.set(x, "sourceImageEncryptionKey", js.undefined)
    
    inline def setSourceImageNull: Self = StObject.set(x, "sourceImage", null)
    
    inline def setSourceImageUndefined: Self = StObject.set(x, "sourceImage", js.undefined)
    
    inline def setSourceSnapshot(value: String): Self = StObject.set(x, "sourceSnapshot", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "sourceSnapshotEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotEncryptionKeyUndefined: Self = StObject.set(x, "sourceSnapshotEncryptionKey", js.undefined)
    
    inline def setSourceSnapshotNull: Self = StObject.set(x, "sourceSnapshot", null)
    
    inline def setSourceSnapshotUndefined: Self = StObject.set(x, "sourceSnapshot", js.undefined)
  }
}
