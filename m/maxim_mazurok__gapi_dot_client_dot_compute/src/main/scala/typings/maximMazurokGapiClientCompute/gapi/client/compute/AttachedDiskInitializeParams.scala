package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachedDiskInitializeParams extends js.Object {
  
  /** An optional description. Provide this property when creating the disk. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is
    * attached to the new instance and the new disk is not created.
    */
  var diskName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the
    * sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /**
    * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard
    *
    *
    * Other values include pd-ssd and local-ssd. If you define this field, you can provide either the full or partial URL. For example, the following are valid values:
    * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType
    * - projects/project/zones/zone/diskTypes/diskType
    * - zones/zone/diskTypes/diskType  Note that for InstanceTemplate, this is the name of the disk type, not URL.
    */
  var diskType: js.UndefOr[String] = js.native
  
  /** Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.AttachedDiskInitializeParams with TopLevel[js.Any]
  ] = js.native
  
  /** Specifies which action to take on instance update with this disk. Default is to use the existing disk. */
  var onUpdateAction: js.UndefOr[String] = js.native
  
  /** Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for
    * local SSD.
    *
    * To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image:
    * projects/debian-cloud/global/images/family/debian-9
    *
    *
    * Alternatively, use a specific version of a public operating system image:
    * projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD
    *
    *
    * To create a disk with a custom image that you created, specify the image name in the following format:
    * global/images/my-custom-image
    *
    *
    * You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name:
    * global/images/family/my-image-family
    *
    *
    * If the source image is deleted later, this field will not be set.
    */
  var sourceImage: js.UndefOr[String] = js.native
  
  /**
    * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
    *
    * Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your
    * own keys.
    */
  var sourceImageEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
  
  /**
    * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for
    * local SSD.
    *
    * To create a disk with a snapshot that you created, specify the snapshot name in the following format:
    * global/snapshots/my-backup
    *
    *
    * If the source snapshot is deleted later, this field will not be set.
    */
  var sourceSnapshot: js.UndefOr[String] = js.native
  
  /** The customer-supplied encryption key of the source snapshot. */
  var sourceSnapshotEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
}
object AttachedDiskInitializeParams {
  
  @scala.inline
  def apply(): AttachedDiskInitializeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedDiskInitializeParams]
  }
  
  @scala.inline
  implicit class AttachedDiskInitializeParamsOps[Self <: AttachedDiskInitializeParams] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDiskName(value: String): Self = this.set("diskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskName: Self = this.set("diskName", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = this.set("diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskType: Self = this.set("diskType", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.AttachedDiskInitializeParams with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setOnUpdateAction(value: String): Self = this.set("onUpdateAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdateAction: Self = this.set("onUpdateAction", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = this.set("resourcePolicies", js.Array(value :_*))
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = this.set("resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePolicies: Self = this.set("resourcePolicies", js.undefined)
    
    @scala.inline
    def setSourceImage(value: String): Self = this.set("sourceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceImage: Self = this.set("sourceImage", js.undefined)
    
    @scala.inline
    def setSourceImageEncryptionKey(value: CustomerEncryptionKey): Self = this.set("sourceImageEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceImageEncryptionKey: Self = this.set("sourceImageEncryptionKey", js.undefined)
    
    @scala.inline
    def setSourceSnapshot(value: String): Self = this.set("sourceSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSnapshot: Self = this.set("sourceSnapshot", js.undefined)
    
    @scala.inline
    def setSourceSnapshotEncryptionKey(value: CustomerEncryptionKey): Self = this.set("sourceSnapshotEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSnapshotEncryptionKey: Self = this.set("sourceSnapshotEncryptionKey", js.undefined)
  }
}
