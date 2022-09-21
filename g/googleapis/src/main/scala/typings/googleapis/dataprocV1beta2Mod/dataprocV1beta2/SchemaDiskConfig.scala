package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskConfig extends StObject {
  
  /**
    * Optional. Size in GB of the boot disk (default is 500GB).
    */
  var bootDiskSizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive), "pd-ssd" (Persistent Disk Solid State Drive), or "pd-standard" (Persistent Disk Hard Disk Drive). See Disk types (https://cloud.google.com/compute/docs/disks#disk-types).
    */
  var bootDiskType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and HDFS (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
    */
  var numLocalSsds: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDiskConfig {
  
  inline def apply(): SchemaDiskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskConfig]
  }
  
  extension [Self <: SchemaDiskConfig](x: Self) {
    
    inline def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setBootDiskSizeGbNull: Self = StObject.set(x, "bootDiskSizeGb", null)
    
    inline def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    inline def setBootDiskType(value: String): Self = StObject.set(x, "bootDiskType", value.asInstanceOf[js.Any])
    
    inline def setBootDiskTypeNull: Self = StObject.set(x, "bootDiskType", null)
    
    inline def setBootDiskTypeUndefined: Self = StObject.set(x, "bootDiskType", js.undefined)
    
    inline def setNumLocalSsds(value: Double): Self = StObject.set(x, "numLocalSsds", value.asInstanceOf[js.Any])
    
    inline def setNumLocalSsdsNull: Self = StObject.set(x, "numLocalSsds", null)
    
    inline def setNumLocalSsdsUndefined: Self = StObject.set(x, "numLocalSsds", js.undefined)
  }
}
