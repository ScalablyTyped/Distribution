package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedAttachedDisk extends StObject {
  
  /**
    * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
    */
  var autoDelete: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
    */
  var boot: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the name of the disk attached to the source instance.
    */
  var deviceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The encryption key for the disk.
    */
  var diskEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
  
  /**
    * The size of the disk in base-2 GB.
    */
  var diskSizeGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
    */
  var diskType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
    */
  var guestOsFeatures: js.UndefOr[js.Array[SchemaGuestOsFeature]] = js.undefined
  
  /**
    * Specifies zero-based index of the disk that is attached to the source instance.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
    */
  var interface: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Any valid publicly visible licenses.
    */
  var licenses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies a URL of the disk attached to the source instance.
    */
  var source: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A size of the storage used by the disk's snapshot by this machine image.
    */
  var storageBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
    */
  var storageBytesStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSavedAttachedDisk {
  
  inline def apply(): SchemaSavedAttachedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedAttachedDisk]
  }
  
  extension [Self <: SchemaSavedAttachedDisk](x: Self) {
    
    inline def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteNull: Self = StObject.set(x, "autoDelete", null)
    
    inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
    
    inline def setBoot(value: Boolean): Self = StObject.set(x, "boot", value.asInstanceOf[js.Any])
    
    inline def setBootNull: Self = StObject.set(x, "boot", null)
    
    inline def setBootUndefined: Self = StObject.set(x, "boot", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDiskEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "diskEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setDiskEncryptionKeyUndefined: Self = StObject.set(x, "diskEncryptionKey", js.undefined)
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbNull: Self = StObject.set(x, "diskSizeGb", null)
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeNull: Self = StObject.set(x, "diskType", null)
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setGuestOsFeatures(value: js.Array[SchemaGuestOsFeature]): Self = StObject.set(x, "guestOsFeatures", value.asInstanceOf[js.Any])
    
    inline def setGuestOsFeaturesUndefined: Self = StObject.set(x, "guestOsFeatures", js.undefined)
    
    inline def setGuestOsFeaturesVarargs(value: SchemaGuestOsFeature*): Self = StObject.set(x, "guestOsFeatures", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNull: Self = StObject.set(x, "interface", null)
    
    inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLicenses(value: js.Array[String]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesNull: Self = StObject.set(x, "licenses", null)
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: String*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStorageBytes(value: String): Self = StObject.set(x, "storageBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesNull: Self = StObject.set(x, "storageBytes", null)
    
    inline def setStorageBytesStatus(value: String): Self = StObject.set(x, "storageBytesStatus", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesStatusNull: Self = StObject.set(x, "storageBytesStatus", null)
    
    inline def setStorageBytesStatusUndefined: Self = StObject.set(x, "storageBytesStatus", js.undefined)
    
    inline def setStorageBytesUndefined: Self = StObject.set(x, "storageBytes", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
