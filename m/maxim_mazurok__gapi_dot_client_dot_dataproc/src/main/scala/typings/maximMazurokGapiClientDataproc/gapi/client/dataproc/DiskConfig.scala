package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskConfig extends StObject {
  
  /** Optional. Size in GB of the boot disk (default is 500GB). */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  
  /** Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive). */
  var bootDiskType: js.UndefOr[String] = js.native
  
  /**
    * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and HDFS
    * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only
    * basic config and installed binaries.
    */
  var numLocalSsds: js.UndefOr[Double] = js.native
}
object DiskConfig {
  
  @scala.inline
  def apply(): DiskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskConfig]
  }
  
  @scala.inline
  implicit class DiskConfigMutableBuilder[Self <: DiskConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    @scala.inline
    def setBootDiskType(value: String): Self = StObject.set(x, "bootDiskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDiskTypeUndefined: Self = StObject.set(x, "bootDiskType", js.undefined)
    
    @scala.inline
    def setNumLocalSsds(value: Double): Self = StObject.set(x, "numLocalSsds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumLocalSsdsUndefined: Self = StObject.set(x, "numLocalSsds", js.undefined)
  }
}
