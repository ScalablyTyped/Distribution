package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachedDisk extends js.Object {
  
  /** Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance). */
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  /** Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem. */
  var boot: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used
    * to reference the device for mounting, resizing, and so on, from within the instance.
    *
    * If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is
    * only applicable for persistent disks.
    */
  var deviceName: js.UndefOr[String] = js.native
  
  /**
    * Encrypts or decrypts a disk using a customer-supplied encryption key.
    *
    * If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this
    * field decrypts the disk using the customer-supplied encryption key.
    *
    * If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key
    * when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance.
    *
    * If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later.
    *
    * Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
    */
  var diskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
  
  /** The size of the disk in GB. */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /** A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options. */
  var guestOsFeatures: js.UndefOr[js.Array[GuestOsFeature]] = js.native
  
  /** [Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number. */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to
    * the new instance.
    *
    * This property is mutually exclusive with the source property; you can only define one or the other, but not both.
    */
  var initializeParams: js.UndefOr[AttachedDiskInitializeParams] = js.native
  
  /**
    * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if
    * you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD
    * performance.
    */
  var interface: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#attachedDisk for attached disks. */
  var kind: js.UndefOr[String] = js.native
  
  /** [Output Only] Any valid publicly visible licenses. */
  var licenses: js.UndefOr[js.Array[String]] = js.native
  
  /** The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. */
  var mode: js.UndefOr[String] = js.native
  
  /** [Output Only] shielded vm initial state stored on disk */
  var shieldedInstanceInitialState: js.UndefOr[InitialStateConfig] = js.native
  
  /**
    * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot
    * or disks.source is required except for local SSD.
    *
    * If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks.
    *
    * Note that for InstanceTemplate, specify the disk name, not the URL for the disk.
    */
  var source: js.UndefOr[String] = js.native
  
  /** Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT. */
  var `type`: js.UndefOr[String] = js.native
}
object AttachedDisk {
  
  @scala.inline
  def apply(): AttachedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedDisk]
  }
  
  @scala.inline
  implicit class AttachedDiskOps[Self <: AttachedDisk] (val x: Self) extends AnyVal {
    
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
    def setAutoDelete(value: Boolean): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
    
    @scala.inline
    def setBoot(value: Boolean): Self = this.set("boot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoot: Self = this.set("boot", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDiskEncryptionKey(value: CustomerEncryptionKey): Self = this.set("diskEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskEncryptionKey: Self = this.set("diskEncryptionKey", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setGuestOsFeaturesVarargs(value: GuestOsFeature*): Self = this.set("guestOsFeatures", js.Array(value :_*))
    
    @scala.inline
    def setGuestOsFeatures(value: js.Array[GuestOsFeature]): Self = this.set("guestOsFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestOsFeatures: Self = this.set("guestOsFeatures", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setInitializeParams(value: AttachedDiskInitializeParams): Self = this.set("initializeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitializeParams: Self = this.set("initializeParams", js.undefined)
    
    @scala.inline
    def setInterface(value: String): Self = this.set("interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterface: Self = this.set("interface", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLicensesVarargs(value: String*): Self = this.set("licenses", js.Array(value :_*))
    
    @scala.inline
    def setLicenses(value: js.Array[String]): Self = this.set("licenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenses: Self = this.set("licenses", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setShieldedInstanceInitialState(value: InitialStateConfig): Self = this.set("shieldedInstanceInitialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShieldedInstanceInitialState: Self = this.set("shieldedInstanceInitialState", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
