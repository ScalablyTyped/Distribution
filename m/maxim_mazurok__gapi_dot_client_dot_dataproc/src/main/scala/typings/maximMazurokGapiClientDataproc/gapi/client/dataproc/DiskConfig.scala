package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskConfig extends StObject {
  
  /** Optional. Size in GB of the boot disk (default is 500GB). */
  var bootDiskSizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive), "pd-ssd" (Persistent Disk Solid State Drive),
    * or "pd-standard" (Persistent Disk Hard Disk Drive). See Disk types (https://cloud.google.com/compute/docs/disks#disk-types).
    */
  var bootDiskType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Interface type of local SSDs (default is "scsi"). Valid values: "scsi" (Small Computer System Interface), "nvme" (Non-Volatile Memory Express). See local SSD performance
    * (https://cloud.google.com/compute/docs/disks/local-ssd#performance).
    */
  var localSsdInterface: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Number of attached SSDs, from 0 to 8 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and HDFS
    * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only
    * basic config and installed binaries.Note: Local SSD options may vary by machine type and number of vCPUs selected.
    */
  var numLocalSsds: js.UndefOr[Double] = js.undefined
}
object DiskConfig {
  
  inline def apply(): DiskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskConfig] (val x: Self) extends AnyVal {
    
    inline def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    inline def setBootDiskType(value: String): Self = StObject.set(x, "bootDiskType", value.asInstanceOf[js.Any])
    
    inline def setBootDiskTypeUndefined: Self = StObject.set(x, "bootDiskType", js.undefined)
    
    inline def setLocalSsdInterface(value: String): Self = StObject.set(x, "localSsdInterface", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdInterfaceUndefined: Self = StObject.set(x, "localSsdInterface", js.undefined)
    
    inline def setNumLocalSsds(value: Double): Self = StObject.set(x, "numLocalSsds", value.asInstanceOf[js.Any])
    
    inline def setNumLocalSsdsUndefined: Self = StObject.set(x, "numLocalSsds", js.undefined)
  }
}
